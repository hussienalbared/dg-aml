package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CORE_ACCOUNT_D database table.
 * 
 */
@Entity
@Table(name="CORE_ACCOUNT_D")
@NamedQuery(name="CoreAccountD.findAll", query="SELECT c FROM CoreAccountD c")
public class CoreAccountD implements Serializable {
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="coreAccount")
    private List<CorePartyAccountB> corePartyD;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_key")
	private int accountKey;

	@Column(name="ACCTALTNM")
	private String acctaltnm;

	@Column(name="ACCTBNM")
	private String acctbnm;

	@Column(name="ACCTCLDATE")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Timestamp acctcldate;

	@Column(name="ACCTCOLLTYCD")
	private String acctcolltycd;

	public List<CorePartyAccountB> getCorePartyD() {
		return corePartyD;
	}

	public void setCorePartyD(List<CorePartyAccountB> corePartyD) {
		this.corePartyD = corePartyD;
	}

	@Column(name="ACCTCOLLTYDS")
	private String acctcolltyds;

	@Column(name="ACCTCURRBASEIND")
	private String acctcurrbaseind;

	@Column(name="ACCTCURRC")
	private String acctcurrc;

	@Column(name="ACCTCURRNM")
	private String acctcurrnm;

	@Column(name="ACCTDORIND")
	private String acctdorind;

	@Column(name="ACCTEMPIND")
	private String acctempind;

	@Column(name="ACCTINSAMT")
	private BigDecimal acctinsamt;

	@Column(name="ACCTLETTERCREDITIND")
	private String acctlettercreditind;

	@Column(name="ACCTMAILADD1")
	private String acctmailadd1;

	@Column(name="ACCTMAILADD2")
	private String acctmailadd2;

	@Column(name="ACCTMAILCINM")
	private String acctmailcinm;

	@Column(name="ACCTMAILCOCD")
	private String acctmailcocd;

	@Column(name="ACCTMAILCONM")
	private String acctmailconm;

	@Column(name="ACCTMAILPOCD")
	private String acctmailpocd;

	@Column(name="ACCTMAILSTATCD")
	private String acctmailstatcd;

	@Column(name="ACCTMAILSTATNM")
	private String acctmailstatnm;

	@Column(name="ACCTMATURDATE")
	private Timestamp acctmaturdate;

	@Column(name="ACCTNM")
	private String acctnm;

	@Column(name="ACCTNO")
	private String acctno;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="ACCTOPDATE",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	
	private Timestamp acctopdate;

	@Column(name="ACCTORGLOANAMT")
	private BigDecimal acctorgloanamt;

	@Column(name="ACCTPRBRNM")
	private String acctprbrnm;

	@Column(name="ACCTPRODCATNM")
	private String acctprodcatnm;

	@Column(name="ACCTPRODLINENM")
	private String acctprodlinenm;

	@Column(name="ACCTPRODNM")
	private String acctprodnm;

	@Column(name="ACCTPRODNO")
	private String acctprodno;

	@Column(name="ACCTPRODTYNM")
	private String acctprodtynm;

	@Column(name="ACCTREGNM")
	private String acctregnm;

	@Column(name="ACCTREGTYDESC")
	private String acctregtydesc;

	@Column(name="ACCTSTATDESC")
	private String acctstatdesc;

	@Column(name="ACCTTAXID")
	private String accttaxid;

	@Column(name="ACCTTAXIDTYDES")
	private String accttaxidtydes;

	@Column(name="ACCTTAXSTATCD")
	private String accttaxstatcd;

	@Column(name="ACCTTRADEIND")
	private String accttradeind;

	@Column(name="ACCTTYDESC")
	private String accttydesc;

	@Column(name="ACTTCASHINTIND")
	private String acttcashintind;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	@Column(name="installment_amount")
	private BigDecimal installmentAmount;

	@Column(name="MODIFICATION_DATE")
	private Timestamp modificationDate;

	public CoreAccountD() {
	}

	public int getAccountKey() {
		return this.accountKey;
	}

	public void setAccountKey(int accountKey) {
		this.accountKey = accountKey;
	}

	public String getAcctaltnm() {
		return this.acctaltnm;
	}

	public void setAcctaltnm(String acctaltnm) {
		this.acctaltnm = acctaltnm;
	}

	public String getAcctbnm() {
		return this.acctbnm;
	}

	public void setAcctbnm(String acctbnm) {
		this.acctbnm = acctbnm;
	}

	public Timestamp getAcctcldate() {
		return this.acctcldate;
	}

	public void setAcctcldate(Timestamp acctcldate) {
		this.acctcldate = acctcldate;
	}

	public String getAcctcolltycd() {
		return this.acctcolltycd;
	}

	public void setAcctcolltycd(String acctcolltycd) {
		this.acctcolltycd = acctcolltycd;
	}

	public String getAcctcolltyds() {
		return this.acctcolltyds;
	}

	public void setAcctcolltyds(String acctcolltyds) {
		this.acctcolltyds = acctcolltyds;
	}

	public String getAcctcurrbaseind() {
		return this.acctcurrbaseind;
	}

	public void setAcctcurrbaseind(String acctcurrbaseind) {
		this.acctcurrbaseind = acctcurrbaseind;
	}

	public String getAcctcurrc() {
		return this.acctcurrc;
	}

	public void setAcctcurrc(String acctcurrc) {
		this.acctcurrc = acctcurrc;
	}

	public String getAcctcurrnm() {
		return this.acctcurrnm;
	}

	public void setAcctcurrnm(String acctcurrnm) {
		this.acctcurrnm = acctcurrnm;
	}

	public String getAcctdorind() {
		return this.acctdorind;
	}

	public void setAcctdorind(String acctdorind) {
		this.acctdorind = acctdorind;
	}

	public String getAcctempind() {
		return this.acctempind;
	}

	public void setAcctempind(String acctempind) {
		this.acctempind = acctempind;
	}

	public BigDecimal getAcctinsamt() {
		return this.acctinsamt;
	}

	public void setAcctinsamt(BigDecimal acctinsamt) {
		this.acctinsamt = acctinsamt;
	}

	public String getAcctlettercreditind() {
		return this.acctlettercreditind;
	}

	public void setAcctlettercreditind(String acctlettercreditind) {
		this.acctlettercreditind = acctlettercreditind;
	}

	public String getAcctmailadd1() {
		return this.acctmailadd1;
	}

	public void setAcctmailadd1(String acctmailadd1) {
		this.acctmailadd1 = acctmailadd1;
	}

	public String getAcctmailadd2() {
		return this.acctmailadd2;
	}

	public void setAcctmailadd2(String acctmailadd2) {
		this.acctmailadd2 = acctmailadd2;
	}

	public String getAcctmailcinm() {
		return this.acctmailcinm;
	}

	public void setAcctmailcinm(String acctmailcinm) {
		this.acctmailcinm = acctmailcinm;
	}

	public String getAcctmailcocd() {
		return this.acctmailcocd;
	}

	public void setAcctmailcocd(String acctmailcocd) {
		this.acctmailcocd = acctmailcocd;
	}

	public String getAcctmailconm() {
		return this.acctmailconm;
	}

	public void setAcctmailconm(String acctmailconm) {
		this.acctmailconm = acctmailconm;
	}

	public String getAcctmailpocd() {
		return this.acctmailpocd;
	}

	public void setAcctmailpocd(String acctmailpocd) {
		this.acctmailpocd = acctmailpocd;
	}

	public String getAcctmailstatcd() {
		return this.acctmailstatcd;
	}

	public void setAcctmailstatcd(String acctmailstatcd) {
		this.acctmailstatcd = acctmailstatcd;
	}

	public String getAcctmailstatnm() {
		return this.acctmailstatnm;
	}

	public void setAcctmailstatnm(String acctmailstatnm) {
		this.acctmailstatnm = acctmailstatnm;
	}

	public Timestamp getAcctmaturdate() {
		return this.acctmaturdate;
	}

	public void setAcctmaturdate(Timestamp acctmaturdate) {
		this.acctmaturdate = acctmaturdate;
	}

	public String getAcctnm() {
		return this.acctnm;
	}

	public void setAcctnm(String acctnm) {
		this.acctnm = acctnm;
	}

	public String getAcctno() {
		return this.acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public Timestamp getAcctopdate() {
		return this.acctopdate;
	}

	public void setAcctopdate(Timestamp acctopdate) {
		this.acctopdate = acctopdate;
	}

	public BigDecimal getAcctorgloanamt() {
		return this.acctorgloanamt;
	}

	public void setAcctorgloanamt(BigDecimal acctorgloanamt) {
		this.acctorgloanamt = acctorgloanamt;
	}

	public String getAcctprbrnm() {
		return this.acctprbrnm;
	}

	public void setAcctprbrnm(String acctprbrnm) {
		this.acctprbrnm = acctprbrnm;
	}

	public String getAcctprodcatnm() {
		return this.acctprodcatnm;
	}

	public void setAcctprodcatnm(String acctprodcatnm) {
		this.acctprodcatnm = acctprodcatnm;
	}

	public String getAcctprodlinenm() {
		return this.acctprodlinenm;
	}

	public void setAcctprodlinenm(String acctprodlinenm) {
		this.acctprodlinenm = acctprodlinenm;
	}

	public String getAcctprodnm() {
		return this.acctprodnm;
	}

	public void setAcctprodnm(String acctprodnm) {
		this.acctprodnm = acctprodnm;
	}

	public String getAcctprodno() {
		return this.acctprodno;
	}

	public void setAcctprodno(String acctprodno) {
		this.acctprodno = acctprodno;
	}

	public String getAcctprodtynm() {
		return this.acctprodtynm;
	}

	public void setAcctprodtynm(String acctprodtynm) {
		this.acctprodtynm = acctprodtynm;
	}

	public String getAcctregnm() {
		return this.acctregnm;
	}

	public void setAcctregnm(String acctregnm) {
		this.acctregnm = acctregnm;
	}

	public String getAcctregtydesc() {
		return this.acctregtydesc;
	}

	public void setAcctregtydesc(String acctregtydesc) {
		this.acctregtydesc = acctregtydesc;
	}

	public String getAcctstatdesc() {
		return this.acctstatdesc;
	}

	public void setAcctstatdesc(String acctstatdesc) {
		this.acctstatdesc = acctstatdesc;
	}

	public String getAccttaxid() {
		return this.accttaxid;
	}

	public void setAccttaxid(String accttaxid) {
		this.accttaxid = accttaxid;
	}

	public String getAccttaxidtydes() {
		return this.accttaxidtydes;
	}

	public void setAccttaxidtydes(String accttaxidtydes) {
		this.accttaxidtydes = accttaxidtydes;
	}

	public String getAccttaxstatcd() {
		return this.accttaxstatcd;
	}

	public void setAccttaxstatcd(String accttaxstatcd) {
		this.accttaxstatcd = accttaxstatcd;
	}

	public String getAccttradeind() {
		return this.accttradeind;
	}

	public void setAccttradeind(String accttradeind) {
		this.accttradeind = accttradeind;
	}

	public String getAccttydesc() {
		return this.accttydesc;
	}

	public void setAccttydesc(String accttydesc) {
		this.accttydesc = accttydesc;
	}

	public String getActtcashintind() {
		return this.acttcashintind;
	}

	public void setActtcashintind(String acttcashintind) {
		this.acttcashintind = acttcashintind;
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

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public BigDecimal getInstallmentAmount() {
		return this.installmentAmount;
	}

	public void setInstallmentAmount(BigDecimal installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public Timestamp getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Timestamp modificationDate) {
		this.modificationDate = modificationDate;
	}

}