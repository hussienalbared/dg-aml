package com.datagearbi.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.helper.alramInsertionUtil;
import com.datagearbi.repository.AlaramObjectRepository;

/**
 * This class calls the function that used to insert data
 *
 */
@Service
public class AlarmsProcess {
	@Autowired
	AlarmGeneration AlarmGeneration;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;

	@Autowired
	private AML001AlarmData AMLP;

	@Autowired
	private AML002AlarmData AMLP2;

	@Autowired
	private AML003AlarmData AMLP3;

	@Autowired
	private AML005AlarmData AMLP5;

	@Autowired
	private AML007AlarmData AMLP7;

	@Autowired
	private AML010AlarmData AMLP10;

	@Autowired
	private AML016AlarmData AMLP16;

	@Autowired
	private AML020AlarmData AMLP20;

	@Autowired
	private AML021AlarmData AMLP21;

	@Autowired
	private AML022AlarmData AMLP22;

	@Autowired
	private AML023AlarmData AMLP23;

	public AlarmsProcess() {
	}

	/* AML001 - *****/
	public void insertAML001AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML001AlarmData AMLP = new AML001AlarmData();
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
				flag1 = false;
				flag2 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {

					if (parmres.getParm_type_desc().equalsIgnoreCase("Numeric Constant")) {

						String acct_Close_Date = results.getAcct_Close_Date();
						String date_Key = results.getDate_Key();
						String acct_Open_Date = results.getAcct_Open_Date();
						String parm_value = parmres.getParm_value();

						if (acct_Close_Date != null && date_Key != null && acct_Open_Date != null
								&& parm_value != null) {

							float m007_percentage = (Float.parseFloat(acct_Close_Date)
									- Float.parseFloat(acct_Open_Date))
									/ (Float.parseFloat(date_Key) - Float.parseFloat(acct_Open_Date));

							if (m007_percentage * 100 >= Float.parseFloat(parm_value)
									&& parmres.getParm_name().equalsIgnoreCase("m001_percentage"))
								flag1 = true;
						} else {
							// FIXME TODO XXX @mFarag throw error msg
						}
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
	public void insertAML002AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML002AlarmData AMLP = new AML002AlarmData();
		AlarmsVM Results = AMLP2.getAML002AlarmData();

		AlarmsVM parmResults = AMLP2.getAML002ParmData();

		int itr = 0;
		String msg = null;

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			AlarmsVM expnResults = AMLP2.getAML002EXPNData(Integer.parseInt(results.getAcct_Key()));

			msg = results.getRoutine_Msg_Txt().replace("#1", results.getNum_inst());
			msg = msg.replace("#2", results.getExec_Cust_Key());

			/***** Get Msg ****/

			for (AlarmDTO expnresults : expnResults.getAlrmsVMs()) {

				msg = msg + "," + expnresults.getExec_Cust_Key();

			}

			/****************/
			// AlarmGeneration.updateRecordIntoAlrmTable(results.getPNO(), msg);

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML002", msg);
			if (recordCount > 0) {

				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {
					String paramType = parmres.getParm_type_desc();
					String paramName = parmres.getParm_name();
					String totalAmount = results.getTotal_amount();
					String paramValue = parmres.getParm_value();

					String NumInst = results.getNum_inst();
					if (paramType != null && paramName != null && totalAmount != null && paramValue != null
							&& NumInst != null) {
						if (paramType.equalsIgnoreCase("Numeric Constant")) {

							if (paramName.equalsIgnoreCase("m002_amount")
									&& Float.parseFloat(totalAmount) >= Integer.parseInt(paramValue))
								flag1 = true;

							if (Integer.parseInt(NumInst) >= Integer.parseInt(paramValue)
									&& paramName.equalsIgnoreCase("m002_num_inst"))
								flag2 = true;
						}

					}

				}

				// ***********************

				if (flag1 == true && flag2 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "ACC", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}

	}

	public void insertAML003AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML003AlarmData AMLP = new AML003AlarmData();
		AlarmsVM Results = AMLP3.getAML003AlarmData();

		AlarmsVM parmResults = AMLP3.getAML003ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String msg = results.getRoutine_Msg_Txt().replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML003", msg);
			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;
				// *************** Conditions (parametrs) ********
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {

					String paramType = parmres.getParm_type_desc();
					String paramName = parmres.getParm_name();
					String totalAmount = results.getTotal_amount();
					String paramValue = parmres.getParm_value().replaceAll("[^0-9]", "");
					String NumInst = results.getNum_inst().replaceAll("[^0-9]", "");
					if (paramType != null && paramName != null && totalAmount != null && paramValue != null
							&& NumInst != null) {
						if (paramType.equalsIgnoreCase("Numeric Constant")) {
							if (paramName.equalsIgnoreCase("m002_amount")
									&& Float.parseFloat(totalAmount) >= Integer.parseInt(paramValue))
								flag1 = true;
							System.out.println(NumInst + "hala");
							System.out.println(paramValue + ")))))))))");

							if (Integer.parseInt(NumInst) >= Integer.parseInt(paramValue)
									&& paramName.equalsIgnoreCase("m002_num_inst"))
								flag2 = true;
						}
					}

				}
				if (flag1 == true && flag2 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "ACC", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}

	}

	/* End of AML003 - */

	/* AML005 - *****/
	public void insertAML005AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML005AlarmData AMLP = new AML005AlarmData();
		AlarmsVM Results = AMLP5.getAML005AlarmData();

		AlarmsVM parmResults = AMLP5.getAML005ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			float f = (Float.parseFloat(results.getTotal_amount()) / Float.parseFloat(results.getAll_amnt()));
			f = (float) (f * 100.0);
			String msg = results.getRoutine_Msg_Txt().replace("#1", Float.toString(f));
			boolean flag1 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML005", msg);
			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {
					String paramType = parmres.getParm_type_desc();
					String paramName = parmres.getParm_name();
					String totalAmount = results.getTotal_amount();
					String paramValue = parmres.getParm_value().replaceAll("[^0-9]", "");
					String allAmount = results.getAll_amnt();
					if (paramType != null && paramName != null && totalAmount != null && paramValue != null
							&& allAmount != null) {
						if (paramType.equalsIgnoreCase("Numeric Constant")) {
							float cash_perc = Float.parseFloat(totalAmount) / Float.parseFloat(allAmount);
							if (paramName.equalsIgnoreCase("m005_percentage")
									&& cash_perc * 100.0 >= Integer.parseInt(paramValue))
								flag1 = true;

							// if(Integer.parseInt(results.getNum_inst())>=Integer.parseInt(parmres.getParm_value())
							// &&
							// parmres.getParm_name().equalsIgnoreCase("m002_num_inst"))
							// flag2=true;
						}
					}

				}

				// ***********************

				if (flag1 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}

	}

