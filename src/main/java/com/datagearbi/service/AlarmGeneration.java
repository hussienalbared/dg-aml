package com.datagearbi.service;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		
		AC_Alarm acc = new AC_Alarm();
//		System.out.println(acc+"amr");
//		System.out.println(alaramObjectRepository+"husien");
//		System.out.println(ut.getProduct_type()+ut.getAlarm_status_code()+"55555");
		// + "( product_type,alarm_status_code,money_laundering_risk_score"
		// + ",alarm_description,primary_obj_level_code"
		// + ",alarmed_obj_number ,alarmed_obj_name,primary_obj_number,primary_obj_key"
		// + ",primary_obj_name,routine_id,routine_name,suppression_end_date"
		// + ",actual_values_text,run_date,create_date,create_user_id,employee_ind"
		// + ",version_number,logical_delete_ind,alarm_type_cd,alarm_category_cd"
		// + ",alarm_subcategory_cd,alarmed_obj_key,alarmed_obj_level_code) "
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
//		acc.setAlarm_Id(99);
		AC_Alarm aa = alaramObjectRepository.save(acc);
		String event_code = "CRE";
		AC_Alarm_Event ac = new AC_Alarm_Event();
		ac.setCreate_Date(ut.getCreate_date());
		ac.setCreate_User_Id(ut.getCreate_user_id());
		ac.setAlarm_Id(aa.getAlarm_Id());
		ac.setEvent_Desc(ut.getAlarm_description());
		ac.setEvent_Type_Cd(event_code);
		// "INSERT INTO AML.AC_SUSPECTED_OBJS "
		// + "(obj_level_code,obj_key,obj_number,obj_name,alert_count"
		// + ",transactions_count,total_amount,oldest_alert"
		// + ",risk_classification_code,money_laundering_score,employee_ind"
		// + ",compliance_userid,pep_ind,created_on) "
		acAlarmEventRepository.save(ac);
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

		/*
		 * "INSERT INTO AML.AC_CASH_FLOW_ALARM " +
		 * "(alarm_id,transaction_key,account_key,date_key,time_key,transaction_type_key"
		 * +
		 * ",country_key,transaction_status_key,remitter_ext_party_key,beneficiary_ext_party_key"
		 * +
		 * ",posted_date_key,associate_key,executing_party_key,executing_ext_party_key"
		 * +
		 * ",currency_amount,currency_amount_in_txn_ccy,currency_amount_in_account_ccy"
		 * + ",transaction_currency_key,branch_key,secondary_account_key,related_ind" +
		 * ",trigger_ind,third_party_ind)"
		 */
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
//		b.setPost_Date_Key(Integer.parseInt(ut.getPosted_date_key()));
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

}
