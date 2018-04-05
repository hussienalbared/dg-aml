package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CORE_PARTY_PROFILE_F database table.
 * 
 */
@Entity
@Table(name="CORE_PARTY_PROFILE_F")
@NamedQuery(name="CorePartyProfileF.findAll", query="SELECT c FROM CorePartyProfileF c")
public class CorePartyProfileF implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CorePartyProfileFPK id;

	@Column(name="monetary_instrument_count")
	private BigDecimal monetaryInstrumentCount;

	@Column(name="PPRACCTVAMT")
	private BigDecimal ppracctvamt;

	@Column(name="PPRAGGASETAMT")
	private BigDecimal ppraggasetamt;

	@Column(name="PPRCTCT")
	private BigDecimal pprctct;

	@Column(name="PPRDTCT")
	private BigDecimal pprdtct;

	@Column(name="PPRFUNDPASVCSCT")
	private BigDecimal pprfundpasvcsct;

	@Column(name="PPRLCRAMT")
	private BigDecimal pprlcramt;

	@Column(name="PPRLDBAMT")
	private BigDecimal pprldbamt;

	@Column(name="PPRMONTINSTCT")
	private BigDecimal pprmontinstct;

	@Column(name="PPRTCT")
	private BigDecimal pprtct;

	@Column(name="PPRTOCCRAMT")
	private BigDecimal pprtoccramt;

	@Column(name="PPRTOCDBAMT")
	private BigDecimal pprtocdbamt;

	@Column(name="PPRTOCRAMT")
	private BigDecimal pprtocramt;

	@Column(name="PPRTODBAMT")
	private BigDecimal pprtodbamt;

	@Column(name="PPRTOTAMT")
	private BigDecimal pprtotamt;

	@Column(name="PPRTOWICRAMT")
	private BigDecimal pprtowicramt;

	@Column(name="PPRTOWIDBAMT")
	private BigDecimal pprtowidbamt;

	@Column(name="PPRWDCT")
	private BigDecimal pprwdct;

	@Column(name="PPRWICT")
	private BigDecimal pprwict;

	public CorePartyProfileF() {
	}

	public CorePartyProfileFPK getId() {
		return this.id;
	}

	public void setId(CorePartyProfileFPK id) {
		this.id = id;
	}

	public BigDecimal getMonetaryInstrumentCount() {
		return this.monetaryInstrumentCount;
	}

	public void setMonetaryInstrumentCount(BigDecimal monetaryInstrumentCount) {
		this.monetaryInstrumentCount = monetaryInstrumentCount;
	}

	public BigDecimal getPpracctvamt() {
		return this.ppracctvamt;
	}

	public void setPpracctvamt(BigDecimal ppracctvamt) {
		this.ppracctvamt = ppracctvamt;
	}

	public BigDecimal getPpraggasetamt() {
		return this.ppraggasetamt;
	}

	public void setPpraggasetamt(BigDecimal ppraggasetamt) {
		this.ppraggasetamt = ppraggasetamt;
	}

	public BigDecimal getPprctct() {
		return this.pprctct;
	}

	public void setPprctct(BigDecimal pprctct) {
		this.pprctct = pprctct;
	}

	public BigDecimal getPprdtct() {
		return this.pprdtct;
	}

	public void setPprdtct(BigDecimal pprdtct) {
		this.pprdtct = pprdtct;
	}

	public BigDecimal getPprfundpasvcsct() {
		return this.pprfundpasvcsct;
	}

	public void setPprfundpasvcsct(BigDecimal pprfundpasvcsct) {
		this.pprfundpasvcsct = pprfundpasvcsct;
	}

	public BigDecimal getPprlcramt() {
		return this.pprlcramt;
	}

	public void setPprlcramt(BigDecimal pprlcramt) {
		this.pprlcramt = pprlcramt;
	}

	public BigDecimal getPprldbamt() {
		return this.pprldbamt;
	}

	public void setPprldbamt(BigDecimal pprldbamt) {
		this.pprldbamt = pprldbamt;
	}

	public BigDecimal getPprmontinstct() {
		return this.pprmontinstct;
	}

	public void setPprmontinstct(BigDecimal pprmontinstct) {
		this.pprmontinstct = pprmontinstct;
	}

	public BigDecimal getPprtct() {
		return this.pprtct;
	}

	public void setPprtct(BigDecimal pprtct) {
		this.pprtct = pprtct;
	}

	public BigDecimal getPprtoccramt() {
		return this.pprtoccramt;
	}

	public void setPprtoccramt(BigDecimal pprtoccramt) {
		this.pprtoccramt = pprtoccramt;
	}

	public BigDecimal getPprtocdbamt() {
		return this.pprtocdbamt;
	}

	public void setPprtocdbamt(BigDecimal pprtocdbamt) {
		this.pprtocdbamt = pprtocdbamt;
	}

	public BigDecimal getPprtocramt() {
		return this.pprtocramt;
	}

	public void setPprtocramt(BigDecimal pprtocramt) {
		this.pprtocramt = pprtocramt;
	}

	public BigDecimal getPprtodbamt() {
		return this.pprtodbamt;
	}

	public void setPprtodbamt(BigDecimal pprtodbamt) {
		this.pprtodbamt = pprtodbamt;
	}

	public BigDecimal getPprtotamt() {
		return this.pprtotamt;
	}

	public void setPprtotamt(BigDecimal pprtotamt) {
		this.pprtotamt = pprtotamt;
	}

	public BigDecimal getPprtowicramt() {
		return this.pprtowicramt;
	}

	public void setPprtowicramt(BigDecimal pprtowicramt) {
		this.pprtowicramt = pprtowicramt;
	}

	public BigDecimal getPprtowidbamt() {
		return this.pprtowidbamt;
	}

	public void setPprtowidbamt(BigDecimal pprtowidbamt) {
		this.pprtowidbamt = pprtowidbamt;
	}

	public BigDecimal getPprwdct() {
		return this.pprwdct;
	}

	public void setPprwdct(BigDecimal pprwdct) {
		this.pprwdct = pprwdct;
	}

	public BigDecimal getPprwict() {
		return this.pprwict;
	}

	public void setPprwict(BigDecimal pprwict) {
		this.pprwict = pprwict;
	}

}