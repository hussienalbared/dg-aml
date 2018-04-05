package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_TRANSACTION_STATUS_L database table.
 * 
 */
@Entity
@Table(name="CORE_TRANSACTION_STATUS_L")
@NamedQuery(name="CoreTransactionStatusL.findAll", query="SELECT c FROM CoreTransactionStatusL c")
public class CoreTransactionStatusL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_status_key")
	private long transactionStatusKey;

	@Column(name="status_desc")
	private String statusDesc;

	@Column(name="status_reason_desc")
	private String statusReasonDesc;

	public CoreTransactionStatusL() {
	}

	public long getTransactionStatusKey() {
		return this.transactionStatusKey;
	}

	public void setTransactionStatusKey(long transactionStatusKey) {
		this.transactionStatusKey = transactionStatusKey;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getStatusReasonDesc() {
		return this.statusReasonDesc;
	}

	public void setStatusReasonDesc(String statusReasonDesc) {
		this.statusReasonDesc = statusReasonDesc;
	}

}