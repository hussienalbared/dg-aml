package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Transaction_Details database table.
 * 
 */
@Entity
@Table(name="Transaction_Details",schema="DGAMLCORE")
@NamedQuery(name="Transaction_Detail.findAll", query="SELECT t FROM Transaction_Detail t")
public class Transaction_Detail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Trans_Key")
	private int trans_Key;

	@Column(name="Check_No")
	private String check_No;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Deal_No")
	private String deal_No;

	@Column(name="Mech_Id")
	private String mech_Id;

	@Column(name="Secur_Name")
	private String secur_Name;

	@Column(name="Trans_Desc")
	private String trans_Desc;

	@Column(name="Trans_Ref_No")
	private String trans_Ref_No;

	public Transaction_Detail() {
	}

	public int getTrans_Key() {
		return this.trans_Key;
	}

	public void setTrans_Key(int trans_Key) {
		this.trans_Key = trans_Key;
	}

	public String getCheck_No() {
		return this.check_No;
	}

	public void setCheck_No(String check_No) {
		this.check_No = check_No;
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public String getDeal_No() {
		return this.deal_No;
	}

	public void setDeal_No(String deal_No) {
		this.deal_No = deal_No;
	}

	public String getMech_Id() {
		return this.mech_Id;
	}

	public void setMech_Id(String mech_Id) {
		this.mech_Id = mech_Id;
	}

	public String getSecur_Name() {
		return this.secur_Name;
	}

	public void setSecur_Name(String secur_Name) {
		this.secur_Name = secur_Name;
	}

	public String getTrans_Desc() {
		return this.trans_Desc;
	}

	public void setTrans_Desc(String trans_Desc) {
		this.trans_Desc = trans_Desc;
	}

	public String getTrans_Ref_No() {
		return this.trans_Ref_No;
	}

	public void setTrans_Ref_No(String trans_Ref_No) {
		this.trans_Ref_No = trans_Ref_No;
	}

}