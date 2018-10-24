package com.datagearbi.agp.service;

import java.text.DateFormat;
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
import com.datagearbi.agp.repository.InstallmentsPaidByOtherPartyRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.InstallmentsPaidByOtherParty;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.service.AlarmGeneration;

@Service
public class AML002Service2X {
	@Autowired
	private InstallmentsPaidByOtherPartyRepository installmentsPaidByOtherPartyRepository;
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
		List<AcRoutineHelper> routine_detail = this.getRoutine_2_Parameters();
		List<String> CreditInd = this.getm002_credit_ind();

		List<String> AccountTypes = this.getM002account_type();

		List<InstallmentsPaidByOtherParty> records = this.installmentsPaidByOtherPartyRepository.findAll();
		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();
		System.out.println(records.size() + "record size----");
		records.forEach(res -> {
			if (AccountTypes.contains(res.getAcct_Type_Desc().trim()) && CreditInd.contains(res.getCredit_Ind())) {

				AlarmDTO temp = new AlarmDTO();
				temp.setCust_Type_Desc(res.getCust_Type_Desc());
				temp.setCust_No(res.getCust_No());
				temp.setCust_Name(res.getCust_Name());
				temp.setAcct_No(res.getAcct_No());
				temp.setAcct_Key(String.valueOf(res.getAcct_Key()));

				temp.setAcct_Name(res.getAcct_Name());
				temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
				// temp.setAcct_Emp_Ind(res.getAcct_Emp_Ind());
				// temp.setCust_Emp_Ind(res.getCust_Emp_Ind());
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
				temp.setCredit_Ind(res.getCredit_Ind());
				temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(res.getCcy_Amt_In_Trans_Ccy()));
				temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(res.getCcy_Amt_In_Acct_Ccy()));
				temp.setSec_Acct_Key(String.valueOf(res.getSec_Acct_Key()));
				temp.setRelate_Ind(String.valueOf(res.getRelate_Ind()));
				temp.setThird_Cust_Ind(res.getThird_Cust_Ind());

				temp.setInst_Amt(String.valueOf(Math.round(res.getInst_Amt())));
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

	public List<AcRoutineHelper> getRoutine_2_Parameters() {
		List<AcRoutineHelper> routine_detail = this.ac_RoutineRepository.getRoutineDetail("AML002");
		return routine_detail;

	}

	public String getTotalAmount(int accountKey) {
		Long totalAmount = this.installmentsPaidByOtherPartyRepository.CalculateTransactionTotalAmount(accountKey);
		String result = String.valueOf(totalAmount);
		return result;

	}

	public String getTransactionCount(int accountKey) {
		Integer TransactionCount = this.installmentsPaidByOtherPartyRepository.CalculateTransactionsCount(accountKey);
		String result = String.valueOf(TransactionCount);
		return result;
	}

	public String getInstallmentNumber(int accountKey) {
		Long InstallmentNumber = this.installmentsPaidByOtherPartyRepository.CalculateInstallmentNumber(accountKey);
		String result = String.valueOf(InstallmentNumber);
		return result;
	}

	public Map<String, List<AlarmDTO>> generateaAlarms() {
		List<AlarmDTO> alarms = this.getAllRecordsFromView();
		Map<String, List<AlarmDTO>> alarmDtos = alarms.stream().collect(Collectors.groupingBy(AlarmDTO::getAcct_Key));
		System.out.println("number of accounts " + alarmDtos.size());
		alarmDtos.forEach((a, b) -> {
			System.out.println("***********************------------------*************8");
			boolean x = this.checkAggreateAmountOfInstallment(Integer.valueOf(a));
			boolean y = this.checkNumberOfInstallment(Integer.valueOf(a), Long.valueOf(b.get(0).getInst_Amt()));
			System.out.println("X "+x+"Y:"+y);
			if (x && y) {

				Long InstallmentAmount = Long.valueOf(b.get(0).getInst_Amt());
				System.out.println("InstallmentAmount " + InstallmentAmount);

				System.out.println("alarm genertead");
				System.out.println("InstallmentAmount:" + InstallmentAmount);
				alramInsertionUtil alramInsertionUtil = new alramInsertionUtil();
				// insert to alarm table
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date dateobj = new Date();
				String StDate = df.format(dateobj);
				String actual_values_text = this.generateAlertMessage(Integer.valueOf(a), b);
				alramInsertionUtil.setProduct_type("AML");
				alramInsertionUtil.setAlarm_status_code("ACT");
				alramInsertionUtil.setAlarm_description(b.get(0).getRoutine_Short_Desc());
				alramInsertionUtil.setPrimary_obj_level_code("ACC");
				alramInsertionUtil.setAlarmed_obj_number(b.get(0).getAcct_No());
				alramInsertionUtil.setAlarmed_obj_name("PTY");
				alramInsertionUtil.setPrimary_obj_number(b.get(0).getAcct_No());
				alramInsertionUtil.setPrimary_obj_key(b.get(0).getAcct_Key());
				alramInsertionUtil.setPrimary_obj_name(b.get(0).getAcct_Name());
				alramInsertionUtil.setRoutine_id(b.get(0).getRoutine_Id());
				alramInsertionUtil.setRoutine_name(b.get(0).getRoutine_Name());
				alramInsertionUtil.setSuppression_end_date(StDate);
				alramInsertionUtil.setActual_values_text(actual_values_text);
				LocalDate today = LocalDate.now();
				alramInsertionUtil.setRun_date(today);
				alramInsertionUtil.setCreate_date(today);
				alramInsertionUtil.setCreate_user_id("1");
				alramInsertionUtil.setEmployee_ind(b.get(0).getAcct_Emp_Ind());
				alramInsertionUtil.setVersion_number("1");
				alramInsertionUtil.setLogical_delete_ind("N");
				alramInsertionUtil.setAlarm_type_cd("AML");
				alramInsertionUtil.setAlarm_category_cd("Unexpected payments");
				alramInsertionUtil.setAlarm_subcategory_cd(b.get(0).getAlarm_Subcateg_Cd());
				alramInsertionUtil.setAlarmed_obj_key(b.get(0).getAcct_Key());
				alramInsertionUtil.setAlarmed_obj_level_code("PTY");
				long alarmed_Obj_Key = Long.parseLong(alramInsertionUtil.getAlarmed_obj_key());
				String alarmed_Obj_Level_Cd = alramInsertionUtil.getAlarmed_obj_level_code();
				System.out.println("alarmed_Obj_Key:" + alarmed_Obj_Key);

				System.out.println("alarmed_Obj_Level_Cd:" + alarmed_Obj_Level_Cd);
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

				 AC_Alarm alarm=this.alarmGeneration.saveAlarm(alramInsertionUtil);
				 if(alarm!=null) {
				
				 this.alarmGeneration.saveAlarmEvent(alramInsertionUtil, alarm);
				
				 this.alarmGeneration.saveSuspect(alramInsertionUtil);
				 for(AlarmDTO d:b)
				 {
				 this.alarmGeneration.saveAC_Transaction_Flow_Alarm(d, alarm);
				
				
				 }
				 }

			}
		});

		return alarmDtos;

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

	public Long getActiveAlarmsCounts(String alarmed_Obj_Level_Cd, long alarmed_Obj_Key) {
		// TODO Auto-generated method stub
		return this.alaramObjectRepository.getActiveAlarmsCounts(alarmed_Obj_Level_Cd, alarmed_Obj_Key);
	}

	public int getM003Percentage() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m003_percentage");
		System.out.println("values size:" + values.size());
		int number = 200;
		if (values.size() > 0) {
			String mystr = values.get(0).replaceAll("[^\\d]", "");
			number = Integer.parseInt(mystr);

		}

		return number;
	}

	public List<String> getM002account_type() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m002_account_type");

		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			String[] accounttypes = values.get(0).split(",");
			return Arrays.asList(accounttypes).stream().map((z) -> z.trim()).collect(Collectors.toList());

		}
		List<String> defaultAccountTypes = new ArrayList<String>();
		defaultAccountTypes.add("P");
		defaultAccountTypes.add("C");
		return defaultAccountTypes;
	}

	public List<String> getm002_credit_ind() {
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m002_cdi_code");

		if (values.size() > 0 && (values.get(0) != null && values.get(0).length() != 0)) {
			String[] accounttypes = values.get(0).split(",");
			return Arrays.asList(accounttypes).stream().map((z) -> z.trim()).collect(Collectors.toList());

		}

		List<String> defaultCreditInd = new ArrayList<String>();

		defaultCreditInd.add("C");
		return defaultCreditInd;

	}

	public int getm002_num_inst() {
		// TODO Auto-generated method stub
		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m002_num_inst");
		int numInstallment = 2;
		if (values.size() > 0) {

			numInstallment = Integer.valueOf(values.get(0));
		}
		return numInstallment;

	}

	public long getm002_amount() {

		List<String> values = this.routine_ParameterRepository.getParamValueByParamName("m002_amount");
		long numInstallment = 2;
		if (values.size() > 0) {

			numInstallment = Integer.valueOf(values.get(0));
		}
		return numInstallment;
	}

	private boolean checkNumberOfInstallment(int accountKey, long instAmt) {
		System.out.println("Inside checkNumberOfInstallment for account key:"+accountKey);
		try {
			int m002_num_inst = this.getm002_num_inst();
			System.out.println(" m002_num_inst: "+m002_num_inst);
			long totalAmount = Long.valueOf(this.getTotalAmount(accountKey));
			System.out.println("totalammount:"+totalAmount);
			int calculatedNumInst = (int) (totalAmount / instAmt);
			System.out.println("calculatedNumInst:"+calculatedNumInst);
			if (m002_num_inst < calculatedNumInst)
				return true;
			else
				return false;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	private boolean checkAggreateAmountOfInstallment(int accountKey) {
		try {
			long amount = this.getm002_amount();
			long totalAmount = Long.valueOf(this.getTotalAmount(accountKey));
			if (amount < totalAmount)
				return true;
			else
				return false;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	private String generateAlertMessage(int accountKey, List<AlarmDTO> alarmDTOs) {
		List<String> execuingParties = alarmDTOs.stream().map(a -> a.getExec_Cust_Key()).collect(Collectors.toList());
		String execuingPartiesSeparated = String.join(",", execuingParties);
		String Message = this.getInstallmentNumber(accountKey) + "installemnt are paid By other parties "
				+ execuingPartiesSeparated;
		System.out.println(Message);
		return Message;
	}
}
