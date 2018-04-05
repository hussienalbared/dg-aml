package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_BRANCH_D database table.
 * 
 */
@Entity
@Table(name="CORE_BRANCH_D")
@NamedQuery(name="CoreBranchD.findAll", query="SELECT c FROM CoreBranchD c")
public class CoreBranchD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="branch_key")
	private int branchKey;

	@Column(name="BRADD1")
	private String bradd1;

	@Column(name="BRADD2")
	private String bradd2;

	@Column(name="BRCINM")
	private String brcinm;

	@Column(name="BRCOC")
	private String brcoc;

	@Column(name="BRCONM")
	private String brconm;

	@Column(name="BRNM")
	private String brnm;

	@Column(name="BRNO")
	private String brno;

	@Column(name="BRPO")
	private String brpo;

	@Column(name="BRSTATC")
	private String brstatc;

	@Column(name="BRSTATNM")
	private String brstatnm;

	@Column(name="BRTYDESC")
	private String brtydesc;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	public CoreBranchD() {
	}

	public int getBranchKey() {
		return this.branchKey;
	}

	public void setBranchKey(int branchKey) {
		this.branchKey = branchKey;
	}

	public String getBradd1() {
		return this.bradd1;
	}

	public void setBradd1(String bradd1) {
		this.bradd1 = bradd1;
	}

	public String getBradd2() {
		return this.bradd2;
	}

	public void setBradd2(String bradd2) {
		this.bradd2 = bradd2;
	}

	public String getBrcinm() {
		return this.brcinm;
	}

	public void setBrcinm(String brcinm) {
		this.brcinm = brcinm;
	}

	public String getBrcoc() {
		return this.brcoc;
	}

	public void setBrcoc(String brcoc) {
		this.brcoc = brcoc;
	}

	public String getBrconm() {
		return this.brconm;
	}

	public void setBrconm(String brconm) {
		this.brconm = brconm;
	}

	public String getBrnm() {
		return this.brnm;
	}

	public void setBrnm(String brnm) {
		this.brnm = brnm;
	}

	public String getBrno() {
		return this.brno;
	}

	public void setBrno(String brno) {
		this.brno = brno;
	}

	public String getBrpo() {
		return this.brpo;
	}

	public void setBrpo(String brpo) {
		this.brpo = brpo;
	}

	public String getBrstatc() {
		return this.brstatc;
	}

	public void setBrstatc(String brstatc) {
		this.brstatc = brstatc;
	}

	public String getBrstatnm() {
		return this.brstatnm;
	}

	public void setBrstatnm(String brstatnm) {
		this.brstatnm = brstatnm;
	}

	public String getBrtydesc() {
		return this.brtydesc;
	}

	public void setBrtydesc(String brtydesc) {
		this.brtydesc = brtydesc;
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