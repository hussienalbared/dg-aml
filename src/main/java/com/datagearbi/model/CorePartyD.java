package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_PARTY_D database table.
 * 
 */
@Entity
@Table(name="CORE_PARTY_D")
@NamedQuery(name="CorePartyD.findAll", query="SELECT c FROM CorePartyD c")
public class CorePartyD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="party_key")
	private int partyKey;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	@Column(name="check_casher_ind")
	private String checkCasherInd;

	@Column(name="currency_exchange_ind")
	private String currencyExchangeInd;

	@Column(name="external_party_ind")
	private String externalPartyInd;

	@Column(name="foreign_consulate_embassy_ind")
	private String foreignConsulateEmbassyInd;

	@Column(name="industry_code_rr")
	private String industryCodeRr;

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

	@Column(name="susp_actv_rpt_count")
	private BigDecimal suspActvRptCount;

	@Column(name="travelers_cheques_ind")
	private String travelersChequesInd;

	@Column(name="trust_account_ind")
	private String trustAccountInd;

	public CorePartyD() {
	}

	public int getPartyKey() {
		return this.partyKey;
	}

	public void setPartyKey(int partyKey) {
		this.partyKey = partyKey;
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

	public String getCheckCasherInd() {
		return this.checkCasherInd;
	}

	public void setCheckCasherInd(String checkCasherInd) {
		this.checkCasherInd = checkCasherInd;
	}

	public String getCurrencyExchangeInd() {
		return this.currencyExchangeInd;
	}

	public void setCurrencyExchangeInd(String currencyExchangeInd) {
		this.currencyExchangeInd = currencyExchangeInd;
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

	public String getIndustryCodeRr() {
		return this.industryCodeRr;
	}

	public void setIndustryCodeRr(String industryCodeRr) {
		this.industryCodeRr = industryCodeRr;
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

	public BigDecimal getSuspActvRptCount() {
		return this.suspActvRptCount;
	}

	public void setSuspActvRptCount(BigDecimal suspActvRptCount) {
		this.suspActvRptCount = suspActvRptCount;
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

}