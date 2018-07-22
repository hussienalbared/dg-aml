package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the suspected_transactions_V database table.
 * 
 */
@Entity
@Table(name="suspected_transactions_V",schema="DGAMLCORE")
@NamedQuery(name="Suspected_transactions_V.findAll", query="SELECT s FROM Suspected_transactions_V s")
public class Suspected_transactions_V implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="Acct_No")
    private String acct_No;
	@Column(name="Acct_Key")
	private int acct_Key;

	public String getAcct_No() {
		return acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	@Column(name="Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Trans_Cr_Db_Ind_Desc")
	private String trans_Cr_Db_Ind_Desc;

	@Column(name="Trans_Desc")
	private String trans_Desc;
	@Id
	@Column(name="Trans_Ref_No")
	private String trans_Ref_No;

	public Suspected_transactions_V() {
	}

	public int getAcct_Key() {
		return this.acct_Key;
	}

	public void setAcct_Key(int acct_Key) {
		this.acct_Key = acct_Key;
	}

	public BigDecimal getCcy_Amt() {
		return this.ccy_Amt;
	}

	public void setCcy_Amt(BigDecimal ccy_Amt) {
		this.ccy_Amt = ccy_Amt;
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public String getTrans_Cr_Db_Ind_Desc() {
		return this.trans_Cr_Db_Ind_Desc;
	}

	public void setTrans_Cr_Db_Ind_Desc(String trans_Cr_Db_Ind_Desc) {
		this.trans_Cr_Db_Ind_Desc = trans_Cr_Db_Ind_Desc;
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