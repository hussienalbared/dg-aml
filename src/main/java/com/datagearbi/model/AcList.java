package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_LIST database table.
 * 
 */
@Entity
@Table(name="AC_LIST")
@NamedQuery(name="AcList.findAll", query="SELECT a FROM AcList a")
public class AcList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="list_id")
	private long listId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user_id")
	private String deleteUserId;

	@Column(name="list_category_id")
	private BigDecimal listCategoryId;

	@Column(name="list_desc")
	private String listDesc;

	@Column(name="list_name")
	private String listName;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="validation_type_code")
	private String validationTypeCode;

	public AcList() {
	}

	public long getListId() {
		return this.listId;
	}

	public void setListId(long listId) {
		this.listId = listId;
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

	public BigDecimal getListCategoryId() {
		return this.listCategoryId;
	}

	public void setListCategoryId(BigDecimal listCategoryId) {
		this.listCategoryId = listCategoryId;
	}

	public String getListDesc() {
		return this.listDesc;
	}

	public void setListDesc(String listDesc) {
		this.listDesc = listDesc;
	}

	public String getListName() {
		return this.listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public String getValidationTypeCode() {
		return this.validationTypeCode;
	}

	public void setValidationTypeCode(String validationTypeCode) {
		this.validationTypeCode = validationTypeCode;
	}

}