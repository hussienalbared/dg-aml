/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.DGAML002_Install_paid_BY_OTH_PRepsoitory;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.DGAML002_Install_paid_BY_OTH_P;

/**
 * 
 * SELECT CUST.Cust_Type_Desc, CUST.Cust_No, CUST.Cust_Name, Acct.Acct_No,
 * Acct.Acct_Key, Acct.Acct_Name, Acct.Acct_Type_Desc, Acct.Emp_Ind AS
 * Acct_Emp_Ind, CUST.Emp_Ind AS Cust_Emp_Ind, CUST.Cust_Key,
 * CUST.Political_Exp_Prsn_Ind, TRANSF.Trans_Key, TRANSF.Date_Key,
 * TRANSF.Time_Key, TRANSF.Trans_Type_Key, TRANSF.Cntry_Key,
 * TRANSF.Trans_Status_Key, TRANSF.Branch_Key, TRANSF.Remit_Ext_Cust_Key,
 * TRANSF.Benef_Ext_Cust_Key, TRANSF.Trans_Ccy_Key, TRANSF.Post_Date_Key,
 * TRANSF.Emp_Key, TRANSF.Ccy_Amt, TRANSF.Ccy_Amt_In_Trans_Ccy,
 * TRANSF.Ccy_Amt_In_Acct_Ccy, TRANSF.Sec_Acct_Key, TRANSF.Relate_Ind,
 * TRANSF.Third_Cust_Ind FROM DGAMLCORE.Customer AS CUST INNER JOIN
 * DGAMLCORE.Customer_X_Account AS C_X_A ON CUST.Cust_Key = C_X_A.Cust_Key AND
 * C_X_A.Chg_Current_Ind = 'Y' INNER JOIN DGAMLCORE.Account AS Acct ON
 * C_X_A.Acct_Key = Acct.Acct_Key INNER JOIN DGAMLCORE.Transaction_Flow AS
 * TRANSF ON Acct.Acct_Key = TRANSF.Acct_Key INNER JOIN
 * DGAMLCORE.Transaction_Type AS Trans_T ON TRANSF.Trans_Type_Key =
 * Trans_T.Trans_Type_Key
 * 
 * @author Hamzah.Ahmed
 */
@Service
// @Transactional
public class AML002AlarmData {
	@Autowired
	Routine_ParameterRepository routine_ParameterRepository;
	@Autowired
	private DGAML002_Install_paid_BY_OTH_PRepsoitory dgaml002_Install_paid_BY_OTH_PRepsoitory;
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;

	public AML002AlarmData() {
	}

	/**
	 * *********** AML002 - ***
	 */
	public AlarmsVM getAML002AlarmData() {
		AlarmsVM scMAVM = new AlarmsVM();
		List<AlarmDTO> listofSC;

		listofSC = selectRecordfromAML002View();
		// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
		// "+listofSC.get(0));
		scMAVM.setAlrmVMs(listofSC);
		Logger.getLogger(AML002AlarmData.class.getName()).log(Level.SEVERE, "");

		return scMAVM;

	}

	// Parameters VMs

	public AlarmsVM getAML002ParmData() {
		AlarmsVM parmMAVM = new AlarmsVM();
		List<AlarmDTO> listofParm;

		listofParm = selectRecordfromAML002Parm();
		// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
		// "+listofSC.get(0));
		parmMAVM.setAlrmVMs(listofParm);
		Logger.getLogger(AML002AlarmData.class.getName()).log(Level.SEVERE, "");

		return parmMAVM;

	}

	// EXPN VM
	public AlarmsVM getAML002EXPNData(int Acct_key) {
		AlarmsVM expnMAVM = new AlarmsVM();
		List<AlarmDTO> listofEXPN;

		listofEXPN = selectRecordfromAML002EXPN(Acct_key);
		// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
		// "+listofSC.get(0));
		expnMAVM.setAlrmVMs(listofEXPN);

		Logger.getLogger(AML002AlarmData.class.getName()).log(Level.SEVERE, "");

		return expnMAVM;

	}

