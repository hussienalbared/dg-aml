package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the AC_Alarm database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Alarm.findAll", query="SELECT a FROM AC_Alarm a")
@Table(name="AC_Alarm",schema="AC")
public class AC_Alarm implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonIgnore
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "alarmed_Obj_Key", referencedColumnName = "alarmed_Obj_Key", insertable = false, updatable = false),
			@JoinColumn(name = "alarmed_Obj_Level_Cd", referencedColumnName = "alarmed_Obj_level_Cd", insertable = false, updatable = false) })
	private AC_Suspected_Object acSuspectedObj ;
	public AC_Suspected_Object getAcSuspectedObj() {
		return acSuspectedObj;
	}
	public void setAcSuspectedObj(AC_Suspected_Object acSuspectedObj) {
		this.acSuspectedObj = acSuspectedObj;
	}
	@NotFound(action=NotFoundAction.IGNORE)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="routine_Id",referencedColumnName="routine_Id",insertable=false,updatable=false)
	private AC_Routine acroutine;
	public AC_Routine getAcroutine() {
		return acroutine;
	}
	public void setAcroutine(AC_Routine acroutine) {
		this.acroutine = acroutine;
	}
	@Id
	@Column(name="Alarm_Id")
	@GenericGenerator(
		    name = "incrementGenerator",
		    strategy = "org.hibernate.id.IncrementGenerator",
		    parameters = {
                    @org.hibernate.annotations.Parameter(name = "schema",value = "AC")
            })
	@GeneratedValue(generator="incrementGenerator")
	private long alarm_Id;

	@Column(name="Actual_Value_Txt")
	private String actual_Value_Txt;

	@Column(name="Alarm_Categ_Cd")
	private String alarm_Categ_Cd;

	@Column(name="Alarm_Desc")
	private String alarm_Desc;

	@Column(name="Alarm_Status_Cd")
	private String alarm_Status_Cd;

	@Column(name="Alarm_Subcateg_Cd")
	private String alarm_Subcateg_Cd;

	@Column(name="Alarm_Type_Cd")
	private String alarm_Type_Cd;

	@Column(name="Alarmed_Obj_Key")
	private long alarmed_Obj_Key;

	@Column(name="Alarmed_Obj_Level_Cd")
	private String alarmed_Obj_Level_Cd;

	@Column(name="Alarmed_Obj_Name")
	private String alarmed_Obj_Name;

	@Column(name="Alarmed_Obj_No")
	private String alarmed_Obj_No;
	@JsonFormat( pattern="yyyy-MM-dd")
	@Column(name="Create_Date")
	private LocalDate create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Emp_Ind")
	private String emp_Ind;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	@Column(name="Ml_Risk_Score")
	private int ml_Risk_Score;

	@Column(name="Prim_Obj_Key")
	private BigDecimal prim_Obj_Key;

	@Column(name="Prim_Obj_level_Cd")
	private String prim_Obj_level_Cd;

	@Column(name="Prim_Obj_Name")
	private String prim_Obj_Name;

	@Column(name="Prim_Obj_No")
	private String prim_Obj_No;

	@Column(name="Prod_Type")
	private String prod_Type;

	@Column(name="Routine_Id")
	private BigDecimal routine_Id;

	@Column(name="Routine_Name")
	private String routine_Name;

	@Column(name="Run_Date")
	@JsonFormat( pattern="yyyy-MM-dd")
	private LocalDate run_Date;

	@Column(name="Suppr_End_Date")
	private Timestamp suppr_End_Date;

	@Column(name="Tf_Risk_Score")
	private int tf_Risk_Score;

	@Column(name="Ver_No")
	private int ver_No;


	@Column(name="total_amount_of_Pep")
	private int total_AmountOfPepCustomer;

	public int getTotal_AmountOfPepCustomer() {
		return total_AmountOfPepCustomer;
	}
	public void setTotal_AmountOfPepCustomer(int total_AmountOfPepCustomer) {
		this.total_AmountOfPepCustomer = total_AmountOfPepCustomer;
	}
	public AC_Alarm() {
	}

	public long getAlarm_Id() {
		return this.alarm_Id;
	}

	public void setAlarm_Id(long alarm_Id) {
		this.alarm_Id = alarm_Id;
	}

	public String getActual_Value_Txt() {
		return this.actual_Value_Txt;
	}

	public void setActual_Value_Txt(String actual_Value_Txt) {
		this.actual_Value_Txt = actual_Value_Txt;
	}

	public String getAlarm_Categ_Cd() {
		return this.alarm_Categ_Cd;
	}

	public void setAlarm_Categ_Cd(String alarm_Categ_Cd) {
		this.alarm_Categ_Cd = alarm_Categ_Cd;
	}

	public String getAlarm_Desc() {
		return this.alarm_Desc;
	}

	public void setAlarm_Desc(String alarm_Desc) {
		this.alarm_Desc = alarm_Desc;
	}

	public String getAlarm_Status_Cd() {
		return this.alarm_Status_Cd;
	}

	public void setAlarm_Status_Cd(String alarm_Status_Cd) {
		this.alarm_Status_Cd = alarm_Status_Cd;
	}

	public String getAlarm_Subcateg_Cd() {
		return this.alarm_Subcateg_Cd;
	}

	public void setAlarm_Subcateg_Cd(String alarm_Subcateg_Cd) {
		this.alarm_Subcateg_Cd = alarm_Subcateg_Cd;
	}

	public String getAlarm_Type_Cd() {
		return this.alarm_Type_Cd;
	}

	public void setAlarm_Type_Cd(String alarm_Type_Cd) {
		this.alarm_Type_Cd = alarm_Type_Cd;
	}

	public long getAlarmed_Obj_Key() {
		return this.alarmed_Obj_Key;
	}
	
	public void setAlarmed_Obj_Key(long alarmed_Obj_Key) {
		this.alarmed_Obj_Key = alarmed_Obj_Key;
	}

	public String getAlarmed_Obj_Level_Cd() {
		return this.alarmed_Obj_Level_Cd;
	}

	public void setAlarmed_Obj_Level_Cd(String alarmed_Obj_Level_Cd) {
		this.alarmed_Obj_Level_Cd = alarmed_Obj_Level_Cd;
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

	public LocalDate getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(LocalDate create_Date) {
		this.create_Date = create_Date;
	}

	public String getCreate_User_Id() {
		return this.create_User_Id;
	}

	public void setCreate_User_Id(String create_User_Id) {
		this.create_User_Id = create_User_Id;
	}

	public String getEmp_Ind() {
		return this.emp_Ind;
	}

	public void setEmp_Ind(String emp_Ind) {
		this.emp_Ind = emp_Ind;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

	public int getMl_Risk_Score() {
		return this.ml_Risk_Score;
	}

	public void setMl_Risk_Score(int ml_Risk_Score) {
		this.ml_Risk_Score = ml_Risk_Score;
	}

	public BigDecimal getPrim_Obj_Key() {
		return this.prim_Obj_Key;
	}

	public void setPrim_Obj_Key(BigDecimal prim_Obj_Key) {
		this.prim_Obj_Key = prim_Obj_Key;
	}

	public String getPrim_Obj_level_Cd() {
		return this.prim_Obj_level_Cd;
	}

	public void setPrim_Obj_level_Cd(String prim_Obj_level_Cd) {
		this.prim_Obj_level_Cd = prim_Obj_level_Cd;
	}

	public String getPrim_Obj_Name() {
		return this.prim_Obj_Name;
	}

	public void setPrim_Obj_Name(String prim_Obj_Name) {
		this.prim_Obj_Name = prim_Obj_Name;
	}

	public String getPrim_Obj_No() {
		return this.prim_Obj_No;
	}

	public void setPrim_Obj_No(String prim_Obj_No) {
		this.prim_Obj_No = prim_Obj_No;
	}

	public String getProd_Type() {
		return this.prod_Type;
	}

	public void setProd_Type(String prod_Type) {
		this.prod_Type = prod_Type;
	}

	public BigDecimal getRoutine_Id() {
		return this.routine_Id;
	}

	public void setRoutine_Id(BigDecimal routine_Id) {
		this.routine_Id = routine_Id;
	}

	public String getRoutine_Name() {
		return this.routine_Name;
	}

	public void setRoutine_Name(String routine_Name) {
		this.routine_Name = routine_Name;
	}

	public LocalDate getRun_Date() {
		return this.run_Date;
	}

	public void setRun_Date(LocalDate run_Date) {
		this.run_Date = run_Date;
	}

	public Timestamp getSuppr_End_Date() {
		return this.suppr_End_Date;
	}

	public void setSuppr_End_Date(Timestamp suppr_End_Date) {
		this.suppr_End_Date = suppr_End_Date;
	}

	public int getTf_Risk_Score() {
		return this.tf_Risk_Score;
	}

	public void setTf_Risk_Score(int tf_Risk_Score) {
		this.tf_Risk_Score = tf_Risk_Score;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}
	

}