package com.datagearbi.model.security;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "[User]", schema = "[Admin_DEV].[Admin]")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	// @SequenceGenerator(name = "user_seq", sequenceName = "user_seq",
	// allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}


	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}


	public void setLastPasswordResetDate(Date lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}


	public String getDisplayName() {
		return DisplayName;
	}


	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}


	public List<Group> getGroups() {
		return groups;
	}


	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}


	@Column(name = "UserName", length = 50, unique = true)

	@Size(min = 4, max = 50)
	private String username;

	@Column(name = "Password", length = 100)

	@Size(min = 4, max = 100)
	private String password;

	@Column(name = "FirstName", length = 50)

	@Size(min = 4, max = 50)
	private String firstname;

	@Column(name = "LastName", length = 50)

	@Size(min = 4, max = 50)
	private String lastname;

	@Column(name = "Email", length = 50)

	@Size(min = 4, max = 50)
	private String email;

	@Column(name = "Enabled")

	private Boolean enabled;

	@Column(name = "LastPasswordResetDate")
	@Temporal(TemporalType.TIMESTAMP)

	private Date lastPasswordResetDate;
	
	@Column(name = "DisplayName")
	private String DisplayName;


	@NotFound(action=NotFoundAction.IGNORE)
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "USER_GROUP", joinColumns = {
			@JoinColumn(name = "U_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "G_ID", referencedColumnName = "ID") })
	private List<Group> groups;


}