	/* End of AML005 - */

	/* AML007 - *****/
	public void insertAML007AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML007AlarmData AMLP = new AML007AlarmData();
		AlarmsVM Results = AMLP7.getAML007AlarmData();

		AlarmsVM parmResults = AMLP7.getAML007ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String routine_Msg_Txt = results.getRoutine_Msg_Txt();

			System.out.println("MSG: " + routine_Msg_Txt);
			String msg = routine_Msg_Txt;
			if (routine_Msg_Txt != null && results.getAcct_No() != null) {
				msg = routine_Msg_Txt.replace("#1", results.getAcct_No());
			}

			boolean flag1 = false, flag2 = false, flag3 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML007", msg);

			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;
				flag3 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {

					String paramType = parmres.getParm_type_desc();
					String paramName = parmres.getParm_name();
					String totalLoanAmount = results.getTotal_loan_amount();
					String paramValue = parmres.getParm_value().replaceAll("[^0-9]", "");
					String OrigLoanAmt = results.getOrig_Loan_Amt();
					String AcctCloseDate = results.getAcct_Close_Date().trim().split(" ")[0].replaceAll("[^0-9]", "");
					String AcctOpenDate = results.getAcct_Open_Date().trim().split(" ")[0].replaceAll("[^0-9]", "");
					String Date_Key = results.getDate_Key();
					if (paramType != null && paramName != null && totalLoanAmount != null && paramValue != null
							&& OrigLoanAmt != null && AcctCloseDate != null && AcctOpenDate != null
							&& Date_Key != null) {
						if (paramType.equalsIgnoreCase("Numeric Constant")) {
							if (paramName.equalsIgnoreCase("m007_total_amount")
									&& Float.parseFloat(totalLoanAmount) >= Integer.parseInt(paramValue))
								flag1 = true;

							if (Float.parseFloat(OrigLoanAmt) >= Integer.parseInt(paramValue)
									&& paramName.equalsIgnoreCase("m007_amt_single_loan"))
								flag2 = true;

							System.out.println("FLOOOOOOOOOOAT: " + Float.parseFloat(AcctCloseDate));
							float m007_percentage = (Float.parseFloat(AcctCloseDate) - Float.parseFloat(AcctOpenDate))
									/ (Float.parseFloat(Date_Key) - Float.parseFloat(AcctOpenDate));

							if (m007_percentage * 100 >= Float.parseFloat(paramValue)
									&& paramName.equalsIgnoreCase("m007_percentage"))
								flag3 = true;
						}
					}

				}

				// ***********************

