package com.datagearbi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema = "AML", name = "CORE_ACCOUNT_D")
public class Account {
	@Id
	private int account_key;
	@Column(name="acctno")
	private String acctNo;
	private String ACCTBNM;
	private String ACCTTYDESC;
	private String ACCTCURRC;
	private String ACCTCURRNM;
	private String ACCTREGTYDESC;
	private String ACCTREGNM;
	private String ACCTNM;
	private String ACCTALTNM;
	private Date ACCTOPDATE;
	private Date ACCTCLDATE;
	private String ACCTSTATDESC;
	private String ACCTDORIND;
	private String ACCTPRODLINENM;
	private String ACCTPRODCATNM;
	private String ACCTPRODNM;
	private String ACCTPRODNO;
		
	private String ACCTTAXID	;
	private String	ACCTTAXIDTYDES	;
	private String	ACCTTAXSTATCD	;
	private String ACCTPRBRNM	;
	private String ACCTMAILADD1	;
	private String	ACCTMAILADD2	;
	private String ACCTMAILCINM	;
	private String ACCTMAILSTATCD	;
	private String ACCTMAILSTATNM	;
	private String	ACCTMAILPOCD	;
	private String ACCTMAILCOCD	;
	private String ACCTMAILCONM	;
	private String ACCTCURRBASEIND;
	private Date ACCTMATURDATE	;
	private Double ACCTORGLOANAMT;
	private String ACCTCOLLTYCD	; //char(10)
	private String ACCTCOLLTYDS	; //varchar(35)
	private Double ACCTINSAMT;//	decimal(15, 5)
	private String ACCTEMPIND	;//char(1)
	private String	ACCTLETTERCREDITIND;	//char(1)

