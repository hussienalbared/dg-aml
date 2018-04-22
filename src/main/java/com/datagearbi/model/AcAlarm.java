package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * The persistent class for the AC_ALARM database table.
 * 
 */
@Entity
@Table(name = "AC_ALARM")
@NamedQuery(name = "AcAlarm.findAll", query = "SELECT a FROM AcAlarm a")
public class AcAlarm implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "alarmed_obj_key", referencedColumnName = "obj_key", insertable = false, updatable = false),
			@JoinColumn(name = "alarmed_obj_level_code", referencedColumnName = "obj_level_code", insertable = false, updatable = false) })
	private AcSuspectedObj acSuspectedObj ;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "alarm_id")
	private long alarmId;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy="acalarm")
    private List<AcRoutine> acroutine;
	@Column(name = "actual_values_text")
	private String actualValuesText;

	@Column(name = "alarm_category_cd")
	private String alarmCategoryCd;

	@Column(name = "alarm_description")
	private String alarmDescription;

	@Column(name = "alarm_status_code")
	private String alarmStatusCode;

	@Column(name = "alarm_subcategory_cd")
	private String alarmSubcategoryCd;

	@Column(name = "alarm_type_cd")
	private String alarmTypeCd;

	@Column(name = "alarmed_obj_key")
	private int alarmedObjKey;

	@Column(name = "alarmed_obj_level_code")
	private String alarmedObjLevelCode;

	@Column(name = "alarmed_obj_name")
	private String alarmedObjName;

	@Column(name = "alarmed_obj_number")
	private String alarmedObjNumber;

	@Column(name = "create_date")
	private Timestamp createDate;

	@Column(name = "create_user_id")
	private String createUserId;

	@Column(name = "employee_ind")
	private String employeeInd;

	@Column(name = "logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name = "money_laundering_risk_score")
	private BigDecimal moneyLaunderingRiskScore;

	@Column(name = "primary_obj_key")
	private BigDecimal primaryObjKey;

	@Column(name = "primary_obj_level_code")
	private String primaryObjLevelCode;

	@Column(name = "primary_obj_name")
	private String primaryObjName;

	@Column(name = "primary_obj_number")
	private String primaryObjNumber;

	@Column(name = "product_type")
	private String productType;

	@Column(name = "routine_id")
	private BigDecimal routineId;

	public List<AcRoutine> getAcroutine() {
		return acroutine;
	}

	public void setAcroutine(List<AcRoutine> acroutine) {
		this.acroutine = acroutine;
	}

	@Column(name = "routine_name")
	private String routineName;
 
	@Column(name = "run_date")
	private Timestamp runDate;

	@Column(name = "suppression_end_date")
	private Timestamp suppressionEndDate;

	@Column(name = "terror_financing_risk_score")
	private BigDecimal terrorFinancingRiskScore;

	@Column(name = "version_number")
	private BigDecimal versionNumber;

	public AcAlarm() {
	}

	public long getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(long alarmId) {
		this.alarmId = alarmId;
	}

	public String getActualValuesText() {
		return this.actualValuesText;
	}

	public void setActualValuesText(String actualValuesText) {
		this.actualValuesText = actualValuesText;
	}

	public String getAlarmCategoryCd() {
		return this.alarmCategoryCd;
	}

	public void setAlarmCategoryCd(String alarmCategoryCd) {
		this.alarmCategoryCd = alarmCategoryCd;
	}

	public String getAlarmDescription() {
		return this.alarmDescription;
	}

	public void setAlarmDescription(String alarmDescription) {
		this.alarmDescription = alarmDescription;
	}

	public String getAlarmStatusCode() {
		return this.alarmStatusCode;
	}

	public void setAlarmStatusCode(String alarmStatusCode) {
		this.alarmStatusCode = alarmStatusCode;
	}

	public String getAlarmSubcategoryCd() {
		return this.alarmSubcategoryCd;
	}

	public void setAlarmSubcategoryCd(String alarmSubcategoryCd) {
		this.alarmSubcategoryCd = alarmSubcategoryCd;
	}

	public String getAlarmTypeCd() {
		return this.alarmTypeCd;
	}

	public void setAlarmTypeCd(String alarmTypeCd) {
		this.alarmTypeCd = alarmTypeCd;
	}

	public int getAlarmedObjKey() {
		return this.alarmedObjKey;
	}

	public void setAlarmedObjKey(int alarmedObjKey) {
		this.alarmedObjKey = alarmedObjKey;
	}

	public String getAlarmedObjLevelCode() {
		return this.alarmedObjLevelCode;
	}

	public void setAlarmedObjLevelCode(String alarmedObjLevelCode) {
		this.alarmedObjLevelCode = alarmedObjLevelCode;
	}

	public String getAlarmedObjName() {
		return this.alarmedObjName;
	}

	public void setAlarmedObjName(String alarmedObjName) {
		this.alarmedObjName = alarmedObjName;
	}

	public String getAlarmedObjNumber() {
		return this.alarmedObjNumber;
	}

	public void setAlarmedObjNumber(String alarmedObjNumber) {
		this.alarmedObjNumber = alarmedObjNumber;
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

	public String getEmployeeInd() {
		return this.employeeInd;
	}

	public void setEmployeeInd(String employeeInd) {
		this.employeeInd = employeeInd;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public BigDecimal getMoneyLaunderingRiskScore() {
		return this.moneyLaunderingRiskScore;
	}

	public void setMoneyLaunderingRiskScore(BigDecimal moneyLaunderingRiskScore) {
		this.moneyLaunderingRiskScore = moneyLaunderingRiskScore;
	}

	public BigDecimal getPrimaryObjKey() {
		return this.primaryObjKey;
	}

	public void setPrimaryObjKey(BigDecimal primaryObjKey) {
		this.primaryObjKey = primaryObjKey;
	}

	public String getPrimaryObjLevelCode() {
		return this.primaryObjLevelCode;
	}

	public void setPrimaryObjLevelCode(String primaryObjLevelCode) {
		this.primaryObjLevelCode = primaryObjLevelCode;
	}

	public String getPrimaryObjName() {
		return this.primaryObjName;
	}

	public void setPrimaryObjName(String primaryObjName) {
		this.primaryObjName = primaryObjName;
	}

	public String getPrimaryObjNumber() {
		return this.primaryObjNumber;
	}

	public void setPrimaryObjNumber(String primaryObjNumber) {
		this.primaryObjNumber = primaryObjNumber;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getRoutineId() {
		return this.routineId;
	}

	public void setRoutineId(BigDecimal routineId) {
		this.routineId = routineId;
	}

	public String getRoutineName() {
		return this.routineName;
	}

	public void setRoutineName(String routineName) {
		this.routineName = routineName;
	}

	public Timestamp getRunDate() {
		return this.runDate;
	}

	public void setRunDate(Timestamp runDate) {
		this.runDate = runDate;
	}

	public Timestamp getSuppressionEndDate() {
		return this.suppressionEndDate;
	}

	public void setSuppressionEndDate(Timestamp suppressionEndDate) {
		this.suppressionEndDate = suppressionEndDate;
	}

	public BigDecimal getTerrorFinancingRiskScore() {
		return this.terrorFinancingRiskScore;
	}

	public void setTerrorFinancingRiskScore(BigDecimal terrorFinancingRiskScore) {
		this.terrorFinancingRiskScore = terrorFinancingRiskScore;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

}