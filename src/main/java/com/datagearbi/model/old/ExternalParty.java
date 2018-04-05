package com.datagearbi.model.old;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema = "AML", name = "CORE_EXTERNAL_PARTY_D")
public class ExternalParty {
	

@Id
	private int ext_party_account_key;//ext_party_account_key	int
	private String EXPNO;//EXPNO	varchar(100)
	private String EXPTYDS; //EXPTYDS	varchar(20)
	private String EXPFULLNM;//EXPFULLNM	varchar(255)
	private String EXPLNM;//EXPLNM	varchar(200)
	private String EXPFNM;//EXPFNM	varchar(200)
	private String EXPMNM;//EXPMNM	varchar(200)
	private Date EXPBOD;//EXPBOD	datetime
	private String EXPTAXID;//EXPTAXID	varchar(35)
	private String EXPTAXIDCD;//EXPTAXIDCD	char(1)
	private String EXPMATCHCDO;//EXPMATCHCDO	varchar(100)
	private String EXPMATCHCDI;//EXPMATCHCDI	varchar(80)
	private String EXPMATCHCDSTADD;//EXPMATCHCDSTADD	varchar(40)
	private String match_code_street_address;//match_code_street_address	varchar(140)
	private String match_code_street_addr_lines;//match_code_street_addr_lines	varchar(80)
	private String match_code_street_city;//match_code_street_city	varchar(30)
	private String match_code_street_state;//match_code_street_state	varchar(15)
	private String match_code_street_country;//match_code_street_country	varchar(15)
	private String EXPSTADD1;//EXPSTADD1	varchar(80)
	private String EXPSTADD2;//EXPSTADD2	varchar(35)
	private  String EXPSTCINM;//EXPSTCINM	varchar(35)
	private  String EXPSTSTATCD;//EXPSTSTATCD	char(3)
	private  String EXPSTSTATNM;//EXPSTSTATNM	varchar(35)
	private  String EXPSTPOCD;//EXPSTPOCD	char(10)
	private  String EXPSTCOCD;//EXPSTCOCD	char(3)
	private  String EXPSTCONM;//EXPSTCONM	varchar(100)
	private String EXPACCTNO;//EXPACCTNO	varchar(50)
	private Double EXPBKKEY;//EXPBKKEY	decimal(12, 0)
	private String EXPBRNO;//EXPBRNO	varchar(25)
	private String EXPBRNM;//EXPBRNM	varchar(255)
	private String EXPCZCOCD;//EXPCZCOCD	char(3)
	private String EXPCZCONM;//EXPCZCONM	varchar(100)
	private String EXPRESCOCD;//EXPRESCOCD	char(3)
	private String EXPRESCONM;//EXPRESCONM	varchar(100)
	private String EXPTEL1;//EXPTEL1	varchar(25)
	private String EXPTEL2;//EXPTEL2	varchar(25)
	private String EXPID;//EXPID	varchar(35)
	private String EXPIDTYDS;//EXPIDTYDS	char(4)
	private String EXPIDSTATCD;//EXPIDSTATCD	char(3)
private String EXPIDCOCD;//EXPIDCOCD	char(3)
private String EXPIDCONM;//EXPIDCONM	varchar(100)
public int getExt_party_account_key() {
	return ext_party_account_key;
}
public void setExt_party_account_key(int ext_party_account_key) {
	this.ext_party_account_key = ext_party_account_key;
}
public String getEXPNO() {
	return EXPNO;
}
public void setEXPNO(String eXPNO) {
	EXPNO = eXPNO;
}
public String getEXPTYDS() {
	return EXPTYDS;
}
public void setEXPTYDS(String eXPTYDS) {
	EXPTYDS = eXPTYDS;
}
public String getEXPFULLNM() {
	return EXPFULLNM;
}
public void setEXPFULLNM(String eXPFULLNM) {
	EXPFULLNM = eXPFULLNM;
}
public String getEXPLNM() {
	return EXPLNM;
}
public void setEXPLNM(String eXPLNM) {
	EXPLNM = eXPLNM;
}
public String getEXPFNM() {
	return EXPFNM;
}
public void setEXPFNM(String eXPFNM) {
	EXPFNM = eXPFNM;
}
public String getEXPMNM() {
	return EXPMNM;
}
public void setEXPMNM(String eXPMNM) {
	EXPMNM = eXPMNM;
}
public Date getEXPBOD() {
	return EXPBOD;
}
public void setEXPBOD(Date eXPBOD) {
	EXPBOD = eXPBOD;
}
public String getEXPTAXID() {
	return EXPTAXID;
}
public void setEXPTAXID(String eXPTAXID) {
	EXPTAXID = eXPTAXID;
}
public String getEXPTAXIDCD() {
	return EXPTAXIDCD;
}
public void setEXPTAXIDCD(String eXPTAXIDCD) {
	EXPTAXIDCD = eXPTAXIDCD;
}
public String getEXPMATCHCDO() {
	return EXPMATCHCDO;
}
public void setEXPMATCHCDO(String eXPMATCHCDO) {
	EXPMATCHCDO = eXPMATCHCDO;
}
public String getEXPMATCHCDI() {
	return EXPMATCHCDI;
}
public void setEXPMATCHCDI(String eXPMATCHCDI) {
	EXPMATCHCDI = eXPMATCHCDI;
}
public String getEXPMATCHCDSTADD() {
	return EXPMATCHCDSTADD;
}
public void setEXPMATCHCDSTADD(String eXPMATCHCDSTADD) {
	EXPMATCHCDSTADD = eXPMATCHCDSTADD;
}
public String getMatch_code_street_address() {
	return match_code_street_address;
}
public void setMatch_code_street_address(String match_code_street_address) {
	this.match_code_street_address = match_code_street_address;
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
public String getEXPSTADD1() {
	return EXPSTADD1;
}
public void setEXPSTADD1(String eXPSTADD1) {
	EXPSTADD1 = eXPSTADD1;
}
public String getEXPSTADD2() {
	return EXPSTADD2;
}
public void setEXPSTADD2(String eXPSTADD2) {
	EXPSTADD2 = eXPSTADD2;
}
public String getEXPSTCINM() {
	return EXPSTCINM;
}
public void setEXPSTCINM(String eXPSTCINM) {
	EXPSTCINM = eXPSTCINM;
}
public String getEXPSTSTATCD() {
	return EXPSTSTATCD;
}
public void setEXPSTSTATCD(String eXPSTSTATCD) {
	EXPSTSTATCD = eXPSTSTATCD;
}
public String getEXPSTSTATNM() {
	return EXPSTSTATNM;
}
public void setEXPSTSTATNM(String eXPSTSTATNM) {
	EXPSTSTATNM = eXPSTSTATNM;
}
public String getEXPSTPOCD() {
	return EXPSTPOCD;
}
public void setEXPSTPOCD(String eXPSTPOCD) {
	EXPSTPOCD = eXPSTPOCD;
}
public String getEXPSTCOCD() {
	return EXPSTCOCD;
}
public void setEXPSTCOCD(String eXPSTCOCD) {
	EXPSTCOCD = eXPSTCOCD;
}
public String getEXPSTCONM() {
	return EXPSTCONM;
}
public void setEXPSTCONM(String eXPSTCONM) {
	EXPSTCONM = eXPSTCONM;
}
public String getEXPACCTNO() {
	return EXPACCTNO;
}
public void setEXPACCTNO(String eXPACCTNO) {
	EXPACCTNO = eXPACCTNO;
}
public Double getEXPBKKEY() {
	return EXPBKKEY;
}
public void setEXPBKKEY(Double eXPBKKEY) {
	EXPBKKEY = eXPBKKEY;
}
public String getEXPBRNO() {
	return EXPBRNO;
}
public void setEXPBRNO(String eXPBRNO) {
	EXPBRNO = eXPBRNO;
}
public String getEXPBRNM() {
	return EXPBRNM;
}
public void setEXPBRNM(String eXPBRNM) {
	EXPBRNM = eXPBRNM;
}
public String getEXPCZCOCD() {
	return EXPCZCOCD;
}
public void setEXPCZCOCD(String eXPCZCOCD) {
	EXPCZCOCD = eXPCZCOCD;
}
public String getEXPCZCONM() {
	return EXPCZCONM;
}
public void setEXPCZCONM(String eXPCZCONM) {
	EXPCZCONM = eXPCZCONM;
}
public String getEXPRESCOCD() {
	return EXPRESCOCD;
}
public void setEXPRESCOCD(String eXPRESCOCD) {
	EXPRESCOCD = eXPRESCOCD;
}
public String getEXPRESCONM() {
	return EXPRESCONM;
}
public void setEXPRESCONM(String eXPRESCONM) {
	EXPRESCONM = eXPRESCONM;
}
public String getEXPTEL1() {
	return EXPTEL1;
}
public void setEXPTEL1(String eXPTEL1) {
	EXPTEL1 = eXPTEL1;
}
public String getEXPTEL2() {
	return EXPTEL2;
}
public void setEXPTEL2(String eXPTEL2) {
	EXPTEL2 = eXPTEL2;
}
public String getEXPID() {
	return EXPID;
}
public void setEXPID(String eXPID) {
	EXPID = eXPID;
}
public String getEXPIDTYDS() {
	return EXPIDTYDS;
}
public void setEXPIDTYDS(String eXPIDTYDS) {
	EXPIDTYDS = eXPIDTYDS;
}
public String getEXPIDSTATCD() {
	return EXPIDSTATCD;
}
public void setEXPIDSTATCD(String eXPIDSTATCD) {
	EXPIDSTATCD = eXPIDSTATCD;
}
public String getEXPIDCOCD() {
	return EXPIDCOCD;
}
public void setEXPIDCOCD(String eXPIDCOCD) {
	EXPIDCOCD = eXPIDCOCD;
}
public String getEXPIDCONM() {
	return EXPIDCONM;
}
public void setEXPIDCONM(String eXPIDCONM) {
	EXPIDCONM = eXPIDCONM;
}

public ExternalParty() {
	// TODO Auto-generated constructor stub
}
public ExternalParty(int ext_party_account_key, String eXPNO, String eXPTYDS, String eXPFULLNM, String eXPLNM,
		String eXPFNM, String eXPMNM, Date eXPBOD, String eXPTAXID, String eXPTAXIDCD, String eXPMATCHCDO,
		String eXPMATCHCDI, String eXPMATCHCDSTADD, String match_code_street_address,
		String match_code_street_addr_lines, String match_code_street_city, String match_code_street_state,
		String match_code_street_country, String eXPSTADD1, String eXPSTADD2, String eXPSTCINM, String eXPSTSTATCD,
		String eXPSTSTATNM, String eXPSTPOCD, String eXPSTCOCD, String eXPSTCONM, String eXPACCTNO, double eXPBKKEY,
		String eXPBRNO, String eXPBRNM, String eXPCZCOCD, String eXPCZCONM, String eXPRESCOCD, String eXPRESCONM,
		String eXPTEL1, String eXPTEL2, String eXPID, String eXPIDTYDS, String eXPIDSTATCD, String eXPIDCOCD,
		String eXPIDCONM) {
	super();
	this.ext_party_account_key = ext_party_account_key;
	EXPNO = eXPNO;
	EXPTYDS = eXPTYDS;
	EXPFULLNM = eXPFULLNM;
	EXPLNM = eXPLNM;
	EXPFNM = eXPFNM;
	EXPMNM = eXPMNM;
	EXPBOD = eXPBOD;
	EXPTAXID = eXPTAXID;
	EXPTAXIDCD = eXPTAXIDCD;
	EXPMATCHCDO = eXPMATCHCDO;
	EXPMATCHCDI = eXPMATCHCDI;
	EXPMATCHCDSTADD = eXPMATCHCDSTADD;
	this.match_code_street_address = match_code_street_address;
	this.match_code_street_addr_lines = match_code_street_addr_lines;
	this.match_code_street_city = match_code_street_city;
	this.match_code_street_state = match_code_street_state;
	this.match_code_street_country = match_code_street_country;
	EXPSTADD1 = eXPSTADD1;
	EXPSTADD2 = eXPSTADD2;
	EXPSTCINM = eXPSTCINM;
	EXPSTSTATCD = eXPSTSTATCD;
	EXPSTSTATNM = eXPSTSTATNM;
	EXPSTPOCD = eXPSTPOCD;
	EXPSTCOCD = eXPSTCOCD;
	EXPSTCONM = eXPSTCONM;
	EXPACCTNO = eXPACCTNO;
	EXPBKKEY = eXPBKKEY;
	EXPBRNO = eXPBRNO;
	EXPBRNM = eXPBRNM;
	EXPCZCOCD = eXPCZCOCD;
	EXPCZCONM = eXPCZCONM;
	EXPRESCOCD = eXPRESCOCD;
	EXPRESCONM = eXPRESCONM;
	EXPTEL1 = eXPTEL1;
	EXPTEL2 = eXPTEL2;
	EXPID = eXPID;
	EXPIDTYDS = eXPIDTYDS;
	EXPIDSTATCD = eXPIDSTATCD;
	EXPIDCOCD = eXPIDCOCD;
	EXPIDCONM = eXPIDCONM;
}

	
 
}
