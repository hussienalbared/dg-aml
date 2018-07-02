package com.datagearbi.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

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
import com.datagearbi.repository.AttachmentRepository;

@Service
public class FileStorageService {

	private final Path fileStorageLocation;
	@Autowired
	private AttachmentRepository AttachmentRepository;

	  @Autowired
	    public FileStorageService(FileStorageProperties fileStorageProperties) {
	        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
	                .toAbsolutePath().normalize();

	        try {
	            Files.createDirectories(this.fileStorageLocation);
	        } catch (Exception ex) {
	            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
	        }
	    }

	public Attachment storeFile(MultipartFile file,long alarmed_Obj_Key,
			String alarmed_Obj_level_Cd,String description,int uplodedById) {
		// Normalize file name
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		System.out.println(fileName + "{}");

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
			}

			// Copy file to the target location (Replacing existing file with the same name)
			Path targetLocation = this.fileStorageLocation.resolve(fileName);
			System.out.println(targetLocation);
			Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
			Attachment x = new Attachment();
			 x.setAlarmed_Obj_Key(alarmed_Obj_Key);
			 x.setAlarmed_Obj_level_Cd(alarmed_Obj_level_Cd);
			x.setCommentId(-1);
			 x.setDescription(description);
			x.setFileName(file.getOriginalFilename());
			x.setFilepath(targetLocation.toString());
			x.setUploadDate(new Date());
			 x.setUplodedById(uplodedById);

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