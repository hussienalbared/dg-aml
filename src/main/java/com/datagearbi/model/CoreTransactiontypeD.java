package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORE_TRANSACTIONTYPE_D database table.
 * 
 */
@Entity
@Table(name="CORE_TRANSACTIONTYPE_D")
@NamedQuery(name="CoreTransactiontypeD.findAll", query="SELECT c FROM CoreTransactiontypeD c")
public class CoreTransactiontypeD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transaction_type_key")
	private int transactionTypeKey;

	@Column(name="TTFSC")
	private String ttfsc;

	@Column(name="TTFSD")
	private String ttfsd;

	@Column(name="TTMD")
	private String ttmd;

	@Column(name="TTPMD")
	private String ttpmd;

	@Column(name="TTSMD")
	private String ttsmd;

	@Column(name="TTTCC")
	private String tttcc;

	@Column(name="TTTCD")
	private String tttcd;

	@Column(name="TTTMD")
	private String tttmd;

	public CoreTransactiontypeD() {
	}

	public int getTransactionTypeKey() {
		return this.transactionTypeKey;
	}

	public void setTransactionTypeKey(int transactionTypeKey) {
		this.transactionTypeKey = transactionTypeKey;
	}

	public String getTtfsc() {
		return this.ttfsc;
	}

	public void setTtfsc(String ttfsc) {
		this.ttfsc = ttfsc;
	}

	public String getTtfsd() {
		return this.ttfsd;
	}

	public void setTtfsd(String ttfsd) {
		this.ttfsd = ttfsd;
	}

	public String getTtmd() {
		return this.ttmd;
	}

	public void setTtmd(String ttmd) {
		this.ttmd = ttmd;
	}

	public String getTtpmd() {
		return this.ttpmd;
	}

	public void setTtpmd(String ttpmd) {
		this.ttpmd = ttpmd;
	}

	public String getTtsmd() {
		return this.ttsmd;
	}

	public void setTtsmd(String ttsmd) {
		this.ttsmd = ttsmd;
	}

	public String getTttcc() {
		return this.tttcc;
	}

	public void setTttcc(String tttcc) {
		this.tttcc = tttcc;
	}

	public String getTttcd() {
		return this.tttcd;
	}

	public void setTttcd(String tttcd) {
		this.tttcd = tttcd;
	}

	public String getTttmd() {
		return this.tttmd;
	}

	public void setTttmd(String tttmd) {
		this.tttmd = tttmd;
	}

}