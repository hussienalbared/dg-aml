package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Case_Event database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Case_Event.findAll", query="SELECT a FROM AC_Case_Event a")
public class AC_Case_Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Event_Id")
	private long event_Id;

	@Column(name="Case_Id")
	private BigDecimal case_Id;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Event_Desc")
	private String event_Desc;

	@Column(name="Event_Type_Cd")
	private String event_Type_Cd;

	public AC_Case_Event() {
	}

	public long getEvent_Id() {
		return this.event_Id;
	}

	public void setEvent_Id(long event_Id) {
		this.event_Id = event_Id;
	}

	public BigDecimal getCase_Id() {
		return this.case_Id;
	}

	public void setCase_Id(BigDecimal case_Id) {
		this.case_Id = case_Id;
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

	public String getEvent_Desc() {
		return this.event_Desc;
	}

	public void setEvent_Desc(String event_Desc) {
		this.event_Desc = event_Desc;
	}

	public String getEvent_Type_Cd() {
		return this.event_Type_Cd;
	}

	public void setEvent_Type_Cd(String event_Type_Cd) {
		this.event_Type_Cd = event_Type_Cd;
	}

}