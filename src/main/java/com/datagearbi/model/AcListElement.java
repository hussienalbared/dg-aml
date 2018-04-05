package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_LIST_ELEMENT database table.
 * 
 */
@Entity
@Table(name="AC_LIST_ELEMENT")
@NamedQuery(name="AcListElement.findAll", query="SELECT a FROM AcListElement a")
public class AcListElement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="list_element_id")
	private long listElementId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="delete_date")
	private Timestamp deleteDate;

	@Column(name="delete_user_id")
	private String deleteUserId;

	@Column(name="list_element_desc")
	private String listElementDesc;

	@Column(name="list_element_value")
	private String listElementValue;

	@Column(name="list_id")
	private BigDecimal listId;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	public AcListElement() {
	}

	public long getListElementId() {
		return this.listElementId;
	}

	public void setListElementId(long listElementId) {
		this.listElementId = listElementId;
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

	public String getListElementDesc() {
		return this.listElementDesc;
	}

	public void setListElementDesc(String listElementDesc) {
		this.listElementDesc = listElementDesc;
	}

	public String getListElementValue() {
		return this.listElementValue;
	}

	public void setListElementValue(String listElementValue) {
		this.listElementValue = listElementValue;
	}

	public BigDecimal getListId() {
		return this.listId;
	}

	public void setListId(BigDecimal listId) {
		this.listId = listId;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

}