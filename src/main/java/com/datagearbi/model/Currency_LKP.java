package com.datagearbi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Currency_LKP database table.
 * 
 */
@Entity
@NamedQuery(name="Currency_LKP.findAll", query="SELECT c FROM Currency_LKP c")
public class Currency_LKP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Curr_key")
	private int curr_key;

	@Column(name="Curr_Cd")
	private String curr_Cd;

	@Column(name="Curr_Name")
	private String curr_Name;

	public Currency_LKP() {
	}

	public int getCurr_key() {
		return this.curr_key;
	}

	public void setCurr_key(int curr_key) {
		this.curr_key = curr_key;
	}

	public String getCurr_Cd() {
		return this.curr_Cd;
	}

	public void setCurr_Cd(String curr_Cd) {
		this.curr_Cd = curr_Cd;
	}

	public String getCurr_Name() {
		return this.curr_Name;
	}

	public void setCurr_Name(String curr_Name) {
		this.curr_Name = curr_Name;
	}

}