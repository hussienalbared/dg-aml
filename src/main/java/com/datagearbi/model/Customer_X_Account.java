package com.datagearbi.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the Customer_X_Account database table.
 * 
 */
@Entity
@NamedQuery(name="Customer_X_Account.findAll", query="SELECT c FROM Customer_X_Account c")
@Table(name="Customer_X_Account",schema="DGAMLCORE")
public class Customer_X_Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Customer_X_AccountPK id;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Role_Desc")
	private String role_Desc;

	public Customer_X_Account() {
	}

	public Customer_X_AccountPK getId() {
		return this.id;
	}

	public void setId(Customer_X_AccountPK id) {
		this.id = id;
	}

	public String getAcct_No() {
		return this.acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	public String getChg_Current_Ind() {
		return this.chg_Current_Ind;
	}

	public void setChg_Current_Ind(String chg_Current_Ind) {
		this.chg_Current_Ind = chg_Current_Ind;
	}

	public Timestamp getChg_End_Date() {
		return this.chg_End_Date;
	}

	public void setChg_End_Date(Timestamp chg_End_Date) {
		this.chg_End_Date = chg_End_Date;
	}

	public String getCust_No() {
		return this.cust_No;
	}

	public void setCust_No(String cust_No) {
		this.cust_No = cust_No;
	}

	public String getRole_Desc() {
		return this.role_Desc;
	}

	public void setRole_Desc(String role_Desc) {
		this.role_Desc = role_Desc;
	}

}