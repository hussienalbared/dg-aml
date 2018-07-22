package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Risk_Assessment_Email database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Risk_Assessment_Email.findAll", query="SELECT a FROM AC_Risk_Assessment_Email a")
public class AC_Risk_Assessment_Email implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Email_Id")
	private long email_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Email_Cc_Txt")
	private String email_Cc_Txt;

	@Column(name="Email_Msg_Txt")
	private String email_Msg_Txt;

	@Column(name="Email_Subj_Desc")
	private String email_Subj_Desc;

	@Column(name="Email_To_Txt")
	private String email_To_Txt;

	@Column(name="Risk_Assmnt_Id")
	private BigDecimal risk_Assmnt_Id;

	public AC_Risk_Assessment_Email() {
	}

	public long getEmail_Id() {
		return this.email_Id;
	}

	public void setEmail_Id(long email_Id) {
		this.email_Id = email_Id;
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

	public String getEmail_Cc_Txt() {
		return this.email_Cc_Txt;
	}

	public void setEmail_Cc_Txt(String email_Cc_Txt) {
		this.email_Cc_Txt = email_Cc_Txt;
	}

	public String getEmail_Msg_Txt() {
		return this.email_Msg_Txt;
	}

	public void setEmail_Msg_Txt(String email_Msg_Txt) {
		this.email_Msg_Txt = email_Msg_Txt;
	}

	public String getEmail_Subj_Desc() {
		return this.email_Subj_Desc;
	}

	public void setEmail_Subj_Desc(String email_Subj_Desc) {
		this.email_Subj_Desc = email_Subj_Desc;
	}

	public String getEmail_To_Txt() {
		return this.email_To_Txt;
	}

	public void setEmail_To_Txt(String email_To_Txt) {
		this.email_To_Txt = email_To_Txt;
	}

	public BigDecimal getRisk_Assmnt_Id() {
		return this.risk_Assmnt_Id;
	}

	public void setRisk_Assmnt_Id(BigDecimal risk_Assmnt_Id) {
		this.risk_Assmnt_Id = risk_Assmnt_Id;
	}

}