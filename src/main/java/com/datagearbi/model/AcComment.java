package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_COMMENTS database table.
 * 
 */
@Entity
@Table(name="AC_COMMENTS")
@NamedQuery(name="AcComment.findAll", query="SELECT a FROM AcComment a")
public class AcComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="comment_id")
	private long commentId;

	@Column(name="comment_category_cd")
	private String commentCategoryCd;

	@Column(name="comment_text")
	private String commentText;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="lstupdate_date")
	private Timestamp lstupdateDate;

	@Column(name="lstupdate_user_id")
	private String lstupdateUserId;

	@Column(name="obj_id")
	private String objId;

	@Column(name="obj_type_cd")
	private String objTypeCd;

	public AcComment() {
	}

	public long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public String getCommentCategoryCd() {
		return this.commentCategoryCd;
	}

	public void setCommentCategoryCd(String commentCategoryCd) {
		this.commentCategoryCd = commentCategoryCd;
	}

	public String getCommentText() {
		return this.commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
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

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public Timestamp getLstupdateDate() {
		return this.lstupdateDate;
	}

	public void setLstupdateDate(Timestamp lstupdateDate) {
		this.lstupdateDate = lstupdateDate;
	}

	public String getLstupdateUserId() {
		return this.lstupdateUserId;
	}

	public void setLstupdateUserId(String lstupdateUserId) {
		this.lstupdateUserId = lstupdateUserId;
	}

	public String getObjId() {
		return this.objId;
	}

	public void setObjId(String objId) {
		this.objId = objId;
	}

	public String getObjTypeCd() {
		return this.objTypeCd;
	}

	public void setObjTypeCd(String objTypeCd) {
		this.objTypeCd = objTypeCd;
	}

}