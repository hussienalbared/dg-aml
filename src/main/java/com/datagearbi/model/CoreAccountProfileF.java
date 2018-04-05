package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CORE_ACCOUNT_PROFILE_F database table.
 * 
 */
@Entity
@Table(name="CORE_ACCOUNT_PROFILE_F")
@NamedQuery(name="CoreAccountProfileF.findAll", query="SELECT c FROM CoreAccountProfileF c")
public class CoreAccountProfileF implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoreAccountProfileFPK id;

	@Column(name="AACTPRMINACCTVALAMT")
	private BigDecimal aactprminacctvalamt;

	@Column(name="ACCTORWDCT")
	private BigDecimal acctorwdct;

	@Column(name="ACCTPRACCTVAMT")
	private BigDecimal acctpracctvamt;

	@Column(name="ACCTPRAVGACCTVALAMT")
	private BigDecimal acctpravgacctvalamt;

	@Column(name="ACCTPRAVGDABLAMT")
	private BigDecimal acctpravgdablamt;

	@Column(name="ACCTPRBBLAMT")
	private BigDecimal acctprbblamt;

	@Column(name="ACCTPRCTCT")
	private BigDecimal acctprctct;

	@Column(name="ACCTPRCUSTINTTCT")
	private BigDecimal acctprcustinttct;

	@Column(name="ACCTPRDTCT")
	private BigDecimal acctprdtct;

	@Column(name="ACCTPRENDCBLAMT")
	private BigDecimal acctprendcblamt;

	@Column(name="ACCTPRLCRAMT")
	private BigDecimal acctprlcramt;

	@Column(name="ACCTPRLDBAMT")
	private BigDecimal acctprldbamt;

	@Column(name="ACCTPRMAXACCTVALAMT")
	private BigDecimal acctprmaxacctvalamt;

	@Column(name="ACCTPRTOCCRAMT")
	private BigDecimal acctprtoccramt;

	@Column(name="ACCTPRTOCDBAMT")
	private BigDecimal acctprtocdbamt;

	@Column(name="ACCTPRTOCRAMT")
	private BigDecimal acctprtocramt;

	@Column(name="ACCTPRTODBAMT")
	private BigDecimal acctprtodbamt;

	@Column(name="ACCTPRTOTAMT")
	private BigDecimal acctprtotamt;

	@Column(name="ACCTPRTOWICRAMT")
	private BigDecimal acctprtowicramt;

	@Column(name="ACCTPRTOWIDBAMT")
	private BigDecimal acctprtowidbamt;

	@Column(name="ACCTPRWICT")
	private BigDecimal acctprwict;

	@Column(name="ACTTPRTCT")
	private BigDecimal acttprtct;

	public CoreAccountProfileF() {
	}

	public CoreAccountProfileFPK getId() {
		return this.id;
	}

	public void setId(CoreAccountProfileFPK id) {
		this.id = id;
	}

	public BigDecimal getAactprminacctvalamt() {
		return this.aactprminacctvalamt;
	}

	public void setAactprminacctvalamt(BigDecimal aactprminacctvalamt) {
		this.aactprminacctvalamt = aactprminacctvalamt;
	}

	public BigDecimal getAcctorwdct() {
		return this.acctorwdct;
	}

	public void setAcctorwdct(BigDecimal acctorwdct) {
		this.acctorwdct = acctorwdct;
	}

	public BigDecimal getAcctpracctvamt() {
		return this.acctpracctvamt;
	}

	public void setAcctpracctvamt(BigDecimal acctpracctvamt) {
		this.acctpracctvamt = acctpracctvamt;
	}

	public BigDecimal getAcctpravgacctvalamt() {
		return this.acctpravgacctvalamt;
	}

	public void setAcctpravgacctvalamt(BigDecimal acctpravgacctvalamt) {
		this.acctpravgacctvalamt = acctpravgacctvalamt;
	}

	public BigDecimal getAcctpravgdablamt() {
		return this.acctpravgdablamt;
	}

	public void setAcctpravgdablamt(BigDecimal acctpravgdablamt) {
		this.acctpravgdablamt = acctpravgdablamt;
	}

	public BigDecimal getAcctprbblamt() {
		return this.acctprbblamt;
	}

	public void setAcctprbblamt(BigDecimal acctprbblamt) {
		this.acctprbblamt = acctprbblamt;
	}

	public BigDecimal getAcctprctct() {
		return this.acctprctct;
	}

	public void setAcctprctct(BigDecimal acctprctct) {
		this.acctprctct = acctprctct;
	}

	public BigDecimal getAcctprcustinttct() {
		return this.acctprcustinttct;
	}

	public void setAcctprcustinttct(BigDecimal acctprcustinttct) {
		this.acctprcustinttct = acctprcustinttct;
	}

	public BigDecimal getAcctprdtct() {
		return this.acctprdtct;
	}

	public void setAcctprdtct(BigDecimal acctprdtct) {
		this.acctprdtct = acctprdtct;
	}

	public BigDecimal getAcctprendcblamt() {
		return this.acctprendcblamt;
	}

	public void setAcctprendcblamt(BigDecimal acctprendcblamt) {
		this.acctprendcblamt = acctprendcblamt;
	}

	public BigDecimal getAcctprlcramt() {
		return this.acctprlcramt;
	}

	public void setAcctprlcramt(BigDecimal acctprlcramt) {
		this.acctprlcramt = acctprlcramt;
	}

	public BigDecimal getAcctprldbamt() {
		return this.acctprldbamt;
	}

	public void setAcctprldbamt(BigDecimal acctprldbamt) {
		this.acctprldbamt = acctprldbamt;
	}

	public BigDecimal getAcctprmaxacctvalamt() {
		return this.acctprmaxacctvalamt;
	}

	public void setAcctprmaxacctvalamt(BigDecimal acctprmaxacctvalamt) {
		this.acctprmaxacctvalamt = acctprmaxacctvalamt;
	}

	public BigDecimal getAcctprtoccramt() {
		return this.acctprtoccramt;
	}

	public void setAcctprtoccramt(BigDecimal acctprtoccramt) {
		this.acctprtoccramt = acctprtoccramt;
	}

	public BigDecimal getAcctprtocdbamt() {
		return this.acctprtocdbamt;
	}

	public void setAcctprtocdbamt(BigDecimal acctprtocdbamt) {
		this.acctprtocdbamt = acctprtocdbamt;
	}

	public BigDecimal getAcctprtocramt() {
		return this.acctprtocramt;
	}

	public void setAcctprtocramt(BigDecimal acctprtocramt) {
		this.acctprtocramt = acctprtocramt;
	}

	public BigDecimal getAcctprtodbamt() {
		return this.acctprtodbamt;
	}

	public void setAcctprtodbamt(BigDecimal acctprtodbamt) {
		this.acctprtodbamt = acctprtodbamt;
	}

	public BigDecimal getAcctprtotamt() {
		return this.acctprtotamt;
	}

	public void setAcctprtotamt(BigDecimal acctprtotamt) {
		this.acctprtotamt = acctprtotamt;
	}

	public BigDecimal getAcctprtowicramt() {
		return this.acctprtowicramt;
	}

	public void setAcctprtowicramt(BigDecimal acctprtowicramt) {
		this.acctprtowicramt = acctprtowicramt;
	}

	public BigDecimal getAcctprtowidbamt() {
		return this.acctprtowidbamt;
	}

	public void setAcctprtowidbamt(BigDecimal acctprtowidbamt) {
		this.acctprtowidbamt = acctprtowidbamt;
	}

	public BigDecimal getAcctprwict() {
		return this.acctprwict;
	}

	public void setAcctprwict(BigDecimal acctprwict) {
		this.acctprwict = acctprwict;
	}

	public BigDecimal getActtprtct() {
		return this.acttprtct;
	}

	public void setActtprtct(BigDecimal acttprtct) {
		this.acttprtct = acttprtct;
	}

}