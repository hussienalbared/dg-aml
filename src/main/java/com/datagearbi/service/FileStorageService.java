package com.datagearbi.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.datagearbi.Exception.FileStorageException;
import com.datagearbi.Exception.MyFileNotFoundException;
import com.datagearbi.helper.FileStorageProperties;
import com.datagearbi.model.Attachment;
import com.datagearbi.model.Comments;
import com.datagearbi.repository.AttachmentRepository;
import com.datagearbi.repository.CommentsRepository;

@Service
public class FileStorageService {

	private final Path fileStorageLocation;
	private final Path fileDeleteLocation;
	@Autowired
	private AttachmentRepository AttachmentRepository;
	@Autowired
	private CommentsRepository CommentsRepository;

	@Autowired
	public FileStorageService(FileStorageProperties fileStorageProperties) {
		this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();
		this.fileDeleteLocation = Paths.get(fileStorageProperties.getDeleteDir()).toAbsolutePath().normalize();

		try {
			Files.createDirectories(this.fileStorageLocation);
			Files.createDirectories(this.fileDeleteLocation);
		} catch (Exception ex) {
			throw new FileStorageException("Could not create the directory where the uploaded files will be stored.",
					ex);
		}
	}

	public Attachment storeFile(MultipartFile file, int commentId, int userId) {
		// Normalize file name
		String fileName = this.checkFileName(file.getOriginalFilename());
		Path targetLocation;

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			targetLocation = this.fileStorageLocation.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
			
			System.out.println("QQQQQQQQQQQQQq= " + commentId);
			
			Attachment x = new Attachment();
			x.setCommentId(commentId);
			x.setFileName(fileName);
			x.setFilepath(targetLocation.toString());
			x.setAddedBy(userId);

			this.AttachmentRepository.save(x);

			return x;
		} catch (IOException ex) {
			throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public Resource loadFileAsResource(String fileName) {
		try {
			Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
			Resource resource = new UrlResource(filePath.toUri());
			if (resource.exists()) {
				return resource;
			} else {
				throw new MyFileNotFoundException("File not found " + fileName);
			}
		} catch (MalformedURLException ex) {
			throw new MyFileNotFoundException("File not found " + fileName, ex);
		}
	}

	public void deleteFile(int fileId) {
		this.AttachmentRepository.deleteById(fileId);
	}

	public void moveToDelete(String name) {

		// String fileName = this.checkFileName(file.getOriginalFilename());
		Path originalLocation = this.fileStorageLocation.resolve(name);
		Path deleteLocation = this.fileDeleteLocation.resolve(name);
		System.out.println(originalLocation);
		System.out.println(deleteLocation);

		try {

			// Files.copy(file.getInputStream(), deleteLocation,
			// StandardCopyOption.REPLACE_EXISTING);
			Files.copy(originalLocation, deleteLocation, StandardCopyOption.REPLACE_EXISTING);
			Files.delete(originalLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String checkFileName(String filename) {
		List<Attachment> files = this.AttachmentRepository.findByfileName(filename);
		String fileName;
		if (files.size() > 0) {

			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");

			String strDate = dateFormat.format(date);

			fileName = StringUtils.cleanPath(filename);
			int extensionIndex = fileName.lastIndexOf('.');

			fileName = fileName.substring(0, extensionIndex) + strDate + fileName.substring(extensionIndex);

		} else {
			fileName = StringUtils.cleanPath(filename);

		}
		return fileName;

	}

	// state 4
	public void deleteComment(int commentId, int updaterId) {
		Optional<Comments> comment = this.CommentsRepository.findById(commentId);
		if (comment.isPresent()) {
			Comments c = comment.get();
			c.setStateIndicator("n");

			Comments v = new Comments();
			v.setAlarmed_Obj_Key(c.getAlarmed_Obj_Key());
			v.setAlarmed_Obj_level_Cd(c.getAlarmed_Obj_level_Cd());
			v.setDescription(c.getDescription());
			v.setPreviousComment(c.getId());
			v.setStateIndicator("n");
			v.setUploadDate(new Date());
			v.setUplodedById(updaterId);
			Comments newOne = this.CommentsRepository.save(v);
			
			c.getAttachment().forEach(attach -> {
				this.moveToDelete(attach.getFileName());
				attach.setDeletedBy(updaterId);
				attach.setCommentId(newOne.getId());
				this.AttachmentRepository.save(attach);
			});
		}

	}

	// state 2
	// user id the id of user who add the file
	public void addNewFileToComment(MultipartFile file, int commentId, int userId) {
		this.storeFile(file, commentId, userId);
	}

	public void addNewFilesToComment(MultipartFile[] files, int commentId, int userId) {
		for (MultipartFile file : files) {
			this.addNewFileToComment(file, commentId, userId);
		}
	}
	
	// state 3
	public void removeAttachment(int attachmentid, int userId) {
		
		Optional<Attachment> attachment= this.AttachmentRepository.findById(attachmentid);
		if(attachment.isPresent())
		{
			Attachment a=attachment.get();
			a.setDeletedBy(userId);
			System.out.println(a.getFileName());
			this.AttachmentRepository.save(a);
			
			this.moveToDelete(a.getFileName());
			
			
		}
	}

	// state 1
	public void updateComment(int commentid, long alarmed_Obj_Key,String alarmed_Obj_level_Cd, String description, 
			int uplodedById, MultipartFile[] files) {

		Optional<Comments> oldOne = this.CommentsRepository.findById(commentid);
		if(oldOne.isPresent()) {
			oldOne.get().setStateIndicator("n");
			this.CommentsRepository.save(oldOne.get());
		}
		
		Comments s = new Comments();
		s.setAlarmed_Obj_Key(alarmed_Obj_Key);
		s.setAlarmed_Obj_level_Cd(alarmed_Obj_level_Cd);
		s.setDescription(description);
		s.setUploadDate(new Date());
		s.setPreviousComment(commentid);
		s.setStateIndicator("y");
		s.setUplodedById(uplodedById);
		Comments newComment = this.CommentsRepository.save(s);
//		this.CommentsRepository.findById(commentid).get().getAttachment().forEach(attach -> {
//			// attach.setUpdatedBy(comments.getUplodedById());
//			attach.setCommentId(newComment.getId());
//			this.AttachmentRepository.save(attach);
//		});
		System.out.println("HUSSIENHUSSIENBefor = " + this.CommentsRepository.getAllComments(alarmed_Obj_level_Cd, alarmed_Obj_Key).size());
		List<Attachment>list=this.CommentsRepository.findById(commentid).get().getAttachment();
		list.forEach(a->{
			a.setCommentId(newComment.getId());
			System.out.println(a.getCommentId()+"Arrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
			
			this.AttachmentRepository.save(a);
//			newComment.getAttachment().add(a);/**/
		});
		//
		System.out.println("HUSSIENHUSSIENAfter = " + this.CommentsRepository.getAllComments(alarmed_Obj_level_Cd, alarmed_Obj_Key).size() + " , " + newComment.getDescription());		
		newComment.setAttachment(list);
		this.CommentsRepository.save(newComment);
		//
		
		Arrays.asList(files).stream().
		map(file -> storeFile(file, newComment.getId(),uplodedById)).
		collect(Collectors.toList());

	}
	
	public Attachment uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("commentId") int commentId,
			@RequestParam("userId") int userId) {
		Attachment fileName = storeFile(file, commentId, userId);
		return fileName;
	}

}