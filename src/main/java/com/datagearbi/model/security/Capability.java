package com.datagearbi.model.security;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * The persistent class for the Capability database table.
 * 
 */
@Entity
@Table(name = "Capability")

@NamedQuery(name="Capability.findAll", query="SELECT c FROM Capability c")
public class Capability implements Serializable {
	private static final long serialVersionUID = 1L;
//	@ManyToMany(mappedBy="capabilities")
//   private List<Group>groups;
//   public void setGroups(List<Group> groups) {
//	this.groups = groups;
//}
//   public List<Group> getGroups() {
//	return groups;
//}
	@Column(name="Description")
	private String description;
    @Id
	@Column(name="ID")
	private int id;

	@Column(name="Name")
	private String name;

	public Capability() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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