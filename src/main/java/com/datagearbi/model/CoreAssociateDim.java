package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_ASSOCIATE_DIM database table.
 * 
 */
@Entity
@Table(name="CORE_ASSOCIATE_DIM")
@NamedQuery(name="CoreAssociateDim.findAll", query="SELECT c FROM CoreAssociateDim c")
public class CoreAssociateDim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="associate_key")
	private long associateKey;

	@Column(name="associate_first_name")
	private String associateFirstName;

	@Column(name="associate_last_name")
	private String associateLastName;

	@Column(name="associate_middle_name")
	private String associateMiddleName;

	@Column(name="associate_number")
	private String associateNumber;

	@Column(name="associate_status_desc")
	private String associateStatusDesc;

	@Column(name="associate_title_desc")
	private String associateTitleDesc;

	@Column(name="branch_name")
	private String branchName;

	@Column(name="branch_number")
	private String branchNumber;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	@Column(name="email_address")
	private String emailAddress;

	@Column(name="street_address_1")
	private String streetAddress1;

	@Column(name="street_address_2")
	private String streetAddress2;

	@Column(name="street_city_name")
	private String streetCityName;

	@Column(name="street_country_code")
	private String streetCountryCode;

	@Column(name="street_country_name")
	private String streetCountryName;

	@Column(name="street_postal_code")
	private String streetPostalCode;

	@Column(name="street_state_code")
	private String streetStateCode;

	@Column(name="street_state_name")
	private String streetStateName;

	@Column(name="work_phone_number")
	private String workPhoneNumber;

	public CoreAssociateDim() {
	}

	public long getAssociateKey() {
		return this.associateKey;
	}

	public void setAssociateKey(long associateKey) {
		this.associateKey = associateKey;
	}

	public String getAssociateFirstName() {
		return this.associateFirstName;
	}

	public void setAssociateFirstName(String associateFirstName) {
		this.associateFirstName = associateFirstName;
	}

	public String getAssociateLastName() {
		return this.associateLastName;
	}

	public void setAssociateLastName(String associateLastName) {
		this.associateLastName = associateLastName;
	}

	public String getAssociateMiddleName() {
		return this.associateMiddleName;
	}

	public void setAssociateMiddleName(String associateMiddleName) {
		this.associateMiddleName = associateMiddleName;
	}

	public String getAssociateNumber() {
		return this.associateNumber;
	}

	public void setAssociateNumber(String associateNumber) {
		this.associateNumber = associateNumber;
	}

	public String getAssociateStatusDesc() {
		return this.associateStatusDesc;
	}

	public void setAssociateStatusDesc(String associateStatusDesc) {
		this.associateStatusDesc = associateStatusDesc;
	}

	public String getAssociateTitleDesc() {
		return this.associateTitleDesc;
	}

	public void setAssociateTitleDesc(String associateTitleDesc) {
		this.associateTitleDesc = associateTitleDesc;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchNumber() {
		return this.branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}

	public Timestamp getChangeBeginDate() {
		return this.changeBeginDate;
	}

	public void setChangeBeginDate(Timestamp changeBeginDate) {
		this.changeBeginDate = changeBeginDate;
	}

	public String getChangeCurrentInd() {
		return this.changeCurrentInd;
	}

	public void setChangeCurrentInd(String changeCurrentInd) {
		this.changeCurrentInd = changeCurrentInd;
	}

	public Timestamp getChangeEndDate() {
		return this.changeEndDate;
	}

	public void setChangeEndDate(Timestamp changeEndDate) {
		this.changeEndDate = changeEndDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getStreetAddress1() {
		return this.streetAddress1;
	}

	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}

	public String getStreetAddress2() {
		return this.streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getStreetCityName() {
		return this.streetCityName;
	}

	public void setStreetCityName(String streetCityName) {
		this.streetCityName = streetCityName;
	}

	public String getStreetCountryCode() {
		return this.streetCountryCode;
	}

	public void setStreetCountryCode(String streetCountryCode) {
		this.streetCountryCode = streetCountryCode;
	}

	public String getStreetCountryName() {
		return this.streetCountryName;
	}

	public void setStreetCountryName(String streetCountryName) {
		this.streetCountryName = streetCountryName;
	}

	public String getStreetPostalCode() {
		return this.streetPostalCode;
	}

	public void setStreetPostalCode(String streetPostalCode) {
		this.streetPostalCode = streetPostalCode;
	}

	public String getStreetStateCode() {
		return this.streetStateCode;
	}

	public void setStreetStateCode(String streetStateCode) {
		this.streetStateCode = streetStateCode;
	}

	public String getStreetStateName() {
		return this.streetStateName;
	}

	public void setStreetStateName(String streetStateName) {
		this.streetStateName = streetStateName;
	}

	public String getWorkPhoneNumber() {
		return this.workPhoneNumber;
	}

	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}

}