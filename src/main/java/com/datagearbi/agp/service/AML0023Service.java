package com.datagearbi.agp.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.*;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.DGAML023_Payments_PEP;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.service.AlarmGeneration;

@Service
public class AML0023Service {

	@Autowired
	private DGAML023_Payments_PEPRepository paymentsByPEPRepository  ;
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;
	@Autowired
	Routine_ParameterRepository routine_ParameterRepository;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;
	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	@Autowired
	private AlarmGeneration alarmGeneration;
	
	
	public List<AlarmDTO> getAllRecordsFromView() {
	 
		List<AcRoutineHelper> routine_detail = this.getRoutine_23_Parameters();
		List<String> cdiCodes = this.getm0023_cdi_code();

		List<String> pepInd = this.getM0023_pep_ind();

		List<DGAML023_Payments_PEP> records = this.paymentsByPEPRepository.findAll();
		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();

		records.forEach(res -> {
			if (cdiCodes.contains(res.getTrans_Cr_Db_Ind_Cd()) && pepInd.contains(res.getPolitical_Exp_Prsn_Ind())) {

				AlarmDTO temp = new AlarmDTO();
				temp.setCust_Type_Desc(res.getCust_Type_Desc());
				temp.setCust_No(res.getCust_No());
				temp.setCust_Name(res.getCust_Name());
//				temp.setAcct_No(res.getAcct_No());
				temp.setAcct_Key(String.valueOf(res.getAcct_Key()));

				temp.setAcct_Name(res.getAcct_Name());
				temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
//				temp.setAcct_Emp_Ind(res.getAcct_Emp_Ind());
				temp.setCust_Emp_Ind(res.getCust_Emp_Ind());
				temp.setCust_Key(String.valueOf(res.getCust_Key()));
				
				// setting the pep to temp
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

				temp.setTotal_amount(getTotalAmountOfPepCustomer(res.getCust_Key()));
				
				// setting the cdi to temp
				temp.setCredit_Ind(res.getTrans_Cr_Db_Ind_Cd());
				temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(res.getCcy_Amt_In_Trans_Ccy()));
				temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(res.getCcy_Amt_In_Acct_Ccy()));
				temp.setSec_Acct_Key(String.valueOf(res.getSec_Acct_Key()));
				temp.setRelate_Ind(String.valueOf(res.getRelate_Ind()));
				temp.setThird_Cust_Ind(res.getThird_Cust_Ind());

				if (routine_detail.size() > 0) {
					temp.setRoutine_Id(String.valueOf(routine_detail.get(0).getRoutine_Id()));
					temp.setRoutine_Name(routine_detail.get(0).getRoutine_Name());
					temp.setAlarm_Categ_Cd(routine_detail.get(0).getAlarm_Categ_Cd());
					temp.setAlarm_Subcateg_Cd(routine_detail.get(0).getAlarm_Subcateg_Cd());
					temp.setRoutine_Short_Desc(routine_detail.get(0).getRoutine_Short_Desc());
					temp.setRoutine_Msg_Txt(routine_detail.get(0).getRoutine_Msg_Txt());
				}
				listOfSC.add(temp);
			}
		});

		return listOfSC;
	}

	public List<String> getM0023_pep_ind() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m023_pep_ind");
		if(values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)){
			String [] pepInd = values.get(0).split(",") ; 
			return Arrays.asList(pepInd).stream().map((z) -> z.trim()).collect(Collectors.toList());
		}
		List<String> default_pep_ind = new ArrayList<String>() ; 
		default_pep_ind.add("Y") ; 
		return default_pep_ind;
	}

	public List<String> getm0023_cdi_code() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m023_cdi_code");
		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			String[] cdiCodes = values.get(0).split(",");
			return Arrays.asList(cdiCodes).stream().map((z) -> z.trim()).collect(Collectors.toList());
		}
		List<String> defaultCdiCodes = new ArrayList<String>();
		defaultCdiCodes.add("C");
		return defaultCdiCodes;
	}
	
//	
//	private String getM0023_num_days() {
//		String value = this.routine_ParameterRepository.getParamValueByTheParamName("m023_num_days");
//		if (value != null) 
//			return value ; 
//
//		String default_num_days = "1" ; 
//		return default_num_days;
//	}

