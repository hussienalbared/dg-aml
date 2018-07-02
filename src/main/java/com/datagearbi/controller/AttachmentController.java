package com.datagearbi.controller;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
import com.datagearbi.repository.AttachmentRepository;
import com.datagearbi.service.FileStorageService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/Attachment")
public class AttachmentController {
	
	@Autowired
	private AttachmentRepository attachmentRepository;
	


	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Attachment> findAll()
	{return this.attachmentRepository.findAll();
		
	}
	@RequestMapping(value = "bySuspect", method = RequestMethod.GET)
	public List<Attachment> findBySuspect(@RequestParam("code") String code,@RequestParam("key") long key)
	{return this.attachmentRepository.findAttachmentbySuspect(code, key);
		
	}


    private static final Logger logger = LoggerFactory.getLogger(AttachmentController.class);

    @Autowired
    private FileStorageService fileStorageService;
    
    @PostMapping("/uploadFile")
    public Attachment uploadFile(@RequestParam("file") MultipartFile file,
    		@RequestParam("alarmed_Obj_Key")	long alarmed_Obj_Key,
    		@RequestParam("alarmed_Obj_level_Cd")	String alarmed_Obj_level_Cd,
    		@RequestParam("description") String description,
    		@RequestParam("uplodedById")int uplodedById
    		) {
        Attachment fileName = fileStorageService.storeFile(
        		 file, alarmed_Obj_Key,
    			 alarmed_Obj_level_Cd, description, uplodedById);

//        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("/downloadFile/")
//                .path(fileName)
//                .toUriString();

        return  fileName;
    }

    @PostMapping("/uploadMultipleFiles")
    public void  uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,
    	int	alarmed_Obj_Key,
  			String  alarmed_Obj_level_Cd,String description,int  uplodedById) {
    	
         Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file, alarmed_Obj_Key,
           			 alarmed_Obj_level_Cd, description, uplodedById))
                .collect(Collectors.toList());
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
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
    @DeleteMapping("/delete/{id}")
   public String DeleteAttachment(@PathVariable(name="id") int id)
   { 
    	 Optional<Attachment> optionalFile= this.attachmentRepository.findById(id);
    	 if(optionalFile.isPresent())
    	 {
    		 String filepath=optionalFile.get().getFilepath();
    		 File file = new File(filepath);
    		   this.fileStorageService.deleteFile(id);

    		 if(file.delete()) {
    			 return "delete succesfully";
    		 }
    		 
    	 }
    	 return "file not found";
   }
}