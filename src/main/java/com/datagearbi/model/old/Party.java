package com.datagearbi.model.old;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema = "AML", name ="CORE_PARTY_D")
public class Party {
	@Id
 private int party_key;//	 party_key	int
private String PNO;//	 PNO	varchar(50)
private String PTYDS;//	 PTYDS	varchar(20)

private String PTAXID;//PTAXID	varchar(35)
private  String PTAXIDTYCD;//PTAXIDTYCD	char(1)
private  String PID;//PID	varchar(100)
private   String PIDTYDS;//PIDTYDS	char(50)
private Date PIDISSUEDATE;//PIDISSUEDATE	datetime
private Date PIDEXPDATE;//PIDEXPDATE	datetime
private  String PGENDER;//PGENDER	char(1)
private  String PIDSTATCD;//PIDSTATCD	char(3)
private  String party_id_country_code;//party_id_country_code	char(3)
private Date PBOD;//PBOD	datetime
private  String PFNM;//PFNM	varchar(200)
private String PLNM;//PLNM	varchar(200)
private String PMNM;//PMNM	varchar(200)
private  String PNM;//PNM	varchar(255)
private  String PDBNM;//PDBNM	varchar(200)
private  String PSTATDS;//PSTATDS	varchar(20)
private  String PUPNTNM;//PUPNTNM	varchar(35)
private  String PMATCHCDO;//PMATCHCDO	varchar(100)
private  String PMATCHCDI;//PMATCHCDI	varchar(80)
private  String PMATCHCDSTADD;//PMATCHCDSTADD	varchar(140)
private  String PMATCHCDMAILADD;//PMATCHCDMAILADD	varchar(140)
private  String match_code_street_addr_lines;//match_code_street_addr_lines	varchar(80)
private  String match_code_street_city;//match_code_street_city	varchar(30)
private  String match_code_street_state;//match_code_street_state	varchar(30)
private  String match_code_street_country;//match_code_street_country	varchar(30)
private  String match_code_mailing_addr_lines; //match_code_mailing_addr_lines	varchar(80)
private  String match_code_mailing_city; //match_code_mailing_city	varchar(30)
private  String match_code_mailing_state; //match_code_mailing_state	varchar(30)
private  String match_code_mailing_country; //match_code_mailing_country	varchar(30)
private  String PSTADD1;//PSTADD1	varchar(350)
private  String PSTADD2; //PSTADD2	varchar(350)
private  String PSTCINM;//PSTCINM	varchar(50)
private  String PSTSTATCD;//PSTSTATCD	char(3)
private  String PSTSTATNM;//PSTSTATNM	varchar(50)
private  String PSTPOCD;//PSTPOCD	varchar(50)
private  String PSTCOCD;//PSTCOCD	char(3)
private  String PSTCONM ;//PSTCONM	varchar(100)
private  String PMAILADD1 ;//PMAILADD1	varchar(350)
private  String PMAILADD2;	 //PMAILADD2	varchar(350)
private  String PMAILCINM; //PMAILCINM	varchar(50)
private  String PMAILLSTATCD;//PMAILLSTATCD	char(3)
private  String PMAILSTATNM;//PMAILSTATNM	varchar(50)
private  String PMAILPOCD;//PMAILPOCD	varchar(50)
private  String PMAILCOCD ;	//PMAILCOCD	char(3)
private  String PMAILCONM;//PMAILCONM	varchar(100)
private  String PRESCOCD;//PRESCOCD	char(3)
private  String PRESCONM;//PRESCONM	varchar(100)
private  String PCZCOCD;//PCZCOCD	char(3)
private  String PCZCONM;//PCZCONM	varchar(100)
private  String PORGCOBCD; //PORGCOBCD	char(3)
private  String PORGCOBNM;//PORGCOBNM	varchar(100)
private  String PASCIND;//PASCIND	char(1)
private  String PASCNO;//PASCNO	varchar(20)
private   String PASCNM;//PASCNM	varchar(50)
private   String PASCTEL;//PASCTEL	varchar(25)
private   String PEMAILAD;//PEMAILAD	varchar(35)
private  String POCUDS;//POCUDS	varchar(35)
private  String PINDSCD;//PINDSCD	char(10)
private  String  industry_code_rr;//industry_code_rr	varchar(10)
private  String PINDSCDRR;//PINDSCDRR	varchar(255)
private   String PTEL1;//PTEL1	varchar(25)
private  String  PTEL2;//PTEL2	varchar(25)
private  String PTEL3;//PTEL3	varchar(25)
private  Double PANINCAMT;//PANINCAMT	decimal(10, 0)
private  Double PNETWOAMT;//PNETWOAMT	decimal(10, 0)
private   String PMARSTATDS;//PMARSTATDS	varchar(20)
private  Date PLACONTDATE;//PLACONTDATE	datetime
private  String  PPEPIND;//PPEPIND	char(1)
private  String PNONPROFITIND; //PNONPROFITIND	char(1)
private  Date PCUSDATE;//PCUSDATE	datetime
private  Date last_susp_actv_rpt_date;//last_susp_actv_rpt_date	datetime
private Date PLCTDATE;//PLCTDATE	datetime
private  Date last_risk_assessment_date;//last_risk_assessment_date	datetime
@Column(name="risk_classification", nullable=true)
private Integer risk_classification;//risk_classification	decimal(1, 0)
private  String external_party_ind;//external_party_ind	char(1)
private  String legal_entity_type;//legal_entity_type	varchar(30)
private  String money_orders_ind;//money_orders_ind	char(1)
private  String travelers_cheques_ind;//travelers_cheques_ind	char(1)
private  String prepaid_cards_ind;//prepaid_cards_ind	char(1)
private  String msb_ind; //msb_ind	char(1)
private  String money_transmitter_ind;//money_transmitter_ind	char(1)
private  String currency_exchange_ind;//currency_exchange_ind	char(1)
private  String check_casher_ind;//check_casher_ind	char(1)
private  String internet_gambling_ind;//internet_gambling_ind	char(1)
private  String trust_account_ind;//trust_account_ind	char(1)
private  String foreign_consulate_embassy_ind;//foreign_consulate_embassy_ind	char(1)
private  String issues_bearer_shares_ind;//issues_bearer_shares_ind	char(1)
private   String negative_news_ind;//negative_news_ind	char(1)
private Integer susp_actv_rpt_count; //susp_actv_rpt_count	decimal(4, 0)
private Date lst_update_date;//lst_update_date	datetime
private Date change_begin_date;//change_begin_date	datetime
private Date change_end_date;//change_end_date	datetime
private  String change_current_ind;//change_current_ind	char(1)
public Party(int party_key, String pNO, String pTYDS, String pTAXID, String pTAXIDTYCD, String pID, String pIDTYDS,
		Date pIDISSUEDATE, Date pIDEXPDATE, String pGENDER, String pIDSTATCD, String party_id_country_code, Date pBOD,
		String pFNM, String pLNM, String pMNM, String pNM, String pDBNM, String pSTATDS, String pUPNTNM,
		String pMATCHCDO, String pMATCHCDI, String pMATCHCDSTADD, String pMATCHCDMAILADD,
		String match_code_street_addr_lines, String match_code_street_city, String match_code_street_state,
		String match_code_street_country, String match_code_mailing_addr_lines, String match_code_mailing_city,
		String match_code_mailing_state, String match_code_mailing_country, String pSTADD1, String pSTADD2,
		String pSTCINM, String pSTSTATCD, String pSTSTATNM, String pSTPOCD, String pSTCOCD, String pSTCONM,
		String pMAILADD1, String pMAILADD2, String pMAILCINM, String pMAILLSTATCD, String pMAILSTATNM, String pMAILPOCD,
		String pMAILCOCD, String pMAILCONM, String pRESCOCD, String pRESCONM, String pCZCOCD, String pCZCONM,
		String pORGCOBCD, String pORGCOBNM, String pASCIND, String pASCNO, String pASCNM, String pASCTEL,
		String pEMAILAD, String pOCUDS, String pINDSCD, String industry_code_rr, String pINDSCDRR, String pTEL1,
		String pTEL2, String pTEL3, Double pANINCAMT, Double pNETWOAMT, String pMARSTATDS, Date pLACONTDATE,
		String pPEPIND, String pNONPROFITIND, Date pCUSDATE, Date last_susp_actv_rpt_date, Date pLCTDATE,
		Date last_risk_assessment_date, int risk_classification, String external_party_ind, String legal_entity_type,
		String money_orders_ind, String travelers_cheques_ind, String prepaid_cards_ind, String msb_ind,
		String money_transmitter_ind, String currency_exchange_ind, String check_casher_ind,
		String internet_gambling_ind, String trust_account_ind, String foreign_consulate_embassy_ind,
		String issues_bearer_shares_ind, String negative_news_ind, Integer susp_actv_rpt_count, Date lst_update_date,
		Date change_begin_date, Date change_end_date, String change_current_ind) {
	super();
	this.party_key = party_key;
	PNO = pNO;
	PTYDS = pTYDS;
	PTAXID = pTAXID;
	PTAXIDTYCD = pTAXIDTYCD;
	PID = pID;
	PIDTYDS = pIDTYDS;
	PIDISSUEDATE = pIDISSUEDATE;
	PIDEXPDATE = pIDEXPDATE;
	PGENDER = pGENDER;
	PIDSTATCD = pIDSTATCD;
	this.party_id_country_code = party_id_country_code;
	PBOD = pBOD;
	PFNM = pFNM;
	PLNM = pLNM;
	PMNM = pMNM;
	PNM = pNM;
	PDBNM = pDBNM;
	PSTATDS = pSTATDS;
	PUPNTNM = pUPNTNM;
	PMATCHCDO = pMATCHCDO;
	PMATCHCDI = pMATCHCDI;
	PMATCHCDSTADD = pMATCHCDSTADD;
	PMATCHCDMAILADD = pMATCHCDMAILADD;
	this.match_code_street_addr_lines = match_code_street_addr_lines;
	this.match_code_street_city = match_code_street_city;
	this.match_code_street_state = match_code_street_state;
	this.match_code_street_country = match_code_street_country;
	this.match_code_mailing_addr_lines = match_code_mailing_addr_lines;
	this.match_code_mailing_city = match_code_mailing_city;
	this.match_code_mailing_state = match_code_mailing_state;
	this.match_code_mailing_country = match_code_mailing_country;
	PSTADD1 = pSTADD1;
	PSTADD2 = pSTADD2;
	PSTCINM = pSTCINM;
	PSTSTATCD = pSTSTATCD;
	PSTSTATNM = pSTSTATNM;
	PSTPOCD = pSTPOCD;
	PSTCOCD = pSTCOCD;
	PSTCONM = pSTCONM;
	PMAILADD1 = pMAILADD1;
	PMAILADD2 = pMAILADD2;
	PMAILCINM = pMAILCINM;
	PMAILLSTATCD = pMAILLSTATCD;
	PMAILSTATNM = pMAILSTATNM;
	PMAILPOCD = pMAILPOCD;
	PMAILCOCD = pMAILCOCD;
	PMAILCONM = pMAILCONM;
	PRESCOCD = pRESCOCD;
	PRESCONM = pRESCONM;
	PCZCOCD = pCZCOCD;
	PCZCONM = pCZCONM;
	PORGCOBCD = pORGCOBCD;
	PORGCOBNM = pORGCOBNM;
	PASCIND = pASCIND;
	PASCNO = pASCNO;
	PASCNM = pASCNM;
	PASCTEL = pASCTEL;
	PEMAILAD = pEMAILAD;
	POCUDS = pOCUDS;
	PINDSCD = pINDSCD;
	this.industry_code_rr = industry_code_rr;
	PINDSCDRR = pINDSCDRR;
	PTEL1 = pTEL1;
	PTEL2 = pTEL2;
	PTEL3 = pTEL3;
	PANINCAMT = pANINCAMT;
	PNETWOAMT = pNETWOAMT;
	PMARSTATDS = pMARSTATDS;
	PLACONTDATE = pLACONTDATE;
	PPEPIND = pPEPIND;
	PNONPROFITIND = pNONPROFITIND;
	PCUSDATE = pCUSDATE;
	this.last_susp_actv_rpt_date = last_susp_actv_rpt_date;
	PLCTDATE = pLCTDATE;
	this.last_risk_assessment_date = last_risk_assessment_date;
	this.risk_classification = risk_classification;
	this.external_party_ind = external_party_ind;
	this.legal_entity_type = legal_entity_type;
	this.money_orders_ind = money_orders_ind;
	this.travelers_cheques_ind = travelers_cheques_ind;
	this.prepaid_cards_ind = prepaid_cards_ind;
	this.msb_ind = msb_ind;
	this.money_transmitter_ind = money_transmitter_ind;
	this.currency_exchange_ind = currency_exchange_ind;
	this.check_casher_ind = check_casher_ind;
	this.internet_gambling_ind = internet_gambling_ind;
	this.trust_account_ind = trust_account_ind;
	this.foreign_consulate_embassy_ind = foreign_consulate_embassy_ind;
	this.issues_bearer_shares_ind = issues_bearer_shares_ind;
	this.negative_news_ind = negative_news_ind;
	this.susp_actv_rpt_count = susp_actv_rpt_count;
	this.lst_update_date = lst_update_date;
	this.change_begin_date = change_begin_date;
	this.change_end_date = change_end_date;
	this.change_current_ind = change_current_ind;
}
public int getParty_key() {
	return party_key;
}
public void setParty_key(int party_key) {
	this.party_key = party_key;
}
public String getPNO() {
	return PNO;
}
public void setPNO(String pNO) {
	PNO = pNO;
}
public String getPTYDS() {
	return PTYDS;
}
public void setPTYDS(String pTYDS) {
	PTYDS = pTYDS;
}
public String getPTAXID() {
	return PTAXID;
}
public void setPTAXID(String pTAXID) {
	PTAXID = pTAXID;
}
public String getPTAXIDTYCD() {
	return PTAXIDTYCD;
}
public void setPTAXIDTYCD(String pTAXIDTYCD) {
	PTAXIDTYCD = pTAXIDTYCD;
}
public String getPID() {
	return PID;
}
public void setPID(String pID) {
	PID = pID;
}
public String getPIDTYDS() {
	return PIDTYDS;
}
public void setPIDTYDS(String pIDTYDS) {
	PIDTYDS = pIDTYDS;
}
public Date getPIDISSUEDATE() {
	return PIDISSUEDATE;
}
public void setPIDISSUEDATE(Date pIDISSUEDATE) {
	PIDISSUEDATE = pIDISSUEDATE;
}
public Date getPIDEXPDATE() {
	return PIDEXPDATE;
}
public void setPIDEXPDATE(Date pIDEXPDATE) {
	PIDEXPDATE = pIDEXPDATE;
}
public String getPGENDER() {
	return PGENDER;
}
public void setPGENDER(String pGENDER) {
	PGENDER = pGENDER;
}
public String getPIDSTATCD() {
	return PIDSTATCD;
}
public void setPIDSTATCD(String pIDSTATCD) {
	PIDSTATCD = pIDSTATCD;
}
public String getParty_id_country_code() {
	return party_id_country_code;
}
public void setParty_id_country_code(String party_id_country_code) {
	this.party_id_country_code = party_id_country_code;
}
public Date getPBOD() {
	return PBOD;
}
public void setPBOD(Date pBOD) {
	PBOD = pBOD;
}
public String getPFNM() {
	return PFNM;
}
public void setPFNM(String pFNM) {
	PFNM = pFNM;
}
public String getPLNM() {
	return PLNM;
}
public void setPLNM(String pLNM) {
	PLNM = pLNM;
}
public String getPMNM() {
	return PMNM;
}
public void setPMNM(String pMNM) {
	PMNM = pMNM;
}
public String getPNM() {
	return PNM;
}
public void setPNM(String pNM) {
	PNM = pNM;
}
public String getPDBNM() {
	return PDBNM;
}
public void setPDBNM(String pDBNM) {
	PDBNM = pDBNM;
}
public String getPSTATDS() {
	return PSTATDS;
}
public void setPSTATDS(String pSTATDS) {
	PSTATDS = pSTATDS;
}
public String getPUPNTNM() {
	return PUPNTNM;
}
public void setPUPNTNM(String pUPNTNM) {
	PUPNTNM = pUPNTNM;
}
public String getPMATCHCDO() {
	return PMATCHCDO;
}
public void setPMATCHCDO(String pMATCHCDO) {
	PMATCHCDO = pMATCHCDO;
}
public String getPMATCHCDI() {
	return PMATCHCDI;
}
public void setPMATCHCDI(String pMATCHCDI) {
	PMATCHCDI = pMATCHCDI;
}
public String getPMATCHCDSTADD() {
	return PMATCHCDSTADD;
}
public void setPMATCHCDSTADD(String pMATCHCDSTADD) {
	PMATCHCDSTADD = pMATCHCDSTADD;
}
public String getPMATCHCDMAILADD() {
	return PMATCHCDMAILADD;
}
public void setPMATCHCDMAILADD(String pMATCHCDMAILADD) {
	PMATCHCDMAILADD = pMATCHCDMAILADD;
}
public String getMatch_code_street_addr_lines() {
	return match_code_street_addr_lines;
}
public void setMatch_code_street_addr_lines(String match_code_street_addr_lines) {
	this.match_code_street_addr_lines = match_code_street_addr_lines;
}
public String getMatch_code_street_city() {
	return match_code_street_city;
}
public void setMatch_code_street_city(String match_code_street_city) {
	this.match_code_street_city = match_code_street_city;
}
public String getMatch_code_street_state() {
	return match_code_street_state;
}
public void setMatch_code_street_state(String match_code_street_state) {
	this.match_code_street_state = match_code_street_state;
}
public String getMatch_code_street_country() {
	return match_code_street_country;
}
public void setMatch_code_street_country(String match_code_street_country) {
	this.match_code_street_country = match_code_street_country;
}
public String getMatch_code_mailing_addr_lines() {
	return match_code_mailing_addr_lines;
}
public void setMatch_code_mailing_addr_lines(String match_code_mailing_addr_lines) {
	this.match_code_mailing_addr_lines = match_code_mailing_addr_lines;
}
public String getMatch_code_mailing_city() {
	return match_code_mailing_city;
}
public void setMatch_code_mailing_city(String match_code_mailing_city) {
	this.match_code_mailing_city = match_code_mailing_city;
}
public String getMatch_code_mailing_state() {
	return match_code_mailing_state;
}
public void setMatch_code_mailing_state(String match_code_mailing_state) {
	this.match_code_mailing_state = match_code_mailing_state;
}
public String getMatch_code_mailing_country() {
	return match_code_mailing_country;
}
public void setMatch_code_mailing_country(String match_code_mailing_country) {
	this.match_code_mailing_country = match_code_mailing_country;
}
public String getPSTADD1() {
	return PSTADD1;
}
public void setPSTADD1(String pSTADD1) {
	PSTADD1 = pSTADD1;
}
public String getPSTADD2() {
	return PSTADD2;
}
public void setPSTADD2(String pSTADD2) {
	PSTADD2 = pSTADD2;
}
public String getPSTCINM() {
	return PSTCINM;
}
public void setPSTCINM(String pSTCINM) {
	PSTCINM = pSTCINM;
}
public String getPSTSTATCD() {
	return PSTSTATCD;
}
public void setPSTSTATCD(String pSTSTATCD) {
	PSTSTATCD = pSTSTATCD;
}
public String getPSTSTATNM() {
	return PSTSTATNM;
}
public void setPSTSTATNM(String pSTSTATNM) {
	PSTSTATNM = pSTSTATNM;
}
public String getPSTPOCD() {
	return PSTPOCD;
}
public void setPSTPOCD(String pSTPOCD) {
	PSTPOCD = pSTPOCD;
}
public String getPSTCOCD() {
	return PSTCOCD;
}
public void setPSTCOCD(String pSTCOCD) {
	PSTCOCD = pSTCOCD;
}
public String getPSTCONM() {
	return PSTCONM;
}
public void setPSTCONM(String pSTCONM) {
	PSTCONM = pSTCONM;
}
public String getPMAILADD1() {
	return PMAILADD1;
}
public void setPMAILADD1(String pMAILADD1) {
	PMAILADD1 = pMAILADD1;
}
public String getPMAILADD2() {
	return PMAILADD2;
}
public void setPMAILADD2(String pMAILADD2) {
	PMAILADD2 = pMAILADD2;
}
public String getPMAILCINM() {
	return PMAILCINM;
}
public void setPMAILCINM(String pMAILCINM) {
	PMAILCINM = pMAILCINM;
}
public String getPMAILLSTATCD() {
	return PMAILLSTATCD;
}
public void setPMAILLSTATCD(String pMAILLSTATCD) {
	PMAILLSTATCD = pMAILLSTATCD;
}
public String getPMAILSTATNM() {
	return PMAILSTATNM;
}
public void setPMAILSTATNM(String pMAILSTATNM) {
	PMAILSTATNM = pMAILSTATNM;
}
public String getPMAILPOCD() {
	return PMAILPOCD;
}
public void setPMAILPOCD(String pMAILPOCD) {
	PMAILPOCD = pMAILPOCD;
}
public String getPMAILCOCD() {
	return PMAILCOCD;
}
public void setPMAILCOCD(String pMAILCOCD) {
	PMAILCOCD = pMAILCOCD;
}
public String getPMAILCONM() {
	return PMAILCONM;
}
public void setPMAILCONM(String pMAILCONM) {
	PMAILCONM = pMAILCONM;
}
public String getPRESCOCD() {
	return PRESCOCD;
}
public void setPRESCOCD(String pRESCOCD) {
	PRESCOCD = pRESCOCD;
}
public String getPRESCONM() {
	return PRESCONM;
}
public void setPRESCONM(String pRESCONM) {
	PRESCONM = pRESCONM;
}
public String getPCZCOCD() {
	return PCZCOCD;
}
public void setPCZCOCD(String pCZCOCD) {
	PCZCOCD = pCZCOCD;
}
public String getPCZCONM() {
	return PCZCONM;
}
public void setPCZCONM(String pCZCONM) {
	PCZCONM = pCZCONM;
}
public String getPORGCOBCD() {
	return PORGCOBCD;
}
public void setPORGCOBCD(String pORGCOBCD) {
	PORGCOBCD = pORGCOBCD;
}
public String getPORGCOBNM() {
	return PORGCOBNM;
}
public void setPORGCOBNM(String pORGCOBNM) {
	PORGCOBNM = pORGCOBNM;
}
public String getPASCIND() {
	return PASCIND;
}
public void setPASCIND(String pASCIND) {
	PASCIND = pASCIND;
}
public String getPASCNO() {
	return PASCNO;
}
public void setPASCNO(String pASCNO) {
	PASCNO = pASCNO;
}
public String getPASCNM() {
	return PASCNM;
}
public void setPASCNM(String pASCNM) {
	PASCNM = pASCNM;
}
public String getPASCTEL() {
	return PASCTEL;
}
public void setPASCTEL(String pASCTEL) {
	PASCTEL = pASCTEL;
}
public String getPEMAILAD() {
	return PEMAILAD;
}
public void setPEMAILAD(String pEMAILAD) {
	PEMAILAD = pEMAILAD;
}
public String getPOCUDS() {
	return POCUDS;
}
public void setPOCUDS(String pOCUDS) {
	POCUDS = pOCUDS;
}
public String getPINDSCD() {
	return PINDSCD;
}
public void setPINDSCD(String pINDSCD) {
	PINDSCD = pINDSCD;
}
public String getIndustry_code_rr() {
	return industry_code_rr;
}
public void setIndustry_code_rr(String industry_code_rr) {
	this.industry_code_rr = industry_code_rr;
}
public String getPINDSCDRR() {
	return PINDSCDRR;
}
public void setPINDSCDRR(String pINDSCDRR) {
	PINDSCDRR = pINDSCDRR;
}
public String getPTEL1() {
	return PTEL1;
}
public void setPTEL1(String pTEL1) {
	PTEL1 = pTEL1;
}
public String getPTEL2() {
	return PTEL2;
}
public void setPTEL2(String pTEL2) {
	PTEL2 = pTEL2;
}
public String getPTEL3() {
	return PTEL3;
}
public void setPTEL3(String pTEL3) {
	PTEL3 = pTEL3;
}
public Double getPANINCAMT() {
	return PANINCAMT;
}
public void setPANINCAMT(Double pANINCAMT) {
	PANINCAMT = pANINCAMT;
}
public Double getPNETWOAMT() {
	return PNETWOAMT;
}
public void setPNETWOAMT(Double pNETWOAMT) {
	PNETWOAMT = pNETWOAMT;
}
public String getPMARSTATDS() {
	return PMARSTATDS;
}
public void setPMARSTATDS(String pMARSTATDS) {
	PMARSTATDS = pMARSTATDS;
}
public Date getPLACONTDATE() {
	return PLACONTDATE;
}
public void setPLACONTDATE(Date pLACONTDATE) {
	PLACONTDATE = pLACONTDATE;
}
public String getPPEPIND() {
	return PPEPIND;
}
public void setPPEPIND(String pPEPIND) {
	PPEPIND = pPEPIND;
}
public String getPNONPROFITIND() {
	return PNONPROFITIND;
}
public void setPNONPROFITIND(String pNONPROFITIND) {
	PNONPROFITIND = pNONPROFITIND;
}
public Date getPCUSDATE() {
	return PCUSDATE;
}
public void setPCUSDATE(Date pCUSDATE) {
	PCUSDATE = pCUSDATE;
}
public Date getLast_susp_actv_rpt_date() {
	return last_susp_actv_rpt_date;
}
public void setLast_susp_actv_rpt_date(Date last_susp_actv_rpt_date) {
	this.last_susp_actv_rpt_date = last_susp_actv_rpt_date;
}
public Date getPLCTDATE() {
	return PLCTDATE;
}
public void setPLCTDATE(Date pLCTDATE) {
	PLCTDATE = pLCTDATE;
}
public Date getLast_risk_assessment_date() {
	return last_risk_assessment_date;
}
public void setLast_risk_assessment_date(Date last_risk_assessment_date) {
	this.last_risk_assessment_date = last_risk_assessment_date;
}
public Integer getRisk_classification() {
	return risk_classification;
}
public void setRisk_classification(int risk_classification) {
	this.risk_classification = risk_classification;
}
public String getExternal_party_ind() {
	return external_party_ind;
}
public void setExternal_party_ind(String external_party_ind) {
	this.external_party_ind = external_party_ind;
}
public String getLegal_entity_type() {
	return legal_entity_type;
}
public void setLegal_entity_type(String legal_entity_type) {
	this.legal_entity_type = legal_entity_type;
}
public String getMoney_orders_ind() {
	return money_orders_ind;
}
public void setMoney_orders_ind(String money_orders_ind) {
	this.money_orders_ind = money_orders_ind;
}
public String getTravelers_cheques_ind() {
	return travelers_cheques_ind;
}
public void setTravelers_cheques_ind(String travelers_cheques_ind) {
	this.travelers_cheques_ind = travelers_cheques_ind;
}
public String getPrepaid_cards_ind() {
	return prepaid_cards_ind;
}
public void setPrepaid_cards_ind(String prepaid_cards_ind) {
	this.prepaid_cards_ind = prepaid_cards_ind;
}
public String getMsb_ind() {
	return msb_ind;
}
public void setMsb_ind(String msb_ind) {
	this.msb_ind = msb_ind;
}
public String getMoney_transmitter_ind() {
	return money_transmitter_ind;
}
public void setMoney_transmitter_ind(String money_transmitter_ind) {
	this.money_transmitter_ind = money_transmitter_ind;
}
public String getCurrency_exchange_ind() {
	return currency_exchange_ind;
}
public void setCurrency_exchange_ind(String currency_exchange_ind) {
	this.currency_exchange_ind = currency_exchange_ind;
}
public String getCheck_casher_ind() {
	return check_casher_ind;
}
public void setCheck_casher_ind(String check_casher_ind) {
	this.check_casher_ind = check_casher_ind;
}
public String getInternet_gambling_ind() {
	return internet_gambling_ind;
}
public void setInternet_gambling_ind(String internet_gambling_ind) {
	this.internet_gambling_ind = internet_gambling_ind;
}
public String getTrust_account_ind() {
	return trust_account_ind;
}
public void setTrust_account_ind(String trust_account_ind) {
	this.trust_account_ind = trust_account_ind;
}
public String getForeign_consulate_embassy_ind() {
	return foreign_consulate_embassy_ind;
}
public void setForeign_consulate_embassy_ind(String foreign_consulate_embassy_ind) {
	this.foreign_consulate_embassy_ind = foreign_consulate_embassy_ind;
}
public String getIssues_bearer_shares_ind() {
	return issues_bearer_shares_ind;
}
public void setIssues_bearer_shares_ind(String issues_bearer_shares_ind) {
	this.issues_bearer_shares_ind = issues_bearer_shares_ind;
}
public String getNegative_news_ind() {
	return negative_news_ind;
}
public void setNegative_news_ind(String negative_news_ind) {
	this.negative_news_ind = negative_news_ind;
}
public Integer getSusp_actv_rpt_count() {
	return susp_actv_rpt_count;
}
public void setSusp_actv_rpt_count(Integer susp_actv_rpt_count) {
	this.susp_actv_rpt_count = susp_actv_rpt_count;
}
public Date getLst_update_date() {
	return lst_update_date;
}
public void setLst_update_date(Date lst_update_date) {
	this.lst_update_date = lst_update_date;
}
public Date getChange_begin_date() {
	return change_begin_date;
}
public void setChange_begin_date(Date change_begin_date) {
	this.change_begin_date = change_begin_date;
}
public Date getChange_end_date() {
	return change_end_date;
}
public void setChange_end_date(Date change_end_date) {
	this.change_end_date = change_end_date;
}
public String getChange_current_ind() {
	return change_current_ind;
}
public void setChange_current_ind(String change_current_ind) {
	this.change_current_ind = change_current_ind;
}
	public Party() {
		// TODO Auto-generated constructor stub
	}

}
/*

 	
 */
