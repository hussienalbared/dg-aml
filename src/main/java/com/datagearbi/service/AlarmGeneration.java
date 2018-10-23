package com.datagearbi.service;
import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Alarm_Event;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.AC_Transaction_Flow_Alarm;
import com.datagearbi.model.AC_Transaction_Flow_AlarmPK;
import com.datagearbi.repository.AC_Transaction_Flow_AlarmRepository;
import com.datagearbi.repository.AcAlarmEventRepository;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;

@Service
public class AlarmGeneration {

	@Autowired
	private  AcAlarmEventRepository acAlarmEventRepository;
	@Autowired
	private  AlaramObjectRepository alaramObjectRepository;
	@Autowired
	private  SuspectedObjectRepository suspectedObjectRepository;
	@Autowired
	private  AC_Transaction_Flow_AlarmRepository ac_Transaction_Flow_AlarmRepository;


	public void insertRecordIntoDbAlarmTable(alramInsertionUtil ut) {
		

		AC_Alarm aa = this.saveAlarm(ut);
		this.saveAlarmEvent(ut, aa);
		this.saveSuspect(ut);
this.saveAC_Transaction_Flow_Alarm(ut, aa);
		
	}
public AC_Alarm saveAlarm(alramInsertionUtil ut) {
	AC_Alarm acc = new AC_Alarm();

	acc.setProd_Type(ut.getProduct_type());
	acc.setAlarm_Status_Cd(ut.getAlarm_status_code());
	acc.setMl_Risk_Score(Integer.parseInt(ut.getMoney_laundering_risk_score()));
	acc.setAlarm_Desc(ut.getAlarm_description());
	acc.setPrim_Obj_level_Cd(ut.getPrimary_obj_level_code());
	acc.setAlarmed_Obj_No(ut.getAlarmed_obj_number());
	acc.setAlarmed_Obj_Name(ut.getAlarmed_obj_name());
	acc.setPrim_Obj_No(ut.getPrimary_obj_number());
	acc.setPrim_Obj_Key(acc.getPrim_Obj_Key());
	acc.setPrim_Obj_Name(ut.getPrimary_obj_name());
	acc.setRoutine_Id(new BigDecimal(ut.getRoutine_id()));
	acc.setRoutine_Name(ut.getRoutine_name());
	acc.setSuppr_End_Date(Timestamp.valueOf(ut.getSuppression_end_date()));
	acc.setActual_Value_Txt(ut.getActual_values_text());
	acc.setRun_Date(ut.getRun_date());
	acc.setCreate_Date(ut.getCreate_date());
	acc.setCreate_User_Id(ut.getCreate_user_id());
	acc.setEmp_Ind(ut.getEmployee_ind());
	acc.setVer_No(Integer.parseInt(ut.getVersion_number()));
	acc.setLogic_Del_Ind(ut.getLogical_delete_ind());
	acc.setAlarm_Type_Cd(ut.getAlarm_type_cd());
	acc.setAlarm_Categ_Cd(ut.getAlarm_category_cd());
	acc.setAlarm_Subcateg_Cd(ut.getAlarm_subcategory_cd());
	acc.setAlarmed_Obj_Level_Cd(ut.getAlarmed_obj_level_code());
	acc.setAlarmed_Obj_Key(Long.valueOf(ut.getAlarmed_obj_key()));
	//FIXME add for testing
	AC_Alarm aa = alaramObjectRepository.save(acc);
return aa;
}
public void saveSuspect(alramInsertionUtil ut) {
	AC_Suspected_Object aaa = new AC_Suspected_Object();
	aaa.setAge_Old_Alarm(Integer.parseInt(ut.getOldest_alert()));
	aaa.setAgg_Amt(new BigDecimal(ut.getTotal_amount()));
	aaa.setAlarmed_Obj_Name(ut.getAlarmed_obj_name());
	aaa.setAlarmed_Obj_No(ut.getAlarmed_obj_number());
	aaa.setAlarms_Count(Integer.parseInt(ut.getAlert_count()));
	aaa.setEmp_Ind(ut.getEmployee_ind());

	aaa.setId(new AC_Suspected_ObjectPK(ut.getAlarmed_obj_level_code(), Long.parseLong(ut.getAlarmed_obj_key())));
	aaa.setTrans_Count(Integer.parseInt(ut.getTransactions_count()));
	aaa.setML_Score(Integer.parseInt(ut.getMoney_laundering_risk_score()));
	aaa.setEmp_Ind(ut.getEmployee_ind());
	aaa.setOwner_UID(ut.getCreate_user_id());
	aaa.setPolitical_Exp_Person_Ind(ut.getPep_ind());
	aaa.setCreate_Timestamp(ut.getCreate_date());
	suspectedObjectRepository.save(aaa);

}
public void saveAlarmEvent(alramInsertionUtil ut,AC_Alarm aa) {
	// TODO Auto-generated method stub
	String event_code = "CRE";
	AC_Alarm_Event ac = new AC_Alarm_Event();
	ac.setCreate_Date(ut.getCreate_date());
	ac.setCreate_User_Id(ut.getCreate_user_id());
	ac.setAlarm_Id(aa.getAlarm_Id());
	ac.setEvent_Desc(ut.getAlarm_description());
	ac.setEvent_Type_Cd(event_code);
	
	acAlarmEventRepository.save(ac);

}
public void saveAC_Transaction_Flow_Alarm(alramInsertionUtil ut,AC_Alarm aa) {
	AC_Transaction_Flow_Alarm b = new AC_Transaction_Flow_Alarm();
	b.setId(new AC_Transaction_Flow_AlarmPK(aa.getAlarm_Id(), Long.valueOf(ut.getTransaction_key())));
	b.setAcct_Key(new BigDecimal(ut.getPrimary_obj_key()));
	b.setDate_Key(Integer.parseInt(ut.getDate_key()));
	b.setTime_Key(Integer.parseInt(ut.getTime_key()));
	b.setTrans_Type_Key(new BigDecimal(ut.getTransaction_type_key()));
	b.setCntry_Key(Integer.parseInt(ut.getCountry_key()));
	b.setTrans_Status_Key(Integer.parseInt(ut.getTransaction_status_key()));
	b.setRemit_Ext_Cust_Key(new BigDecimal(ut.getRemitter_ext_party_key()));
	b.setBenef_Ext_Cust_Key(new BigDecimal(ut.getBeneficiary_ext_party_key()));
//	b.setPost_Date_Key(Integer.parseInt(ut.getPosted_date_key()));
	b.setEmp_Key(new BigDecimal(ut.getAssociate_key()));
	b.setExec_Cust_Key(Integer.parseInt(ut.getExecuting_party_key()));
	b.setCcy_Amt(new BigDecimal(ut.getCurrency_amount()));
	b.setCcy_Amt_In_Trans_Ccy(new BigDecimal(ut.getCurrency_amount_in_txn_ccy()));
	b.setCcy_Amt_In_Acct_Ccy(new BigDecimal(ut.getCurrency_amount_in_account_ccy()));
	b.setTrans_Ccy_Key(Integer.parseInt(ut.getTransaction_key()));
	b.setBranch_Key(new BigDecimal(ut.getBranch_key()));
	b.setSec_Acct_Key(new BigDecimal(ut.getSecondary_account_key()));
	b.setRelate_Ind(ut.getRelated_ind());
	b.setTrig_Ind(ut.getTrigger_ind());
	b.setThird_Cust_Ind(ut.getThird_party_ind());

	ac_Transaction_Flow_AlarmRepository.save(b);

}
public void saveAC_Transaction_Flow_Alarm(AlarmDTO a,AC_Alarm aa) {
	AC_Transaction_Flow_Alarm ac=new AC_Transaction_Flow_Alarm();
    ac.setAcct_Key(new BigDecimal(a.getAcct_Key()));
	ac.setBenef_Ext_Cust_Key(new BigDecimal(a.getBenef_Ext_Cust_Key()));
	ac.setBranch_Key(new BigDecimal(a.getBranch_Key()));
	ac.setCcy_Amt(new BigDecimal(a.getCcy_Amt()));
	ac.setCcy_Amt_In_Acct_Ccy(new BigDecimal(a.getCcy_Amnt_In_Acct_Ccy()));
	ac.setCcy_Amt_In_Trans_Ccy(new BigDecimal(a.getCcy_Amnt_In_Trans_Ccy()));
	ac.setCntry_Key(Integer.valueOf(a.getCntry_Key()));
	ac.setDate_Key(Integer.valueOf(a.getDate_Key()));
	ac.setEmp_Key(new BigDecimal(a.getEmp_Key()));
	ac.setExec_Cust_Key(Long.valueOf(a.getExec_Cust_Key()));
	ac.setId(new AC_Transaction_Flow_AlarmPK(aa.getAlarm_Id(),Long.valueOf(a.getTrans_Key())));
	ac.setPost_Date_Key(Integer.valueOf(a.getPost_Date_Key()));
	ac.setRelate_Ind(a.getRelate_Ind());
	ac.setRemit_Ext_Cust_Key(new BigDecimal(a.getRemit_Ext_Cust_Key()));
	ac.setSec_Acct_Key(new BigDecimal(a.getSec_Acct_Key()));
	ac.setThird_Cust_Ind(a.getThird_Cust_Ind());
	ac.setTime_Key(Integer.valueOf(a.getTime_Key()));
	ac.setTrans_Ccy_Key(Integer.valueOf(a.getTrans_Curr_Key()));
	ac.setTrans_Status_Key(Integer.valueOf(a.getTrans_Status_Key()));
	ac.setTrans_Type_Key(new BigDecimal(a.getTrans_Type_Key()));
    this.ac_Transaction_Flow_AlarmRepository.save(ac);
}

}
