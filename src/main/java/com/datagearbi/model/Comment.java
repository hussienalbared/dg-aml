package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

import com.datagearbi.model.security.User;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the Comments database table.
 * 
 */
@Entity
@Table(schema = "AC", name = "Comments")
@NamedQuery(name = "Comment.findAll", query = "SELECT c FROM Comment c")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private long alarmed_Obj_Key;

	private String alarmed_Obj_level_Cd;

	private String description;

	private Date uploadDate;

	@Column(name = "UplodedById")
	private BigDecimal uplodedById;
	
	
	public Comment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAlarmed_Obj_Key() {
		return this.alarmed_Obj_Key;
	}

	public void setAlarmed_Obj_Key(long alarmed_Obj_Key) {
		this.alarmed_Obj_Key = alarmed_Obj_Key;
	}

	public String getAlarmed_Obj_level_Cd() {
		return this.alarmed_Obj_level_Cd;
	}

	public void setAlarmed_Obj_level_Cd(String alarmed_Obj_level_Cd) {
		this.alarmed_Obj_level_Cd = alarmed_Obj_level_Cd;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public BigDecimal getUplodedById() {
		return this.uplodedById;
	}

	public void setUplodedById(BigDecimal uplodedById) {
		this.uplodedById = uplodedById;
	}

}