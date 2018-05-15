package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_SCD2_Columns database table.
 * 
 */
@Entity
@Table(name="AC_SCD2_Columns")
@NamedQuery(name="AC_SCD2_Column.findAll", query="SELECT a FROM AC_SCD2_Column a")
public class AC_SCD2_Column implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long SCD2_Key;

	@Column(name="Col_Name")
	private String col_Name;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Current_Ind")
	private String current_Ind;

	@Column(name="End_Date")
	private Timestamp end_Date;

	@Column(name="Table_Name")
	private String table_Name;

	@Column(name="Ver_No")
	private int ver_No;

	@Column(name="Xref_Valid_Ind")
	private String xref_Valid_Ind;

	public AC_SCD2_Column() {
	}

	public long getSCD2_Key() {
		return this.SCD2_Key;
	}

	public void setSCD2_Key(long SCD2_Key) {
		this.SCD2_Key = SCD2_Key;
	}

	public String getCol_Name() {
		return this.col_Name;
	}

	public void setCol_Name(String col_Name) {
		this.col_Name = col_Name;
	}

	public Timestamp getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public String getCreate_User_Id() {
		return this.create_User_Id;
	}

	public void setCreate_User_Id(String create_User_Id) {
		this.create_User_Id = create_User_Id;
	}

	public String getCurrent_Ind() {
		return this.current_Ind;
	}

	public void setCurrent_Ind(String current_Ind) {
		this.current_Ind = current_Ind;
	}

	public Timestamp getEnd_Date() {
		return this.end_Date;
	}

	public void setEnd_Date(Timestamp end_Date) {
		this.end_Date = end_Date;
	}

	public String getTable_Name() {
		return this.table_Name;
	}

	public void setTable_Name(String table_Name) {
		this.table_Name = table_Name;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

	public String getXref_Valid_Ind() {
		return this.xref_Valid_Ind;
	}

	public void setXref_Valid_Ind(String xref_Valid_Ind) {
		this.xref_Valid_Ind = xref_Valid_Ind;
	}

}