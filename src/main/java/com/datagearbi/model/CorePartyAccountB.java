package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import java.sql.Timestamp;


/**
 * The persistent class for the CORE_PARTY_ACCOUNT_B database table.
 * 
 */
@Entity
@Table(name="CORE_PARTY_ACCOUNT_B")
@NamedQuery(name="CorePartyAccountB.findAll", query="SELECT c FROM CorePartyAccountB c")
public class CorePartyAccountB implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CorePartyAccountBPK id;
	
	@ManyToOne
	@JoinColumn(name="party_key",insertable=false,updatable=false )
	@JsonIgnore
    private CorePartyD corepartyD;
	@ManyToOne
	@JoinColumn(name="account_key",insertable=false,updatable=false)
	@JsonIgnore
	private CoreAccountD coreAccount;
	
	public CoreAccountD getCoreAccount() {
		return coreAccount;
	}

	public void setCoreAccount(CoreAccountD coreAccount) {
		this.coreAccount = coreAccount;
	}

	public CorePartyD getCorepartyD() {
		return corepartyD;
	}

	public void setCorepartyD(CorePartyD corepartyD) {
		this.corepartyD = corepartyD;
	}

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	@Column(name="PACCTNO")
	private String pacctno;

	@Column(name="PACCTPNO")
	private String pacctpno;

	@Column(name="PACCTRDS")
	private String pacctrds;

	public CorePartyAccountB() {
	}

	public CorePartyAccountBPK getId() {
		return this.id;
	}

	public void setId(CorePartyAccountBPK id) {
		this.id = id;
	}

	public String getChangeCurrentInd() {
		return this.changeCurrentInd;
	}

	public void setChangeCurrentInd(String changeCurrentInd) {
		this.changeCurrentInd = changeCurrentInd;
	}

	public Timestamp getChangeEndDate() {
		return this.changeEndDate;
	}

	public void setChangeEndDate(Timestamp changeEndDate) {
		this.changeEndDate = changeEndDate;
	}

	public String getPacctno() {
		return this.pacctno;
	}

	public void setPacctno(String pacctno) {
		this.pacctno = pacctno;
	}

	public String getPacctpno() {
		return this.pacctpno;
	}

	public void setPacctpno(String pacctpno) {
		this.pacctpno = pacctpno;
	}

	public String getPacctrds() {
		return this.pacctrds;
	}

	public void setPacctrds(String pacctrds) {
		this.pacctrds = pacctrds;
	}

}