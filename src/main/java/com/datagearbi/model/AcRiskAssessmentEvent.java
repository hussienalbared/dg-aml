package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_RISK_ASSESSMENT_EVENT database table.
 * 
 */
@Entity
@Table(name="AC_RISK_ASSESSMENT_EVENT")
@NamedQuery(name="AcRiskAssessmentEvent.findAll", query="SELECT a FROM AcRiskAssessmentEvent a")
public class AcRiskAssessmentEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="event_id")
	private long eventId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="event_desc")
	private String eventDesc;

	@Column(name="event_type_code")
	private String eventTypeCode;

	@Column(name="risk_assessment_id")
	private BigDecimal riskAssessmentId;

	public AcRiskAssessmentEvent() {
	}

	public long getEventId() {
		return this.eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
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

	public String getEventDesc() {
		return this.eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public String getEventTypeCode() {
		return this.eventTypeCode;
	}

	public void setEventTypeCode(String eventTypeCode) {
		this.eventTypeCode = eventTypeCode;
	}

	public BigDecimal getRiskAssessmentId() {
		return this.riskAssessmentId;
	}

	public void setRiskAssessmentId(BigDecimal riskAssessmentId) {
		this.riskAssessmentId = riskAssessmentId;
	}

}