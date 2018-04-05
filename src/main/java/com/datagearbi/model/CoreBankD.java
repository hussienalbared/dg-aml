package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_BANK_D database table.
 * 
 */
@Entity
@Table(name="CORE_BANK_D")
@NamedQuery(name="CoreBankD.findAll", query="SELECT c FROM CoreBankD c")
public class CoreBankD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bank_key")
	private int bankKey;

	@Column(name="BKADD1")
	private String bkadd1;

	@Column(name="BKADD2")
	private String bkadd2;

	@Column(name="BKCHNO")
	private String bkchno;

	@Column(name="BKCINM")
	private String bkcinm;

	@Column(name="BKCOC")
	private String bkcoc;

	@Column(name="BKCONM")
	private String bkconm;

	@Column(name="BKNM")
	private String bknm;

	@Column(name="BKNO")
	private String bkno;

	@Column(name="BKPO")
	private String bkpo;

	@Column(name="BKSTATC")
	private String bkstatc;

	@Column(name="BKSTATNM")
	private String bkstatnm;

	@Column(name="BKSWNO")
	private String bkswno;

	@Column(name="BKTEL")
	private String bktel;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	public CoreBankD() {
	}

	public int getBankKey() {
		return this.bankKey;
	}

	public void setBankKey(int bankKey) {
		this.bankKey = bankKey;
	}

	public String getBkadd1() {
		return this.bkadd1;
	}

	public void setBkadd1(String bkadd1) {
		this.bkadd1 = bkadd1;
	}

	public String getBkadd2() {
		return this.bkadd2;
	}

	public void setBkadd2(String bkadd2) {
		this.bkadd2 = bkadd2;
	}

	public String getBkchno() {
		return this.bkchno;
	}

	public void setBkchno(String bkchno) {
		this.bkchno = bkchno;
	}

	public String getBkcinm() {
		return this.bkcinm;
	}

	public void setBkcinm(String bkcinm) {
		this.bkcinm = bkcinm;
	}

	public String getBkcoc() {
		return this.bkcoc;
	}

	public void setBkcoc(String bkcoc) {
		this.bkcoc = bkcoc;
	}

	public String getBkconm() {
		return this.bkconm;
	}

	public void setBkconm(String bkconm) {
		this.bkconm = bkconm;
	}

	public String getBknm() {
		return this.bknm;
	}

	public void setBknm(String bknm) {
		this.bknm = bknm;
	}

	public String getBkno() {
		return this.bkno;
	}

	public void setBkno(String bkno) {
		this.bkno = bkno;
	}

	public String getBkpo() {
		return this.bkpo;
	}

	public void setBkpo(String bkpo) {
		this.bkpo = bkpo;
	}

	public String getBkstatc() {
		return this.bkstatc;
	}

	public void setBkstatc(String bkstatc) {
		this.bkstatc = bkstatc;
	}

	public String getBkstatnm() {
		return this.bkstatnm;
	}

	public void setBkstatnm(String bkstatnm) {
		this.bkstatnm = bkstatnm;
	}

	public String getBkswno() {
		return this.bkswno;
	}

	public void setBkswno(String bkswno) {
		this.bkswno = bkswno;
	}

	public String getBktel() {
		return this.bktel;
	}

	public void setBktel(String bktel) {
		this.bktel = bktel;
	}

	public Timestamp getChangeBeginDate() {
		return this.changeBeginDate;
	}

	public void setChangeBeginDate(Timestamp changeBeginDate) {
		this.changeBeginDate = changeBeginDate;
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

}