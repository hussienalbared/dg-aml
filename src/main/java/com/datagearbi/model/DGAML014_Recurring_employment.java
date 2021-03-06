package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the DGAML014_Recurring_employment database table.
 * 
 */
@Embeddable
@NamedQuery(name="DGAML014_Recurring_employment.findAll", query="SELECT d FROM DGAML014_Recurring_employment d")
public class DGAML014_Recurring_employment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="Empr_Name")
	private String empr_Name;

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	public DGAML014_Recurring_employment() {
	}

	public int getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_Name() {
		return this.cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_No() {
		return this.cust_No;
	}

	public void setCust_No(String cust_No) {
		this.cust_No = cust_No;
	}

	public String getCust_Type_Desc() {
		return this.cust_Type_Desc;
	}

	public void setCust_Type_Desc(String cust_Type_Desc) {
		this.cust_Type_Desc = cust_Type_Desc;
	}

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public String getEmpr_Name() {
		return this.empr_Name;
	}

	public void setEmpr_Name(String empr_Name) {
		this.empr_Name = empr_Name;
	}

	public String getPolitical_Exp_Prsn_Ind() {
		return this.political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}

}