package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the AC_CAT_LKP database table.
 * 
 */
@Entity
@Table(name="AC_CAT_LKP")
@NamedQuery(name="AcCatLkp.findAll", query="SELECT a FROM AcCatLkp a")
public class AcCatLkp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CAT_CODE")
	private String catCode;
@Id
	@Column(name="CAT_ID")
	private int catId;

	@Column(name="CAT_NAME")
	private String catName;

	public AcCatLkp() {
	}

	public String getCatCode() {
		return this.catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	public int getCatId() {
		return this.catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

}