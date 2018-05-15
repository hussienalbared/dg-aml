package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Alarm_Email database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Alarm_Email.findAll", query="SELECT a FROM AC_Alarm_Email a")
public class AC_Alarm_Email implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Email_Id")
	private long email_Id;

	@Column(name="Alarm_Id")
	private BigDecimal alarm_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Email_Cc_Txt")
	private String email_Cc_Txt;

	@Column(name="Email_Msg_Text")
	private String email_Msg_Text;

	@Column(name="Email_Subj_Desc")
	private String email_Subj_Desc;

	@Column(name="Email_To_Txt")
	private String email_To_Txt;

	public AC_Alarm_Email() {
	}

	public long getEmail_Id() {
		return this.email_Id;
	}

	public void setEmail_Id(long email_Id) {
		this.email_Id = email_Id;
	}

	public BigDecimal getAlarm_Id() {
		return this.alarm_Id;
	}

	public void setAlarm_Id(BigDecimal alarm_Id) {
		this.alarm_Id = alarm_Id;
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

	public String getEmail_Msg_Text() {
		return this.email_Msg_Text;
	}

	public void setEmail_Msg_Text(String email_Msg_Text) {
		this.email_Msg_Text = email_Msg_Text;
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

}