	private String ACTTCASHINTIND; //	char(1)
	private String	ACCTTRADEIND; //	char(1)
	private Double installment_amount;//	decimal(18, 5)
	private Date CREATION_DATE	;//datetime
	private Date MODIFICATION_DATE;	//datetime
	private Date change_begin_date	;//datetime
	private Date change_end_date	;//datetime
	private String change_current_ind;	//char(1)
	public int getAccount_key() {
		return account_key;
	}
	public void setAccount_key(int account_key) {
		this.account_key = account_key;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getACCTBNM() {
		return ACCTBNM;
	}
	public void setACCTBNM(String aCCTBNM) {
		ACCTBNM = aCCTBNM;
	}
	public String getACCTTYDESC() {
		return ACCTTYDESC;
	}
	public void setACCTTYDESC(String aCCTTYDESC) {
		ACCTTYDESC = aCCTTYDESC;
	}
	public String getACCTCURRC() {
		return ACCTCURRC;
	}
	public void setACCTCURRC(String aCCTCURRC) {
		ACCTCURRC = aCCTCURRC;
	}
	public String getACCTCURRNM() {
		return ACCTCURRNM;
	}
	public void setACCTCURRNM(String aCCTCURRNM) {
		ACCTCURRNM = aCCTCURRNM;
	}
	public String getACCTREGTYDESC() {
		return ACCTREGTYDESC;
	}
	public void setACCTREGTYDESC(String aCCTREGTYDESC) {
		ACCTREGTYDESC = aCCTREGTYDESC;
	}
	public String getACCTREGNM() {
		return ACCTREGNM;
	}
	public void setACCTREGNM(String aCCTREGNM) {
		ACCTREGNM = aCCTREGNM;
	}
	public String getACCTNM() {
		return ACCTNM;
	}
	public void setACCTNM(String aCCTNM) {
		ACCTNM = aCCTNM;
	}
	public String getACCTALTNM() {
		return ACCTALTNM;
	}
	public void setACCTALTNM(String aCCTALTNM) {
		ACCTALTNM = aCCTALTNM;
	}
	public Date getACCTOPDATE() {
		return ACCTOPDATE;
	}
	public void setACCTOPDATE(Date aCCTOPDATE) {
		ACCTOPDATE = aCCTOPDATE;
	}
	public Date getACCTCLDATE() {
		return ACCTCLDATE;
	}
	public void setACCTCLDATE(Date aCCTCLDATE) {
		ACCTCLDATE = aCCTCLDATE;
	}
	public String getACCTSTATDESC() {
		return ACCTSTATDESC;
	}
	public void setACCTSTATDESC(String aCCTSTATDESC) {
		ACCTSTATDESC = aCCTSTATDESC;
	}
	public String getACCTDORIND() {
		return ACCTDORIND;
	}
	public void setACCTDORIND(String aCCTDORIND) {
		ACCTDORIND = aCCTDORIND;
	}
	public String getACCTPRODLINENM() {
		return ACCTPRODLINENM;
	}
	public void setACCTPRODLINENM(String aCCTPRODLINENM) {
		ACCTPRODLINENM = aCCTPRODLINENM;
	}
	public String getACCTPRODCATNM() {
		return ACCTPRODCATNM;
	}
	public void setACCTPRODCATNM(String aCCTPRODCATNM) {
		ACCTPRODCATNM = aCCTPRODCATNM;
	}
	public String getACCTPRODNM() {
		return ACCTPRODNM;
	}
	public void setACCTPRODNM(String aCCTPRODNM) {
		ACCTPRODNM = aCCTPRODNM;
	}
	public String getACCTPRODNO() {
		return ACCTPRODNO;
	}
	public void setACCTPRODNO(String aCCTPRODNO) {
		ACCTPRODNO = aCCTPRODNO;
	}
	public String getACCTTAXID() {
		return ACCTTAXID;
	}
	public void setACCTTAXID(String aCCTTAXID) {
		ACCTTAXID = aCCTTAXID;
	}
	public String getACCTTAXIDTYDES() {
		return ACCTTAXIDTYDES;
	}
	public void setACCTTAXIDTYDES(String aCCTTAXIDTYDES) {
		ACCTTAXIDTYDES = aCCTTAXIDTYDES;
	}
	public String getACCTTAXSTATCD() {
		return ACCTTAXSTATCD;
	}
	public void setACCTTAXSTATCD(String aCCTTAXSTATCD) {
		ACCTTAXSTATCD = aCCTTAXSTATCD;
	}
	public String getACCTPRBRNM() {
		return ACCTPRBRNM;
	}
	public void setACCTPRBRNM(String aCCTPRBRNM) {
		ACCTPRBRNM = aCCTPRBRNM;
	}
	public String getACCTMAILADD1() {
		return ACCTMAILADD1;
	}
	public void setACCTMAILADD1(String aCCTMAILADD1) {
		ACCTMAILADD1 = aCCTMAILADD1;
	}
	public String getACCTMAILADD2() {
		return ACCTMAILADD2;
	}
	public void setACCTMAILADD2(String aCCTMAILADD2) {
		ACCTMAILADD2 = aCCTMAILADD2;
	}
	public String getACCTMAILCINM() {
		return ACCTMAILCINM;
	}
	public void setACCTMAILCINM(String aCCTMAILCINM) {
		ACCTMAILCINM = aCCTMAILCINM;
	}
	public String getACCTMAILSTATCD() {
		return ACCTMAILSTATCD;
	}
	public void setACCTMAILSTATCD(String aCCTMAILSTATCD) {
		ACCTMAILSTATCD = aCCTMAILSTATCD;
	}
	public String getACCTMAILSTATNM() {
		return ACCTMAILSTATNM;
	}
	public void setACCTMAILSTATNM(String aCCTMAILSTATNM) {
		ACCTMAILSTATNM = aCCTMAILSTATNM;
	}
	public String getACCTMAILPOCD() {
		return ACCTMAILPOCD;
	}
	public void setACCTMAILPOCD(String aCCTMAILPOCD) {
		ACCTMAILPOCD = aCCTMAILPOCD;
	}
	public String getACCTMAILCOCD() {
		return ACCTMAILCOCD;
	}
	public void setACCTMAILCOCD(String aCCTMAILCOCD) {
		ACCTMAILCOCD = aCCTMAILCOCD;
	}
	public String getACCTMAILCONM() {
		return ACCTMAILCONM;
	}
	public void setACCTMAILCONM(String aCCTMAILCONM) {
		ACCTMAILCONM = aCCTMAILCONM;
	}
	public String getACCTCURRBASEIND() {
		return ACCTCURRBASEIND;
	}
	public void setACCTCURRBASEIND(String aCCTCURRBASEIND) {
		ACCTCURRBASEIND = aCCTCURRBASEIND;
	}
	public Date getACCTMATURDATE() {
		return ACCTMATURDATE;
	}
	public void setACCTMATURDATE(Date aCCTMATURDATE) {
		ACCTMATURDATE = aCCTMATURDATE;
	}
	public Double getACCTORGLOANAMT() {
		return ACCTORGLOANAMT;
	}
	public void setACCTORGLOANAMT(Double aCCTORGLOANAMT) {
		ACCTORGLOANAMT = aCCTORGLOANAMT;
	}
	public String getACCTCOLLTYCD() {
		return ACCTCOLLTYCD;
	}
	public void setACCTCOLLTYCD(String aCCTCOLLTYCD) {
		ACCTCOLLTYCD = aCCTCOLLTYCD;
	}
	public String getACCTCOLLTYDS() {
		return ACCTCOLLTYDS;
	}
	public void setACCTCOLLTYDS(String aCCTCOLLTYDS) {
		ACCTCOLLTYDS = aCCTCOLLTYDS;
	}
	public Double getACCTINSAMT() {
		return ACCTINSAMT;
	}
	public void setACCTINSAMT(Double aCCTINSAMT) {
		ACCTINSAMT = aCCTINSAMT;
	}
	public String getACCTEMPIND() {
		return ACCTEMPIND;
	}
	public void setACCTEMPIND(String aCCTEMPIND) {
		ACCTEMPIND = aCCTEMPIND;
	}
	public String getACCTLETTERCREDITIND() {
		return ACCTLETTERCREDITIND;
	}
	public void setACCTLETTERCREDITIND(String aCCTLETTERCREDITIND) {
		ACCTLETTERCREDITIND = aCCTLETTERCREDITIND;
	}
	public String getACTTCASHINTIND() {
		return ACTTCASHINTIND;
	}
	public void setACTTCASHINTIND(String aCTTCASHINTIND) {
		ACTTCASHINTIND = aCTTCASHINTIND;
	}
	public String getACCTTRADEIND() {
		return ACCTTRADEIND;
	}
	public void setACCTTRADEIND(String aCCTTRADEIND) {
		ACCTTRADEIND = aCCTTRADEIND;
	}
	public Double getInstallment_amount() {
		return installment_amount;
	}
	public void setInstallment_amount(Double installment_amount) {
		this.installment_amount = installment_amount;
	}
	public Date getCREATION_DATE() {
		return CREATION_DATE;
	}
	public void setCREATION_DATE(Date cREATION_DATE) {
		CREATION_DATE = cREATION_DATE;
	}
	public Date getMODIFICATION_DATE() {
		return MODIFICATION_DATE;
	}
	public void setMODIFICATION_DATE(Date mODIFICATION_DATE) {
		MODIFICATION_DATE = mODIFICATION_DATE;
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
	public Account(int account_key, String acctNo, String aCCTBNM, String aCCTTYDESC, String aCCTCURRC,
			String aCCTCURRNM, String aCCTREGTYDESC, String aCCTREGNM, String aCCTNM, String aCCTALTNM, Date aCCTOPDATE,
			Date aCCTCLDATE, String aCCTSTATDESC, String aCCTDORIND, String aCCTPRODLINENM, String aCCTPRODCATNM,
			String aCCTPRODNM, String aCCTPRODNO, String aCCTTAXID, String aCCTTAXIDTYDES, String aCCTTAXSTATCD,
			String aCCTPRBRNM, String aCCTMAILADD1, String aCCTMAILADD2, String aCCTMAILCINM, String aCCTMAILSTATCD,
			String aCCTMAILSTATNM, String aCCTMAILPOCD, String aCCTMAILCOCD, String aCCTMAILCONM,
			String aCCTCURRBASEIND, Date aCCTMATURDATE, Double aCCTORGLOANAMT, String aCCTCOLLTYCD, String aCCTCOLLTYDS,
			Double aCCTINSAMT, String aCCTEMPIND, String aCCTLETTERCREDITIND, String aCTTCASHINTIND,
			String aCCTTRADEIND, Double installment_amount, Date cREATION_DATE, Date mODIFICATION_DATE,
			Date change_begin_date, Date change_end_date, String change_current_ind) {
		super();
		this.account_key = account_key;
		this.acctNo = acctNo;
		ACCTBNM = aCCTBNM;
		ACCTTYDESC = aCCTTYDESC;
		ACCTCURRC = aCCTCURRC;
		ACCTCURRNM = aCCTCURRNM;
		ACCTREGTYDESC = aCCTREGTYDESC;
		ACCTREGNM = aCCTREGNM;
		ACCTNM = aCCTNM;
		ACCTALTNM = aCCTALTNM;
		ACCTOPDATE = aCCTOPDATE;
		ACCTCLDATE = aCCTCLDATE;
		ACCTSTATDESC = aCCTSTATDESC;
		ACCTDORIND = aCCTDORIND;
		ACCTPRODLINENM = aCCTPRODLINENM;
		ACCTPRODCATNM = aCCTPRODCATNM;
		ACCTPRODNM = aCCTPRODNM;
		ACCTPRODNO = aCCTPRODNO;
		ACCTTAXID = aCCTTAXID;
		ACCTTAXIDTYDES = aCCTTAXIDTYDES;
		ACCTTAXSTATCD = aCCTTAXSTATCD;
		ACCTPRBRNM = aCCTPRBRNM;
		ACCTMAILADD1 = aCCTMAILADD1;
		ACCTMAILADD2 = aCCTMAILADD2;
		ACCTMAILCINM = aCCTMAILCINM;
		ACCTMAILSTATCD = aCCTMAILSTATCD;
		ACCTMAILSTATNM = aCCTMAILSTATNM;
		ACCTMAILPOCD = aCCTMAILPOCD;
		ACCTMAILCOCD = aCCTMAILCOCD;
		ACCTMAILCONM = aCCTMAILCONM;
		ACCTCURRBASEIND = aCCTCURRBASEIND;
		ACCTMATURDATE = aCCTMATURDATE;
		ACCTORGLOANAMT = aCCTORGLOANAMT;
		ACCTCOLLTYCD = aCCTCOLLTYCD;
		ACCTCOLLTYDS = aCCTCOLLTYDS;
		ACCTINSAMT = aCCTINSAMT;
		ACCTEMPIND = aCCTEMPIND;
		ACCTLETTERCREDITIND = aCCTLETTERCREDITIND;
		ACTTCASHINTIND = aCTTCASHINTIND;
		ACCTTRADEIND = aCCTTRADEIND;
		this.installment_amount = installment_amount;
		CREATION_DATE = cREATION_DATE;
		MODIFICATION_DATE = mODIFICATION_DATE;
		this.change_begin_date = change_begin_date;
		this.change_end_date = change_end_date;
		this.change_current_ind = change_current_ind;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}

}
/*
 account_key	int
ACCTNO	varchar(50)
ACCTBNM	varchar(35)
ACCTTYDESC	varchar(50)
ACCTCURRC	char(3)
ACCTCURRNM	varchar(100)
ACCTREGTYDESC	varchar(20)
ACCTREGNM	varchar(255)
ACCTNM	varchar(255)
ACCTALTNM	varchar(255)
ACCTOPDATE	datetime
ACCTCLDATE	datetime
ACCTSTATDESC	varchar(35)
ACCTDORIND	char(1)
ACCTPRODLINENM	varchar(35)
ACCTPRODCATNM	varchar(35)
ACCTPRODTYNM	varchar(35)
ACCTPRODNM	varchar(100)
ACCTPRODNO	varchar(25)
ACCTTAXID	varchar(35)
ACCTTAXIDTYDES	char(1)
ACCTTAXSTATCD	char(3)
ACCTPRBRNM	varchar(100)
ACCTMAILADD1	varchar(350)
ACCTMAILADD2	varchar(350)
ACCTMAILCINM	varchar(50)
ACCTMAILSTATCD	char(3)
ACCTMAILSTATNM	varchar(50)
ACCTMAILPOCD	varchar(50)
ACCTMAILCOCD	char(3)
ACCTMAILCONM	varchar(100)
ACCTCURRBASEIND	char(1)
ACCTMATURDATE	datetime
ACCTORGLOANAMT	decimal(15, 5)
ACCTCOLLTYCD	char(10)
ACCTCOLLTYDS	varchar(35)
ACCTINSAMT	decimal(15, 5)
ACCTEMPIND	char(1)
ACCTLETTERCREDITIND	char(1)
ACTTCASHINTIND	char(1)
ACCTTRADEIND	char(1)
installment_amount	decimal(18, 5)
CREATION_DATE	datetime
MODIFICATION_DATE	datetime
change_begin_date	datetime
change_end_date	datetime
change_current_ind	char(1)
	

 
*/