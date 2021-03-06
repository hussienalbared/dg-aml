package com.datagearbi.model.security;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The persistent class for the Group_capability database table.
 * 
 */
@Entity
@Table(name = "Group_Capability")
@NamedQuery(name="Group_Capability.findAll", query="SELECT g FROM Group_capability g")
public class Group_capability implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	@EmbeddedId
	private Group_CapabilityPK id;

	public Group_capability() {
	}
	public Group_CapabilityPK getId() {
		return id;
	}
	public void setId(Group_CapabilityPK id) {
		this.id = id;
	}
	
}