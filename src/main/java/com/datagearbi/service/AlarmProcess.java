package com.datagearbi.service;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.repository.AlaramObjectRepository;

@Service
public class AlarmProcess {
	@Autowired
	AlarmGeneration AlarmGeneration;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;
	@Autowired
	private AML002Service Aml002Service;
	

	public void insertAML002AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);
		String msg = null;

		AlarmsVM Results = Aml002Service.getAML002AlarmData();
System.out.println(Results.getAlrmsVMs().size()+"{{{{{{{{{");
		for (AlarmDTO results : Results.getAlrmsVMs()) {

			AlarmsVM expnResults = Aml002Service.getAML002EXPNData(Integer.parseInt(results.getAcct_Key()));
			System.out.println("**********");
			System.out.println(results.getNum_inst());
			System.out.println(results.getRoutine_Msg_Txt());
			System.out.println("**********");

			msg = results.getRoutine_Msg_Txt().replace("#1", results.getNum_inst());
			System.out.println(msg);
			System.out.println(results.getExec_Cust_Key()+"]]");
//			msg = msg.replace("#2", results.getExec_Cust_Key());

			for (AlarmDTO expnresults : expnResults.getAlrmsVMs()) {

				msg = msg + "," + expnresults.getExec_Cust_Key();

			}

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML002", msg);
			if (recordCount > 0) {

				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = String.valueOf(this.alaramObjectRepository.getAlarmCount("ACC", Integer.valueOf(results.getAcct_Key()))),
						
						oldest_alert = "7";
				LocalDate tomorrow = LocalDate.now().minusDays(1);
			
				AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
						results.getRoutine_Short_Desc(), "ACC", results.getCust_No(), results.getCust_Name(),
						results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(), results.getRoutine_Id(),
						results.getRoutine_Name(), suppression_end_date, msg, tomorrow, LocalDate.now(), "1",
						results.getAcct_Emp_Ind(), "1", "N", "AML", results.getAlarm_Categ_Cd(),
						results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY", alert_count,
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