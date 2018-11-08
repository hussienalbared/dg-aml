package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="LargeNumberAuthorizationsConductBusiness",schema="dbo")
@NamedQuery(name="LargeNumberAuthorizationsConductBusiness.findAll", query="SELECT a FROM LargeNumberAuthorizationsConductBusiness a")

public class LargeNumberAuthorizationsConductBusiness implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "Acct_Emp_Ind")
	private String acct_Emp_Ind;

	@Column(name = "Cust_Ident_Type_Desc")
	private String cust_Ident_Type_Desc;
	@Id
	@Column(name = "IdRow")
	private int IdRow;

	public void setIdRow(int idRow) {
		IdRow = idRow;
	}

	public int getIdRow() {
		return IdRow;
	}

	@Column(name = "Cust_Key")
	private int cust_Key;

	@Column(name = "Cust_Name")
	private String cust_Name;

	@Column(name = "Cust_No")
	private String cust_No;

	@Column(name = "Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name = "Empr_Name")
	private String empr_Name;

	@Column(name = "Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;
	@Column(name = "Acct_key")
	private int Acct_key;
	@Column(name = "Acct_No")
	private String Acct_No;
	@Column(name = "Acct_Name")
	private String Acct_Name;
	@Column(name = "role_desc")
	private String roleDesc;
	public int getAcct_key() {
		return Acct_key;
	}

	public void setAcct_key(int acct_key) {
		Acct_key = acct_key;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getAcct_No() {
		return Acct_No;
	}

	public void setAcct_No(String acct_No) {
		Acct_No = acct_No;
	}

	public String getAcct_Name() {
		return Acct_Name;
	}

	public void setAcct_Name(String acct_Name) {
		Acct_Name = acct_Name;
	}

	public String getAcct_Type_Desc() {
		return Acct_Type_Desc;
	}

	public void setAcct_Type_Desc(String acct_Type_Desc) {
		Acct_Type_Desc = acct_Type_Desc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "Acct_Type_Desc")
	private String Acct_Type_Desc;

	public String getAcct_Emp_Ind() {
		return this.acct_Emp_Ind;
	}

	public void setAcct_Emp_Ind(String acct_Emp_Ind) {
		this.acct_Emp_Ind = acct_Emp_Ind;
	}

	public String getCust_Ident_Type_Desc() {
		return this.cust_Ident_Type_Desc;
	}

	public void setCust_Ident_Type_Desc(String cust_Ident_Type_Desc) {
		this.cust_Ident_Type_Desc = cust_Ident_Type_Desc;
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

	public String getCust_Type_Desc() {
		return this.cust_Type_Desc;
	}

	public void setCust_Type_Desc(String cust_Type_Desc) {
		this.cust_Type_Desc = cust_Type_Desc;
	}

	public String getEmpr_Name() {
		return this.empr_Name;
	}

	public void setEmpr_Name(String empr_Name) {
		this.empr_Name = empr_Name;
	}

	public String getPolitical_Exp_Prsn_Ind() {
		return this.political_Exp_Prsn_Ind;
	}

	public void setPolitical_Exp_Prsn_Ind(String political_Exp_Prsn_Ind) {
		this.political_Exp_Prsn_Ind = political_Exp_Prsn_Ind;
	}
}
