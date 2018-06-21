package com.datagearbi.model.security;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the User_Group database table.
 * 
 */
@Entity
@Table(name = "User_Group", schema = "[Admin_DEV].[Admin]")
@NamedQuery(name = "User_Group.findAll", query = "SELECT u FROM User_Group u")
public class User_Group implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private User_GroupPK id;

	public User_GroupPK getId() {
		return id;
	}

	public void setId(User_GroupPK id) {
		this.id = id;
	}

	public User_Group() {
	}
}