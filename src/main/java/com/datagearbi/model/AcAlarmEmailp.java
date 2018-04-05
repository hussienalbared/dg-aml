package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_ALARM_EMAIL database table.
 * 
 */
@Entity
@Table(name="AC_ALARM_EMAIL")
@NamedQuery(name="AcAlarmEmailp.findAll", query="SELECT a FROM AcAlarmEmailp a")
public class AcAlarmEmailp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="email_id")
	private long emailId;

	@Column(name="alarm_id")
	private BigDecimal alarmId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="email_cc_text")
	private String emailCcText;

	@Column(name="email_message_text")
	private String emailMessageText;

	@Column(name="email_subject_desc")
	private String emailSubjectDesc;

	@Column(name="email_to_text")
	private String emailToText;

	public AcAlarmEmailp() {
	}

	public long getEmailId() {
		return this.emailId;
	}

	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}

	public BigDecimal getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(BigDecimal alarmId) {
		this.alarmId = alarmId;
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

	public String getEmailCcText() {
		return this.emailCcText;
	}

	public void setEmailCcText(String emailCcText) {
		this.emailCcText = emailCcText;
	}

	public String getEmailMessageText() {
		return this.emailMessageText;
	}

	public void setEmailMessageText(String emailMessageText) {
		this.emailMessageText = emailMessageText;
	}

	public String getEmailSubjectDesc() {
		return this.emailSubjectDesc;
	}

	public void setEmailSubjectDesc(String emailSubjectDesc) {
		this.emailSubjectDesc = emailSubjectDesc;
	}

	public String getEmailToText() {
		return this.emailToText;
	}

	public void setEmailToText(String emailToText) {
		this.emailToText = emailToText;
	}

}