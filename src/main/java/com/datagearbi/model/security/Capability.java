package com.datagearbi.model.security;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Capability database table.
 * 
 */
@Entity
@Table(name = "Capability")
@NamedQuery(name="Capability.findAll", query="SELECT c FROM Capability c")
public class Capability implements Serializable {
	private static final long serialVersionUID = 1L;

	private String desc;
	@Id
	@Column(name="ID")
	private int id;

	@Column(name="Name")
	private String name;

	public Capability() {
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}