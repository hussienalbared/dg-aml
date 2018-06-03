package com.datagearbi.model.security;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class User_GroupPK implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "G_ID")
	private int gId;

	@Column(name = "U_ID")
	private int uId;

	public User_GroupPK() {
	}

	public int getGId() {
		return this.gId;
	}

	public void setGId(int gId) {
		this.gId = gId;
	}

	public int getUId() {
		return this.uId;
	}

	public void setUId(int uId) {
		this.uId = uId;
	}

}
