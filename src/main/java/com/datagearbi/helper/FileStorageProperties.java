package com.datagearbi.helper;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;
    private String deleteDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }

	public String getDeleteDir() {
		return deleteDir;
	}

	public void setDeleteDir(String deleteDir) {
		this.deleteDir = deleteDir;
	}
}