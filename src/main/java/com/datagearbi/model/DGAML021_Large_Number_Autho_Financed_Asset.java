package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DGAML021_Large_Number_Autho_Financed_Asset database table.
 * 
 */
@Embeddable
@NamedQuery(name="DGAML021_Large_Number_Autho_Financed_Asset.findAll", query="SELECT d FROM DGAML021_Large_Number_Autho_Financed_Asset d")
public class DGAML021_Large_Number_Autho_Financed_Asset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="Acct_Emp_Ind")
	private String acct_Emp_Ind;

	@Column(name="Cust_Ident_Type_Desc")
	private String cust_Ident_Type_Desc;

	@Column(name="Cust_Key")
	private int cust_Key;

	@Column(name="Cust_Name")
	private String cust_Name;

	@Column(name="Cust_No")
	private String cust_No;

	@Column(name="Cust_Type_Desc")
	private String cust_Type_Desc;

	@Column(name="Empr_Name")
	private String empr_Name;

	@Column(name="Political_Exp_Prsn_Ind")
	private String political_Exp_Prsn_Ind;

	public DGAML021_Large_Number_Autho_Financed_Asset() {
	}

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