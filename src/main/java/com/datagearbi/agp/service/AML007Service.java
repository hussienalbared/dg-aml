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
import com.datagearbi.agp.repository.Early_termination_of_LoansRepository;
import com.datagearbi.agp.repository.Installments_paid_in_cashRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.Early_termination_of_Loans;
import com.datagearbi.model.Installments_paid_in_cash;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.service.AlarmGeneration;

@Service
public class AML007Service {
	@Autowired
	private Early_termination_of_LoansRepository early_termination_of_LoansRepository;
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
		List<AcRoutineHelper> routine_detail = this.getRoutine_7_Parameters();

		List<String> AccountTypes = this.getM007account_type();
		Integer AmtSingleLoanParameter = this.getm007_amt_single_loan();
		List<Early_termination_of_Loans> records = this.early_termination_of_LoansRepository.findAll();
		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();

		records.forEach(res -> {
			if (AccountTypes.contains(res.getAcct_Type_Desc())
					&& AmtSingleLoanParameter<=res.getOrig_Loan_Amt()
					&&res.getPercentageCloseAcct()<this.getm007_percentage()) {
				AlarmDTO temp = new AlarmDTO();
				temp.setCust_Type_Desc(res.getCust_Type_Desc());
				temp.setCust_No(res.getCust_No());
				temp.setCust_Name(res.getCust_Name());
				temp.setAcct_No(res.getAcct_No());
				temp.setAcct_Key(String.valueOf(res.getAcct_Key()));

				temp.setAcct_Name(res.getAcct_Name());
				temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
				temp.setAcct_Emp_Ind(res.getEmp_ind());
				temp.setCust_Emp_Ind(res.getCust_Emp_Ind());
				temp.setCust_Key(String.valueOf(res.getCust_Key()));
				temp.setPolitical_Exp_Prsn_Ind(res.getPolitical_Exp_Prsn_Ind());
				temp.setOrig_Loan_Amt(String.valueOf(res.getOrig_Loan_Amt()));
				temp.setAcct_Close_Date(String.valueOf(res.getAcct_Close_Date()));
				temp.setAcct_Open_Date(String.valueOf(res.getAcct_Open_Date()));
				temp.setMaturity_Date(String.valueOf(res.getMaturity_Date()));
//				temp.setTotal_amount(getTotalAmount(res.getAcct_Key()));
				temp.setPercentageCloseAcct(String.valueOf(res.getPercentageCloseAcct()));

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

	private List<AcRoutineHelper> getRoutine_7_Parameters() {
		List<AcRoutineHelper> routine_detail = this.ac_RoutineRepository.getRoutineDetail("AML007");
		System.out.println(routine_detail.size() + "routine_detail");
		return routine_detail;

	}

	private List<String> getM007account_type() {
		// TODO Auto-generated method stub
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m007_account_type");

		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			String[] accounttypes = values.get(0).split(",");
			return Arrays.asList(accounttypes).stream().map((z) -> z.trim()).collect(Collectors.toList());

		}
		List<String> defaultAccountTypes = new ArrayList<String>();
		defaultAccountTypes.add("P");
		defaultAccountTypes.add("C");
		return defaultAccountTypes;
	}

	private Long getm007_total_amount() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m007_total_amount");
		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			return Long.valueOf(values.get(0));
		}
		return (long) 50000;
	}

