package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_EXTERNAL_PARTY_D database table.
 * 
 */
@Entity
@Table(name="CORE_EXTERNAL_PARTY_D")
@NamedQuery(name="CoreExternalPartyD.findAll", query="SELECT c FROM CoreExternalPartyD c")
public class CoreExternalPartyD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ext_party_account_key")
	private int extPartyAccountKey;

	@Column(name="EXPACCTNO")
	private String expacctno;

	@Column(name="EXPBKKEY")
	private BigDecimal expbkkey;

	@Column(name="EXPBOD")
	private Timestamp expbod;

	@Column(name="EXPBRNM")
	private String expbrnm;

	@Column(name="EXPBRNO")
	private String expbrno;

	@Column(name="EXPCZCOCD")
	private String expczcocd;

	@Column(name="EXPCZCONM")
	private String expczconm;

	@Column(name="EXPFNM")
	private String expfnm;

	@Column(name="EXPFULLNM")
	private String expfullnm;

	@Column(name="EXPID")
	private String expid;

	@Column(name="EXPIDCOCD")
	private String expidcocd;

	@Column(name="EXPIDCONM")
	private String expidconm;

	@Column(name="EXPIDSTATCD")
	private String expidstatcd;

	@Column(name="EXPIDTYDS")
	private String expidtyds;

	@Column(name="EXPLNM")
	private String explnm;

	@Column(name="EXPMATCHCDI")
	private String expmatchcdi;

	@Column(name="EXPMATCHCDO")
	private String expmatchcdo;

	@Column(name="EXPMATCHCDSTADD")
	private String expmatchcdstadd;

	@Column(name="EXPMNM")
	private String expmnm;

	@Column(name="EXPNO")
	private String expno;

	@Column(name="EXPRESCOCD")
	private String exprescocd;

	@Column(name="EXPRESCONM")
	private String expresconm;

	@Column(name="EXPSTADD1")
	private String expstadd1;

	@Column(name="EXPSTADD2")
	private String expstadd2;

	@Column(name="EXPSTCINM")
	private String expstcinm;

	@Column(name="EXPSTCOCD")
	private String expstcocd;

	@Column(name="EXPSTCONM")
	private String expstconm;

	@Column(name="EXPSTPOCD")
	private String expstpocd;

	@Column(name="EXPSTSTATCD")
	private String expststatcd;

	@Column(name="EXPSTSTATNM")
	private String expststatnm;

	@Column(name="EXPTAXID")
	private String exptaxid;

	@Column(name="EXPTAXIDCD")
	private String exptaxidcd;

	@Column(name="EXPTEL1")
	private String exptel1;

	@Column(name="EXPTEL2")
	private String exptel2;

	@Column(name="EXPTYDS")
	private String exptyds;

	@Column(name="match_code_street_addr_lines")
	private String matchCodeStreetAddrLines;

	@Column(name="match_code_street_address")
	private String matchCodeStreetAddress;

	@Column(name="match_code_street_city")
	private String matchCodeStreetCity;

	@Column(name="match_code_street_country")
	private String matchCodeStreetCountry;

	@Column(name="match_code_street_state")
	private String matchCodeStreetState;

	public CoreExternalPartyD() {
	}

	public int getExtPartyAccountKey() {
		return this.extPartyAccountKey;
	}

	public void setExtPartyAccountKey(int extPartyAccountKey) {
		this.extPartyAccountKey = extPartyAccountKey;
	}

	public String getExpacctno() {
		return this.expacctno;
	}

	public void setExpacctno(String expacctno) {
		this.expacctno = expacctno;
	}

	public BigDecimal getExpbkkey() {
		return this.expbkkey;
	}

	public void setExpbkkey(BigDecimal expbkkey) {
		this.expbkkey = expbkkey;
	}

	public Timestamp getExpbod() {
		return this.expbod;
	}

	public void setExpbod(Timestamp expbod) {
		this.expbod = expbod;
	}

	public String getExpbrnm() {
		return this.expbrnm;
	}

	public void setExpbrnm(String expbrnm) {
		this.expbrnm = expbrnm;
	}

	public String getExpbrno() {
		return this.expbrno;
	}

	public void setExpbrno(String expbrno) {
		this.expbrno = expbrno;
	}

	public String getExpczcocd() {
		return this.expczcocd;
	}

	public void setExpczcocd(String expczcocd) {
		this.expczcocd = expczcocd;
	}

	public String getExpczconm() {
		return this.expczconm;
	}

	public void setExpczconm(String expczconm) {
		this.expczconm = expczconm;
	}

	public String getExpfnm() {
		return this.expfnm;
	}

	public void setExpfnm(String expfnm) {
		this.expfnm = expfnm;
	}

	public String getExpfullnm() {
		return this.expfullnm;
	}

	public void setExpfullnm(String expfullnm) {
		this.expfullnm = expfullnm;
	}

	public String getExpid() {
		return this.expid;
	}

	public void setExpid(String expid) {
		this.expid = expid;
	}

	public String getExpidcocd() {
		return this.expidcocd;
	}

	public void setExpidcocd(String expidcocd) {
		this.expidcocd = expidcocd;
	}

	public String getExpidconm() {
		return this.expidconm;
	}

	public void setExpidconm(String expidconm) {
		this.expidconm = expidconm;
	}

	public String getExpidstatcd() {
		return this.expidstatcd;
	}

	public void setExpidstatcd(String expidstatcd) {
		this.expidstatcd = expidstatcd;
	}

	public String getExpidtyds() {
		return this.expidtyds;
	}

	public void setExpidtyds(String expidtyds) {
		this.expidtyds = expidtyds;
	}

	public String getExplnm() {
		return this.explnm;
	}

	public void setExplnm(String explnm) {
		this.explnm = explnm;
	}

	public String getExpmatchcdi() {
		return this.expmatchcdi;
	}

	public void setExpmatchcdi(String expmatchcdi) {
		this.expmatchcdi = expmatchcdi;
	}

	public String getExpmatchcdo() {
		return this.expmatchcdo;
	}

	public void setExpmatchcdo(String expmatchcdo) {
		this.expmatchcdo = expmatchcdo;
	}

	public String getExpmatchcdstadd() {
		return this.expmatchcdstadd;
	}

	public void setExpmatchcdstadd(String expmatchcdstadd) {
		this.expmatchcdstadd = expmatchcdstadd;
	}

	public String getExpmnm() {
		return this.expmnm;
	}

	public void setExpmnm(String expmnm) {
		this.expmnm = expmnm;
	}

	public String getExpno() {
		return this.expno;
	}

	public void setExpno(String expno) {
		this.expno = expno;
	}

	public String getExprescocd() {
		return this.exprescocd;
	}

	public void setExprescocd(String exprescocd) {
		this.exprescocd = exprescocd;
	}

	public String getExpresconm() {
		return this.expresconm;
	}

	public void setExpresconm(String expresconm) {
		this.expresconm = expresconm;
	}

	public String getExpstadd1() {
		return this.expstadd1;
	}

	public void setExpstadd1(String expstadd1) {
		this.expstadd1 = expstadd1;
	}

	public String getExpstadd2() {
		return this.expstadd2;
	}

	public void setExpstadd2(String expstadd2) {
		this.expstadd2 = expstadd2;
	}

	public String getExpstcinm() {
		return this.expstcinm;
	}

	public void setExpstcinm(String expstcinm) {
		this.expstcinm = expstcinm;
	}

	public String getExpstcocd() {
		return this.expstcocd;
	}

	public void setExpstcocd(String expstcocd) {
		this.expstcocd = expstcocd;
	}

	public String getExpstconm() {
		return this.expstconm;
	}

	public void setExpstconm(String expstconm) {
		this.expstconm = expstconm;
	}

	public String getExpstpocd() {
		return this.expstpocd;
	}

	public void setExpstpocd(String expstpocd) {
		this.expstpocd = expstpocd;
	}

	public String getExpststatcd() {
		return this.expststatcd;
	}

	public void setExpststatcd(String expststatcd) {
		this.expststatcd = expststatcd;
	}

	public String getExpststatnm() {
		return this.expststatnm;
	}

	public void setExpststatnm(String expststatnm) {
		this.expststatnm = expststatnm;
	}

	public String getExptaxid() {
		return this.exptaxid;
	}

	public void setExptaxid(String exptaxid) {
		this.exptaxid = exptaxid;
	}

	public String getExptaxidcd() {
		return this.exptaxidcd;
	}

	public void setExptaxidcd(String exptaxidcd) {
		this.exptaxidcd = exptaxidcd;
	}

	public String getExptel1() {
		return this.exptel1;
	}

	public void setExptel1(String exptel1) {
		this.exptel1 = exptel1;
	}

	public String getExptel2() {
		return this.exptel2;
	}

	public void setExptel2(String exptel2) {
		this.exptel2 = exptel2;
	}

	public String getExptyds() {
		return this.exptyds;
	}

	public void setExptyds(String exptyds) {
		this.exptyds = exptyds;
	}

	public String getMatchCodeStreetAddrLines() {
		return this.matchCodeStreetAddrLines;
	}

	public void setMatchCodeStreetAddrLines(String matchCodeStreetAddrLines) {
		this.matchCodeStreetAddrLines = matchCodeStreetAddrLines;
	}

	public String getMatchCodeStreetAddress() {
		return this.matchCodeStreetAddress;
	}

	public void setMatchCodeStreetAddress(String matchCodeStreetAddress) {
		this.matchCodeStreetAddress = matchCodeStreetAddress;
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

}