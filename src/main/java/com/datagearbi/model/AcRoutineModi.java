package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_ROUTINE_MODI database table.
 * 
 */
@Entity
@Table(name="AC_ROUTINE_MODI")
@NamedQuery(name="AcRoutineModi.findAll", query="SELECT a FROM AcRoutineModi a")
public class AcRoutineModi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="routine_id")
	private int routineId;

	@Column(name="alarm_category_cd")
	private String alarmCategoryCd;

	@Column(name="alarm_subcategory_cd")
	private String alarmSubcategoryCd;

	@Column(name="alarm_type_cd")
	private String alarmTypeCd;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user_id")
	private String createUserId;

	@Column(name="current_ind")
	private String currentInd;

	@Column(name="dflt_suppress_duration_count")
	private BigDecimal dfltSuppressDurationCount;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="end_user_id")
	private String endUserId;

	@Column(name="logical_delete_ind")
	private String logicalDeleteInd;

	@Column(name="lstupdate_date")
	private Timestamp lstupdateDate;

	@Column(name="lstupdate_user_id")
	private String lstupdateUserId;

	@Column(name="money_laundering_bayes_weight")
	private BigDecimal moneyLaunderingBayesWeight;

	@Column(name="obj_level_code")
	private String objLevelCode;

	@Column(name="primary_obj_number_var_name")
	private String primaryObjNumberVarName;

	@Column(name="product_type_code")
	private String productTypeCode;

	@Column(name="risk_factor_ind")
	private String riskFactorInd;

	@Column(name="routine_category_code")
	private String routineCategoryCode;

	@Column(name="routine_description")
	private String routineDescription;

	@Column(name="routine_duration_count")
	private BigDecimal routineDurationCount;

	@Column(name="routine_message_text")
	private String routineMessageText;

	@Column(name="routine_name")
	private String routineName;

	@Column(name="routine_run_frequency_code")
	private String routineRunFrequencyCode;

	@Column(name="routine_short_description")
	private String routineShortDescription;

	@Column(name="routine_status_code")
	private String routineStatusCode;

	@Column(name="routine_type_code")
	private String routineTypeCode;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	public AcRoutineModi() {
	}

	public int getRoutineId() {
		return this.routineId;
	}

	public void setRoutineId(int routineId) {
		this.routineId = routineId;
	}

	public String getAlarmCategoryCd() {
		return this.alarmCategoryCd;
	}

	public void setAlarmCategoryCd(String alarmCategoryCd) {
		this.alarmCategoryCd = alarmCategoryCd;
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

	public BigDecimal getDfltSuppressDurationCount() {
		return this.dfltSuppressDurationCount;
	}

	public void setDfltSuppressDurationCount(BigDecimal dfltSuppressDurationCount) {
		this.dfltSuppressDurationCount = dfltSuppressDurationCount;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
	}

	public String getLogicalDeleteInd() {
		return this.logicalDeleteInd;
	}

	public void setLogicalDeleteInd(String logicalDeleteInd) {
		this.logicalDeleteInd = logicalDeleteInd;
	}

	public Timestamp getLstupdateDate() {
		return this.lstupdateDate;
	}

	public void setLstupdateDate(Timestamp lstupdateDate) {
		this.lstupdateDate = lstupdateDate;
	}

	public String getLstupdateUserId() {
		return this.lstupdateUserId;
	}

	public void setLstupdateUserId(String lstupdateUserId) {
		this.lstupdateUserId = lstupdateUserId;
	}

	public BigDecimal getMoneyLaunderingBayesWeight() {
		return this.moneyLaunderingBayesWeight;
	}

	public void setMoneyLaunderingBayesWeight(BigDecimal moneyLaunderingBayesWeight) {
		this.moneyLaunderingBayesWeight = moneyLaunderingBayesWeight;
	}

	public String getObjLevelCode() {
		return this.objLevelCode;
	}

	public void setObjLevelCode(String objLevelCode) {
		this.objLevelCode = objLevelCode;
	}

	public String getPrimaryObjNumberVarName() {
		return this.primaryObjNumberVarName;
	}

	public void setPrimaryObjNumberVarName(String primaryObjNumberVarName) {
		this.primaryObjNumberVarName = primaryObjNumberVarName;
	}

	public String getProductTypeCode() {
		return this.productTypeCode;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getRiskFactorInd() {
		return this.riskFactorInd;
	}

	public void setRiskFactorInd(String riskFactorInd) {
		this.riskFactorInd = riskFactorInd;
	}

	public String getRoutineCategoryCode() {
		return this.routineCategoryCode;
	}

	public void setRoutineCategoryCode(String routineCategoryCode) {
		this.routineCategoryCode = routineCategoryCode;
	}

	public String getRoutineDescription() {
		return this.routineDescription;
	}

	public void setRoutineDescription(String routineDescription) {
		this.routineDescription = routineDescription;
	}

	public BigDecimal getRoutineDurationCount() {
		return this.routineDurationCount;
	}

	public void setRoutineDurationCount(BigDecimal routineDurationCount) {
		this.routineDurationCount = routineDurationCount;
	}

	public String getRoutineMessageText() {
		return this.routineMessageText;
	}

	public void setRoutineMessageText(String routineMessageText) {
		this.routineMessageText = routineMessageText;
	}

	public String getRoutineName() {
		return this.routineName;
	}

	public void setRoutineName(String routineName) {
		this.routineName = routineName;
	}

	public String getRoutineRunFrequencyCode() {
		return this.routineRunFrequencyCode;
	}

	public void setRoutineRunFrequencyCode(String routineRunFrequencyCode) {
		this.routineRunFrequencyCode = routineRunFrequencyCode;
	}

	public String getRoutineShortDescription() {
		return this.routineShortDescription;
	}

	public void setRoutineShortDescription(String routineShortDescription) {
		this.routineShortDescription = routineShortDescription;
	}

	public String getRoutineStatusCode() {
		return this.routineStatusCode;
	}

	public void setRoutineStatusCode(String routineStatusCode) {
		this.routineStatusCode = routineStatusCode;
	}

	public String getRoutineTypeCode() {
		return this.routineTypeCode;
	}

	public void setRoutineTypeCode(String routineTypeCode) {
		this.routineTypeCode = routineTypeCode;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

}