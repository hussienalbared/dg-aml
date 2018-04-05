package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_INVESTIGATION_EVENT database table.
 * 
 */
@Entity
@Table(name="AC_INVESTIGATION_EVENT")
@NamedQuery(name="AcInvestigationEvent.findAll", query="SELECT a FROM AcInvestigationEvent a")
public class AcInvestigationEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="event_id")
	private long eventId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="event_description")
	private String eventDescription;

	@Column(name="event_type_code")
	private String eventTypeCode;

	@Column(name="investigation_id")
	private BigDecimal investigationId;

	public AcInvestigationEvent() {
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

	public String getEventDescription() {
		return this.eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventTypeCode() {
		return this.eventTypeCode;
	}

	public void setEventTypeCode(String eventTypeCode) {
		this.eventTypeCode = eventTypeCode;
	}

	public BigDecimal getInvestigationId() {
		return this.investigationId;
	}

	public void setInvestigationId(BigDecimal investigationId) {
		this.investigationId = investigationId;
	}

}