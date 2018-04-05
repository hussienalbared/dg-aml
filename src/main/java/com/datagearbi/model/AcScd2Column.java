package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_SCD2_COLUMNS database table.
 * 
 */
@Entity
@Table(name="AC_SCD2_COLUMNS")
@NamedQuery(name="AcScd2Column.findAll", query="SELECT a FROM AcScd2Column a")
public class AcScd2Column implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="scd2_key")
	private long scd2Key;

	@Column(name="column_name")
	private String columnName;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="current_ind")
	private String currentInd;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="table_name")
	private String tableName;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	@Column(name="xref_valid_ind")
	private String xrefValidInd;

	public AcScd2Column() {
	}

	public long getScd2Key() {
		return this.scd2Key;
	}

	public void setScd2Key(long scd2Key) {
		this.scd2Key = scd2Key;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCurrentInd() {
		return this.currentInd;
	}

	public void setCurrentInd(String currentInd) {
		this.currentInd = currentInd;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getXrefValidInd() {
		return this.xrefValidInd;
	}

	public void setXrefValidInd(String xrefValidInd) {
		this.xrefValidInd = xrefValidInd;
	}

}