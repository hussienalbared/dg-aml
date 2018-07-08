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
			c.getAttachment().forEach(attach -> {
				this.moveToDelete(attach.getFileName());
			});

			Comments v = new Comments();
			v.setAlarmed_Obj_Key(c.getAlarmed_Obj_Key());
			v.setAlarmed_Obj_level_Cd(c.getAlarmed_Obj_level_Cd());
			v.setDescription(c.getDescription());
			v.setPreviousComment(c.getId());
			v.setStateIndicator("y");
			v.setUploadDate(new Date());
			v.setUplodedById(updaterId);
			this.CommentsRepository.save(v);

		}

	}

	// state 2
	// user id the id of user who add the file
	public void addNewFileToComment(MultipartFile file, int commentId, int userId) {
		this.storeFile(file, commentId, userId);

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
	public void updateComment(Comments comments, MultipartFile[] files) {

		Comments s = new Comments();
		s.setAlarmed_Obj_Key(comments.getAlarmed_Obj_Key());
		s.setAlarmed_Obj_level_Cd(comments.getAlarmed_Obj_level_Cd());
		s.setDescription(comments.getDescription());
		s.setUploadDate(new Date());
		s.setPreviousComment(comments.getId());
		s.setStateIndicator("y");
		s.setUplodedById(comments.getUplodedById());
		Comments newComment = this.CommentsRepository.save(s);
		this.CommentsRepository.findById(comments.getId()).get().getAttachment().forEach(attach -> {
			// attach.setUpdatedBy(comments.getUplodedById());
			attach.setCommentId(newComment.getId());
			this.AttachmentRepository.save(attach);
		});
		
		Arrays.asList(files).stream().
		map(file -> storeFile(file, newComment.getId(),comments.getUplodedById())).
		collect(Collectors.toList());

	}

}