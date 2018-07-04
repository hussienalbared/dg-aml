package com.datagearbi.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
	@Autowired
	private AttachmentRepository AttachmentRepository;
	@Autowired
	private CommentsRepository CommentsRepository;

	@Autowired
	public FileStorageService(FileStorageProperties fileStorageProperties) {
		this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir()).toAbsolutePath().normalize();

		try {
			Files.createDirectories(this.fileStorageLocation);
		} catch (Exception ex) {
			throw new FileStorageException("Could not create the directory where the uploaded files will be stored.",
					ex);
		}
	}

	public Attachment storeFile(MultipartFile file, int commentId) {
		// Normalize file name
		List<Attachment> files = this.AttachmentRepository.findByfileName(file.getOriginalFilename());
		String fileName;
		Path targetLocation;
		if (files.size() > 0) {

			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");

			String strDate = dateFormat.format(date);

			 fileName = StringUtils.cleanPath(file.getOriginalFilename());
			int extensionIndex = fileName.lastIndexOf('.');

			 fileName = fileName.substring(0, extensionIndex) + strDate + fileName.substring(extensionIndex);
		
		}
		else
		{
			 fileName = StringUtils.cleanPath(file.getOriginalFilename());
			
		}

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			// Copy file to the target location (Replacing existing file with the same name)
			 targetLocation = this.fileStorageLocation.resolve(fileName);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
			Attachment x = new Attachment();
			x.setCommentId(commentId);
			x.setFileName(file.getOriginalFilename());
			x.setFilepath(targetLocation.toString());

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

}