package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the DGAML012_Recurring_Phone_NUM database table.
 * 
 */
@Embeddable
@NamedQuery(name="DGAML012_Recurring_Phone_NUM.findAll", query="SELECT d FROM DGAML012_Recurring_Phone_NUM d")
public class DGAML012_Recurring_Phone_NUM implements Serializable {
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

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	@Column(name="Tel_No_1")
	private String tel_No_1;

	@Column(name="Tel_No_2")
	private String tel_No_2;

	@Column(name="Tel_No_3")
	private String tel_No_3;

	public DGAML012_Recurring_Phone_NUM() {
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

	public String getPolitical_Exp_Prsn_Ind() {
		return this.political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}

	public String getTel_No_1() {
		return this.tel_No_1;
	}

	public void setTel_No_1(String tel_No_1) {
		this.tel_No_1 = tel_No_1;
	}

	public String getTel_No_2() {
		return this.tel_No_2;
	}

	public void setTel_No_2(String tel_No_2) {
		this.tel_No_2 = tel_No_2;
	}

	public String getTel_No_3() {
		return this.tel_No_3;
	}

	public void setTel_No_3(String tel_No_3) {
		this.tel_No_3 = tel_No_3;
	}

}