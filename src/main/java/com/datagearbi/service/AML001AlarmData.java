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
import com.datagearbi.agp.repository.Dgaml001TransLoanXToRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.Dgaml001TransLoanXToT;

/**
 *
 * @author Hamzah.Ahmed
 * 
 *         This class gets all data for the AML001
 */
@Service
public class AML001AlarmData {

	@Autowired
	Routine_ParameterRepository routine_ParameterRepository;

	@Autowired
	Dgaml001TransLoanXToRepository dgaml001TransLoanXToRepository;
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;

	public AML001AlarmData() {
	}

	/**
	 * *********** AML001 - ***
	 */
	public AlarmsVM getAML001AlarmData() {
		AlarmsVM scMAVM = new AlarmsVM();
		List<AlarmDTO> listofSC;

		listofSC = selectRecordfromAML001View();
		// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
		// "+listofSC.get(0));
		scMAVM.setAlrmVMs(listofSC);

		return scMAVM;

	}

	// Parameters VMs

	public AlarmsVM getAML001ParmData() {
		AlarmsVM parmMAVM = new AlarmsVM();
		List<AlarmDTO> listofParm;

		listofParm = selectRecordfromAML001Parm();
		// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
		// "+listofSC.get(0));
		parmMAVM.setAlrmVMs(listofParm);
		Logger.getLogger(AML001AlarmData.class.getName()).log(Level.SEVERE, "");

		return parmMAVM;

	}

	// select Data
	public List<AlarmDTO> selectRecordfromAML001View() {

		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();

		List<Dgaml001TransLoanXToT> res1 = this.dgaml001TransLoanXToRepository.findAll();

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

	/**
	 * ************** Get transactions count
	 */
	public String selectTransactionsCount(int Acct_key) {
		String transactions_count1 = null;

		List<Long> f = this.dgaml001TransLoanXToRepository.getTransactionCount(Acct_key);

		if (f.size() > 0) {
			long z = f.get(0);
			transactions_count1 = String.valueOf(z);
		}

		return transactions_count1;

	}

	/**
	 * ************ Get parameters Data
	 */
	public List<AlarmDTO> selectRecordfromAML001Parm() {

		List<AlarmDTO> listOfParm = new ArrayList<AlarmDTO>();

		List<AC_Routine_Parameter> list = this.routine_ParameterRepository.getRoutineParameter("AML001");

		for (AC_Routine_Parameter r : list) {
			AlarmDTO tempParm = new AlarmDTO();
			tempParm.setParm_name(r.getParm_Desc());
			tempParm.setParm_value(r.getParm_Value());
			tempParm.setParm_type_desc(r.getParm_Type_Desc());
			listOfParm.add(tempParm);
		}

		return listOfParm;

	}
}