	private Integer getm007_amt_single_loan() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m007_amt_single_loan");
		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			return Integer.valueOf(values.get(0));
		}
		return 5000;
	}

	private long getm007_percentage() {

		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m007_percentage");
		long number = 25;
		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			values.get(0).replaceAll("[^\\d]", "");
			try {
				return Long.valueOf(values.get(0));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		return number;

	}

	public void generateaAlarms() {
		List<AlarmDTO> alarms = this.getAllRecordsFromView();
		Map<String, List<AlarmDTO>> alarmByCustomers = alarms.stream()
				.collect(Collectors.groupingBy(AlarmDTO::getCust_Key));
		System.out.println("number of customers " + alarmByCustomers.size());
		alarmByCustomers.forEach((a, b) -> {

//			String actual_values_text = percentage + " %  Percentage of total installments are paid in cash";
//			System.out.println(actual_values_text);
			//
		long totalAmount=this.calculateTotalAmountOfAllTerminatedLoans(Integer.valueOf(a));
		long totalAmountParamter=this.getm007_total_amount();
		if(totalAmount>=totalAmountParamter) {
			
		
			System.out.println("*********8");

			System.out.println("alarm genertead");

			alramInsertionUtil alramInsertionUtil = new alramInsertionUtil();
			// insert to alarm table
			java.text.DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date dateobj = new Date();
			String StDate = df.format(dateobj);
			LocalDate today = LocalDate.now();
			alramInsertionUtil.setProduct_type("AML");
			alramInsertionUtil.setAlarm_status_code("ACT");
			alramInsertionUtil.setAlarm_description(b.get(0).getRoutine_Short_Desc());
			alramInsertionUtil.setPrimary_obj_level_code("PTY");
			alramInsertionUtil.setAlarmed_obj_number(b.get(0).getCust_No());
			alramInsertionUtil.setAlarmed_obj_name("PTY");
			alramInsertionUtil.setPrimary_obj_number(b.get(0).getCust_No());
			alramInsertionUtil.setPrimary_obj_key(b.get(0).getCust_Key());
			alramInsertionUtil.setPrimary_obj_name(b.get(0).getCust_Name());
			alramInsertionUtil.setRoutine_id(b.get(0).getRoutine_Id());
			alramInsertionUtil.setRoutine_name(b.get(0).getRoutine_Name());
			alramInsertionUtil.setSuppression_end_date(StDate);
//				alramInsertionUtil.setActual_values_text(actual_values_text);

			alramInsertionUtil.setRun_date(today);
			alramInsertionUtil.setCreate_date(today);
			alramInsertionUtil.setCreate_user_id("1");
			alramInsertionUtil.setEmployee_ind(b.get(0).getAcct_Emp_Ind());
			alramInsertionUtil.setVersion_number("1");
			alramInsertionUtil.setLogical_delete_ind("N");
			alramInsertionUtil.setAlarm_type_cd("AML");

			alramInsertionUtil.setAlarm_category_cd("Cash payments ");
			alramInsertionUtil.setAlarm_subcategory_cd(b.get(0).getAlarm_Subcateg_Cd());
			alramInsertionUtil.setAlarmed_obj_key(b.get(0).getAcct_Key());
			alramInsertionUtil.setAlarmed_obj_level_code("PTY");
			long alarmed_Obj_Key = Long.parseLong(alramInsertionUtil.getAlarmed_obj_key());
			String alarmed_Obj_Level_Cd = alramInsertionUtil.getAlarmed_obj_level_code();

////				Long alert_count = this.getActiveAlarmsCounts(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
//				alramInsertionUtil.setAlert_count(String.valueOf(alert_count));
//				alramInsertionUtil.setTransactions_count(
//						String.valueOf(this.getTransactions_cnt(alarmed_Obj_Level_Cd, alarmed_Obj_Key)));
//				String Total_amount = getAggregate_amt(alarmed_Obj_Level_Cd, alarmed_Obj_Key) != null
//						? String.valueOf(getAggregate_amt(alarmed_Obj_Level_Cd, alarmed_Obj_Key))
//						: "0";
//				alramInsertionUtil.setTotal_amount(Total_amount);
			System.out.println(alramInsertionUtil.getTotal_amount());
			alramInsertionUtil.setOldest_alert("7");
			alramInsertionUtil.setRisk_classification_code("1");
			alramInsertionUtil.setMoney_laundering_risk_score("1");
			alramInsertionUtil.setPep_ind(b.get(0).getPolitical_Exp_Prsn_Ind());

			AC_Alarm alarm = this.alarmGeneration.saveAlarm(alramInsertionUtil);
			if (alarm != null) {

				this.alarmGeneration.saveAlarmEvent(alramInsertionUtil, alarm);

				this.alarmGeneration.saveSuspect(alramInsertionUtil);

//
			}
			}
		});

	}

	private long calculateTotalAmountOfAllTerminatedLoans(int customerKey) {
		long sum = 0;
		sum=this.early_termination_of_LoansRepository.getTotalAmountOfAllTerminatedLoans(customerKey);
//		for (int i = 0; i < alarmDTOs.size(); i++) {
//			sum += Long.valueOf(alarmDTOs.get(i).getOrig_Loan_Amt());
//		}
		return sum;
	}
	
}
