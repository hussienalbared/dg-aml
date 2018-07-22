package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Transaction_Type database table.
 * 
 */
@Entity
@NamedQuery(name="Transaction_Type.findAll", query="SELECT t FROM Transaction_Type t")
public class Transaction_Type implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Trans_Type_Key")
	private int trans_Type_Key;

	@Column(name="Fund_Secur_Cd")
	private String fund_Secur_Cd;

	@Column(name="Fund_Secur_Desc")
	private String fund_Secur_Desc;

	@Column(name="Mech_Desc")
	private String mech_Desc;

	@Column(name="Prim_Med_Desc")
	private String prim_Med_Desc;

	@Column(name="Sec_Med_Desc")
	private String sec_Med_Desc;

	@Column(name="Trans_Cr_Db_Ind_Cd")
	private String trans_Cr_Db_Ind_Cd;

	@Column(name="Trans_Cr_Db_Ind_Desc")
	private String trans_Cr_Db_Ind_Desc;

	@Column(name="Trans_Date")
	private String trans_Date;

	public Transaction_Type() {
	}

	public int getTrans_Type_Key() {
		return this.trans_Type_Key;
	}

	public void setTrans_Type_Key(int trans_Type_Key) {
		this.trans_Type_Key = trans_Type_Key;
	}

	public String getFund_Secur_Cd() {
		return this.fund_Secur_Cd;
	}

	public void setFund_Secur_Cd(String fund_Secur_Cd) {
		this.fund_Secur_Cd = fund_Secur_Cd;
	}

	public String getFund_Secur_Desc() {
		return this.fund_Secur_Desc;
	}

	public void setFund_Secur_Desc(String fund_Secur_Desc) {
		this.fund_Secur_Desc = fund_Secur_Desc;
	}

	public String getMech_Desc() {
		return this.mech_Desc;
	}

	public void setMech_Desc(String mech_Desc) {
		this.mech_Desc = mech_Desc;
	}

	public String getPrim_Med_Desc() {
		return this.prim_Med_Desc;
	}

	public void setPrim_Med_Desc(String prim_Med_Desc) {
		this.prim_Med_Desc = prim_Med_Desc;
	}

	public String getSec_Med_Desc() {
		return this.sec_Med_Desc;
	}

	public void setSec_Med_Desc(String sec_Med_Desc) {
		this.sec_Med_Desc = sec_Med_Desc;
	}

	public String getTrans_Cr_Db_Ind_Cd() {
		return this.trans_Cr_Db_Ind_Cd;
	}

	public void setTrans_Cr_Db_Ind_Cd(String trans_Cr_Db_Ind_Cd) {
		this.trans_Cr_Db_Ind_Cd = trans_Cr_Db_Ind_Cd;
	}

	public String getTrans_Cr_Db_Ind_Desc() {
		return this.trans_Cr_Db_Ind_Desc;
	}

	public void setTrans_Cr_Db_Ind_Desc(String trans_Cr_Db_Ind_Desc) {
		this.trans_Cr_Db_Ind_Desc = trans_Cr_Db_Ind_Desc;
	}

	public String getTrans_Date() {
		return this.trans_Date;
	}

	public void setTrans_Date(String trans_Date) {
		this.trans_Date = trans_Date;
	}

}