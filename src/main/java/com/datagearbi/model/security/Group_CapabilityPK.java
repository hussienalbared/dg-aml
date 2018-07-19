package com.datagearbi.model.security;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Group_CapabilityPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("cId")
	@Column(name="C_ID")
	private int cId;
	@JsonProperty("gId")
	@Column(name="G_ID")
	private int gId;

	public Group_CapabilityPK() {
	}

	public int getCId() {
		return this.cId;
	}

	public void setCId(int cId) {
		this.cId = cId;
	}

	public int getGId() {
		return this.gId;
	}

	public void setGId(int gId) {
		this.gId = gId;
	}

}
