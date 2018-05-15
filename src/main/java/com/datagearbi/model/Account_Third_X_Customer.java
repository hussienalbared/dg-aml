package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Account_Third_X_Customer database table.
 * 
 */
@Entity
@NamedQuery(name="Account_Third_X_Customer.findAll", query="SELECT a FROM Account_Third_X_Customer a")
public class Account_Third_X_Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Account_Third_X_CustomerPK id;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	@Column(name="Ext_Cust_No")
	private String ext_Cust_No;

	@Column(name="Rel_Desc")
	private String rel_Desc;

	@Column(name="Role_Desc")
	private String role_Desc;

	public Account_Third_X_Customer() {
	}

	public Account_Third_X_CustomerPK getId() {
		return this.id;
	}

	public void setId(Account_Third_X_CustomerPK id) {
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

	public String getExt_Cust_No() {
		return this.ext_Cust_No;
	}

	public void setExt_Cust_No(String ext_Cust_No) {
		this.ext_Cust_No = ext_Cust_No;
	}

	public String getRel_Desc() {
		return this.rel_Desc;
	}

	public void setRel_Desc(String rel_Desc) {
		this.rel_Desc = rel_Desc;
	}

	public String getRole_Desc() {
		return this.role_Desc;
	}

	public void setRole_Desc(String role_Desc) {
		this.role_Desc = role_Desc;
	}

}