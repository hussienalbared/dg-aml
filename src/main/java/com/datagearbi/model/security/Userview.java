package com.datagearbi.model.security;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "userView", schema = "[Admin_DEV].[dbo]")
public class Userview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "UserName", length = 50, unique = true)

	@Size(min = 4, max = 50)
	private String username;

	@Column(name = "FirstName", length = 50)

	@Size(min = 4, max = 50)
	private String firstname;

	@Column(name = "LastName", length = 50)

	@Size(min = 4, max = 50)
	private String lastname;

	@Column(name = "DisplayName")
	private String DisplayName;

	public String getDisplayName() {
		return this.DisplayName;
	}

	public void setDisplayName(String displayName) {
		this.DisplayName = displayName;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



}