package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the Employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Emp_Key")
	private int emp_Key;

	@Column(name="Addr_1")
	private String addr_1;

	@Column(name="Addr_2")
	private String addr_2;

	@Column(name="Branch_Name")
	private String branch_Name;

	@Column(name="Branch_No")
	private String branch_No;

	@Column(name="Chg_Begin_Date")
	private Timestamp chg_Begin_Date;

	@Column(name="Chg_Current_Ind")
	private String chg_Current_Ind;

	@Column(name="Chg_End_Date")
	private Timestamp chg_End_Date;

	@Column(name="City_Name")
	private String city_Name;

	@Column(name="Cntry_Cd")
	private String cntry_Cd;

	@Column(name="Cntry_Name")
	private String cntry_Name;

	@Column(name="E_Addr")
	private String e_Addr;

	@Column(name="Emp_FName")
	private String emp_FName;

	@Column(name="Emp_LName")
	private String emp_LName;

	@Column(name="Emp_MName")
	private String emp_MName;

	@Column(name="Emp_No")
	private String emp_No;

	@Column(name="Emp_Status_Desc")
	private String emp_Status_Desc;

	@Column(name="Emp_Title_Desc")
	private String emp_Title_Desc;

	@Column(name="Post_Cd")
	private String post_Cd;

	@Column(name="State_Cd")
	private String state_Cd;

	@Column(name="State_Name")
	private String state_Name;

	@Column(name="Work_Tel_No")
	private String work_Tel_No;

	public Employee() {
	}

	public int getEmp_Key() {
		return this.emp_Key;
	}

	public void setEmp_Key(int emp_Key) {
		this.emp_Key = emp_Key;
	}

	public String getAddr_1() {
		return this.addr_1;
	}

	public void setAddr_1(String addr_1) {
		this.addr_1 = addr_1;
	}

	public String getAddr_2() {
		return this.addr_2;
	}

	public void setAddr_2(String addr_2) {
		this.addr_2 = addr_2;
	}

	public String getBranch_Name() {
		return this.branch_Name;
	}

	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}

	public String getBranch_No() {
		return this.branch_No;
	}

	public void setBranch_No(String branch_No) {
		this.branch_No = branch_No;
	}

	public Timestamp getChg_Begin_Date() {
		return this.chg_Begin_Date;
	}

	public void setChg_Begin_Date(Timestamp chg_Begin_Date) {
		this.chg_Begin_Date = chg_Begin_Date;
	}

	public String getChg_Current_Ind() {
		return this.chg_Current_Ind;
	}

	public void setChg_Current_Ind(String chg_Current_Ind) {
		this.chg_Current_Ind = chg_Current_Ind;
	}

	public Timestamp getChg_End_Date() {
		return this.chg_End_Date;
	}

	public void setChg_End_Date(Timestamp chg_End_Date) {
		this.chg_End_Date = chg_End_Date;
	}

	public String getCity_Name() {
		return this.city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	public String getCntry_Cd() {
		return this.cntry_Cd;
	}

	public void setCntry_Cd(String cntry_Cd) {
		this.cntry_Cd = cntry_Cd;
	}

	public String getCntry_Name() {
		return this.cntry_Name;
	}

	public void setCntry_Name(String cntry_Name) {
		this.cntry_Name = cntry_Name;
	}

	public String getE_Addr() {
		return this.e_Addr;
	}

	public void setE_Addr(String e_Addr) {
		this.e_Addr = e_Addr;
	}

	public String getEmp_FName() {
		return this.emp_FName;
	}

	public void setEmp_FName(String emp_FName) {
		this.emp_FName = emp_FName;
	}

	public String getEmp_LName() {
		return this.emp_LName;
	}

	public void setEmp_LName(String emp_LName) {
		this.emp_LName = emp_LName;
	}

	public String getEmp_MName() {
		return this.emp_MName;
	}

	public void setEmp_MName(String emp_MName) {
		this.emp_MName = emp_MName;
	}

	public String getEmp_No() {
		return this.emp_No;
	}

	public void setEmp_No(String emp_No) {
		this.emp_No = emp_No;
	}

	public String getEmp_Status_Desc() {
		return this.emp_Status_Desc;
	}

	public void setEmp_Status_Desc(String emp_Status_Desc) {
		this.emp_Status_Desc = emp_Status_Desc;
	}

	public String getEmp_Title_Desc() {
		return this.emp_Title_Desc;
	}

	public void setEmp_Title_Desc(String emp_Title_Desc) {
		this.emp_Title_Desc = emp_Title_Desc;
	}

	public String getPost_Cd() {
		return this.post_Cd;
	}

	public void setPost_Cd(String post_Cd) {
		this.post_Cd = post_Cd;
	}

	public String getState_Cd() {
		return this.state_Cd;
	}

	public void setState_Cd(String state_Cd) {
		this.state_Cd = state_Cd;
	}

	public String getState_Name() {
		return this.state_Name;
	}

	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}

	public String getWork_Tel_No() {
		return this.work_Tel_No;
	}

	public void setWork_Tel_No(String work_Tel_No) {
		this.work_Tel_No = work_Tel_No;
	}

}