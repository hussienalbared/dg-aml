package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_INVESTIGATION_OBJ_EVENT database table.
 * 
 */
@Entity
@Table(name="AC_INVESTIGATION_OBJ_EVENT")
@NamedQuery(name="AcInvestigationObjEvent.findAll", query="SELECT a FROM AcInvestigationObjEvent a")
public class AcInvestigationObjEvent implements Serializable {
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

	@Column(name="obj_key")
	private BigDecimal objKey;

	@Column(name="obj_level_code")
	private String objLevelCode;

	public AcInvestigationObjEvent() {
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

	public BigDecimal getObjKey() {
		return this.objKey;
	}

	public void setObjKey(BigDecimal objKey) {
		this.objKey = objKey;
	}

	public String getObjLevelCode() {
		return this.objLevelCode;
	}

	public void setObjLevelCode(String objLevelCode) {
		this.objLevelCode = objLevelCode;
	}

}