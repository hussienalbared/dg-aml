package com.datagearbi.agp.service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.Install_paid_exceed_limit_UP_Repository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.Install_paid_exceed_limit_UP;
import com.datagearbi.repository.AlaramObjectRepository;

@Service
public class Install_paid_exceed_limit_UP_Service {
	@Autowired
	private Install_paid_exceed_limit_UP_Repository install_paid_exceed_limit_UP_Repository;
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;
	@Autowired
	Routine_ParameterRepository routine_ParameterRepository;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;

	public List<AlarmDTO> getAllRecords() {
		List<AcRoutineHelper> routine_detail = this.getRoutine_3_Parameters();
		List<Install_paid_exceed_limit_UP> records = this.install_paid_exceed_limit_UP_Repository.findAll();
		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();

		records.forEach(res -> {
			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(res.getCust_Type_Desc());
			temp.setCust_No(res.getCust_No());
			temp.setCust_Name(res.getCust_Name());
			temp.setAcct_No(res.getAcct_No());
			temp.setAcct_Key(String.valueOf(res.getAcct_Key()));

			temp.setAcct_Name(res.getAcct_Name());
			temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
			temp.setAcct_Emp_Ind(res.getAcct_Emp_Ind());
			temp.setCust_Emp_Ind(res.getCust_Emp_Ind());
			temp.setCust_Key(String.valueOf(res.getCust_Key()));
			temp.setPolitical_Exp_Prsn_Ind(res.getPolitical_Exp_Prsn_Ind());
			temp.setTrans_Key(String.valueOf(res.getTrans_Key()));

			temp.setDate_Key(String.valueOf(res.getDate_Key()));
			temp.setTime_Key(String.valueOf(res.getTime_Key()));
			temp.setTrans_Type_Key(String.valueOf(res.getTrans_Type_Key()));
			temp.setCntry_Key(String.valueOf(res.getCntry_Key()));
			temp.setTrans_Status_Key(String.valueOf(res.getTrans_Status_Key()));
			temp.setBranch_Key(String.valueOf(res.getBranch_Key()));
			temp.setRemit_Ext_Cust_Key(String.valueOf(res.getRemit_Ext_Cust_Key()));
			temp.setBenef_Ext_Cust_Key(String.valueOf(res.getBenef_Ext_Cust_Key()));
			temp.setTrans_Curr_Key(String.valueOf(res.getTrans_Ccy_Key()));
			temp.setPost_Date_Key(String.valueOf(res.getPost_Date_Key()));
			temp.setEmp_Key(String.valueOf(res.getEmp_Key()));
			temp.setExec_Cust_Key(String.valueOf(res.getExec_Cust_Key()));
			temp.setCcy_Amt(String.valueOf(res.getCcy_Amt()));

			temp.setTransactions_count(getTransactionCount(res.getAcct_Key()));
			temp.setTotal_amount(getTotalAmount(res.getAcct_Key()));
			temp.setNum_inst(getInstallmentNumber(res.getAcct_Key()));

			temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(res.getCcy_Amt_In_Trans_Ccy()));
			temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(res.getCcy_Amt_In_Acct_Ccy()));
			temp.setSec_Acct_Key(String.valueOf(res.getSec_Acct_Key()));
			temp.setRelate_Ind(String.valueOf(res.getRelate_Ind()));
			temp.setThird_Cust_Ind(res.getThird_Cust_Ind());

			temp.setInst_Amt(String.valueOf(res.getInst_Amt()));
			if (routine_detail.size() > 0) {
				temp.setRoutine_Id(String.valueOf(routine_detail.get(0).getRoutine_Id()));
				temp.setRoutine_Name(routine_detail.get(0).getRoutine_Name());
				temp.setAlarm_Categ_Cd(routine_detail.get(0).getAlarm_Categ_Cd());
				temp.setAlarm_Subcateg_Cd(routine_detail.get(0).getAlarm_Subcateg_Cd());
				temp.setRoutine_Short_Desc(routine_detail.get(0).getRoutine_Short_Desc());
				temp.setRoutine_Msg_Txt(routine_detail.get(0).getRoutine_Msg_Txt());
			}
			listOfSC.add(temp);
		});

		return listOfSC;
	}

	public List<AcRoutineHelper> getRoutine_3_Parameters() {
		List<AcRoutineHelper> routine_detail = this.ac_RoutineRepository.getRoutineDetail("AML003");
		return routine_detail;

	}

	public String getTotalAmount(int accountKey) {
		Double totalAmount = this.install_paid_exceed_limit_UP_Repository.CalculateTransactionTotalAmount(accountKey);
		String result = String.valueOf(totalAmount);
		return result;

	}

	public String getTransactionCount(int accountKey) {
		Integer TransactionCount = this.install_paid_exceed_limit_UP_Repository.CalculateTransactionsCount(accountKey);
		String result = String.valueOf(TransactionCount);
		return result;
	}

	public String getInstallmentNumber(int accountKey) {
		Double InstallmentNumber = this.install_paid_exceed_limit_UP_Repository.CalculateInstallmentNumber(accountKey);
		String result = String.valueOf(InstallmentNumber);
		return result;
	}

	public Map<String, List<AlarmDTO>> test() {
		List<AlarmDTO> alarms = this.getAllRecords();
		Map<String, List<AlarmDTO>> alarmDtos = alarms.stream().collect(Collectors.groupingBy(AlarmDTO::getAcct_Key));
		alarmDtos.forEach((a, b) -> {
			alramInsertionUtil alramInsertionUtil = new alramInsertionUtil();
			//insert to alarm table
			String actual_values_text = "Paid amount " + b.get(0).getTotal_amount() + " exceeds Installment "
					+ " amount " + b.get(0).getInst_Amt();
			alramInsertionUtil.setAlarm_status_code("ACT");
			alramInsertionUtil.setAlarm_description(b.get(0).getRoutine_Short_Desc());
			alramInsertionUtil.setPrimary_obj_level_code("ACC");
			alramInsertionUtil.setAlarmed_obj_number(b.get(0).getAcct_No());
			alramInsertionUtil.setAlarmed_obj_name("PTY");
			alramInsertionUtil.setPrimary_obj_number(b.get(0).getAcct_No());
			alramInsertionUtil.setPrimary_obj_key("");
			alramInsertionUtil.setPrimary_obj_name("");
			alramInsertionUtil.setRoutine_id(b.get(0).getRoutine_Id());
			alramInsertionUtil.setRoutine_name(b.get(0).getRoutine_Name());
			alramInsertionUtil.setSuppression_end_date("");
			alramInsertionUtil.setActual_values_text(actual_values_text);
			// alramInsertionUtil.setRun_date("");
			// alramInsertionUtil.setCreate_date(create_date);
			alramInsertionUtil.setCreate_user_id("1");
			alramInsertionUtil.setEmployee_ind(b.get(0).getAcct_Emp_Ind());
			alramInsertionUtil.setVersion_number("1");
			alramInsertionUtil.setLogical_delete_ind("N");
			alramInsertionUtil.setAlarm_type_cd("AML");

			alramInsertionUtil.setAlarm_category_cd("Unexpected payments");
			alramInsertionUtil.setAlarm_subcategory_cd(b.get(0).getAlarm_Subcateg_Cd());
			alramInsertionUtil.setAlarmed_obj_key(b.get(0).getAcct_Key());
			alramInsertionUtil.setAlarmed_obj_level_code("PTY");
			long alarmed_Obj_Key=Long.parseLong(alramInsertionUtil.getAlarmed_obj_key());
			String alarmed_Obj_Level_Cd=alramInsertionUtil.getAlarmed_obj_level_code();
			//******
			Integer alert_count=this.getAlarmCount(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
			alramInsertionUtil.setAlert_count(String.valueOf(alert_count));
			alramInsertionUtil.setTransactions_count(String.valueOf(b.size()));
			alramInsertionUtil.setTotal_amount(b.get(0).getTotal_amount());
			
			
			
			
			
			

		});

		return alarmDtos;

	}

	private void addAlert(alramInsertionUtil ut) {
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

		AC_Alarm aa = alaramObjectRepository.save(acc);

	}
	private int getAlarmCount(String alarmed_Obj_Level_Cd,long alarmed_Obj_Key) {
		// TODO Auto-generated method stub
return this.alaramObjectRepository.getAlarmCount(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
	}

}
