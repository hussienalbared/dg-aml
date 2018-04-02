package com.datagearbi.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema = "AML", name = "AC_ALARM")
public class Alaram {
	@Id
private double alarm_id;// alarm_id	decimal(12, 0)
private String product_type;//product_type	char(3)
private String alarm_status_code;//alarm_status_code	char(3)
private int money_laundering_risk_score ;//money_laundering_risk_score	decimal(3, 0)
private int  terror_financing_risk_score;//terror_financing_risk_score	decimal(3, 0)
private String alarm_description;//alarm_description	varchar(100)
private String primary_obj_level_code;//primary_obj_level_code	char(3)
private String alarmed_obj_number;//alarmed_obj_number	varchar(50)
private  String alarmed_obj_name;//alarmed_obj_name	varchar(200)
private String primary_obj_number;//primary_obj_number	varchar(50)
private double primary_obj_key;//primary_obj_key	decimal(12, 0)
private String primary_obj_name;//primary_obj_name	varchar(200)
private double routine_id;//routine_id	decimal(12, 0)
private String routine_name;//routine_name	varchar(35)
private Date suppression_end_date;//suppression_end_date	datetime
private String actual_values_text;//actual_values_text	varchar(255)
private Date run_date;//run_date	datetime
private Date create_date;//create_date	datetime
private String create_user_id;//create_user_id	varchar(60)
private String employee_ind;//employee_ind	char(1)
private double version_number;//version_number	decimal(10, 0)
private String logical_delete_ind;//logical_delete_ind	char(1)
private String alarm_type_cd;//alarm_type_cd	varchar(32)
private String alarm_category_cd;//alarm_category_cd	varchar(32)
private String alarm_subcategory_cd;//alarm_subcategory_cd	varchar(32)
private double alarmed_obj_key;//alarmed_obj_key	decimal(12, 0)
private String alarmed_obj_level_code;//alarmed_obj_level_code	char(3)
public double getAlarm_id() {
	return alarm_id;
}
public void setAlarm_id(double alarm_id) {
	this.alarm_id = alarm_id;
}
public String getProduct_type() {
	return product_type;
}
public void setProduct_type(String product_type) {
	this.product_type = product_type;
}
public String getAlarm_status_code() {
	return alarm_status_code;
}
public void setAlarm_status_code(String alarm_status_code) {
	this.alarm_status_code = alarm_status_code;
}
public int getMoney_laundering_risk_score() {
	return money_laundering_risk_score;
}
public void setMoney_laundering_risk_score(int money_laundering_risk_score) {
	this.money_laundering_risk_score = money_laundering_risk_score;
}
public int getTerror_financing_risk_score() {
	return terror_financing_risk_score;
}
public void setTerror_financing_risk_score(int terror_financing_risk_score) {
	this.terror_financing_risk_score = terror_financing_risk_score;
}
public String getAlarm_description() {
	return alarm_description;
}
public void setAlarm_description(String alarm_description) {
	this.alarm_description = alarm_description;
}
public String getPrimary_obj_level_code() {
	return primary_obj_level_code;
}
public void setPrimary_obj_level_code(String primary_obj_level_code) {
	this.primary_obj_level_code = primary_obj_level_code;
}
public String getAlarmed_obj_number() {
	return alarmed_obj_number;
}
public void setAlarmed_obj_number(String alarmed_obj_number) {
	this.alarmed_obj_number = alarmed_obj_number;
}
public String getAlarmed_obj_name() {
	return alarmed_obj_name;
}
public void setAlarmed_obj_name(String alarmed_obj_name) {
	this.alarmed_obj_name = alarmed_obj_name;
}
public String getPrimary_obj_number() {
	return primary_obj_number;
}
public void setPrimary_obj_number(String primary_obj_number) {
	this.primary_obj_number = primary_obj_number;
}
public double getPrimary_obj_key() {
	return primary_obj_key;
}
public void setPrimary_obj_key(double primary_obj_key) {
	this.primary_obj_key = primary_obj_key;
}
public String getPrimary_obj_name() {
	return primary_obj_name;
}
public void setPrimary_obj_name(String primary_obj_name) {
	this.primary_obj_name = primary_obj_name;
}
public double getRoutine_id() {
	return routine_id;
}
public void setRoutine_id(double routine_id) {
	this.routine_id = routine_id;
}
public String getRoutine_name() {
	return routine_name;
}
public void setRoutine_name(String routine_name) {
	this.routine_name = routine_name;
}
public Date getSuppression_end_date() {
	return suppression_end_date;
}
public void setSuppression_end_date(Date suppression_end_date) {
	this.suppression_end_date = suppression_end_date;
}
public String getActual_values_text() {
	return actual_values_text;
}
public void setActual_values_text(String actual_values_text) {
	this.actual_values_text = actual_values_text;
}
public Date getRun_date() {
	return run_date;
}
public void setRun_date(Date run_date) {
	this.run_date = run_date;
}
public Date getCreate_date() {
	return create_date;
}
public void setCreate_date(Date create_date) {
	this.create_date = create_date;
}
public String getCreate_user_id() {
	return create_user_id;
}
public void setCreate_user_id(String create_user_id) {
	this.create_user_id = create_user_id;
}
public String getEmployee_ind() {
	return employee_ind;
}
public void setEmployee_ind(String employee_ind) {
	this.employee_ind = employee_ind;
}
public double getVersion_number() {
	return version_number;
}
public void setVersion_number(double version_number) {
	this.version_number = version_number;
}
public String getLogical_delete_ind() {
	return logical_delete_ind;
}
public void setLogical_delete_ind(String logical_delete_ind) {
	this.logical_delete_ind = logical_delete_ind;
}
public String getAlarm_type_cd() {
	return alarm_type_cd;
}
public void setAlarm_type_cd(String alarm_type_cd) {
	this.alarm_type_cd = alarm_type_cd;
}
public String getAlarm_category_cd() {
	return alarm_category_cd;
}
public void setAlarm_category_cd(String alarm_category_cd) {
	this.alarm_category_cd = alarm_category_cd;
}
public String getAlarm_subcategory_cd() {
	return alarm_subcategory_cd;
}
public void setAlarm_subcategory_cd(String alarm_subcategory_cd) {
	this.alarm_subcategory_cd = alarm_subcategory_cd;
}
public double getAlarmed_obj_key() {
	return alarmed_obj_key;
}
public void setAlarmed_obj_key(double alarmed_obj_key) {
	this.alarmed_obj_key = alarmed_obj_key;
}
public String getAlarmed_obj_level_code() {
	return alarmed_obj_level_code;
}
public void setAlarmed_obj_level_code(String alarmed_obj_level_code) {
	this.alarmed_obj_level_code = alarmed_obj_level_code;
}
public Alaram(double alarm_id, String product_type, String alarm_status_code, int money_laundering_risk_score,
		int terror_financing_risk_score, String alarm_description, String primary_obj_level_code,
		String alarmed_obj_number, String alarmed_obj_name, String primary_obj_number, double primary_obj_key,
		String primary_obj_name, double routine_id, String routine_name, Date suppression_end_date,
		String actual_values_text, Date run_date, Date create_date, String create_user_id, String employee_ind,
		double version_number, String logical_delete_ind, String alarm_type_cd, String alarm_category_cd,
		String alarm_subcategory_cd, double alarmed_obj_key, String alarmed_obj_level_code) {
	super();
	this.alarm_id = alarm_id;
	this.product_type = product_type;
	this.alarm_status_code = alarm_status_code;
	this.money_laundering_risk_score = money_laundering_risk_score;
	this.terror_financing_risk_score = terror_financing_risk_score;
	this.alarm_description = alarm_description;
	this.primary_obj_level_code = primary_obj_level_code;
	this.alarmed_obj_number = alarmed_obj_number;
	this.alarmed_obj_name = alarmed_obj_name;
	this.primary_obj_number = primary_obj_number;
	this.primary_obj_key = primary_obj_key;
	this.primary_obj_name = primary_obj_name;
	this.routine_id = routine_id;
	this.routine_name = routine_name;
	this.suppression_end_date = suppression_end_date;
	this.actual_values_text = actual_values_text;
	this.run_date = run_date;
	this.create_date = create_date;
	this.create_user_id = create_user_id;
	this.employee_ind = employee_ind;
	this.version_number = version_number;
	this.logical_delete_ind = logical_delete_ind;
	this.alarm_type_cd = alarm_type_cd;
	this.alarm_category_cd = alarm_category_cd;
	this.alarm_subcategory_cd = alarm_subcategory_cd;
	this.alarmed_obj_key = alarmed_obj_key;
	this.alarmed_obj_level_code = alarmed_obj_level_code;
}

	public Alaram() {
		// TODO Auto-generated constructor stub
	}
}