package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the AC_Suspected_Object database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Suspected_Object.findAll", query="SELECT a FROM AC_Suspected_Object a")
@Table(name="AC_Suspected_Object",schema="AC")
public class AC_Suspected_Object implements Serializable {
	private static final long serialVersionUID = 1L;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="acSuspectedObj")
	private Set<AC_Alarm> acAlarm;
	public Set<AC_Alarm> getAcAlarm() {
		return acAlarm;
	}
	public int getAlarmsCount() {
		return alarmsCount;
	}
	public void setAlarmsCount(int alarmsCount) {
		this.alarmsCount = alarmsCount;
	}
	public void setAcAlarm(Set<AC_Alarm> acAlarm) {
		this.acAlarm = acAlarm;
	}
	@EmbeddedId
	private AC_Suspected_ObjectPK id;

	@Column(name="Age_Old_Alarm")
	private int age_Old_Alarm;

	@Column(name="Agg_Amt")
	private BigDecimal agg_Amt;

	@Column(name="Alarmed_Obj_Name")
	private String alarmed_Obj_Name;

	@Column(name="Alarmed_Obj_No")
	private String alarmed_Obj_No;

	@Column(name="Alarms_Count")
	
	private int alarmsCount;

	@Column(name="Create_Timestamp")
	private Timestamp create_Timestamp;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	private int ML_Score;

	@Column(name="Owner_UID")
	private String owner_UID;

	@Column(name="Political_Exp_Person_Ind")
	private String political_Exp_Person_Ind;

	@Column(name="Risk_Score_Cd")
	private String risk_Score_Cd;

	@Column(name="Trans_Count")
	private int trans_Count;

	public AC_Suspected_Object() {
	}

	public AC_Suspected_ObjectPK getId() {
		return this.id;
	}

	public void setId(AC_Suspected_ObjectPK id) {
		this.id = id;
	}

	public int getAge_Old_Alarm() {
		return this.age_Old_Alarm;
	}

	public void setAge_Old_Alarm(int age_Old_Alarm) {
		this.age_Old_Alarm = age_Old_Alarm;
	}

	public BigDecimal getAgg_Amt() {
		return this.agg_Amt;
	}

	public void setAgg_Amt(BigDecimal agg_Amt) {
		this.agg_Amt = agg_Amt;
	}

	public String getAlarmed_Obj_Name() {
		return this.alarmed_Obj_Name;
	}

	public void setAlarmed_Obj_Name(String alarmed_Obj_Name) {
		this.alarmed_Obj_Name = alarmed_Obj_Name;
	}

	public String getAlarmed_Obj_No() {
		return this.alarmed_Obj_No;
	}

	public void setAlarmed_Obj_No(String alarmed_Obj_No) {
		this.alarmed_Obj_No = alarmed_Obj_No;
	}

	public int getAlarms_Count() {
		return this.alarmsCount;
	}

	public void setAlarms_Count(int alarms_Count) {
		this.alarmsCount = alarms_Count;
	}

	public Timestamp getCreate_Timestamp() {
		return this.create_Timestamp;
	}

	public void setCreate_Timestamp(Timestamp create_Timestamp) {
		this.create_Timestamp = create_Timestamp;
	}

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public int getML_Score() {
		return this.ML_Score;
	}

	public void setML_Score(int ML_Score) {
		this.ML_Score = ML_Score;
	}

	public String getOwner_UID() {
		return this.owner_UID;
	}

	public void setOwner_UID(String owner_UID) {
		this.owner_UID = owner_UID;
	}

	public String getPolitical_Exp_Person_Ind() {
		return this.political_Exp_Person_Ind;
	}

	public void setPolitical_Exp_Person_Ind(String political_Exp_Person_Ind) {
		this.political_Exp_Person_Ind = political_Exp_Person_Ind;
	}

	public String getRisk_Score_Cd() {
		return this.risk_Score_Cd;
	}

	public void setRisk_Score_Cd(String risk_Score_Cd) {
		this.risk_Score_Cd = risk_Score_Cd;
	}

	public int getTrans_Count() {
		return this.trans_Count;
	}

	public void setTrans_Count(int trans_Count) {
		this.trans_Count = trans_Count;
	}

}