//	private Long getM0023_amount() {
//		Long value = Long.valueOf(this.routine_ParameterRepository.getParamValueByTheParamName("m023_amount"));
//		if (value != null) 
//			return value ; 
//
//		Long default_pep_ind = (long) 100  ; 
//		return default_pep_ind;
//	}
	
	public List<AcRoutineHelper> getRoutine_23_Parameters() {
		List<AcRoutineHelper> routine_detail = this.ac_RoutineRepository.getRoutineDetail("AML0023");
		System.out.println(routine_detail.size() + "routine_detail");
		return routine_detail;
	}
	
	public String getTotalAmountOfPepCustomer(int customerKey) {
		
		Long totalAmount = this.paymentsByPEPRepository.CalculateTransactionTotalAmountOfPepCustomer(customerKey);
		System.out.println("totalamount:" + totalAmount);
		String result = String.valueOf(totalAmount) != null ? String.valueOf(totalAmount) : "0";
		return result;
	}
	
	
	
	public void generateaAlarms() {
	
		List<AlarmDTO> alarms = this.getAllRecordsFromView();
		Map<String, List<AlarmDTO>> alarmByCustomers = alarms.stream().collect(Collectors.groupingBy(AlarmDTO::getCust_Key));
		System.out.println("number of customers " + alarmByCustomers.size());
		System.out.println("alarms by customers " + alarmByCustomers.toString());
		
		
		Long totalAmountOfPerCustomer ; 
		for (int i = 0 ; i < alarms.size() ; i++){
			totalAmountOfPerCustomer = Long.valueOf(this.getTotalAmountOfPepCustomer(i)) ;
			System.out.println("the total amount of customer is" +  totalAmountOfPerCustomer);
			
			
//			if (totalAmountOfPerCustomer > this.getM0023_amount()) {
				alramInsertionUtil alramInsertionUtil = new alramInsertionUtil();
				java.text.DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date dateobj = new Date();
				String StDate = df.format(dateobj);
				LocalDate today = LocalDate.now();
				alramInsertionUtil.setProduct_type("AML");
				alramInsertionUtil.setAlarm_status_code("ACT");
				alramInsertionUtil.setAlarm_description(alarms.get(0).getRoutine_Short_Desc());
				alramInsertionUtil.setPrimary_obj_level_code("PTY");
				alramInsertionUtil.setAlarmed_obj_number(alarms.get(0).getCust_No());
				alramInsertionUtil.setAlarmed_obj_name("PTY");
				alramInsertionUtil.setPrimary_obj_number(alarms.get(0).getCust_No());
				alramInsertionUtil.setPrimary_obj_key(Integer.parseInt(alarms.get(0).getCust_Key()));
				alramInsertionUtil.setPrimary_obj_name(alarms.get(0).getCust_Name());
				alramInsertionUtil.setRoutine_id(alarms.get(0).getRoutine_Id());
				alramInsertionUtil.setRoutine_name(alarms.get(0).getRoutine_Name());
				alramInsertionUtil.setSuppression_end_date(StDate);
				alramInsertionUtil.setActual_values_text(String.valueOf(totalAmountOfPerCustomer));
				
				alramInsertionUtil.setRun_date(today);
				alramInsertionUtil.setCreate_date(today);
				alramInsertionUtil.setCreate_user_id("1");
				alramInsertionUtil.setEmployee_ind(alarms.get(0).getAcct_Emp_Ind());
				alramInsertionUtil.setVersion_number("1");
				alramInsertionUtil.setLogical_delete_ind("N");
				alramInsertionUtil.setAlarm_type_cd("AML");

				alramInsertionUtil.setAlarm_category_cd("Cash payments ");
				alramInsertionUtil.setAlarm_subcategory_cd(alarms.get(0).getAlarm_Subcateg_Cd());
				alramInsertionUtil.setAlarmed_obj_key(alarms.get(0).getAcct_Key());
				alramInsertionUtil.setAlarmed_obj_level_code("PTY");
				long alarmed_Obj_Key = Long.parseLong(alramInsertionUtil.getAlarmed_obj_key());
				String alarmed_Obj_Level_Cd = alramInsertionUtil.getAlarmed_obj_level_code();
				
				Long alert_count = this.getActiveAlarmsCounts(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
				alramInsertionUtil.setAlert_count(String.valueOf(alert_count));
				alramInsertionUtil.setTransactions_count(
						String.valueOf(this.getTransactions_cnt(alarmed_Obj_Level_Cd, alarmed_Obj_Key)));
				String Total_amount = getAggregate_amt(alarmed_Obj_Level_Cd, alarmed_Obj_Key) != null
						? String.valueOf(getAggregate_amt(alarmed_Obj_Level_Cd, alarmed_Obj_Key))
						: "0";
				alramInsertionUtil.setTotal_amount(Total_amount);
				System.out.println(alramInsertionUtil.getTotal_amount());
				alramInsertionUtil.setOldest_alert("7");
				alramInsertionUtil.setRisk_classification_code("1");
				alramInsertionUtil.setMoney_laundering_risk_score("1");
				alramInsertionUtil.setPep_ind(alarms.get(0).getPolitical_Exp_Prsn_Ind());

				
				AC_Alarm alarm = this.alarmGeneration.saveAlarm(alramInsertionUtil);
				if (alarm != null) {

					this.alarmGeneration.saveAlarmEvent(alramInsertionUtil, alarm);

					this.alarmGeneration.saveSuspect(alramInsertionUtil);
					for (AlarmDTO d : alarms) {
						this.alarmGeneration.saveAC_Transaction_Flow_Alarm(d, alarm);

					}
				}
			}
		}
	
	
	public Long getActiveAlarmsCounts(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		
		return this.alaramObjectRepository.getActiveAlarmsCounts(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
	}

	public Long getTransactions_cnt(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		Long Transactions_cnt = this.suspectedObjectRepository.getTransactions_cntForActiveAlarms(alarmed_Obj_Level_Cd,
				alarmed_Obj_Key);
		System.out.println(
				"getTransactions_cnt for (" + alarmed_Obj_Level_Cd + "," + alarmed_Obj_Key + ")=" + Transactions_cnt);
		return Transactions_cnt;

	}

	public Long getAggregate_amt(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		Long Aggregate_amt = this.suspectedObjectRepository.getAggregate_amtForActiveAlarms(alarmed_Obj_Level_Cd,
				alarmed_Obj_Key);
		System.out.println(
				"getAggregate_amt for (" + alarmed_Obj_Level_Cd + "," + alarmed_Obj_Key + ")=" + Aggregate_amt);
		return Aggregate_amt;

	}

	public String getPepName(int customerKey) {
		
		return this.paymentsByPEPRepository.getPepName(customerKey);
	}
	
}


