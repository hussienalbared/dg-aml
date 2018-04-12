package com.datagearbi.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AC_ROUTINE database table.
 * 
 */
@Entity
@Table(name="AC_ROUTINE")
@NamedQuery(name="AcRoutine.findAll", query="SELECT a FROM AcRoutine a")
public class AcRoutine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="routine_id")
	private int routineId;
	@JsonIgnore
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="routine_id",referencedColumnName="routine_id",insertable=false,updatable=false)
	private AcAlarm acalarm;
	@Column(name="alarm_category_cd")
	private String alarmCategoryCd;

	

	public AcAlarm getAcalarm() {
		return acalarm;
	}

	public void setAcalarm(AcAlarm acalarm) {
		this.acalarm = acalarm;
	}

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

	@Column(name="execution_probability_rate")
	private BigDecimal executionProbabilityRate;

	@Column(name="header_id")
	private BigDecimal headerId;

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

	@Column(name="order_in_header")
	private BigDecimal orderInHeader;

	@Column(name="primary_obj_number_var_name")
	private String primaryObjNumberVarName;

	@Column(name="product_type_code")
	private String productTypeCode;

	@Column(name="risk_factor_ind")
	private String riskFactorInd;

	@Column(name="root_key")
	private BigDecimal rootKey;

	@Column(name="routine_category_code")
	private String routineCategoryCode;

	@Column(name="routine_code_location_desc")
	private String routineCodeLocationDesc;

	@Column(name="routine_description")
	private String routineDescription;

	@Column(name="routine_duration_count")
	private BigDecimal routineDurationCount;

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

	@Column(name="routing_group_id")
	private BigDecimal routingGroupId;

	@Column(name="routing_user_long_id")
	private String routingUserLongId;

	@Column(name="save_trig_trans_ind")
	private String saveTrigTransInd;

	@Column(name="skip_if_no_trans_curr_day_ind")
	private String skipIfNoTransCurrDayInd;

	@Column(name="terror_financing_bayes_weight")
	private BigDecimal terrorFinancingBayesWeight;

	@Column(name="version_number")
	private BigDecimal versionNumber;

	@Column(name="vsd_deployment_name")
	private String vsdDeploymentName;

	@Column(name="vsd_window_name")
	private String vsdWindowName;

	public AcRoutine() {
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

	public BigDecimal getExecutionProbabilityRate() {
		return this.executionProbabilityRate;
	}

	public void setExecutionProbabilityRate(BigDecimal executionProbabilityRate) {
		this.executionProbabilityRate = executionProbabilityRate;
	}

	public BigDecimal getHeaderId() {
		return this.headerId;
	}

	public void setHeaderId(BigDecimal headerId) {
		this.headerId = headerId;
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

	public BigDecimal getOrderInHeader() {
		return this.orderInHeader;
	}

	public void setOrderInHeader(BigDecimal orderInHeader) {
		this.orderInHeader = orderInHeader;
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

	public BigDecimal getRootKey() {
		return this.rootKey;
	}

	public void setRootKey(BigDecimal rootKey) {
		this.rootKey = rootKey;
	}

	public String getRoutineCategoryCode() {
		return this.routineCategoryCode;
	}

	public void setRoutineCategoryCode(String routineCategoryCode) {
		this.routineCategoryCode = routineCategoryCode;
	}

	public String getRoutineCodeLocationDesc() {
		return this.routineCodeLocationDesc;
	}

	public void setRoutineCodeLocationDesc(String routineCodeLocationDesc) {
		this.routineCodeLocationDesc = routineCodeLocationDesc;
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

	public BigDecimal getRoutingGroupId() {
		return this.routingGroupId;
	}

	public void setRoutingGroupId(BigDecimal routingGroupId) {
		this.routingGroupId = routingGroupId;
	}

	public String getRoutingUserLongId() {
		return this.routingUserLongId;
	}

	public void setRoutingUserLongId(String routingUserLongId) {
		this.routingUserLongId = routingUserLongId;
	}

	public String getSaveTrigTransInd() {
		return this.saveTrigTransInd;
	}

	public void setSaveTrigTransInd(String saveTrigTransInd) {
		this.saveTrigTransInd = saveTrigTransInd;
	}

	public String getSkipIfNoTransCurrDayInd() {
		return this.skipIfNoTransCurrDayInd;
	}

	public void setSkipIfNoTransCurrDayInd(String skipIfNoTransCurrDayInd) {
		this.skipIfNoTransCurrDayInd = skipIfNoTransCurrDayInd;
	}

	public BigDecimal getTerrorFinancingBayesWeight() {
		return this.terrorFinancingBayesWeight;
	}

	public void setTerrorFinancingBayesWeight(BigDecimal terrorFinancingBayesWeight) {
		this.terrorFinancingBayesWeight = terrorFinancingBayesWeight;
	}

	public BigDecimal getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(BigDecimal versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getVsdDeploymentName() {
		return this.vsdDeploymentName;
	}

	public void setVsdDeploymentName(String vsdDeploymentName) {
		this.vsdDeploymentName = vsdDeploymentName;
	}

	public String getVsdWindowName() {
		return this.vsdWindowName;
	}

	public void setVsdWindowName(String vsdWindowName) {
		this.vsdWindowName = vsdWindowName;
	}

}