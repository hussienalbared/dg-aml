package com.datagearbi.model.security;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the Group database table.
 * 
 */
@Entity
//@NamedQuery(name="Group.findAll", query="SELECT g FROM Group g")
@Table(name="[Group]",schema="Admin")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
	@Column(name="ID")
	private int id;

	@Column(name="Name")
    @Enumerated(EnumType.STRING)
	private AuthorityName name;

    @ManyToMany(mappedBy = "groups", fetch = FetchType.LAZY)
    private List<User> users;

	public Group() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AuthorityName getName() {
		return this.name;
	}

	public void setName(AuthorityName name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}