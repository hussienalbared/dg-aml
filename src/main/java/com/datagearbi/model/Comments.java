package com.datagearbi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@NamedQuery(name="Comments.findAll", query="SELECT c FROM Comments c")
@Table(schema="AC")
public class Comments implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

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



}
