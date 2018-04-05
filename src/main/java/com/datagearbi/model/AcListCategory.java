package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_LIST_CATEGORY database table.
 * 
 */
@Entity
@Table(name="AC_LIST_CATEGORY")
@NamedQuery(name="AcListCategory.findAll", query="SELECT a FROM AcListCategory a")
public class AcListCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="list_category_id")
	private long listCategoryId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user_id")
	private String deleteUserId;

	@Column(name="list_category_desc")
	private String listCategoryDesc;

	@Column(name="list_category_name")
	private String listCategoryName;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	public AcListCategory() {
	}

	public long getListCategoryId() {
		return this.listCategoryId;
	}

	public void setListCategoryId(long listCategoryId) {
		this.listCategoryId = listCategoryId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Timestamp getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getDeleteUserId() {
		return this.deleteUserId;
	}

	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	public String getListCategoryDesc() {
		return this.listCategoryDesc;
	}

	public void setListCategoryDesc(String listCategoryDesc) {
		this.listCategoryDesc = listCategoryDesc;
	}

	public String getListCategoryName() {
		return this.listCategoryName;
	}

	public void setListCategoryName(String listCategoryName) {
		this.listCategoryName = listCategoryName;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

}