				if (flag1 == true && flag2 == true && flag3 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}
	}

	/* AML010 - *****/
	public void insertAML010AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML010AlarmData AMLP = new AML010AlarmData();
		AlarmsVM Results = AMLP10.getAML010AlarmData();

		AlarmsVM parmResults = AMLP10.getAML010ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String routine_Msg_Txt = results.getRoutine_Msg_Txt();

			System.out.println("MSG: " + routine_Msg_Txt);
			String msg = routine_Msg_Txt;
			if (routine_Msg_Txt != null && results.getAcct_No() != null) {
				msg = routine_Msg_Txt.replace("#1", results.getAcct_No());
			}

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML010", msg);

			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {

					String paramType = parmres.getParm_type_desc();
					String paramName = parmres.getParm_name();
					String totalAmount = results.getTotal_amount();
					String paramValue = parmres.getParm_value().replaceAll("[^0-9]", "");
					if (paramType != null && paramName != null && totalAmount != null && paramValue != null) {
						if (paramType.equalsIgnoreCase("Numeric Constant")) {
							if (paramName.equalsIgnoreCase("m010_amount")
									&& Float.parseFloat(totalAmount) >= Integer.parseInt(paramValue))
								flag1 = true;

						}

					}

				}

				// ***********************

				if (flag1 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}

	}

	/* End of AML010 - */

	/* AML016 - *****/
	public void insertAML016AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML016AlarmData AMLP = new AML016AlarmData();
		AlarmsVM Results = AMLP16.getAML016AlarmData();

		AlarmsVM parmResults = AMLP16.getAML016ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String msg = results.getRoutine_Msg_Txt().replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML016", msg);

			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;
				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {
					String paramType = parmres.getParm_type_desc();
					String paramName = parmres.getParm_name();
					String totalAmount = results.getTotal_amount();
					String paramValue = parmres.getParm_value();
					String NumInst = results.getNum_inst();
					if (paramType != null && paramName != null && totalAmount != null && paramValue != null
							&& NumInst != null) {
						if (paramType.equalsIgnoreCase("Numeric Constant")) {
							if (paramName.equalsIgnoreCase("m002_amount")
									&& Float.parseFloat(totalAmount) >= Integer.parseInt(paramValue))
								flag1 = true;

							if (Integer.parseInt(NumInst) >= Integer.parseInt(paramValue)
									&& paramName.equalsIgnoreCase("m002_num_inst"))
								flag2 = true;
						}

					}

				}

				// ***********************

				if (flag1 == true && flag2 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "ACC", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}
			}
		}
	}

	/* End of AML016 - */

	/* AML020 - *****/
	public void insertAML020AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML020AlarmData AMLP = new AML020AlarmData();
		AlarmsVM Results = AMLP20.getAML020AlarmData();

		AlarmsVM parmResults = AMLP20.getAML020ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String routine_Msg_Txt = results.getRoutine_Msg_Txt();
			String msg = "#";

			if (routine_Msg_Txt != null && results.getAcct_No() != null)
				msg = routine_Msg_Txt.replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML020", msg);
			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;

				// ***********************
				// Was Commented By Hamza !!!
				// for (AlarmDTO parmres : parmResults.getAlrmsVMs())
				// {
				//
				// /**/
				// String total_amount = results.getTotal_amount();
				// String parm_value = parmres.getParm_value();
				// String num_inst = results.getNum_inst();
				//
				// int oo=5;
				// if(parmres.getParm_type_desc().equalsIgnoreCase("Numeric Constant"))
				// {
				// if(total_amount!=null && parm_value!=null && num_inst!=null) {
				// if (parmres.getParm_name().equalsIgnoreCase("m002_amount") &&
				// Float.parseFloat(total_amount)>=Integer.parseInt(parm_value))
				// flag1=true;
				//
				// if(Integer.parseInt(num_inst)>=Integer.parseInt(parm_value) &&
				// parmres.getParm_name().equalsIgnoreCase("m002_num_inst"))
				// flag2=true;
				// }
				//
				// }
				// }
				// ***********************

				if (flag1 == true && flag2 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(), "0",
							"0", "0", results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getCust_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, "0", "0", oldest_alert, "1", results.getPolitical_Exp_Prsn_Ind(), "0", " ",
							" ", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", executing_ext_party_key, "0", "0",
							"0", "-1", "0", "N", "0"));
				}

			}
		}

	}
	/* End of AML020 - */

	/* AML021 - *****/
	public void insertAML021AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML021AlarmData AMLP = new AML021AlarmData();
		AlarmsVM Results = AMLP21.getAML021AlarmData();

		AlarmsVM parmResults = AMLP21.getAML021ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String routine_Msg_Txt = results.getRoutine_Msg_Txt();
			String msg = "#";

			System.out.println("Orignal String=" + routine_Msg_Txt);
			System.out.println("getAcct_No String=" + results.getAcct_No());

			if (routine_Msg_Txt != null && results.getAcct_No() != null)
				msg = routine_Msg_Txt.replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML021", msg);

			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;

				if (flag1 == true && flag2 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(), "0",
							"0", "0", results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getCust_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, "0", "0", oldest_alert, "1", results.getPolitical_Exp_Prsn_Ind(), "0", " ",
							" ", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", executing_ext_party_key, "0", "0",
							"0", "-1", "0", "N", "0"));
				}

			}
		}

	}

	/* End of AML021 - */

	/* AML022 - *****/
	public void insertAML022AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML022AlarmData AMLP = new AML022AlarmData();
		AlarmsVM Results = AMLP22.getAML022AlarmData();

		AlarmsVM parmResults = AMLP22.getAML022ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String msg = results.getRoutine_Msg_Txt().replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;
			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML022", msg);

			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {
					String total_amount = results.getTotal_amount();
					String parm_value = parmres.getParm_value();

					int oo = 5;
					if (parmres.getParm_type_desc().equalsIgnoreCase("Numeric Constant")) {
						if (total_amount != null && parm_value != null) {
							if (parmres.getParm_name().equalsIgnoreCase("m022_amount")
									&& Float.parseFloat(total_amount) >= Integer.parseInt(parm_value))
								flag1 = true;
						}
					}
				}

				// ***********************

				if (flag1 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}

	}

	/* End of AML022 - */

	/* AML023 - *****/
	public void insertAML023AlarmData() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateobj = new Date();
		String StDate = df.format(dateobj);

		// AML023AlarmData AMLP = new AML023AlarmData();
		AlarmsVM Results = AMLP23.getAML023AlarmData();

		AlarmsVM parmResults = AMLP23.getAML023ParmData();

		for (AlarmDTO results : Results.getAlrmsVMs()) {

			String msg = results.getRoutine_Msg_Txt().replace("#1", results.getAcct_No());

			boolean flag1 = false, flag2 = false;

			int recordCount = alaramObjectRepository.countAlarms(results.getCust_No(), "AML023", msg);

			if (recordCount > 0) {
				System.out.println("ALarm is found");
			} else {

				String suppression_end_date = "2099-04-28 00:00:00.000", executing_ext_party_key = null;
				String alert_count = "2", oldest_alert = "7";
				flag1 = false;
				flag2 = false;

				// ***********************
				for (AlarmDTO parmres : parmResults.getAlrmsVMs()) {
					int oo = 5;

					String total_amount = results.getTotal_amount();
					String parm_value = parmres.getParm_value();

					if (parmres.getParm_type_desc().equalsIgnoreCase("Numeric Constant")) {
						if (parmres.getParm_name().equalsIgnoreCase("m023_amount") && total_amount != null
								&& parm_value != null && Float.parseFloat(total_amount) >= Integer.parseInt(parm_value))
							flag1 = true;
					}
				}

				// ***********************

				if (flag1 == true) {

					AlarmGeneration.insertRecordIntoDbAlarmTable(new alramInsertionUtil("AML", "ACT", "1",
							results.getRoutine_Short_Desc(), "PTY", results.getCust_No(), results.getCust_Name(),
							results.getAcct_No(), results.getAcct_Key(), results.getAcct_Name(),
							results.getRoutine_Id(), results.getRoutine_Name(), suppression_end_date, msg,
							"2016-04-28 00:00:00.000", StDate, "1", results.getAcct_Emp_Ind(), "1", "N", "AML",
							results.getAlarm_Categ_Cd(), results.getAlarm_Subcateg_Cd(), results.getCust_Key(), "PTY",
							alert_count, results.getTransactions_count(), results.getTotal_amount(), oldest_alert, "1",
							results.getPolitical_Exp_Prsn_Ind(), results.getTrans_Key(), results.getDate_Key(),
							results.getTime_Key(), results.getTrans_Type_Key(), results.getCntry_Key(),
							results.getTrans_Status_Key(), results.getRemit_Ext_Cust_Key(),
							results.getBenef_Ext_Cust_Key(), results.getTrans_Curr_Key(), "1",
							results.getPost_Date_Key(), results.getEmp_Key(), results.getExec_Cust_Key(),
							executing_ext_party_key, results.getCcy_Amt(), results.getCcy_Amnt_In_Trans_Ccy(),
							results.getCcy_Amnt_In_Acct_Ccy(), "-1", results.getRelate_Ind(), "N",
							results.getThird_Cust_Ind()));
				}

			}
		}
	}

}