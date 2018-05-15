package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Country_LKP database table.
 * 
 */
@Entity
@NamedQuery(name="Country_LKP.findAll", query="SELECT c FROM Country_LKP c")
public class Country_LKP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Cntry_Key")
	private int cntry_Key;

	@Column(name="Cntry_CD_2")
	private String cntry_CD_2;

	@Column(name="Cntry_CD_3")
	private String cntry_CD_3;

	@Column(name="Cntry_Name")
	private String cntry_Name;

	public Country_LKP() {
	}

	public int getCntry_Key() {
		return this.cntry_Key;
	}

	public void setCntry_Key(int cntry_Key) {
		this.cntry_Key = cntry_Key;
	}

	public String getCntry_CD_2() {
		return this.cntry_CD_2;
	}

	public void setCntry_CD_2(String cntry_CD_2) {
		this.cntry_CD_2 = cntry_CD_2;
	}

	public String getCntry_CD_3() {
		return this.cntry_CD_3;
	}

	public void setCntry_CD_3(String cntry_CD_3) {
		this.cntry_CD_3 = cntry_CD_3;
	}

	public String getCntry_Name() {
		return this.cntry_Name;
	}

	public void setCntry_Name(String cntry_Name) {
		this.cntry_Name = cntry_Name;
	}

}