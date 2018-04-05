package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the CORE_EMPLOYEE_DATA_D database table.
 * 
 */
@Entity
@Table(name="CORE_EMPLOYEE_DATA_D")
@NamedQuery(name="CoreEmployeeDataD.findAll", query="SELECT c FROM CoreEmployeeDataD c")
public class CoreEmployeeDataD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="associate_key")
	private int associateKey;

	@Column(name="ASCBRNM")
	private String ascbrnm;

	@Column(name="ASCBRNO")
	private String ascbrno;

	@Column(name="ASCEMLAD")
	private String ascemlad;

	@Column(name="ASCFNM")
	private String ascfnm;

	@Column(name="ASCLNM")
	private String asclnm;

	@Column(name="ASCMNM")
	private String ascmnm;

	@Column(name="ASCNO")
	private String ascno;

	@Column(name="ASCSTADD1")
	private String ascstadd1;

	@Column(name="ASCSTADD2")
	private String ascstadd2;

	@Column(name="ASCSTATDS")
	private String ascstatds;

	@Column(name="ASCSTCINM")
	private String ascstcinm;

	@Column(name="ASCSTCOCD")
	private String ascstcocd;

	@Column(name="ASCSTCONM")
	private String ascstconm;

	@Column(name="ASCSTPOCD")
	private String ascstpocd;

	@Column(name="ASCSTSTATCD")
	private String ascststatcd;

	@Column(name="ASCSTSTATNM")
	private String ascststatnm;

	@Column(name="ASCTDS")
	private String asctds;

	@Column(name="ASCWTEL")
	private String ascwtel;

	@Column(name="change_begin_date")
	private Timestamp changeBeginDate;

	@Column(name="change_current_ind")
	private String changeCurrentInd;

	@Column(name="change_end_date")
	private Timestamp changeEndDate;

	public CoreEmployeeDataD() {
	}

	public int getAssociateKey() {
		return this.associateKey;
	}

	public void setAssociateKey(int associateKey) {
		this.associateKey = associateKey;
	}

	public String getAscbrnm() {
		return this.ascbrnm;
	}

	public void setAscbrnm(String ascbrnm) {
		this.ascbrnm = ascbrnm;
	}

	public String getAscbrno() {
		return this.ascbrno;
	}

	public void setAscbrno(String ascbrno) {
		this.ascbrno = ascbrno;
	}

	public String getAscemlad() {
		return this.ascemlad;
	}

	public void setAscemlad(String ascemlad) {
		this.ascemlad = ascemlad;
	}

	public String getAscfnm() {
		return this.ascfnm;
	}

	public void setAscfnm(String ascfnm) {
		this.ascfnm = ascfnm;
	}

	public String getAsclnm() {
		return this.asclnm;
	}

	public void setAsclnm(String asclnm) {
		this.asclnm = asclnm;
	}

	public String getAscmnm() {
		return this.ascmnm;
	}

	public void setAscmnm(String ascmnm) {
		this.ascmnm = ascmnm;
	}

	public String getAscno() {
		return this.ascno;
	}

	public void setAscno(String ascno) {
		this.ascno = ascno;
	}

	public String getAscstadd1() {
		return this.ascstadd1;
	}

	public void setAscstadd1(String ascstadd1) {
		this.ascstadd1 = ascstadd1;
	}

	public String getAscstadd2() {
		return this.ascstadd2;
	}

	public void setAscstadd2(String ascstadd2) {
		this.ascstadd2 = ascstadd2;
	}

	public String getAscstatds() {
		return this.ascstatds;
	}

	public void setAscstatds(String ascstatds) {
		this.ascstatds = ascstatds;
	}

	public String getAscstcinm() {
		return this.ascstcinm;
	}

	public void setAscstcinm(String ascstcinm) {
		this.ascstcinm = ascstcinm;
	}

	public String getAscstcocd() {
		return this.ascstcocd;
	}

	public void setAscstcocd(String ascstcocd) {
		this.ascstcocd = ascstcocd;
	}

	public String getAscstconm() {
		return this.ascstconm;
	}

	public void setAscstconm(String ascstconm) {
		this.ascstconm = ascstconm;
	}

	public String getAscstpocd() {
		return this.ascstpocd;
	}

	public void setAscstpocd(String ascstpocd) {
		this.ascstpocd = ascstpocd;
	}

	public String getAscststatcd() {
		return this.ascststatcd;
	}

	public void setAscststatcd(String ascststatcd) {
		this.ascststatcd = ascststatcd;
	}

	public String getAscststatnm() {
		return this.ascststatnm;
	}

	public void setAscststatnm(String ascststatnm) {
		this.ascststatnm = ascststatnm;
	}

	public String getAsctds() {
		return this.asctds;
	}

	public void setAsctds(String asctds) {
		this.asctds = asctds;
	}

	public String getAscwtel() {
		return this.ascwtel;
	}

	public void setAscwtel(String ascwtel) {
		this.ascwtel = ascwtel;
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

}