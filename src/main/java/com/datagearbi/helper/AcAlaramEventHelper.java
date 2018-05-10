package com.datagearbi.helper;

import java.math.BigDecimal;

public class AcAlaramEventHelper {
	private BigDecimal alarm_id ;
	private	String event_type_code;
	private String event_description;
	private String create_user_id;
	public AcAlaramEventHelper() {
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getAlarm_id() {
		return alarm_id;
	}
	public void setAlarm_id(BigDecimal alarm_id) {
		this.alarm_id = alarm_id;
	}
	public String getEvent_type_code() {
		return event_type_code;
	}
	public void setEvent_type_code(String event_type_code) {
		this.event_type_code = event_type_code;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public String getCreate_user_id() {
		return create_user_id;
	}
	public void setCreate_user_id(String create_user_id) {
		this.create_user_id = create_user_id;
	}
	
	

}
