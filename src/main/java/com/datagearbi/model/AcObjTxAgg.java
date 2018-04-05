package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_OBJ_TX_AGG database table.
 * 
 */
@Entity
@Table(name="AC_OBJ_TX_AGG")
@NamedQuery(name="AcObjTxAgg.findAll", query="SELECT a FROM AcObjTxAgg a")
public class AcObjTxAgg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ac_obj_tx_agg_pk")
	private long acObjTxAggPk;

	@Column(name="aggregate_amt")
	private BigDecimal aggregateAmt;

	@Column(name="aggregate_type_code")
	private String aggregateTypeCode;

	@Column(name="alarmed_obj_key")
	private BigDecimal alarmedObjKey;

	@Column(name="alarmed_obj_level_code")
	private String alarmedObjLevelCode;

	@Column(name="created_timestamp")
	private Timestamp createdTimestamp;

	@Column(name="group_code")
	private String groupCode;

	@Column(name="group_desc")
	private String groupDesc;

	public AcObjTxAgg() {
	}

	public long getAcObjTxAggPk() {
		return this.acObjTxAggPk;
	}

	public void setAcObjTxAggPk(long acObjTxAggPk) {
		this.acObjTxAggPk = acObjTxAggPk;
	}

	public BigDecimal getAggregateAmt() {
		return this.aggregateAmt;
	}

	public void setAggregateAmt(BigDecimal aggregateAmt) {
		this.aggregateAmt = aggregateAmt;
	}

	public String getAggregateTypeCode() {
		return this.aggregateTypeCode;
	}

	public void setAggregateTypeCode(String aggregateTypeCode) {
		this.aggregateTypeCode = aggregateTypeCode;
	}

	public BigDecimal getAlarmedObjKey() {
		return this.alarmedObjKey;
	}

	public void setAlarmedObjKey(BigDecimal alarmedObjKey) {
		this.alarmedObjKey = alarmedObjKey;
	}

	public String getAlarmedObjLevelCode() {
		return this.alarmedObjLevelCode;
	}

	public void setAlarmedObjLevelCode(String alarmedObjLevelCode) {
		this.alarmedObjLevelCode = alarmedObjLevelCode;
	}

	public Timestamp getCreatedTimestamp() {
		return this.createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getGroupDesc() {
		return this.groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

}