package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AC_KEY_VAL database table.
 * 
 */
@Entity
@Table(name="AC_KEY_VAL")
@NamedQuery(name="AcKeyVal.findAll", query="SELECT a FROM AcKeyVal a")
public class AcKeyVal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AcKeyValPK id;

	@Column(name="active_flg")
	private String activeFlg;

	@Column(name="kv_sort_position_number")
	private int kvSortPositionNumber;

	@Column(name="kv_type_desc")
	private String kvTypeDesc;

	public AcKeyVal() {
	}

	public AcKeyValPK getId() {
		return this.id;
	}

	public void setId(AcKeyValPK id) {
		this.id = id;
	}

	public String getActiveFlg() {
		return this.activeFlg;
	}

	public void setActiveFlg(String activeFlg) {
		this.activeFlg = activeFlg;
	}

	public int getKvSortPositionNumber() {
		return this.kvSortPositionNumber;
	}

	public void setKvSortPositionNumber(int kvSortPositionNumber) {
		this.kvSortPositionNumber = kvSortPositionNumber;
	}

	public String getKvTypeDesc() {
		return this.kvTypeDesc;
	}

	public void setKvTypeDesc(String kvTypeDesc) {
		this.kvTypeDesc = kvTypeDesc;
	}

}