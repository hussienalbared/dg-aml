package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AML001_TRANS_LOAN_X_TO_T database table.
 * 
 */
//@Entity
//@Table(name="AML001_TRANS_LOAN_X_TO_T")
//@NamedQuery(name="Aml001TransLoanXToT.findAll", query="SELECT a FROM Aml001TransLoanXToT a")
public class Aml001TransLoanXToT implements Serializable {
	/*private static final long serialVersionUID = 1L;

	@Column(name="ACCTALTNM")
	private String acctaltnm;

	@Column(name="ACCTBNM")
	private String acctbnm;

	@Column(name="ACCTCLDATE")
	private Timestamp acctcldate;

	@Column(name="ACCTCOLLTYCD")
	private String acctcolltycd;

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

	@Column(name="ACCTECTRN")
	private String acctectrn;

	@Column(name="ACCTEMPIND")
	private String acctempind;

	@Column(name="ACCTEVACCTNO")
	private BigDecimal acctevacctno;

	@Column(name="ACCTEVBRNO")
	private BigDecimal acctevbrno;

	@Column(name="ACCTEVCOCD")
	private BigDecimal acctevcocd;

	@Column(name="ACCTEVDATEKEY")
	private BigDecimal acctevdatekey;

	@Column(name="ACCTEVHHMMSS")
	private BigDecimal acctevhhmmss;

	@Column(name="ACCTEVTSTATKEY")
	private BigDecimal acctevtstatkey;

	@Column(name="ACCTEVTTYKEY")
	private BigDecimal acctevttykey;

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

	@Column(name="ACCTOPDATE")
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

	@Column(name="check_casher_ind")
	private String checkCasherInd;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	@Column(name="currency_exchange_ind")
	private String currencyExchangeInd;

	@Column(name="Expr1")
	private Timestamp expr1;

	@Column(name="Expr10")
	private String expr10;

	@Column(name="Expr11")
	private String expr11;

	@Column(name="Expr12")
	private String expr12;

	@Column(name="Expr13")
	private String expr13;

	@Column(name="Expr14")
	private String expr14;

	@Column(name="Expr15")
	private String expr15;

	@Column(name="Expr16")
	private String expr16;

	@Column(name="Expr17")
	private Timestamp expr17;

	@Column(name="Expr18")
	private Timestamp expr18;

	@Column(name="Expr19")
	private String expr19;

	@Column(name="Expr2")
	private Timestamp expr2;

	@Column(name="Expr20")
	private String expr20;

	@Column(name="Expr21")
	private String expr21;

	@Column(name="Expr22")
	private String expr22;

	@Column(name="Expr23")
	private String expr23;

	@Column(name="Expr24")
	private String expr24;

	@Column(name="Expr25")
	private String expr25;

	@Column(name="Expr26")
	private String expr26;

	@Column(name="Expr27")
	private String expr27;

	@Column(name="Expr28")
	private String expr28;

	@Column(name="Expr29")
	private String expr29;

	@Column(name="Expr3")
	private String expr3;

	@Column(name="Expr30")
	private String expr30;

	@Column(name="Expr31")
	private String expr31;

	@Column(name="Expr32")
	private String expr32;

	@Column(name="Expr33")
	private String expr33;

	@Column(name="Expr34")
	private String expr34;

	@Column(name="Expr35")
	private String expr35;

	@Column(name="Expr36")
	private String expr36;

	@Column(name="Expr37")
	private String expr37;

	@Column(name="Expr38")
	private String expr38;

	@Column(name="Expr39")
	private Timestamp expr39;

	@Column(name="Expr4")
	private Timestamp expr4;

	@Column(name="Expr40")
	private BigDecimal expr40;

	@Column(name="Expr41")
	private String expr41;

	@Column(name="Expr42")
	private String expr42;

	@Column(name="Expr43")
	private BigDecimal expr43;

	@Column(name="Expr44")
	private String expr44;

	@Column(name="Expr45")
	private String expr45;

	@Column(name="Expr46")
	private String expr46;

	@Column(name="Expr47")
	private String expr47;

	@Column(name="Expr48")
	private BigDecimal expr48;

	@Column(name="Expr49")
	private Timestamp expr49;

	@Column(name="Expr5")
	private Timestamp expr5;

	@Column(name="Expr50")
	private Timestamp expr50;

	@Column(name="Expr51")
	private int expr51;

	@Column(name="Expr52")
	private Timestamp expr52;

	@Column(name="Expr53")
	private Timestamp expr53;

	@Column(name="Expr54")
	private String expr54;

	@Column(name="Expr55")
	private int expr55;

	@Column(name="Expr6")
	private String expr6;

	@Column(name="Expr7")
	private int expr7;

	@Column(name="Expr8")
	private String expr8;

	@Column(name="Expr9")
	private String expr9;

	@Column(name="external_party_ind")
	private String externalPartyInd;

	@Column(name="foreign_consulate_embassy_ind")
	private String foreignConsulateEmbassyInd;

	@Column(name="funds_securities_code")
	private String fundsSecuritiesCode;

	@Column(name="funds_securities_desc")
	private String fundsSecuritiesDesc;

	@Column(name="industry_code_rr")
	private String industryCodeRr;

	@Column(name="installment_amount")
	private BigDecimal installmentAmount;

	@Column(name="internet_gambling_ind")
	private String internetGamblingInd;

	@Column(name="issues_bearer_shares_ind")
	private String issuesBearerSharesInd;

	@Column(name="last_risk_assessment_date")
	private Timestamp lastRiskAssessmentDate;

	@Column(name="last_susp_actv_rpt_date")
	private Timestamp lastSuspActvRptDate;

	@Column(name="legal_entity_type")
	private String legalEntityType;

	@Column(name="lst_update_date")
	private Timestamp lstUpdateDate;

	@Column(name="match_code_mailing_addr_lines")
	private String matchCodeMailingAddrLines;

	@Column(name="match_code_mailing_city")
	private String matchCodeMailingCity;

	@Column(name="match_code_mailing_country")
	private String matchCodeMailingCountry;

	@Column(name="match_code_mailing_state")
	private String matchCodeMailingState;

	@Column(name="match_code_street_addr_lines")
	private String matchCodeStreetAddrLines;

	@Column(name="match_code_street_city")
	private String matchCodeStreetCity;

	@Column(name="match_code_street_country")
	private String matchCodeStreetCountry;

	@Column(name="match_code_street_state")
	private String matchCodeStreetState;

	@Column(name="mechanism_desc")
	private String mechanismDesc;

	@Column(name="MODIFICATION_DATE")
	private Timestamp modificationDate;

	@Column(name="money_orders_ind")
	private String moneyOrdersInd;

	@Column(name="money_transmitter_ind")
	private String moneyTransmitterInd;

	@Column(name="msb_ind")
	private String msbInd;

	@Column(name="negative_news_ind")
	private String negativeNewsInd;

	@Column(name="PANINCAMT")
	private BigDecimal panincamt;

	@Column(name="party_id_country_code")
	private String partyIdCountryCode;

	@Column(name="PASCIND")
	private String pascind;

	@Column(name="PASCNM")
	private String pascnm;

	@Column(name="PASCNO")
	private String pascno;

	@Column(name="PASCTEL")
	private String pasctel;

	@Column(name="PBOD")
	private Timestamp pbod;

	@Column(name="PCUSDATE")
	private Timestamp pcusdate;

	@Column(name="PCZCOCD")
	private String pczcocd;

	@Column(name="PCZCONM")
	private String pczconm;

	@Column(name="PDBNM")
	private String pdbnm;

	@Column(name="PEMAILAD")
	private String pemailad;

	@Column(name="PFNM")
	private String pfnm;

	@Column(name="PGENDER")
	private String pgender;

	@Column(name="PID")
	private String pid;

	@Column(name="PIDEXPDATE")
	private Timestamp pidexpdate;

	@Column(name="PIDISSUEDATE")
	private Timestamp pidissuedate;

	@Column(name="PIDSTATCD")
	private String pidstatcd;

	@Column(name="PIDTYDS")
	private String pidtyds;

	@Column(name="PINDSCD")
	private String pindscd;

	@Column(name="PINDSCDRR")
	private String pindscdrr;

	@Column(name="PLACONTDATE")
	private Timestamp placontdate;

	@Column(name="PLCTDATE")
	private Timestamp plctdate;

	@Column(name="PLNM")
	private String plnm;

	@Column(name="PMAILADD1")
	private String pmailadd1;

	@Column(name="PMAILADD2")
	private String pmailadd2;

	@Column(name="PMAILCINM")
	private String pmailcinm;

	@Column(name="PMAILCOCD")
	private String pmailcocd;

	@Column(name="PMAILCONM")
	private String pmailconm;

	@Column(name="PMAILLSTATCD")
	private String pmaillstatcd;

	@Column(name="PMAILPOCD")
	private String pmailpocd;

	@Column(name="PMAILSTATNM")
	private String pmailstatnm;

	@Column(name="PMARSTATDS")
	private String pmarstatds;

	@Column(name="PMATCHCDI")
	private String pmatchcdi;

	@Column(name="PMATCHCDMAILADD")
	private String pmatchcdmailadd;

	@Column(name="PMATCHCDO")
	private String pmatchcdo;

	@Column(name="PMATCHCDSTADD")
	private String pmatchcdstadd;

	@Column(name="PMNM")
	private String pmnm;

	@Column(name="PNETWOAMT")
	private BigDecimal pnetwoamt;

	@Column(name="PNM")
	private String pnm;

	@Column(name="PNO")
	private String pno;

	@Column(name="PNONPROFITIND")
	private String pnonprofitind;

	@Column(name="POCUDS")
	private String pocuds;

	@Column(name="PORGCOBCD")
	private String porgcobcd;

	@Column(name="PORGCOBNM")
	private String porgcobnm;

	@Column(name="PPEPIND")
	private String ppepind;

	@Column(name="prepaid_cards_ind")
	private String prepaidCardsInd;

	@Column(name="PRESCOCD")
	private String prescocd;

	@Column(name="PRESCONM")
	private String presconm;

	@Column(name="primary_medium_desc")
	private String primaryMediumDesc;

	@Column(name="PSTADD1")
	private String pstadd1;

	@Column(name="PSTADD2")
	private String pstadd2;

	@Column(name="PSTATDS")
	private String pstatds;

	@Column(name="PSTCINM")
	private String pstcinm;

	@Column(name="PSTCOCD")
	private String pstcocd;

	@Column(name="PSTCONM")
	private String pstconm;

	@Column(name="PSTPOCD")
	private String pstpocd;

	@Column(name="PSTSTATCD")
	private String pststatcd;

	@Column(name="PSTSTATNM")
	private String pststatnm;

	@Column(name="PTAXID")
	private String ptaxid;

	@Column(name="PTAXIDTYCD")
	private String ptaxidtycd;

	@Column(name="PTEL1")
	private String ptel1;

	@Column(name="PTEL2")
	private String ptel2;

	@Column(name="PTEL3")
	private String ptel3;

	@Column(name="PTYDS")
	private String ptyds;

	@Column(name="PUPNTNM")
	private String pupntnm;

	@Column(name="risk_classification")
	private BigDecimal riskClassification;

	@Column(name="secondary_medium_desc")
	private String secondaryMediumDesc;

	@Column(name="susp_actv_rpt_count")
	private BigDecimal suspActvRptCount;

	@Column(name="tertiary_medium_desc")
	private String tertiaryMediumDesc;

	@Column(name="transaction_cdi_code")
	private String transactionCdiCode;

	@Column(name="transaction_cdi_desc")
	private String transactionCdiDesc;

	@Column(name="transaction_key")
	private int transactionKey;

	@Column(name="transaction_type_key")
	private BigDecimal transactionTypeKey;

	@Column(name="travelers_cheques_ind")
	private String travelersChequesInd;

	@Column(name="trust_account_ind")
	private String trustAccountInd;

	public Aml001TransLoanXToT() {
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

	public String getAcctectrn() {
		return this.acctectrn;
	}

	public void setAcctectrn(String acctectrn) {
		this.acctectrn = acctectrn;
	}

	public String getAcctempind() {
		return this.acctempind;
	}

	public void setAcctempind(String acctempind) {
		this.acctempind = acctempind;
	}

	public BigDecimal getAcctevacctno() {
		return this.acctevacctno;
	}

	public void setAcctevacctno(BigDecimal acctevacctno) {
		this.acctevacctno = acctevacctno;
	}

	public BigDecimal getAcctevbrno() {
		return this.acctevbrno;
	}

	public void setAcctevbrno(BigDecimal acctevbrno) {
		this.acctevbrno = acctevbrno;
	}

	public BigDecimal getAcctevcocd() {
		return this.acctevcocd;
	}

	public void setAcctevcocd(BigDecimal acctevcocd) {
		this.acctevcocd = acctevcocd;
	}

	public BigDecimal getAcctevdatekey() {
		return this.acctevdatekey;
	}

	public void setAcctevdatekey(BigDecimal acctevdatekey) {
		this.acctevdatekey = acctevdatekey;
	}

	public BigDecimal getAcctevhhmmss() {
		return this.acctevhhmmss;
	}

	public void setAcctevhhmmss(BigDecimal acctevhhmmss) {
		this.acctevhhmmss = acctevhhmmss;
	}

	public BigDecimal getAcctevtstatkey() {
		return this.acctevtstatkey;
	}

	public void setAcctevtstatkey(BigDecimal acctevtstatkey) {
		this.acctevtstatkey = acctevtstatkey;
	}

	public BigDecimal getAcctevttykey() {
		return this.acctevttykey;
	}

	public void setAcctevttykey(BigDecimal acctevttykey) {
		this.acctevttykey = acctevttykey;
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

	public String getCheckCasherInd() {
		return this.checkCasherInd;
	}

	public void setCheckCasherInd(String checkCasherInd) {
		this.checkCasherInd = checkCasherInd;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getCurrencyExchangeInd() {
		return this.currencyExchangeInd;
	}

	public void setCurrencyExchangeInd(String currencyExchangeInd) {
		this.currencyExchangeInd = currencyExchangeInd;
	}

	public Timestamp getExpr1() {
		return this.expr1;
	}

	public void setExpr1(Timestamp expr1) {
		this.expr1 = expr1;
	}

	public String getExpr10() {
		return this.expr10;
	}

	public void setExpr10(String expr10) {
		this.expr10 = expr10;
	}

	public String getExpr11() {
		return this.expr11;
	}

	public void setExpr11(String expr11) {
		this.expr11 = expr11;
	}

	public String getExpr12() {
		return this.expr12;
	}

	public void setExpr12(String expr12) {
		this.expr12 = expr12;
	}

	public String getExpr13() {
		return this.expr13;
	}

	public void setExpr13(String expr13) {
		this.expr13 = expr13;
	}

	public String getExpr14() {
		return this.expr14;
	}

	public void setExpr14(String expr14) {
		this.expr14 = expr14;
	}

	public String getExpr15() {
		return this.expr15;
	}

	public void setExpr15(String expr15) {
		this.expr15 = expr15;
	}

	public String getExpr16() {
		return this.expr16;
	}

	public void setExpr16(String expr16) {
		this.expr16 = expr16;
	}

	public Timestamp getExpr17() {
		return this.expr17;
	}

	public void setExpr17(Timestamp expr17) {
		this.expr17 = expr17;
	}

	public Timestamp getExpr18() {
		return this.expr18;
	}

	public void setExpr18(Timestamp expr18) {
		this.expr18 = expr18;
	}

	public String getExpr19() {
		return this.expr19;
	}

	public void setExpr19(String expr19) {
		this.expr19 = expr19;
	}

	public Timestamp getExpr2() {
		return this.expr2;
	}

	public void setExpr2(Timestamp expr2) {
		this.expr2 = expr2;
	}

	public String getExpr20() {
		return this.expr20;
	}

	public void setExpr20(String expr20) {
		this.expr20 = expr20;
	}

	public String getExpr21() {
		return this.expr21;
	}

	public void setExpr21(String expr21) {
		this.expr21 = expr21;
	}

	public String getExpr22() {
		return this.expr22;
	}

	public void setExpr22(String expr22) {
		this.expr22 = expr22;
	}

	public String getExpr23() {
		return this.expr23;
	}

	public void setExpr23(String expr23) {
		this.expr23 = expr23;
	}

	public String getExpr24() {
		return this.expr24;
	}

	public void setExpr24(String expr24) {
		this.expr24 = expr24;
	}

	public String getExpr25() {
		return this.expr25;
	}

	public void setExpr25(String expr25) {
		this.expr25 = expr25;
	}

	public String getExpr26() {
		return this.expr26;
	}

	public void setExpr26(String expr26) {
		this.expr26 = expr26;
	}

	public String getExpr27() {
		return this.expr27;
	}

	public void setExpr27(String expr27) {
		this.expr27 = expr27;
	}

	public String getExpr28() {
		return this.expr28;
	}

	public void setExpr28(String expr28) {
		this.expr28 = expr28;
	}

	public String getExpr29() {
		return this.expr29;
	}

	public void setExpr29(String expr29) {
		this.expr29 = expr29;
	}

	public String getExpr3() {
		return this.expr3;
	}

	public void setExpr3(String expr3) {
		this.expr3 = expr3;
	}

	public String getExpr30() {
		return this.expr30;
	}

	public void setExpr30(String expr30) {
		this.expr30 = expr30;
	}

	public String getExpr31() {
		return this.expr31;
	}

	public void setExpr31(String expr31) {
		this.expr31 = expr31;
	}

	public String getExpr32() {
		return this.expr32;
	}

	public void setExpr32(String expr32) {
		this.expr32 = expr32;
	}

	public String getExpr33() {
		return this.expr33;
	}

	public void setExpr33(String expr33) {
		this.expr33 = expr33;
	}

	public String getExpr34() {
		return this.expr34;
	}

	public void setExpr34(String expr34) {
		this.expr34 = expr34;
	}

	public String getExpr35() {
		return this.expr35;
	}

	public void setExpr35(String expr35) {
		this.expr35 = expr35;
	}

	public String getExpr36() {
		return this.expr36;
	}

	public void setExpr36(String expr36) {
		this.expr36 = expr36;
	}

	public String getExpr37() {
		return this.expr37;
	}

	public void setExpr37(String expr37) {
		this.expr37 = expr37;
	}

	public String getExpr38() {
		return this.expr38;
	}

	public void setExpr38(String expr38) {
		this.expr38 = expr38;
	}

	public Timestamp getExpr39() {
		return this.expr39;
	}

	public void setExpr39(Timestamp expr39) {
		this.expr39 = expr39;
	}

	public Timestamp getExpr4() {
		return this.expr4;
	}

	public void setExpr4(Timestamp expr4) {
		this.expr4 = expr4;
	}

	public BigDecimal getExpr40() {
		return this.expr40;
	}

	public void setExpr40(BigDecimal expr40) {
		this.expr40 = expr40;
	}

	public String getExpr41() {
		return this.expr41;
	}

	public void setExpr41(String expr41) {
		this.expr41 = expr41;
	}

	public String getExpr42() {
		return this.expr42;
	}

	public void setExpr42(String expr42) {
		this.expr42 = expr42;
	}

	public BigDecimal getExpr43() {
		return this.expr43;
	}

	public void setExpr43(BigDecimal expr43) {
		this.expr43 = expr43;
	}

	public String getExpr44() {
		return this.expr44;
	}

	public void setExpr44(String expr44) {
		this.expr44 = expr44;
	}

	public String getExpr45() {
		return this.expr45;
	}

	public void setExpr45(String expr45) {
		this.expr45 = expr45;
	}

	public String getExpr46() {
		return this.expr46;
	}

	public void setExpr46(String expr46) {
		this.expr46 = expr46;
	}

	public String getExpr47() {
		return this.expr47;
	}

	public void setExpr47(String expr47) {
		this.expr47 = expr47;
	}

	public BigDecimal getExpr48() {
		return this.expr48;
	}

	public void setExpr48(BigDecimal expr48) {
		this.expr48 = expr48;
	}

	public Timestamp getExpr49() {
		return this.expr49;
	}

	public void setExpr49(Timestamp expr49) {
		this.expr49 = expr49;
	}

	public Timestamp getExpr5() {
		return this.expr5;
	}

	public void setExpr5(Timestamp expr5) {
		this.expr5 = expr5;
	}

	public Timestamp getExpr50() {
		return this.expr50;
	}

	public void setExpr50(Timestamp expr50) {
		this.expr50 = expr50;
	}

	public int getExpr51() {
		return this.expr51;
	}

	public void setExpr51(int expr51) {
		this.expr51 = expr51;
	}

	public Timestamp getExpr52() {
		return this.expr52;
	}

	public void setExpr52(Timestamp expr52) {
		this.expr52 = expr52;
	}

	public Timestamp getExpr53() {
		return this.expr53;
	}

	public void setExpr53(Timestamp expr53) {
		this.expr53 = expr53;
	}

	public String getExpr54() {
		return this.expr54;
	}

	public void setExpr54(String expr54) {
		this.expr54 = expr54;
	}

	public int getExpr55() {
		return this.expr55;
	}

	public void setExpr55(int expr55) {
		this.expr55 = expr55;
	}

	public String getExpr6() {
		return this.expr6;
	}

	public void setExpr6(String expr6) {
		this.expr6 = expr6;
	}

	public int getExpr7() {
		return this.expr7;
	}

	public void setExpr7(int expr7) {
		this.expr7 = expr7;
	}

	public String getExpr8() {
		return this.expr8;
	}

	public void setExpr8(String expr8) {
		this.expr8 = expr8;
	}

	public String getExpr9() {
		return this.expr9;
	}

	public void setExpr9(String expr9) {
		this.expr9 = expr9;
	}

	public String getExternalPartyInd() {
		return this.externalPartyInd;
	}

	public void setExternalPartyInd(String externalPartyInd) {
		this.externalPartyInd = externalPartyInd;
	}

	public String getForeignConsulateEmbassyInd() {
		return this.foreignConsulateEmbassyInd;
	}

	public void setForeignConsulateEmbassyInd(String foreignConsulateEmbassyInd) {
		this.foreignConsulateEmbassyInd = foreignConsulateEmbassyInd;
	}

	public String getFundsSecuritiesCode() {
		return this.fundsSecuritiesCode;
	}

	public void setFundsSecuritiesCode(String fundsSecuritiesCode) {
		this.fundsSecuritiesCode = fundsSecuritiesCode;
	}

	public String getFundsSecuritiesDesc() {
		return this.fundsSecuritiesDesc;
	}

	public void setFundsSecuritiesDesc(String fundsSecuritiesDesc) {
		this.fundsSecuritiesDesc = fundsSecuritiesDesc;
	}

	public String getIndustryCodeRr() {
		return this.industryCodeRr;
	}

	public void setIndustryCodeRr(String industryCodeRr) {
		this.industryCodeRr = industryCodeRr;
	}

	public BigDecimal getInstallmentAmount() {
		return this.installmentAmount;
	}

	public void setInstallmentAmount(BigDecimal installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public String getInternetGamblingInd() {
		return this.internetGamblingInd;
	}

	public void setInternetGamblingInd(String internetGamblingInd) {
		this.internetGamblingInd = internetGamblingInd;
	}

	public String getIssuesBearerSharesInd() {
		return this.issuesBearerSharesInd;
	}

	public void setIssuesBearerSharesInd(String issuesBearerSharesInd) {
		this.issuesBearerSharesInd = issuesBearerSharesInd;
	}

	public Timestamp getLastRiskAssessmentDate() {
		return this.lastRiskAssessmentDate;
	}

	public void setLastRiskAssessmentDate(Timestamp lastRiskAssessmentDate) {
		this.lastRiskAssessmentDate = lastRiskAssessmentDate;
	}

	public Timestamp getLastSuspActvRptDate() {
		return this.lastSuspActvRptDate;
	}

	public void setLastSuspActvRptDate(Timestamp lastSuspActvRptDate) {
		this.lastSuspActvRptDate = lastSuspActvRptDate;
	}

	public String getLegalEntityType() {
		return this.legalEntityType;
	}

	public void setLegalEntityType(String legalEntityType) {
		this.legalEntityType = legalEntityType;
	}

	public Timestamp getLstUpdateDate() {
		return this.lstUpdateDate;
	}

	public void setLstUpdateDate(Timestamp lstUpdateDate) {
		this.lstUpdateDate = lstUpdateDate;
	}

	public String getMatchCodeMailingAddrLines() {
		return this.matchCodeMailingAddrLines;
	}

	public void setMatchCodeMailingAddrLines(String matchCodeMailingAddrLines) {
		this.matchCodeMailingAddrLines = matchCodeMailingAddrLines;
	}

	public String getMatchCodeMailingCity() {
		return this.matchCodeMailingCity;
	}

	public void setMatchCodeMailingCity(String matchCodeMailingCity) {
		this.matchCodeMailingCity = matchCodeMailingCity;
	}

	public String getMatchCodeMailingCountry() {
		return this.matchCodeMailingCountry;
	}

	public void setMatchCodeMailingCountry(String matchCodeMailingCountry) {
		this.matchCodeMailingCountry = matchCodeMailingCountry;
	}

	public String getMatchCodeMailingState() {
		return this.matchCodeMailingState;
	}

	public void setMatchCodeMailingState(String matchCodeMailingState) {
		this.matchCodeMailingState = matchCodeMailingState;
	}

	public String getMatchCodeStreetAddrLines() {
		return this.matchCodeStreetAddrLines;
	}

	public void setMatchCodeStreetAddrLines(String matchCodeStreetAddrLines) {
		this.matchCodeStreetAddrLines = matchCodeStreetAddrLines;
	}

	public String getMatchCodeStreetCity() {
		return this.matchCodeStreetCity;
	}

	public void setMatchCodeStreetCity(String matchCodeStreetCity) {
		this.matchCodeStreetCity = matchCodeStreetCity;
	}

	public String getMatchCodeStreetCountry() {
		return this.matchCodeStreetCountry;
	}

	public void setMatchCodeStreetCountry(String matchCodeStreetCountry) {
		this.matchCodeStreetCountry = matchCodeStreetCountry;
	}

	public String getMatchCodeStreetState() {
		return this.matchCodeStreetState;
	}

	public void setMatchCodeStreetState(String matchCodeStreetState) {
		this.matchCodeStreetState = matchCodeStreetState;
	}

	public String getMechanismDesc() {
		return this.mechanismDesc;
	}

	public void setMechanismDesc(String mechanismDesc) {
		this.mechanismDesc = mechanismDesc;
	}

	public Timestamp getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Timestamp modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getMoneyOrdersInd() {
		return this.moneyOrdersInd;
	}

	public void setMoneyOrdersInd(String moneyOrdersInd) {
		this.moneyOrdersInd = moneyOrdersInd;
	}

	public String getMoneyTransmitterInd() {
		return this.moneyTransmitterInd;
	}

	public void setMoneyTransmitterInd(String moneyTransmitterInd) {
		this.moneyTransmitterInd = moneyTransmitterInd;
	}

	public String getMsbInd() {
		return this.msbInd;
	}

	public void setMsbInd(String msbInd) {
		this.msbInd = msbInd;
	}

	public String getNegativeNewsInd() {
		return this.negativeNewsInd;
	}

	public void setNegativeNewsInd(String negativeNewsInd) {
		this.negativeNewsInd = negativeNewsInd;
	}

	public BigDecimal getPanincamt() {
		return this.panincamt;
	}

	public void setPanincamt(BigDecimal panincamt) {
		this.panincamt = panincamt;
	}

	public String getPartyIdCountryCode() {
		return this.partyIdCountryCode;
	}

	public void setPartyIdCountryCode(String partyIdCountryCode) {
		this.partyIdCountryCode = partyIdCountryCode;
	}

	public String getPascind() {
		return this.pascind;
	}

	public void setPascind(String pascind) {
		this.pascind = pascind;
	}

	public String getPascnm() {
		return this.pascnm;
	}

	public void setPascnm(String pascnm) {
		this.pascnm = pascnm;
	}

	public String getPascno() {
		return this.pascno;
	}

	public void setPascno(String pascno) {
		this.pascno = pascno;
	}

	public String getPasctel() {
		return this.pasctel;
	}

	public void setPasctel(String pasctel) {
		this.pasctel = pasctel;
	}

	public Timestamp getPbod() {
		return this.pbod;
	}

	public void setPbod(Timestamp pbod) {
		this.pbod = pbod;
	}

	public Timestamp getPcusdate() {
		return this.pcusdate;
	}

	public void setPcusdate(Timestamp pcusdate) {
		this.pcusdate = pcusdate;
	}

	public String getPczcocd() {
		return this.pczcocd;
	}

	public void setPczcocd(String pczcocd) {
		this.pczcocd = pczcocd;
	}

	public String getPczconm() {
		return this.pczconm;
	}

	public void setPczconm(String pczconm) {
		this.pczconm = pczconm;
	}

	public String getPdbnm() {
		return this.pdbnm;
	}

	public void setPdbnm(String pdbnm) {
		this.pdbnm = pdbnm;
	}

	public String getPemailad() {
		return this.pemailad;
	}

	public void setPemailad(String pemailad) {
		this.pemailad = pemailad;
	}

	public String getPfnm() {
		return this.pfnm;
	}

	public void setPfnm(String pfnm) {
		this.pfnm = pfnm;
	}

	public String getPgender() {
		return this.pgender;
	}

	public void setPgender(String pgender) {
		this.pgender = pgender;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Timestamp getPidexpdate() {
		return this.pidexpdate;
	}

	public void setPidexpdate(Timestamp pidexpdate) {
		this.pidexpdate = pidexpdate;
	}

	public Timestamp getPidissuedate() {
		return this.pidissuedate;
	}

	public void setPidissuedate(Timestamp pidissuedate) {
		this.pidissuedate = pidissuedate;
	}

	public String getPidstatcd() {
		return this.pidstatcd;
	}

	public void setPidstatcd(String pidstatcd) {
		this.pidstatcd = pidstatcd;
	}

	public String getPidtyds() {
		return this.pidtyds;
	}

	public void setPidtyds(String pidtyds) {
		this.pidtyds = pidtyds;
	}

	public String getPindscd() {
		return this.pindscd;
	}

	public void setPindscd(String pindscd) {
		this.pindscd = pindscd;
	}

	public String getPindscdrr() {
		return this.pindscdrr;
	}

	public void setPindscdrr(String pindscdrr) {
		this.pindscdrr = pindscdrr;
	}

	public Timestamp getPlacontdate() {
		return this.placontdate;
	}

	public void setPlacontdate(Timestamp placontdate) {
		this.placontdate = placontdate;
	}

	public Timestamp getPlctdate() {
		return this.plctdate;
	}

	public void setPlctdate(Timestamp plctdate) {
		this.plctdate = plctdate;
	}

	public String getPlnm() {
		return this.plnm;
	}

	public void setPlnm(String plnm) {
		this.plnm = plnm;
	}

	public String getPmailadd1() {
		return this.pmailadd1;
	}

	public void setPmailadd1(String pmailadd1) {
		this.pmailadd1 = pmailadd1;
	}

	public String getPmailadd2() {
		return this.pmailadd2;
	}

	public void setPmailadd2(String pmailadd2) {
		this.pmailadd2 = pmailadd2;
	}

	public String getPmailcinm() {
		return this.pmailcinm;
	}

	public void setPmailcinm(String pmailcinm) {
		this.pmailcinm = pmailcinm;
	}

	public String getPmailcocd() {
		return this.pmailcocd;
	}

	public void setPmailcocd(String pmailcocd) {
		this.pmailcocd = pmailcocd;
	}

	public String getPmailconm() {
		return this.pmailconm;
	}

	public void setPmailconm(String pmailconm) {
		this.pmailconm = pmailconm;
	}

	public String getPmaillstatcd() {
		return this.pmaillstatcd;
	}

	public void setPmaillstatcd(String pmaillstatcd) {
		this.pmaillstatcd = pmaillstatcd;
	}

	public String getPmailpocd() {
		return this.pmailpocd;
	}

	public void setPmailpocd(String pmailpocd) {
		this.pmailpocd = pmailpocd;
	}

	public String getPmailstatnm() {
		return this.pmailstatnm;
	}

	public void setPmailstatnm(String pmailstatnm) {
		this.pmailstatnm = pmailstatnm;
	}

	public String getPmarstatds() {
		return this.pmarstatds;
	}

	public void setPmarstatds(String pmarstatds) {
		this.pmarstatds = pmarstatds;
	}

	public String getPmatchcdi() {
		return this.pmatchcdi;
	}

	public void setPmatchcdi(String pmatchcdi) {
		this.pmatchcdi = pmatchcdi;
	}

	public String getPmatchcdmailadd() {
		return this.pmatchcdmailadd;
	}

	public void setPmatchcdmailadd(String pmatchcdmailadd) {
		this.pmatchcdmailadd = pmatchcdmailadd;
	}

	public String getPmatchcdo() {
		return this.pmatchcdo;
	}

	public void setPmatchcdo(String pmatchcdo) {
		this.pmatchcdo = pmatchcdo;
	}

	public String getPmatchcdstadd() {
		return this.pmatchcdstadd;
	}

	public void setPmatchcdstadd(String pmatchcdstadd) {
		this.pmatchcdstadd = pmatchcdstadd;
	}

	public String getPmnm() {
		return this.pmnm;
	}

	public void setPmnm(String pmnm) {
		this.pmnm = pmnm;
	}

	public BigDecimal getPnetwoamt() {
		return this.pnetwoamt;
	}

	public void setPnetwoamt(BigDecimal pnetwoamt) {
		this.pnetwoamt = pnetwoamt;
	}

	public String getPnm() {
		return this.pnm;
	}

	public void setPnm(String pnm) {
		this.pnm = pnm;
	}

	public String getPno() {
		return this.pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPnonprofitind() {
		return this.pnonprofitind;
	}

	public void setPnonprofitind(String pnonprofitind) {
		this.pnonprofitind = pnonprofitind;
	}

	public String getPocuds() {
		return this.pocuds;
	}

	public void setPocuds(String pocuds) {
		this.pocuds = pocuds;
	}

	public String getPorgcobcd() {
		return this.porgcobcd;
	}

	public void setPorgcobcd(String porgcobcd) {
		this.porgcobcd = porgcobcd;
	}

	public String getPorgcobnm() {
		return this.porgcobnm;
	}

	public void setPorgcobnm(String porgcobnm) {
		this.porgcobnm = porgcobnm;
	}

	public String getPpepind() {
		return this.ppepind;
	}

	public void setPpepind(String ppepind) {
		this.ppepind = ppepind;
	}

	public String getPrepaidCardsInd() {
		return this.prepaidCardsInd;
	}

	public void setPrepaidCardsInd(String prepaidCardsInd) {
		this.prepaidCardsInd = prepaidCardsInd;
	}

	public String getPrescocd() {
		return this.prescocd;
	}

	public void setPrescocd(String prescocd) {
		this.prescocd = prescocd;
	}

	public String getPresconm() {
		return this.presconm;
	}

	public void setPresconm(String presconm) {
		this.presconm = presconm;
	}

	public String getPrimaryMediumDesc() {
		return this.primaryMediumDesc;
	}

	public void setPrimaryMediumDesc(String primaryMediumDesc) {
		this.primaryMediumDesc = primaryMediumDesc;
	}

	public String getPstadd1() {
		return this.pstadd1;
	}

	public void setPstadd1(String pstadd1) {
		this.pstadd1 = pstadd1;
	}

	public String getPstadd2() {
		return this.pstadd2;
	}

	public void setPstadd2(String pstadd2) {
		this.pstadd2 = pstadd2;
	}

	public String getPstatds() {
		return this.pstatds;
	}

	public void setPstatds(String pstatds) {
		this.pstatds = pstatds;
	}

	public String getPstcinm() {
		return this.pstcinm;
	}

	public void setPstcinm(String pstcinm) {
		this.pstcinm = pstcinm;
	}

	public String getPstcocd() {
		return this.pstcocd;
	}

	public void setPstcocd(String pstcocd) {
		this.pstcocd = pstcocd;
	}

	public String getPstconm() {
		return this.pstconm;
	}

	public void setPstconm(String pstconm) {
		this.pstconm = pstconm;
	}

	public String getPstpocd() {
		return this.pstpocd;
	}

	public void setPstpocd(String pstpocd) {
		this.pstpocd = pstpocd;
	}

	public String getPststatcd() {
		return this.pststatcd;
	}

	public void setPststatcd(String pststatcd) {
		this.pststatcd = pststatcd;
	}

	public String getPststatnm() {
		return this.pststatnm;
	}

	public void setPststatnm(String pststatnm) {
		this.pststatnm = pststatnm;
	}

	public String getPtaxid() {
		return this.ptaxid;
	}

	public void setPtaxid(String ptaxid) {
		this.ptaxid = ptaxid;
	}

	public String getPtaxidtycd() {
		return this.ptaxidtycd;
	}

	public void setPtaxidtycd(String ptaxidtycd) {
		this.ptaxidtycd = ptaxidtycd;
	}

	public String getPtel1() {
		return this.ptel1;
	}

	public void setPtel1(String ptel1) {
		this.ptel1 = ptel1;
	}

	public String getPtel2() {
		return this.ptel2;
	}

	public void setPtel2(String ptel2) {
		this.ptel2 = ptel2;
	}

	public String getPtel3() {
		return this.ptel3;
	}

	public void setPtel3(String ptel3) {
		this.ptel3 = ptel3;
	}

	public String getPtyds() {
		return this.ptyds;
	}

	public void setPtyds(String ptyds) {
		this.ptyds = ptyds;
	}

	public String getPupntnm() {
		return this.pupntnm;
	}

	public void setPupntnm(String pupntnm) {
		this.pupntnm = pupntnm;
	}

	public BigDecimal getRiskClassification() {
		return this.riskClassification;
	}

	public void setRiskClassification(BigDecimal riskClassification) {
		this.riskClassification = riskClassification;
	}

	public String getSecondaryMediumDesc() {
		return this.secondaryMediumDesc;
	}

	public void setSecondaryMediumDesc(String secondaryMediumDesc) {
		this.secondaryMediumDesc = secondaryMediumDesc;
	}

	public BigDecimal getSuspActvRptCount() {
		return this.suspActvRptCount;
	}

	public void setSuspActvRptCount(BigDecimal suspActvRptCount) {
		this.suspActvRptCount = suspActvRptCount;
	}

	public String getTertiaryMediumDesc() {
		return this.tertiaryMediumDesc;
	}

	public void setTertiaryMediumDesc(String tertiaryMediumDesc) {
		this.tertiaryMediumDesc = tertiaryMediumDesc;
	}

	public String getTransactionCdiCode() {
		return this.transactionCdiCode;
	}

	public void setTransactionCdiCode(String transactionCdiCode) {
		this.transactionCdiCode = transactionCdiCode;
	}

	public String getTransactionCdiDesc() {
		return this.transactionCdiDesc;
	}

	public void setTransactionCdiDesc(String transactionCdiDesc) {
		this.transactionCdiDesc = transactionCdiDesc;
	}

	public int getTransactionKey() {
		return this.transactionKey;
	}

	public void setTransactionKey(int transactionKey) {
		this.transactionKey = transactionKey;
	}

	public BigDecimal getTransactionTypeKey() {
		return this.transactionTypeKey;
	}

	public void setTransactionTypeKey(BigDecimal transactionTypeKey) {
		this.transactionTypeKey = transactionTypeKey;
	}

	public String getTravelersChequesInd() {
		return this.travelersChequesInd;
	}

	public void setTravelersChequesInd(String travelersChequesInd) {
		this.travelersChequesInd = travelersChequesInd;
	}

	public String getTrustAccountInd() {
		return this.trustAccountInd;
	}

	public void setTrustAccountInd(String trustAccountInd) {
		this.trustAccountInd = trustAccountInd;
	}
*/
}