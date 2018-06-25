package com.datagearbi.model.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The persistent class for the Group database table.
 * 
 */
@Entity
// @NamedQuery(name="Group.findAll", query="SELECT g FROM Group g")
@Table(name = "[Group]", schema = "Admin")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JsonProperty("name")
	@Column(name = "Name")
//	@Enumerated(EnumType.STRING)
	private String name;

//	@ManyToMany(mappedBy = "groups", fetch = FetchType.LAZY)
//	private List<User> users;
	@NotFound(action=NotFoundAction.IGNORE)
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="Group_Capability",joinColumns=@JoinColumn(name="G_ID", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "C_ID", referencedColumnName = "ID"))
    private Set<Capability> capabilities;
	public Set<Capability> getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(Set<Capability> capabilities) {
		this.capabilities = capabilities;
	}

	public Group() {
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

//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}

}