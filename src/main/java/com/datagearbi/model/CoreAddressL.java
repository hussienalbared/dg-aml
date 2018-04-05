package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_ADDRESS_L database table.
 * 
 */
@Entity
@Table(name="CORE_ADDRESS_L")
@NamedQuery(name="CoreAddressL.findAll", query="SELECT c FROM CoreAddressL c")
public class CoreAddressL implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_key")
	private long addressKey;

	@Column(name="address_line_1_text")
	private String addressLine1Text;

	@Column(name="address_line_2_text")
	private String addressLine2Text;

	@Column(name="address_type_code")
	private String addressTypeCode;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	@Column(name="city_name")
	private String cityName;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	@Column(name="match_code_addr_lines")
	private String matchCodeAddrLines;

	@Column(name="match_code_address")
	private String matchCodeAddress;

	@Column(name="match_code_city")
	private String matchCodeCity;

	@Column(name="match_code_country")
	private String matchCodeCountry;

	@Column(name="match_code_state")
	private String matchCodeState;

	@Column(name="postal_code")
	private String postalCode;

	@Column(name="primary_object_level_code")
	private String primaryObjectLevelCode;

	@Column(name="primary_object_number")
	private String primaryObjectNumber;

	@Column(name="state_code")
	private String stateCode;

	@Column(name="state_name")
	private String stateName;

	public CoreAddressL() {
	}

	public long getAddressKey() {
		return this.addressKey;
	}

	public void setAddressKey(long addressKey) {
		this.addressKey = addressKey;
	}

	public String getAddressLine1Text() {
		return this.addressLine1Text;
	}

	public void setAddressLine1Text(String addressLine1Text) {
		this.addressLine1Text = addressLine1Text;
	}

	public String getAddressLine2Text() {
		return this.addressLine2Text;
	}

	public void setAddressLine2Text(String addressLine2Text) {
		this.addressLine2Text = addressLine2Text;
	}

	public String getAddressTypeCode() {
		return this.addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
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

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getMatchCodeAddrLines() {
		return this.matchCodeAddrLines;
	}

	public void setMatchCodeAddrLines(String matchCodeAddrLines) {
		this.matchCodeAddrLines = matchCodeAddrLines;
	}

	public String getMatchCodeAddress() {
		return this.matchCodeAddress;
	}

	public void setMatchCodeAddress(String matchCodeAddress) {
		this.matchCodeAddress = matchCodeAddress;
	}

	public String getMatchCodeCity() {
		return this.matchCodeCity;
	}

	public void setMatchCodeCity(String matchCodeCity) {
		this.matchCodeCity = matchCodeCity;
	}

	public String getMatchCodeCountry() {
		return this.matchCodeCountry;
	}

	public void setMatchCodeCountry(String matchCodeCountry) {
		this.matchCodeCountry = matchCodeCountry;
	}

	public String getMatchCodeState() {
		return this.matchCodeState;
	}

	public void setMatchCodeState(String matchCodeState) {
		this.matchCodeState = matchCodeState;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPrimaryObjectLevelCode() {
		return this.primaryObjectLevelCode;
	}

	public void setPrimaryObjectLevelCode(String primaryObjectLevelCode) {
		this.primaryObjectLevelCode = primaryObjectLevelCode;
	}

	public String getPrimaryObjectNumber() {
		return this.primaryObjectNumber;
	}

	public void setPrimaryObjectNumber(String primaryObjectNumber) {
		this.primaryObjectNumber = primaryObjectNumber;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}