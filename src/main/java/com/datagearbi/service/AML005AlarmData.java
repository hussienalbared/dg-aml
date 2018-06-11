/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.DGAML005_Install_Paid_In_Cash;

/**
 *
 * @author Hamzah.Ahmed
 */
public class AML005AlarmData {

	Connection dbConnection = null;
	@PersistenceContext
	private EntityManager entityManager;

	public AML005AlarmData() {
	}

	/**
	 * *********** AML005 - ***
	 */
	public AlarmsVM getAML005AlarmData() {
		AlarmsVM scMAVM = new AlarmsVM();
		List<AlarmDTO> listofSC;

		try {
			listofSC = selectRecordfromAML005View();
			// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
			// "+listofSC.get(0));
			scMAVM.setAlrmVMs(listofSC);
		} catch (SQLException ex) {
			Logger.getLogger(AML005AlarmData.class.getName()).log(Level.SEVERE, null, ex);
		}

		return scMAVM;

	}

	// Parameters VMs

	public AlarmsVM getAML005ParmData() {
		AlarmsVM parmMAVM = new AlarmsVM();
		List<AlarmDTO> listofParm;

		try {
			listofParm = selectRecordfromAML005Parm();
			// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
			// "+listofSC.get(0));
			parmMAVM.setAlrmVMs(listofParm);
		} catch (SQLException ex) {
			Logger.getLogger(AML005AlarmData.class.getName()).log(Level.SEVERE, null, ex);
		}

		return parmMAVM;

	}

	// select Data
	public List<AlarmDTO> selectRecordfromAML005View() throws SQLException {

		List<AlarmDTO> listOfSC = new ArrayList<>();

		String selectRecord = "select D from DGAML005_Install_Paid_In_Cash D from";

		String selectRecord1 = "select new com.datagearbi.helper.AcRoutineHelper (A.routine_Id,A.routine_Name,A.alarm_Categ_Cd,A.alarm_Subcateg_Cd"
				+ ",A.routine_Short_Desc"
				+ ", A.routine_Msg_Txt)  from AC_Routine A where A.routine_Name='AML005' and current_Ind='Y'";

		List<DGAML005_Install_Paid_In_Cash> a = this.entityManager
				.createQuery(selectRecord, DGAML005_Install_Paid_In_Cash.class).getResultList();

		List<AcRoutineHelper> list = this.entityManager.createQuery(selectRecord1, AcRoutineHelper.class)
				.getResultList();

		a.forEach(res -> {
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
			temp.setPolitical_Exp_Prsn_Ind(String.valueOf(res.getPolitical_Exp_Prsn_Ind()));
			temp.setTrans_Key(String.valueOf(res.getTrans_Key()));

			temp.setTransactions_count(selectTransactionsCount(String.valueOf(res.getAcct_Key())));

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

			temp.setTotal_amount(selectTotalAmount(String.valueOf(res.getAcct_Key())));

			temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(res.getCcy_Amt_In_Trans_Ccy()));
			temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(res.getCcy_Amt_In_Acct_Ccy()));
			temp.setSec_Acct_Key(String.valueOf(res.getSec_Acct_Key()));
			temp.setRelate_Ind(res.getRelate_Ind());
			temp.setThird_Cust_Ind(res.getThird_Cust_Ind());

			temp.setAll_amnt(selectAllAmnt(res.getAcct_Key()));

			/**
			 * *************Scenario Data*****************
			 */

			if (list.size() > 0) {
				temp.setRoutine_Id(String.valueOf(list.get(0).getRoutine_Id()));
				temp.setRoutine_Name(list.get(0).getRoutine_Name());
				temp.setAlarm_Categ_Cd(list.get(0).getAlarm_Categ_Cd());
				temp.setAlarm_Subcateg_Cd(list.get(0).getAlarm_Subcateg_Cd());
				temp.setRoutine_Short_Desc(list.get(0).getRoutine_Short_Desc());
				temp.setRoutine_Msg_Txt(list.get(0).getRoutine_Msg_Txt());
			}

			listOfSC.add(temp);

		}

		);

		return listOfSC;

	}

	/**
	 * ************** Get transactions count
	 */
	public String selectTransactionsCount(String Acct_key) {

		String transactions_count1 = null;
		String selectTransactionsCount = " SELECT count(D.trans_Key) ,D.acct_Key "
				+ " FROM DGAML005_Install_Paid_In_Cash D where D.acct_Key= " + Acct_key + " group by D.acct_Key";
		List<Object[]> z = this.entityManager.createQuery(selectTransactionsCount, Object[].class).getResultList();
		if (z.size() > 0)
			transactions_count1 = z.get(0)[0].toString();
		return transactions_count1;
	}

	/**
	 * ************** Get Total amount
	 */
	public String selectTotalAmount(String Acct_key) {
		String total_amount1 = null;
		String selectRecord = "SELECT sum(D.ccy_Amt) as total_amount,D.acct_Key  FROM DGAML005_Install_Paid_In_Cash D "
				+ "where D.acct_Key=" + Acct_key + " group by D.acct_Key";

		List<Object[]> z = this.entityManager.createQuery(selectRecord, Object[].class).getResultList();
		if (z.size() > 0)
			total_amount1 = String.valueOf(z.get(0)[0]);
		return total_amount1;
	}

	/**
	 * ************** Get Number of installments
	 */
	public String selectAllAmnt(int Acct_key) {

		// List<AlarmDTO> listOfSC = new ArrayList<>();
		String all_amnt1 = null;

		String selectTransactionsCount = "select sum(T.ccy_Amt) as all_amnt from Transaction_Flow T"
				+ " where T.acct_Key=" + 1884;

		List tt = this.entityManager.createQuery(selectTransactionsCount, Object.class).getResultList();
		if (tt.size() > 0)
			all_amnt1 = tt.get(0).toString();

		return all_amnt1;
	}

	/**
	 * ************ Get parameters Data
	 */

	public List<AlarmDTO> selectRecordfromAML005Parm() throws SQLException {
		String selectParmRecord = "select A  from AC_Routine_Parameter A where A.id.routine_Id "
				+ "=(select B.routine_Id from AC_Routine B" + " where B.routine_Name='AML003' and B.current_Ind='Y')";

		List<AC_Routine_Parameter> c = this.entityManager.createQuery(selectParmRecord, AC_Routine_Parameter.class)
				.getResultList();
		List<AlarmDTO> listOfParm = new ArrayList<>();
		c.forEach(q -> {
			AlarmDTO tempParm = new AlarmDTO();

			tempParm.setParm_name(q.getId().getParm_Name());
			tempParm.setParm_value(q.getParm_Value());
			tempParm.setParm_type_desc(q.getParm_Type_Desc());
			listOfParm.add(tempParm);
		});
		return listOfParm;
	}

	/**
	 * *********** End of AML005 ***
	 */

}
