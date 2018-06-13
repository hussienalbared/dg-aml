package com.datagearbi.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.repository.AlaramObjectRepository;

/**
 *  This class calls the function that used to insert data
 *
 */
public class AlarmsProcess {
	@Autowired
	private static AlaramObjectRepository alaramObjectRepository;

	public AlarmsProcess() {
	}

	/* AML001 - *****/
	public static void insertAML001AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		AML001AlarmData AMLP = new AML001AlarmData();
		AlarmsVM Results = AMLP.getAML001AlarmData();

		AlarmsVM parmResults = AMLP.getAML001ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String msg = results.getRoutine_Msg_Txt().replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML001", msg);
			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				// transactions_count = "3",total_amount = "2000",
				flag1 = false;
				flag2 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {
					int oo = 5;
					if (parmres.getParm_type_desc().equalsIgnoreCase("Numeric Constant")) {
						/*
						 * if (parmres.getParm_name().equalsIgnoreCase("m002_amount") &&
						 * Float.parseFloat(results.getTotal_amount())>=Integer.parseInt(parmres.
						 * getParm_value())) flag1=true;
						 * 
						 * if(Integer.parseInt(results.getNum_inst())>=Integer.parseInt(parmres.
						 * getParm_value()) && parmres.getParm_name().equalsIgnoreCase("m002_num_inst"))
						 * flag2=true;
						 */

						float m007_percentage = (Float.parseFloat(results.getAcct_Close_Date())
								- Float.parseFloat(results.getAcct_Open_Date()))
								/ (Float.parseFloat(results.getDate_Key())
										- Float.parseFloat(results.getAcct_Open_Date()));

						if (m007_percentage * 100 >= Float.parseFloat(parmres.getParm_value())
								&& parmres.getParm_name().equalsIgnoreCase("m001_percentage"))
							flag1 = true;
					}
				}

				// ***********************

				if (flag1 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "ACC", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), "0", oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), "0", "0", "0", "1", " ", "0", "0", executing_ext_party_key,
							"0", "0", "0", "-1", "0", "N", "0"));
				}

			}
		}

	}

	/* End of AML001 - */

	/* AML002 - *****/
	// public static void insertAML002AlarmData() throws SQLException {
	// DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	// Date dateobj = new Date();
	// String StDate = df.format(dateobj);
	//
	// AML002AlarmData AMLP = new AML002AlarmData();
	// AlarmsVM Results = AMLP.getAML002AlarmData();
	//
	// AlarmsVM parmResults = AMLP.getAML002ParmData();
	//
	//
	//
	//
	//
	// int itr=0;
	// String msg=null;
	//
	// for (AlarmDTO results : Results.getAlrmsVMs()) {
	//
	//
	// AlarmsVM expnResults = AMLP.getAML002EXPNData(results.getAcct_Key());
	//
	// //msg = results.getRoutine_message_text().replace("#1", results.getACCTNO());
	//
	//
	// msg = results.getRoutine_Msg_Txt().replace("#1", results.getNum_inst());
	// msg=msg.replace("#2", results.getExec_Cust_Key());
	//
	//
	//
	// /***** Get Msg ****/
	//
	// for (AlarmDTO expnresults : expnResults.getAlrmsVMs())
	// {
	//
	// msg=msg + "," +expnresults.getExec_Cust_Key();
	//
	// }
	//
	//
	// /****************/
	// // AlarmGeneration.updateRecordIntoAlrmTable(results.getPNO(), msg);
	//
	// boolean flag1=false,flag2=false;
	//
	//// String selectCount = "select count(1) as alarmCount from AC.AC_Alarm"
	//// + " where Alarmed_Obj_No='" + results.getCust_No()+ "' and
	// Routine_Name='AML002' and Routine_Name= '" + results.getRoutine_Name() + "'
	// and Actual_Value_Txt='" + msg + "'";
	//// res3 = statement2.executeQuery(selectCount);
	//// res3.next();
	//// int recordCount = res3.getInt("alarmCount");
	// int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(),
	// "AML002", msg);
	////
	// if (recordCount > 0) {
	//// msg=msg + "," +results.getCFEXCPNO();
	//// AlarmGeneration.updateRecordIntoAlrmTable(results.getPNO(), msg);
	// System.out.println("ALarm is found");
	// //JOptionPane.showMessageDialog(null, "ALarm is found");
	// } else {
	//
	//// msg = results.getRoutine_message_text().replace("#1",
	// results.getNum_inst());
	//// msg=msg.replace("#2", results.getCFEXCPNO());
	// String suppression_end_date = "2099-04-28 00:00:00.000",
	// executing_ext_party_key = null;
	// String alert_count = "2", oldest_alert = "7";
	// //transactions_count = "3",total_amount = "2000",
	// flag1=false; flag2=false;
	//
	// //***********************
	// for (AlarmDTO parmres : parmResults.getAlrmsVMs())
	// {
	// int oo=5;
	// if(parmres.getParm_type_desc().equalsIgnoreCase("Numeric Constant"))
	// {
	// if (parmres.getParm_name().equalsIgnoreCase("m002_amount") &&
	// Float.parseFloat(results.getTotal_amount())>=Integer.parseInt(parmres.getParm_value()))
	// flag1=true;
	//
	// if(Integer.parseInt(results.getNum_inst())>=Integer.parseInt(parmres.getParm_value())
	// &&
	// parmres.getParm_name().equalsIgnoreCase("m002_num_inst"))
	// flag2=true;
	// }
	// }
	//
	// //***********************
	//
	// if(flag1==true && flag2==true)
	// {
	//
	// AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil( "AML",
	// "ACT", "1", results.getRoutine_Short_Desc(), "ACC", results.getCust_No(),
	// results.getCust_Name(),
	// results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
	// results.getRoutine_Id(),
	// results.getRoutine_Name(), suppression_end_date, msg, "2016-04-28
	// 00:00:00.000", StDate, "1",
	// results.getAcct_Emp_Ind(), "1", "N", "AML", results.getAlarm_Categ_Cd(),
	// results.getAlarm_Subcateg_Cd(),
	// results.getCust_Key(), "PTY", alert_count,
	// results.getTransactions_count(),
	// results.getTotal_amount(),
	// oldest_alert,
	// "1",
	// results.getPolitical_Exp_Prsn_Ind(),
	// results.getTrans_Key(),
	// results.getDate_Key(),
	// results.getTime_Key(),
	// results.getTrans_Type_Key(),
	// results.getCntry_Key(),
	// results.getTrans_Status_Key(),
	// results.getRemit_Ext_Cust_Key(),
	// results.getBenef_Ext_Cust_Key(),
	// results.getTrans_Curr_Key(),
	// "1",
	// results.getPost_Date_Key(),
	// results.getEmp_Key(),
	// results.getExec_Cust_Key(),
	// executing_ext_party_key,
	// results.getCcy_Amt(),
	// results.getCcy_Amnt_In_Trans_Ccy(),
	// results.getCcy_Amnt_In_Acct_Ccy(),
	// "-1",
	// results.getRelate_Ind(),
	// "N",
	// results.getThird_Cust_Ind()));
	// }
	//
	// }
	// }
	//
	//
	//
	// }
	//

}
