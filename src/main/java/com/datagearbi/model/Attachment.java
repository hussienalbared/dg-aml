package com.datagearbi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.datagearbi.model.security.User;
@Entity
@NamedQuery(name="Attachment.findAll", query="SELECT c FROM Attachment c")
@Table(schema="AC")
public class Attachment  implements Serializable {
//	@OneToOne(optional=true,fetch=FetchType.LAZY)
//	@NotFound(action=NotFoundAction.IGNORE)
//	@JoinColumn(insertable=false,updatable=false,name="UplodedById")
//	private User user;
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="description")
	private String description;

	@Column(name="UplodedById")
	private int UplodedById;

	@Column(name="uploadDate")
	private Date uploadDate;

	@Column(name="alarmed_Obj_level_Cd")
	private String alarmed_Obj_level_Cd;

	@Column(name="alarmed_Obj_Key")
	private long alarmed_Obj_Key;
	
	@Column(name="filepath")
	private String filepath;
	
	@Column(name="fileName")
	private String fileName;
	
	@Column(name="commentId")
	private int commentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUplodedById() {
		return UplodedById;
	}

	public void setUplodedById(int uplodedById) {
		UplodedById = uplodedById;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getAlarmed_Obj_level_Cd() {
		return alarmed_Obj_level_Cd;
	}

	public void setAlarmed_Obj_level_Cd(String alarmed_Obj_level_Cd) {
		this.alarmed_Obj_level_Cd = alarmed_Obj_level_Cd;
	}

	public long getAlarmed_Obj_Key() {
		return alarmed_Obj_Key;
	}

	public void setAlarmed_Obj_Key(long alarmed_Obj_Key) {
		this.alarmed_Obj_Key = alarmed_Obj_Key;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}


}
