package com.datagearbi.agp.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.Dgaml001TransLoanXToRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.agp.service.DGAML001;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.model.AC_Routine;
import com.datagearbi.model.Dgaml001TransLoanXToT;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.service.AML002Service;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmGeneration;
import com.datagearbi.service.AlarmsVM;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class AC_RoutineController {
	@Autowired
	AC_RoutineRepository ac_RoutineRepository;

	@Autowired
	Routine_ParameterRepository routine_parameter;

	@Autowired
	private AlaramObjectRepository alaramObjectRepository;

	@Autowired
	AlarmGeneration AlarmGeneration;

	@Autowired
	Dgaml001TransLoanXToRepository dgaml001_repository;

	@Autowired
	private AML002Service Aml002Service;

	@GetMapping("scenarios")
	private List<AC_Routine> selectRecordIntoSecsTable() {
		return ac_RoutineRepository.findAll();
	}

	@GetMapping("getscenario")
	private Optional<AC_Routine> selectRecordIntoSecsTable(@RequestParam("id") String id) {
		return ac_RoutineRepository.findById(Long.parseLong(id));
	}

	@RequestMapping(value = "updateroutine", method = RequestMethod.PUT)
	public void updateRoutine(/* @RequestBody AC_Routine ac_Routine */
			@RequestParam("routine_Id") String routine_Id, @RequestParam("routine_Name") String routine_Name,
			@RequestParam("routine_Short_Desc") String routine_Short_Desc,
			@RequestParam("routine_Desc") String routine_Desc,
			@RequestParam("routine_Status_Cd") String routine_Status_Cd,
			@RequestParam("risk_Fact_Ind") String risk_Fact_Ind,
			@RequestParam("routine_Run_Freq_Cd") String routine_Run_Freq_Cd,
			@RequestParam("alarm_Categ_Cd") String alarm_Categ_Cd,
			@RequestParam("alarm_Subcateg_Cd") String alarm_Subcateg_Cd,
			@RequestParam("routine_Type_Cd") String routine_Type_Cd,
			@RequestParam("save_Trig_Trans_Ind") String save_Trig_Trans_Ind,
			@RequestParam("obj_Level_Cd") String obj_Level_Cd, @RequestParam("routine_Msg_Txt") String routine_Msg_Txt,
			@RequestParam("ml_Bayes_Weight") String ml_Bayes_Weight,
			@RequestParam("dflt_Suppr_Dur_Count") String dflt_Suppr_Dur_Count,
			@RequestParam("routine_Dur_Count") String routine_Dur_Count) {

		System.out.println("DDDDDDDDDDDDD");

		// AC_Routine obj = em.find(AC_Routine.class, Long.parseLong(routine_Id));
		// obj.setRoutine_Name(routine_Name);
		// obj.setRoutine_Short_Desc(routine_Short_Desc);
		// obj.setRoutine_Desc(routine_Desc);
		// obj.setRoutine_Status_Cd(routine_Status_Cd);
		// obj.setRisk_Fact_Ind(risk_Fact_Ind);
		// obj.setRoutine_Run_Freq_Cd(routine_Run_Freq_Cd);
		// obj.setAlarm_Categ_Cd(alarm_Categ_Cd);
		// obj.setAlarm_Subcateg_Cd(alarm_Subcateg_Cd);
		// obj.setRoutine_Type_Cd(routine_Type_Cd);obj.setSave_Trig_Trans_Ind(save_Trig_Trans_Ind);
		// obj.setObj_Level_Cd(obj_Level_Cd); obj.setRoutine_Msg_Txt(routine_Msg_Txt);
		//
		// this.em.merge(obj);

		this.ac_RoutineRepository.updateAcRoutine(Long.parseLong(routine_Id), routine_Name, routine_Short_Desc,
				routine_Desc, routine_Status_Cd, risk_Fact_Ind, routine_Run_Freq_Cd, alarm_Categ_Cd, alarm_Subcateg_Cd,
				routine_Type_Cd, save_Trig_Trans_Ind, obj_Level_Cd, routine_Msg_Txt, Integer.parseInt(ml_Bayes_Weight),
				Integer.parseInt(dflt_Suppr_Dur_Count), Integer.parseInt(routine_Dur_Count));

	}

	/*********************************/
	@RequestMapping(value = "scenario2", method = RequestMethod.POST)
	public void runScenario2() {
		this.insertAML002AlarmData();
		
	}
	@RequestMapping(value = "dgamlRun", method = RequestMethod.POST)
	public void dgamlRun(@RequestBody String[] scenarios) {
		for (int i = 0; i < scenarios.length; i++) {
			if (scenarios[i].equals("AML001"))
				try {
					this.DGAML001_new();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else if (scenarios[i].equals("AML002"))
				this.insertAML002AlarmData();
		}
	}

	/***********************/

	/* NEW */
	@RequestMapping(value = "dgaml001_new", method = RequestMethod.GET)
	private void DGAML001_new() throws ParseException {
		/* Data From View */
		List<Dgaml001TransLoanXToT> dgaml001_data = this.dgaml001_repository.findAll();
		/* END Data From View */

		/* DTO */

		List<AlarmDTO> listOfSC = selectRecordfromAML001View(dgaml001_data);
		/* END DTO */
		String suppression_end_date = null, executing_ext_party_key = null;
		String alert_count = null, oldest_alert = null;

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// System.out.println("SysDate: " + );

		for (AlarmDTO record : listOfSC) {

			String msg = record.getRoutine_Msg_Txt().replace("#2", record.getCust_No());
			msg = msg.replace("just 35", "just " + record.getTransfer_Period_Date());

			// System.out.println("****F-MSG: " + msg);
			// System.out.println("****R-MSG: " + record.getRoutine_Msg_Txt());
			// System.out.println("***Transfer_Period_Date_VIEW: " +
			// record.getTransfer_Period_Date());

			int recordCount = alaramObjectRepository.countAlarms(record.getCust_No(), "AML001", msg);
			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				suppression_end_date = "2099-04-28 00:00:00.000";
				executing_ext_party_key = null;
				alert_count = "2";
				oldest_alert = "7";

				AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
						record.getRoutine_Short_Desc(), "ACC", record.getCust_No(), record.getCust_Name(),
						record.getAcct_No(), record.getAcct_Key(), record.getAcct_Name(), record.getRoutine_Id(),
						record.getRoutine_Name(), suppression_end_date, msg, (LocalDate.now().minusDays(1)),
						LocalDate.now(), "1", record.getAcct_Emp_Ind(), "1", "N", "AML", record.getAlarm_Categ_Cd(),
						record.getAlarm_Subcateg_Cd(), record.getAcct_Key(), "ACC", alert_count,
						record.getTransactions_count(), "0", oldest_alert, "1", record.getPolitical_Exp_Prsn_Ind(),
						record.getTrans_Key(), record.getDate_Key(), record.getTime_Key(), record.getTrans_Type_Key(),
						record.getCntry_Key(), record.getTrans_Status_Key(), "0", "0", "0", "1", " ", "0", "0",
						executing_ext_party_key, "0", "0", "0", "-1", "0", "N", "0"));
			}
		}

	}

	/*********************************/
	public List<AlarmDTO> selectRecordfromAML001View(List<Dgaml001TransLoanXToT> res1) {

		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();

		// List<Dgaml001TransLoanXToT> res1 =
		// this.dgaml001TransLoanXToRepository.findAll();

		List<AcRoutineHelper> list = this.ac_RoutineRepository.getRoutineDetail("AML001");

		res1.forEach(a -> {
			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(a.getCust_Type_Desc());
			temp.setCust_No(a.getCust_No());
			temp.setCust_Name(a.getCust_Name());
			temp.setAcct_No(a.getAcct_No());
			temp.setAcct_Key(String.valueOf(a.getAcct_Key()));
			temp.setAcct_Name(a.getAcct_Name());
			temp.setAcct_Type_Desc(a.getAcct_Type_Desc());
			temp.setAcct_Emp_Ind(a.getAcct_Emp_Ind());
			temp.setCust_Emp_Ind(a.getCust_Emp_Ind());
			temp.setCust_Key(String.valueOf(a.getCust_Key()));
			temp.setPolitical_Exp_Prsn_Ind(a.getPolitical_Exp_Prsn_Ind());
			temp.setTrans_Key(String.valueOf(a.getTrans_Key()));

			temp.setTransfer_Period_Date(a.getTransfer_Period_Date());

			temp.setTransactions_count(selectTransactionsCount(a.getAcct_Key()));

			temp.setDate_Key(String.valueOf(a.getDate_Key()));
			temp.setTime_Key(String.valueOf(a.getTime_Key()));
			temp.setTrans_Type_Key(String.valueOf(a.getTrans_Type_Key()));
			temp.setCntry_Key(String.valueOf(a.getCntry_Key()));
			temp.setTrans_Status_Key(String.valueOf(a.getTrans_Status_Key()));
			temp.setBranch_Key(String.valueOf(a.getBranch_Key()));

			if (list.size() > 0) {
				temp.setRoutine_Id(String.valueOf(list.get(0).getRoutine_Id()));
				temp.setRoutine_Name(list.get(0).getRoutine_Name());
				temp.setAlarm_Categ_Cd(list.get(0).getAlarm_Categ_Cd());
				temp.setAlarm_Subcateg_Cd(list.get(0).getAlarm_Subcateg_Cd());
				temp.setRoutine_Short_Desc(list.get(0).getRoutine_Short_Desc());
				temp.setRoutine_Msg_Txt(list.get(0).getRoutine_Msg_Txt());
			}

			/**
			 * ***********************************************
			 */
			listOfSC.add(temp);

		});

		return listOfSC;

	}

	@Autowired
	private DGAML001 dgaml001_service;

	/**
	 * ************** Get transactions count
	 */
	public String selectTransactionsCount(int Acct_key) {
		String transactions_count1 = null;

		List<Long> f = this.dgaml001_repository.getTransactionCount(Acct_key);

		if (f.size() > 0) {
			long z = f.get(0);
			transactions_count1 = String.valueOf(z);
		}

		return transactions_count1;

	}

	public Date getCalculaedRunDate(String param_datKey) {
		// Date systemDate = new Date();

		String date1 = null;
		Date dateKey = null;

		SimpleDateFormat df_in = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat df_output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = df_in.parse(param_datKey);
			date1 = df_output.format(date);

			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			dateKey = format.parse(date1);

			return dateKey;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*********************************/
	/*********************************/

	/// Scenario 2

	public void insertAML002AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);
		String msg = null;

		AlarmsVM Results = Aml002Service.getAML002AlarmData();
		
		
		System.out.println("Size ==="+Results.getAlrmsVMs().size());
		for (AlarmDTO results : Results.getAlrmsVMs()) {
     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
			

			msg = results.getRoutine_Msg_Txt().replace("#1", results.getNum_inst());
			System.out.println("results.getRoutine_Msg_Txt()"+results.getRoutine_Msg_Txt());
			System.out.println("msg after add #1:"+msg);
			
			// msg = msg.replace("#2", results.getExec_Cust_Key());

			System.out.println("sout :"+Aml002Service.getExternalParties(Integer.parseInt(results.getAcct_Key())));
			System.out.println("before get counts ");
			System.out.println("results.getAcct_No() "+results.getAcct_No());
			int recordCount = alaramObjectRepository.countAlarms(results.getAcct_No(), "AML002", msg);
			System.out.println(recordCount+" record count "+recordCount);
			if (recordCount > 0) {

				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = String.valueOf(
						this.alaramObjectRepository.getAlarmCount("ACC", Integer.valueOf(results.getAcct_Key()))),

						oldest_alert = "7";
				LocalDate tomorrow = LocalDate.now().minusDays(1);
if(alert_count!=null)
				msg+=alert_count;
				AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
						results.getRoutine_Short_Desc(), "ACC", results.getAcct_No(), results.getAcct_Name(),
						results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(), results.getRoutine_Id(),
						results.getRoutine_Name(), suppression_end_date, msg, tomorrow, LocalDate.now(), "1",
						results.getAcct_Emp_Ind(), "1", "N", "AML", results.getAlarm_Categ_Cd(),
						results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "ACC", alert_count,
						results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
						results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
						results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
						results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(), results.getBenef_Ext_Cust_Key(),
						results.getTrans_Curr_Key(), "1", results.getPost_Date_Key(), results.getEmp_Key(),
						results.getExec_Cust_Key(), executing_ext_party_key, results.getCcy_Amt(),
						results.getCcy_Amnt_In_Trans_Ccy(), results.getCcy_Amnt_In_Acct_Ccy(), "-1",
						results.getRelate_Ind(), "N", results.getThird_Cust_Ind()));

			}
		}

	}

}
