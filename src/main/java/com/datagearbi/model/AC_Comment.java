package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Comments database table.
 * 
 */
@Entity
@Table(name="AC_Comments")
@NamedQuery(name="AC_Comment.findAll", query="SELECT a FROM AC_Comment a")
public class AC_Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Comment_Id")
	private long comment_Id;

	@Column(name="Comment_Categ_Cd")
	private String comment_Categ_Cd;

	@Column(name="Comment_Txt")
	private String comment_Txt;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Instance_Id")
	private String instance_Id;

	@Column(name="Instance_Type_Cd")
	private String instance_Type_Cd;

	@Column(name="Last_Update_Date")
	private Timestamp last_Update_Date;

	@Column(name="Last_Update_User_Id")
	private String last_Update_User_Id;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	public AC_Comment() {
	}

	public long getComment_Id() {
		return this.comment_Id;
	}

	public void setComment_Id(long comment_Id) {
		this.comment_Id = comment_Id;
	}

	public String getComment_Categ_Cd() {
		return this.comment_Categ_Cd;
	}

	public void setComment_Categ_Cd(String comment_Categ_Cd) {
		this.comment_Categ_Cd = comment_Categ_Cd;
	}

	public String getComment_Txt() {
		return this.comment_Txt;
	}

	public void setComment_Txt(String comment_Txt) {
		this.comment_Txt = comment_Txt;
	}

	public Timestamp getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public String getCreate_User_Id() {
		return this.create_User_Id;
	}

	public void setCreate_User_Id(String create_User_Id) {
		this.create_User_Id = create_User_Id;
	}

	public String getInstance_Id() {
		return this.instance_Id;
	}

	public void setInstance_Id(String instance_Id) {
		this.instance_Id = instance_Id;
	}

	public String getInstance_Type_Cd() {
		return this.instance_Type_Cd;
	}

	public void setInstance_Type_Cd(String instance_Type_Cd) {
		this.instance_Type_Cd = instance_Type_Cd;
	}

	public Timestamp getLast_Update_Date() {
		return this.last_Update_Date;
	}

	public void setLast_Update_Date(Timestamp last_Update_Date) {
		this.last_Update_Date = last_Update_Date;
	}

	public String getLast_Update_User_Id() {
		return this.last_Update_User_Id;
	}

	public void setLast_Update_User_Id(String last_Update_User_Id) {
		this.last_Update_User_Id = last_Update_User_Id;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

}