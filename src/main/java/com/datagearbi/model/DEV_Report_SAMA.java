
package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the DEV_Report_SAMA database table.
 * 
 */
@Entity
@Table(schema="AML")
@NamedQuery(name="DEV_Report_SAMA.findAll", query="SELECT d FROM DEV_Report_SAMA d")
public class DEV_Report_SAMA implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@GenericGenerator(
//		    name = "incrementGenerator2",
//		    strategy = "org.hibernate.id.IncrementGenerator",
//		    parameters = {
//                    @org.hibernate.annotations.Parameter(name = "schema",value = "AML")
//            })
//	@GeneratedValue(generator="incrementGenerator2")
//	@Column(name="DEV_Report_SAMA_ID")
//	private Integer DEV_Report_SAMA_ID;

	@Column(name="Acct_No")
	private String acct_No;

	@Column(name="Acct_Prim_Branch_Name")
	private String acct_Prim_Branch_Name;

	@Column(name="Branch_Name")
	private String branch_Name;

	@Column(name="Branch_Type_Desc")
	private String branch_Type_Desc;

	@Column(name="Calendar_Date")
	private Timestamp calendar_Date;

	@Column(name="Ccy_Amt")
	private BigDecimal ccy_Amt;

	@Column(name="Citizen_Cntry_Name")
	private String citizen_Cntry_Name;

	@Column(name="Curr_Name")
	private String curr_Name;

	@Column(name="Cust_Ident_Id")
	private String cust_Ident_Id;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Prim_Med_Desc")
	private String prim_Med_Desc;

	@Column(name="Sec_Med_Desc")
	private String sec_Med_Desc;
   @Id
	@Column(name="Trans_Key")
	private int trans_Key;

	public DEV_Report_SAMA() {
	}

	public String getAcct_No() {
		return this.acct_No;
	}

	public void setAcct_No(String acct_No) {
		this.acct_No = acct_No;
	}

	public String getAcct_Prim_Branch_Name() {
		return this.acct_Prim_Branch_Name;
	}

	public void setAcct_Prim_Branch_Name(String acct_Prim_Branch_Name) {
		this.acct_Prim_Branch_Name = acct_Prim_Branch_Name;
	}

	public String getBranch_Name() {
		return this.branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}

	public String getBranch_Type_Desc() {
		return this.branch_Type_Desc;
	}

	public void setBranch_Type_Desc(String branch_Type_Desc) {
		this.branch_Type_Desc = branch_Type_Desc;
	}

	public Timestamp getCalendar_Date() {
		return this.calendar_Date;
	}

	public void setCalendar_Date(Timestamp calendar_Date) {
		this.calendar_Date = calendar_Date;
	}

	public BigDecimal getCcy_Amt() {
		return this.ccy_Amt;
	}

	public void setCcy_Amt(BigDecimal ccy_Amt) {
		this.ccy_Amt = ccy_Amt;
	}

	public String getCitizen_Cntry_Name() {
		return this.citizen_Cntry_Name;
	}

	public void setCitizen_Cntry_Name(String citizen_Cntry_Name) {
		this.citizen_Cntry_Name = citizen_Cntry_Name;
	}

	public String getCurr_Name() {
		return this.curr_Name;
	}

	public void setCurr_Name(String curr_Name) {
		this.curr_Name = curr_Name;
	}

	public String getCust_Ident_Id() {
		return this.cust_Ident_Id;
	}

	public void setCust_Ident_Id(String cust_Ident_Id) {
		this.cust_Ident_Id = cust_Ident_Id;
	}

	public int getCust_Key() {
		return this.cust_Key;
	}

	public void setCust_Key(int cust_Key) {
		this.cust_Key = cust_Key;
	}

	public String getCust_Name() {
		return this.cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_No() {
		return this.cust_No;
	}

	public void setCust_No(String cust_No) {
		this.cust_No = cust_No;
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

	public int getTrans_Key() {
		return this.trans_Key;
	}

	public void setTrans_Key(int trans_Key) {
		this.trans_Key = trans_Key;
	}

}