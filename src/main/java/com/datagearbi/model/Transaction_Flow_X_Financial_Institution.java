package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Transaction_Flow_X_Financial_Institution database table.
 * 
 */
@Embeddable
@NamedQuery(name="Transaction_Flow_X_Financial_Institution.findAll", query="SELECT t FROM Transaction_Flow_X_Financial_Institution t")
public class Transaction_Flow_X_Financial_Institution implements Serializable {
	private static final long serialVersionUID = 1L;

	private int FI_Key;

	@Column(name="Role_Desc")
	private String role_Desc;

	@Column(name="Seq_No")
	private int seq_No;

	@Column(name="Trans_Key")
	private int trans_Key;

	public Transaction_Flow_X_Financial_Institution() {
	}

	public int getFI_Key() {
		return this.FI_Key;
	}

	public void setFI_Key(int FI_Key) {
		this.FI_Key = FI_Key;
	}

	public String getRole_Desc() {
		return this.role_Desc;
	}

	public void setRole_Desc(String role_Desc) {
		this.role_Desc = role_Desc;
	}

	public int getSeq_No() {
		return this.seq_No;
	}

	public void setSeq_No(int seq_No) {
		this.seq_No = seq_No;
	}

	public int getTrans_Key() {
		return this.trans_Key;
	}

	public void setTrans_Key(int trans_Key) {
		this.trans_Key = trans_Key;
	}

}