	// select Data
	public List<AlarmDTO> selectRecordfromAML002View() {

		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();

		List<DGAML002_Install_paid_BY_OTH_P> a = this.dgaml002_Install_paid_BY_OTH_PRepsoitory.findAll();

		List<AcRoutineHelper> list = this.ac_RoutineRepository.getRoutineDetail("AML002");

		a.forEach(b -> {
			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(b.getCust_Type_Desc());
			temp.setCust_No(b.getCust_No());
			temp.setCust_Name(b.getCust_Name());
			temp.setAcct_No(b.getAcct_No());
			temp.setAcct_Key(String.valueOf(b.getAcct_Key()));

			temp.setAcct_Name(b.getAcct_Name());
			temp.setAcct_Type_Desc(b.getAcct_Type_Desc());
			temp.setAcct_Emp_Ind(b.getAcct_Emp_Ind());
			temp.setCust_Emp_Ind(b.getCust_Emp_Ind());
			temp.setCust_Key(String.valueOf(b.getCust_Key()));
			temp.setPolitical_Exp_Prsn_Ind(b.getPolitical_Exp_Prsn_Ind());
			temp.setTrans_Key(String.valueOf(b.getTrans_Key()));

			temp.setTransactions_count(selectTransactionsCount(b.getAcct_Key()).toString());

			temp.setDate_Key(String.valueOf(b.getDate_Key()));
			temp.setTime_Key(String.valueOf(b.getTime_Key()));
			temp.setTrans_Type_Key(String.valueOf(b.getTrans_Type_Key()));
			temp.setCntry_Key(String.valueOf(b.getCntry_Key()));
			temp.setTrans_Status_Key(String.valueOf(b.getTrans_Status_Key()));
			temp.setBranch_Key(String.valueOf(b.getBranch_Key()));
			temp.setRemit_Ext_Cust_Key(String.valueOf(b.getRemit_Ext_Cust_Key()));
			temp.setBenef_Ext_Cust_Key(String.valueOf(b.getBenef_Ext_Cust_Key()));
			temp.setTrans_Curr_Key(String.valueOf(b.getTrans_Ccy_Key()));
			temp.setPost_Date_Key(String.valueOf(b.getPost_Date_Key()));
			temp.setEmp_Key(String.valueOf(b.getEmp_Key()));
			// temp.setExec_Cust_Key(b.getcus
			temp.setCcy_Amt(String.valueOf(b.getCcy_Amt()));

			temp.setTotal_amount(selectTotalAmount(b.getAcct_Key()));

			temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(b.getCcy_Amt_In_Trans_Ccy()));
			temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(b.getCcy_Amt_In_Acct_Ccy()));
			temp.setSec_Acct_Key(String.valueOf(b.getSec_Acct_Key()));
			temp.setRelate_Ind(b.getRelate_Ind());
			temp.setThird_Cust_Ind(b.getThird_Cust_Ind());

			temp.setNum_inst(selectInstNum(b.getAcct_Key()));

			if (list.size() > 0) {
				temp.setRoutine_Id(String.valueOf(list.get(0).getRoutine_Id()));
				temp.setRoutine_Name(list.get(0).getRoutine_Name());
				temp.setAlarm_Categ_Cd(list.get(0).getAlarm_Categ_Cd());
				temp.setAlarm_Subcateg_Cd(list.get(0).getAlarm_Subcateg_Cd());
				temp.setRoutine_Short_Desc(list.get(0).getRoutine_Short_Desc());
				temp.setRoutine_Msg_Txt(list.get(0).getRoutine_Msg_Txt());
			}

		});
		return listOfSC;

	}

	/**
	 * ************** Get transactions count
	 * 
	 * 
	 * changed from jdbc syntac to hql by hussien
	 * 
	 * 
	 */
	public String selectTransactionsCount(int Acct_key) {
		String transactions_count1 = null;

		List<Object[]> z = this.dgaml002_Install_paid_BY_OTH_PRepsoitory.TransactionsCount(Acct_key);
		if (z.size() > 0)
			transactions_count1 = z.get(0)[0].toString();
		return transactions_count1;
	}

	/**
	 * ************** Get Total amount changed from jdbc syntac to hql by hussien
	 * 
	 */
	public String selectTotalAmount(int Acct_key) {

		String total_amount1 = null;

		List<Object[]> z = this.dgaml002_Install_paid_BY_OTH_PRepsoitory.selectTotalAmount(Acct_key);
		if (z.size() > 0)
			total_amount1 = String.valueOf(z.get(0)[0]);
		return total_amount1;

	}

	/**
	 * ************** Get Number of installments convert from jdbc to hql hussien
	 */
	public String selectInstNum(int Acct_key) {

		String inst_num1 = null;
		List<Object[]> list = this.dgaml002_Install_paid_BY_OTH_PRepsoitory.selectInstNum(Acct_key);
		if (list.size() > 0) {
			inst_num1 = list.get(0)[0].toString();
		}
		return inst_num1;
	}

	/**
	 * ************ Get parameters Data * changed from jdbc syntac to hql by hussien
	 */
	public List<AlarmDTO> selectRecordfromAML002Parm() {

		List<AC_Routine_Parameter> list = this.routine_ParameterRepository.getRoutineParameter("AML002");
		List<AlarmDTO> listOfParm = new ArrayList<>();
		list.forEach(q -> {
			AlarmDTO tempParm = new AlarmDTO();

			tempParm.setParm_name(q.getId().getParm_Name());
			tempParm.setParm_value(q.getParm_Value());
			tempParm.setParm_type_desc(q.getParm_Type_Desc());
			listOfParm.add(tempParm);
		});
		return listOfParm;
	}

	// Execution party
	/*
	 * changed from jdbc syntac to hql by hussien
	 */
	public List<AlarmDTO> selectRecordfromAML002EXPN(int Acct_key) {

		List<AlarmDTO> listOfEXPN = new ArrayList<>();

		List<Object[]> L = this.dgaml002_Install_paid_BY_OTH_PRepsoitory.selectRecordfromAML002EXPN(Acct_key);
		L.forEach(q -> {
			AlarmDTO tempEXPN = new AlarmDTO();

			tempEXPN.setExec_Cust_Key(q[0].toString());

			listOfEXPN.add(tempEXPN);
		});
		return listOfEXPN;

	}

	/**
	 * *********** End of AML002 ***
	 */

}
