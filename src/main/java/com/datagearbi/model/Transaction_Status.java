package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Transaction_Status database table.
 * 
 */
@Embeddable
@NamedQuery(name="Transaction_Status.findAll", query="SELECT t FROM Transaction_Status t")
public class Transaction_Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Status_Desc")
	private String status_Desc;

	@Column(name="Status_Reason_Desc")
	private String status_Reason_Desc;

	@Column(name="Trans_Status_Key")
	private int trans_Status_Key;

	public Transaction_Status() {
	}

	public String getStatus_Desc() {
		return this.status_Desc;
	}

	public void setStatus_Desc(String status_Desc) {
		this.status_Desc = status_Desc;
	}

	public String getStatus_Reason_Desc() {
		return this.status_Reason_Desc;
	}

	public void setStatus_Reason_Desc(String status_Reason_Desc) {
		this.status_Reason_Desc = status_Reason_Desc;
	}

	public int getTrans_Status_Key() {
		return this.trans_Status_Key;
	}

	public void setTrans_Status_Key(int trans_Status_Key) {
		this.trans_Status_Key = trans_Status_Key;
	}

}