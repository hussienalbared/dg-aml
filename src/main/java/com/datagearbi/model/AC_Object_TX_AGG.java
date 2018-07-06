package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_Object_TX_AGG database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Object_TX_AGG.findAll", query="SELECT a FROM AC_Object_TX_AGG a")
public class AC_Object_TX_AGG implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Obj_Tax_Agg_Pk")
	private long obj_Tax_Agg_Pk;

	@Column(name="Agg_Amt")
	private BigDecimal agg_Amt;

	@Column(name="Agg_Type_Cd")
	private String agg_Type_Cd;

	@Column(name="Alarmed_Obj_Key")
	private BigDecimal alarmed_Obj_Key;

	@Column(name="Alarmed_Obj_Level_Cd")
	private String alarmed_Obj_Level_Cd;

	@Column(name="Create_Timestamp")
	private Timestamp create_Timestamp;

	@Column(name="Grp_Cd")
	private String grp_Cd;

	@Column(name="Grp_Desc")
	private String grp_Desc;

	public AC_Object_TX_AGG() {
	}

	public long getObj_Tax_Agg_Pk() {
		return this.obj_Tax_Agg_Pk;
	}

	public void setObj_Tax_Agg_Pk(long obj_Tax_Agg_Pk) {
		this.obj_Tax_Agg_Pk = obj_Tax_Agg_Pk;
	}

	public BigDecimal getAgg_Amt() {
		return this.agg_Amt;
	}

	public void setAgg_Amt(BigDecimal agg_Amt) {
		this.agg_Amt = agg_Amt;
	}

	public String getAgg_Type_Cd() {
		return this.agg_Type_Cd;
	}

	public void setAgg_Type_Cd(String agg_Type_Cd) {
		this.agg_Type_Cd = agg_Type_Cd;
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

	public Timestamp getCreate_Timestamp() {
		return this.create_Timestamp;
	}

	public void setCreate_Timestamp(Timestamp create_Timestamp) {
		this.create_Timestamp = create_Timestamp;
	}

	public String getGrp_Cd() {
		return this.grp_Cd;
	}

	public void setGrp_Cd(String grp_Cd) {
		this.grp_Cd = grp_Cd;
	}

	public String getGrp_Desc() {
		return this.grp_Desc;
	}

	public void setGrp_Desc(String grp_Desc) {
		this.grp_Desc = grp_Desc;
	}

}