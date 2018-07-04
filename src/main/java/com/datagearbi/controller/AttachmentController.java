package com.datagearbi.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.datagearbi.model.Attachment;
import com.datagearbi.model.Comments;
import com.datagearbi.repository.AttachmentRepository;
import com.datagearbi.repository.CommentsRepository;
import com.datagearbi.service.FileStorageService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/Attachment")
public class AttachmentController {
	@PersistenceContext
	EntityManager EntityManager;
	@Autowired
	private AttachmentRepository attachmentRepository;

	@Autowired
	private CommentsRepository commentsRepository;

	private static final Logger logger = LoggerFactory.getLogger(AttachmentController.class);

	@Autowired
	private FileStorageService fileStorageService;
	
	@Autowired
    private SimpMessagingTemplate template;

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Attachment> findAll() {
		return this.attachmentRepository.findAll();

	}

	@RequestMapping(value = "bySuspect", method = RequestMethod.GET)
	public List<Comments> findBySuspect(@RequestParam("code") String code, @RequestParam("key") String key) {

		return this.commentsRepository.findAttachmentbySuspect(code, Long.parseLong(key));

	}

	@PostMapping("/uploadFile")
	public Attachment uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("commentId") int commentId

	) {
		Attachment fileName = fileStorageService.storeFile(file, commentId);

		// String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
		// .path("/downloadFile/")
		// .path(fileName)
		// .toUriString();

		return fileName;
	}

	@PostMapping("/uploadMultipleFiles")
	public List<Comments> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files, int alarmed_Obj_Key,
			String alarmed_Obj_level_Cd, String description, int uplodedById) {
		Comments c = new Comments();
		c.setAlarmed_Obj_Key(alarmed_Obj_Key);
		c.setAlarmed_Obj_level_Cd(alarmed_Obj_level_Cd);
		c.setDescription(description);
		c.setUploadDate(new Date());
		c.setUplodedById(uplodedById);
		Comments z = this.commentsRepository.save(c);
		Arrays.asList(files).stream().map(file -> uploadFile(file, z.getId())).collect(Collectors.toList());
		
		z.setAttachment(this.attachmentRepository.findByCommentId(z.getId()));
		template.convertAndSend("/topic/comment", this.commentsRepository.findById(z.getId()));
		
		System.out.println("AAAAAAAAAAAAAAa:" + z.getAttachment().size());
		
		return findBySuspect(alarmed_Obj_level_Cd, String.valueOf(alarmed_Obj_Key));
	}

	@GetMapping("/downloadFile/{fileName:.+}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		// Load file as Resource
		Resource resource = fileStorageService.loadFileAsResource(fileName);

		// Try to determine file's content type
		String contentType = null;
		try {
			contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
		} catch (IOException ex) {
			logger.info("Could not determine file type.");
		}

		// Fallback to the default content type if type could not be determined
		if (contentType == null) {
			contentType = "application/octet-stream";
		}

		return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

	@DeleteMapping("/delete/{id}")
	public String DeleteAttachment(@PathVariable(name = "id") int id) {
		Optional<Attachment> optionalFile = this.attachmentRepository.findById(id);
		System.out.println(id + ";;;;;;;;;;;;;;;;;");
		if (optionalFile.isPresent()) {
			String filepath = optionalFile.get().getFilepath();
			File file = new File(filepath);
			this.fileStorageService.deleteFile(id);

			if (file.delete()) {
				return "delete succesfully";
			}

		}
		return "file not found";
	}

	@GetMapping("byname")
	public List<Attachment> findByName(@RequestParam(name = "filename") String filename) {
		System.out.println(filename);
		return this.attachmentRepository.findByfileName(filename);
	}

	@GetMapping("testjoin")
	List test() {
		String query = "select * from [Admin_DEV].[Admin].[User] as "
				+ "a inner join [DGAML].[AC].[Attachment] as b on a.id=";
		return this.EntityManager.createQuery(query).getResultList();
	}

}