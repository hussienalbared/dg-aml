package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the AC_Alarm_Case database table.
 * 
 */
@Entity
@NamedQuery(name = "CommentNotification.findAll", query = "SELECT a FROM CommentNotification a")
@Table(schema = "dbo")
@PrimaryKeyJoinColumn(name = "id")

public class CommentNotification extends Notification implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "commentId")
	private int commentId;

	@Column(name = "description")
	private String description;

	public CommentNotification() {
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

}