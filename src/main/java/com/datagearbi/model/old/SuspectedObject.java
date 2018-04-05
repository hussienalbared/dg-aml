package com.datagearbi.model.old;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "AML", name = "AC_SUSPECTED_OBJS")
public class SuspectedObject {
	@EmbeddedId
	private SuspectedObjectId customerId;
	
	private String obj_number;
	private String obj_name;
	private int alert_count;// [decimal](4, 0) NULL,
	private int transactions_count;// [decimal](8, 0) NULL,
	private double total_amount;// [decimal](15, 3) NULL,
	private int oldest_alert;// [decimal](4, 0) NULL,
	private String risk_classification_code;
	private int money_laundering_score;// [decimal](4, 0) NULL,
	private String employee_ind;// [char](1) NULL,
	private String compliance_userid;
	private String pep_ind;// [char](1) NULL,
	private Date created_on;

	public SuspectedObject() {

	}	
	
	public SuspectedObject(SuspectedObjectId customerId, String obj_number, String obj_name, int alert_count,
			int transactions_count, double total_amount, int oldest_alert, String risk_classification_code,
			int money_laundering_score, String employee_ind, String compliance_userid, String pep_ind,
			Date created_on) {
		this.customerId = customerId;
		this.obj_number = obj_number;
		this.obj_name = obj_name;
		this.alert_count = alert_count;
		this.transactions_count = transactions_count;
		this.total_amount = total_amount;
		this.oldest_alert = oldest_alert;
		this.risk_classification_code = risk_classification_code;
		this.money_laundering_score = money_laundering_score;
		this.employee_ind = employee_ind;
		this.compliance_userid = compliance_userid;
		this.pep_ind = pep_ind;
		this.created_on = created_on;
	}

	public SuspectedObjectId getCustomerId() {
		return customerId;
	}

	public void setCustomerId(SuspectedObjectId customerId) {
		this.customerId = customerId;
	}

	public String getObj_number() {
		return obj_number;
	}

	public void setObj_number(String obj_number) {
		this.obj_number = obj_number;
	}

	public String getObj_name() {
		return obj_name;
	}

	public void setObj_name(String obj_name) {
		this.obj_name = obj_name;
	}

	public int getAlert_count() {
		return alert_count;
	}

	public void setAlert_count(int alert_count) {
		this.alert_count = alert_count;
	}

	public int getTransactions_count() {
		return transactions_count;
	}

	public void setTransactions_count(int transactions_count) {
		this.transactions_count = transactions_count;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public int getOldest_alert() {
		return oldest_alert;
	}

	public void setOldest_alert(int oldest_alert) {
		this.oldest_alert = oldest_alert;
	}

	public String getRisk_classification_code() {
		return risk_classification_code;
	}

	public void setRisk_classification_code(String risk_classification_code) {
		this.risk_classification_code = risk_classification_code;
	}

	public int getMoney_laundering_score() {
		return money_laundering_score;
	}

	public void setMoney_laundering_score(int money_laundering_score) {
		this.money_laundering_score = money_laundering_score;
	}

	public String getEmployee_ind() {
		return employee_ind;
	}

	public void setEmployee_ind(String employee_ind) {
		this.employee_ind = employee_ind;
	}

	public String getCompliance_userid() {
		return compliance_userid;
	}

	public void setCompliance_userid(String compliance_userid) {
		this.compliance_userid = compliance_userid;
	}

	public String getPep_ind() {
		return pep_ind;
	}

	public void setPep_ind(String pep_ind) {
		this.pep_ind = pep_ind;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

}