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
import com.datagearbi.agp.repository.LargeNumberAuthorizationsConductBusinessRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.LargeNumberAuthorizationsConductBusiness;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.service.AlarmGeneration;

@Service
public class AML0020Service {
	@Autowired
	private LargeNumberAuthorizationsConductBusinessRepository largeNumberAuthorizationsConductBusinessRepository;
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
		List<AcRoutineHelper> routine_detail = this.getRoutine_20_Parameters();

		List<LargeNumberAuthorizationsConductBusiness> records = this.largeNumberAuthorizationsConductBusinessRepository
				.findAll();
		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();
		System.out.println(records.size() + " records in AML0016Service");
		records.forEach(res -> {

			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(res.getCust_Type_Desc());
			temp.setCust_No(res.getCust_No());
			temp.setCust_Name(res.getCust_Name());
			temp.setAcct_No(res.getAcct_No());
			temp.setAcct_Key(String.valueOf(res.getAcct_key()));
			temp.setAcct_Name(res.getAcct_Name());
			temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
			temp.setAcct_Emp_Ind(res.getAcct_Emp_Ind());
			temp.setPolitical_Exp_Prsn_Ind(res.getPolitical_Exp_Prsn_Ind());

			temp.setCust_Key(String.valueOf(res.getCust_Key()));
			temp.setPolitical_Exp_Prsn_Ind(res.getPolitical_Exp_Prsn_Ind());
			temp.setCust_Ident_type_Desc(res.getCust_Ident_Type_Desc());
			temp.setEmpr_Name(res.getEmpr_Name());
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

	public List<AcRoutineHelper> getRoutine_20_Parameters() {
		List<AcRoutineHelper> routine_detail = this.ac_RoutineRepository.getRoutineDetail("AML020");
		System.out.println(routine_detail.size() + "routine_detail");
		return routine_detail;

	}

	public Map<String, List<AlarmDTO>> generateaAlarms() {
		List<AlarmDTO> alarms = this.getAllRecordsFromView();
		Map<String, List<AlarmDTO>> alarmByCustomers = alarms.stream()
				.collect(Collectors.groupingBy(AlarmDTO::getAcct_Key));
		int AuthorizationNumber=this.getm020_number();
		alarmByCustomers.forEach((a, b) -> {
//
		if(AuthorizationNumber<=b.size())
		{
			
		
			String actual_values_text = "Account (" + a + ") has " + b.size() + " authorizations to conduct business";
			System.out.println(actual_values_text);
			//

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
			alramInsertionUtil.setPrimary_obj_level_code("ACC");
			alramInsertionUtil.setAlarmed_obj_number(b.get(0).getAcct_No());
			alramInsertionUtil.setAlarmed_obj_name(b.get(0).getAcct_Name());
			alramInsertionUtil.setPrimary_obj_number(b.get(0).getCust_No());
			alramInsertionUtil.setPrimary_obj_key(b.get(0).getCust_Key());
			alramInsertionUtil.setPrimary_obj_name(b.get(0).getCust_Name());
			alramInsertionUtil.setRoutine_id(b.get(0).getRoutine_Id());
			alramInsertionUtil.setRoutine_name(b.get(0).getRoutine_Name());
			alramInsertionUtil.setSuppression_end_date(StDate);
			alramInsertionUtil.setActual_values_text(actual_values_text);

			alramInsertionUtil.setRun_date(today);
			alramInsertionUtil.setCreate_date(today);
			alramInsertionUtil.setCreate_user_id("1");
			alramInsertionUtil.setEmployee_ind(b.get(0).getAcct_Emp_Ind());
			alramInsertionUtil.setVersion_number("1");
			alramInsertionUtil.setLogical_delete_ind("N");
			alramInsertionUtil.setAlarm_type_cd("AML");

			alramInsertionUtil.setAlarm_category_cd("Unexpected events");
			alramInsertionUtil.setAlarm_subcategory_cd(b.get(0).getAlarm_Subcateg_Cd());
			alramInsertionUtil.setAlarmed_obj_key(b.get(0).getAcct_Key());
			alramInsertionUtil.setAlarmed_obj_level_code("ACC");
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
			alramInsertionUtil.setPep_ind(b.get(0).getPolitical_Exp_Prsn_Ind());

			AC_Alarm alarm = this.alarmGeneration.saveAlarm(alramInsertionUtil);
			if (alarm != null) {

				this.alarmGeneration.saveAlarmEvent(alramInsertionUtil, alarm);

				this.alarmGeneration.saveSuspect(alramInsertionUtil);

			}
//

		}});

		return alarmByCustomers;

	}

	public Long getActiveAlarmsCounts(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		// TODO Auto-generated method stub
		return this.alaramObjectRepository.getActiveAlarmsCounts(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
	}

	public Long getTransactions_cnt(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		Long Transactions_cnt = this.suspectedObjectRepository.getTransactions_cntForActiveAlarms(alarmed_Obj_Level_Cd,
				alarmed_Obj_Key);
		System.out.println(
				"getTransactions_cnt for (" + alarmed_Obj_Level_Cd + "," + alarmed_Obj_Key + ")=" + Transactions_cnt);
		return Transactions_cnt;

	}

	private int getm020_number() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m020_number");

		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			return Integer.parseInt(values.get(0));
		}
		return 4;
	}

	public Long getAggregate_amt(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		Long Aggregate_amt = this.suspectedObjectRepository.getAggregate_amtForActiveAlarms(alarmed_Obj_Level_Cd,
				alarmed_Obj_Key);
		System.out.println(
				"getAggregate_amt for (" + alarmed_Obj_Level_Cd + "," + alarmed_Obj_Key + ")=" + Aggregate_amt);
		return Aggregate_amt;

	}

	private Long getAuthorizationNumber(int acct_key) {
		return this.largeNumberAuthorizationsConductBusinessRepository.getAuthorizationNumber(acct_key);
	}
}
