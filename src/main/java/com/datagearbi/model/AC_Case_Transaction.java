package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the AC_Case_Transaction database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Case_Transaction.findAll", query="SELECT a FROM AC_Case_Transaction a")
public class AC_Case_Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AC_Case_TransactionPK id;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Alarmed_Obj_Key")
	private BigDecimal alarmed_Obj_Key;

	@Column(name="Alarmed_Obj_Level_Cd")
	private String alarmed_Obj_Level_Cd;

	@Column(name="Benef_Name")
	private String benef_Name;

	@Column(name="Branch_Name")
	private String branch_Name;

	@Column(name="Create_Timestamp")
	private Timestamp create_Timestamp;

	@Column(name="Date_Key")
	private int date_Key;

	@Column(name="Emp_Name")
	private String emp_Name;

	@Column(name="Prim_Med_Desc")
	private String prim_Med_Desc;

	@Column(name="Sec_Med_Desc")
	private String sec_Med_Desc;

	@Column(name="Time_Key")
	private int time_Key;

	@Column(name="Trans_Amt")
	private BigDecimal trans_Amt;

	@Column(name="Trans_Cr_Db_Ind_Desc")
	private String trans_Cr_Db_Ind_Desc;

	@Column(name="Trans_Date")
	private Timestamp trans_Date;

	@Column(name="Trans_Desc")
	private String trans_Desc;

	@Column(name="Trans_Mech")
	private String trans_Mech;

	@Column(name="Trans_Status")
	private String trans_Status;

	@Column(name="Trig_Ind_Cd")
	private String trig_Ind_Cd;

	public AC_Case_Transaction() {
	}

	public AC_Case_TransactionPK getId() {
		return this.id;
	}

	public void setId(AC_Case_TransactionPK id) {
		this.id = id;
	}

	public String getAcct_No() {
		return this.acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	public BigDecimal getAlarmed_Obj_Key() {
		return this.alarmed_Obj_Key;
	}

	public void setAlarmed_Obj_Key(BigDecimal alarmed_Obj_Key) {
		this.alarmed_Obj_Key = alarmed_Obj_Key;
	}

	public String getAlarmed_Obj_Level_Cd() {
		return this.alarmed_Obj_Level_Cd;
	}

	public void setAlarmed_Obj_Level_Cd(String alarmed_Obj_Level_Cd) {
		this.alarmed_Obj_Level_Cd = alarmed_Obj_Level_Cd;
	}

	public String getBenef_Name() {
		return this.benef_Name;
	}

	public void setBenef_Name(String benef_Name) {
		this.benef_Name = benef_Name;
	}

	public String getBranch_Name() {
		return this.branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}

	public Timestamp getCreate_Timestamp() {
		return this.create_Timestamp;
	}

	public void setCreate_Timestamp(Timestamp create_Timestamp) {
		this.create_Timestamp = create_Timestamp;
	}

	public int getDate_Key() {
		return this.date_Key;
	}

	public void setDate_Key(int date_Key) {
		this.date_Key = date_Key;
	}

	public String getEmp_Name() {
		return this.emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
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

	public int getTime_Key() {
		return this.time_Key;
	}

	public void setTime_Key(int time_Key) {
		this.time_Key = time_Key;
	}

	public BigDecimal getTrans_Amt() {
		return this.trans_Amt;
	}

	public void setTrans_Amt(BigDecimal trans_Amt) {
		this.trans_Amt = trans_Amt;
	}

	public String getTrans_Cr_Db_Ind_Desc() {
		return this.trans_Cr_Db_Ind_Desc;
	}

	public void setTrans_Cr_Db_Ind_Desc(String trans_Cr_Db_Ind_Desc) {
		this.trans_Cr_Db_Ind_Desc = trans_Cr_Db_Ind_Desc;
	}

	public Timestamp getTrans_Date() {
		return this.trans_Date;
	}

	public void setTrans_Date(Timestamp trans_Date) {
		this.trans_Date = trans_Date;
	}

	public String getTrans_Desc() {
		return this.trans_Desc;
	}

	public void setTrans_Desc(String trans_Desc) {
		this.trans_Desc = trans_Desc;
	}

	public String getTrans_Mech() {
		return this.trans_Mech;
	}

	public void setTrans_Mech(String trans_Mech) {
		this.trans_Mech = trans_Mech;
	}

	public String getTrans_Status() {
		return this.trans_Status;
	}

	public void setTrans_Status(String trans_Status) {
		this.trans_Status = trans_Status;
	}

	public String getTrig_Ind_Cd() {
		return this.trig_Ind_Cd;
	}

	public void setTrig_Ind_Cd(String trig_Ind_Cd) {
		this.trig_Ind_Cd = trig_Ind_Cd;
	}

}