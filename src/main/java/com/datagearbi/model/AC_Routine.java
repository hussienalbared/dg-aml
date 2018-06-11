package com.datagearbi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the AC_Routine database table.
 * 
 */
@Entity
@NamedQuery(name="AC_Routine.findAll", query="SELECT a FROM AC_Routine a")
@Table(name="AC_Routine",schema="AC")
public class AC_Routine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Routine_Id")
	private long routine_Id;

	@Column(name="Alarm_Categ_Cd")
	private String alarm_Categ_Cd;

	@Column(name="Alarm_Subcateg_Cd")
	private String alarm_Subcateg_Cd;

	@Column(name="Alarm_Type_Cd")
	private String alarm_Type_Cd;

	@Column(name="Create_Date")
	private Timestamp create_Date;

	@Column(name="Create_User_Id")
	private String create_User_Id;

	@Column(name="Current_Ind")
	private String current_Ind;

	@Column(name="Dflt_Suppr_Dur_Count")
	private int dflt_Suppr_Dur_Count;

	@Column(name="End_Date")
	private Timestamp end_Date;

	@Column(name="End_User_Id")
	private String end_User_Id;

	@Column(name="Exec_Prob_Rate")
	private BigDecimal exec_Prob_Rate;

	@Column(name="header_id")
	private BigDecimal headerId;

	@Column(name="Last_Update_Date")
	private Timestamp last_Update_Date;

	@Column(name="Last_Update_User_Id")
	private String last_Update_User_Id;

	@Column(name="Logic_Del_Ind")
	private String logic_Del_Ind;

	private BigDecimal ML_Bayes_Weight;

	@Column(name="Obj_Level_Cd")
	private String obj_Level_Cd;
    
	@Column(name="Order_In_Header")
	private Integer  order_In_Header;

	@Column(name="Prim_Obj_No_Var_Name")
	private String prim_Obj_No_Var_Name;

	@Column(name="Prod_Type_Cd")
	private String prod_Type_Cd;

	@Column(name="Risk_Fact_Ind")
	private String risk_Fact_Ind;

	@Column(name="root_key")
	private BigDecimal rootKey;

	@Column(name="Route_Grp_Id")
	private BigDecimal route_Grp_Id;

	@Column(name="Route_User_Long_Id")
	private String route_User_Long_Id;

	@Column(name="Routine_Categ_Cd")
	private String routine_Categ_Cd;

	@Column(name="Routine_Cd_Loc_Desc")
	private String routine_Cd_Loc_Desc;

	@Column(name="Routine_Desc")
	private String routine_Desc;

	@Column(name="Routine_Dur_Count")
	private int routine_Dur_Count;

	@Column(name="Routine_Msg_Txt")
	private String routine_Msg_Txt;

	@Column(name="Routine_Name")
	private String routine_Name;

	@Column(name="Routine_Run_Freq_Cd")
	private String routine_Run_Freq_Cd;

	@Column(name="Routine_Short_Desc")
	private String routine_Short_Desc;

	@Column(name="Routine_Status_Cd")
	private String routine_Status_Cd;

	@Column(name="Routine_Type_Cd")
	private String routine_Type_Cd;

	@Column(name="Save_Trig_Trans_Ind")
	private String save_Trig_Trans_Ind;

	@Column(name="Skip_If_No_Trans_Ccy_Day_Ind")
	private String skip_If_No_Trans_Ccy_Day_Ind;

	private BigDecimal TF_Bayes_Weight;

	@Column(name="Ver_No")
	private int ver_No;

	private String VSD_Installation_Name;

	private String VSD_Win_Name;

	public AC_Routine() {
	}

	public long getRoutine_Id() {
		return this.routine_Id;
	}

	public void setRoutine_Id(long routine_Id) {
		this.routine_Id = routine_Id;
	}

	public String getAlarm_Categ_Cd() {
		return this.alarm_Categ_Cd;
	}

	public void setAlarm_Categ_Cd(String alarm_Categ_Cd) {
		this.alarm_Categ_Cd = alarm_Categ_Cd;
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

	public Timestamp getCreate_Date() {
		return this.create_Date;
	}

	public void setCreate_Date(Timestamp create_Date) {
		this.create_Date = create_Date;
	}

	public String getCreate_User_Id() {
		return this.create_User_Id;
	}

	public void setCreate_User_Id(String create_User_Id) {
		this.create_User_Id = create_User_Id;
	}

	public String getCurrent_Ind() {
		return this.current_Ind;
	}

	public void setCurrent_Ind(String current_Ind) {
		this.current_Ind = current_Ind;
	}

	public int getDflt_Suppr_Dur_Count() {
		return this.dflt_Suppr_Dur_Count;
	}

	public void setDflt_Suppr_Dur_Count(int dflt_Suppr_Dur_Count) {
		this.dflt_Suppr_Dur_Count = dflt_Suppr_Dur_Count;
	}

	public Timestamp getEnd_Date() {
		return this.end_Date;
	}

	public void setEnd_Date(Timestamp end_Date) {
		this.end_Date = end_Date;
	}

	public String getEnd_User_Id() {
		return this.end_User_Id;
	}

	public void setEnd_User_Id(String end_User_Id) {
		this.end_User_Id = end_User_Id;
	}

	public BigDecimal getExec_Prob_Rate() {
		return this.exec_Prob_Rate;
	}

	public void setExec_Prob_Rate(BigDecimal exec_Prob_Rate) {
		this.exec_Prob_Rate = exec_Prob_Rate;
	}

	public BigDecimal getHeaderId() {
		return this.headerId;
	}

	public void setHeaderId(BigDecimal headerId) {
		this.headerId = headerId;
	}

	public Timestamp getLast_Update_Date() {
		return this.last_Update_Date;
	}

	public void setLast_Update_Date(Timestamp last_Update_Date) {
		this.last_Update_Date = last_Update_Date;
	}

	public String getLast_Update_User_Id() {
		return this.last_Update_User_Id;
	}

	public void setLast_Update_User_Id(String last_Update_User_Id) {
		this.last_Update_User_Id = last_Update_User_Id;
	}

	public String getLogic_Del_Ind() {
		return this.logic_Del_Ind;
	}

	public void setLogic_Del_Ind(String logic_Del_Ind) {
		this.logic_Del_Ind = logic_Del_Ind;
	}

	public BigDecimal getML_Bayes_Weight() {
		return this.ML_Bayes_Weight;
	}

	public void setML_Bayes_Weight(BigDecimal ML_Bayes_Weight) {
		this.ML_Bayes_Weight = ML_Bayes_Weight;
	}

	public String getObj_Level_Cd() {
		return this.obj_Level_Cd;
	}

	public void setObj_Level_Cd(String obj_Level_Cd) {
		this.obj_Level_Cd = obj_Level_Cd;
	}

	public Integer getOrder_In_Header() {
		return this.order_In_Header;
	}

	public void setOrder_In_Header(Integer order_In_Header) {
		this.order_In_Header = order_In_Header;
	}

	public String getPrim_Obj_No_Var_Name() {
		return this.prim_Obj_No_Var_Name;
	}

	public void setPrim_Obj_No_Var_Name(String prim_Obj_No_Var_Name) {
		this.prim_Obj_No_Var_Name = prim_Obj_No_Var_Name;
	}

	public String getProd_Type_Cd() {
		return this.prod_Type_Cd;
	}

	public void setProd_Type_Cd(String prod_Type_Cd) {
		this.prod_Type_Cd = prod_Type_Cd;
	}

	public String getRisk_Fact_Ind() {
		return this.risk_Fact_Ind;
	}

	public void setRisk_Fact_Ind(String risk_Fact_Ind) {
		this.risk_Fact_Ind = risk_Fact_Ind;
	}

	public BigDecimal getRootKey() {
		return this.rootKey;
	}

	public void setRootKey(BigDecimal rootKey) {
		this.rootKey = rootKey;
	}

	public BigDecimal getRoute_Grp_Id() {
		return this.route_Grp_Id;
	}

	public void setRoute_Grp_Id(BigDecimal route_Grp_Id) {
		this.route_Grp_Id = route_Grp_Id;
	}

	public String getRoute_User_Long_Id() {
		return this.route_User_Long_Id;
	}

	public void setRoute_User_Long_Id(String route_User_Long_Id) {
		this.route_User_Long_Id = route_User_Long_Id;
	}

	public String getRoutine_Categ_Cd() {
		return this.routine_Categ_Cd;
	}

	public void setRoutine_Categ_Cd(String routine_Categ_Cd) {
		this.routine_Categ_Cd = routine_Categ_Cd;
	}

	public String getRoutine_Cd_Loc_Desc() {
		return this.routine_Cd_Loc_Desc;
	}

	public void setRoutine_Cd_Loc_Desc(String routine_Cd_Loc_Desc) {
		this.routine_Cd_Loc_Desc = routine_Cd_Loc_Desc;
	}

	public String getRoutine_Desc() {
		return this.routine_Desc;
	}

	public void setRoutine_Desc(String routine_Desc) {
		this.routine_Desc = routine_Desc;
	}

	public int getRoutine_Dur_Count() {
		return this.routine_Dur_Count;
	}

	public void setRoutine_Dur_Count(int routine_Dur_Count) {
		this.routine_Dur_Count = routine_Dur_Count;
	}

	public String getRoutine_Msg_Txt() {
		return this.routine_Msg_Txt;
	}

	public void setRoutine_Msg_Txt(String routine_Msg_Txt) {
		this.routine_Msg_Txt = routine_Msg_Txt;
	}

	public String getRoutine_Name() {
		return this.routine_Name;
	}

	public void setRoutine_Name(String routine_Name) {
		this.routine_Name = routine_Name;
	}

	public String getRoutine_Run_Freq_Cd() {
		return this.routine_Run_Freq_Cd;
	}

	public void setRoutine_Run_Freq_Cd(String routine_Run_Freq_Cd) {
		this.routine_Run_Freq_Cd = routine_Run_Freq_Cd;
	}

	public String getRoutine_Short_Desc() {
		return this.routine_Short_Desc;
	}

	public void setRoutine_Short_Desc(String routine_Short_Desc) {
		this.routine_Short_Desc = routine_Short_Desc;
	}

	public String getRoutine_Status_Cd() {
		return this.routine_Status_Cd;
	}

	public void setRoutine_Status_Cd(String routine_Status_Cd) {
		this.routine_Status_Cd = routine_Status_Cd;
	}

	public String getRoutine_Type_Cd() {
		return this.routine_Type_Cd;
	}

	public void setRoutine_Type_Cd(String routine_Type_Cd) {
		this.routine_Type_Cd = routine_Type_Cd;
	}

	public String getSave_Trig_Trans_Ind() {
		return this.save_Trig_Trans_Ind;
	}

	public void setSave_Trig_Trans_Ind(String save_Trig_Trans_Ind) {
		this.save_Trig_Trans_Ind = save_Trig_Trans_Ind;
	}

	public String getSkip_If_No_Trans_Ccy_Day_Ind() {
		return this.skip_If_No_Trans_Ccy_Day_Ind;
	}

	public void setSkip_If_No_Trans_Ccy_Day_Ind(String skip_If_No_Trans_Ccy_Day_Ind) {
		this.skip_If_No_Trans_Ccy_Day_Ind = skip_If_No_Trans_Ccy_Day_Ind;
	}

	public BigDecimal getTF_Bayes_Weight() {
		return this.TF_Bayes_Weight;
	}

	public void setTF_Bayes_Weight(BigDecimal TF_Bayes_Weight) {
		this.TF_Bayes_Weight = TF_Bayes_Weight;
	}

	public int getVer_No() {
		return this.ver_No;
	}

	public void setVer_No(int ver_No) {
		this.ver_No = ver_No;
	}

	public String getVSD_Installation_Name() {
		return this.VSD_Installation_Name;
	}

	public void setVSD_Installation_Name(String VSD_Installation_Name) {
		this.VSD_Installation_Name = VSD_Installation_Name;
	}

	public String getVSD_Win_Name() {
		return this.VSD_Win_Name;
	}

	public void setVSD_Win_Name(String VSD_Win_Name) {
		this.VSD_Win_Name = VSD_Win_Name;
	}

}