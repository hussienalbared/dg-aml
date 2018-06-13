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

import org.springframework.beans.factory.annotation.Autowired;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.DGAML020_Large_Number_Autho_Conduct_BusinRepository;
import com.datagearbi.agp.repository.DGAML022_Payments_High_Risk_Industry_CustRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.DGAML020_Large_Number_Autho_Conduct_Busin;

/**
 *
 * @author Hamzah.Ahmed
 */
public class AML020AlarmData {

	@Autowired
	private DGAML020_Large_Number_Autho_Conduct_BusinRepository dGAML020_Large_Number_Autho_Conduct_BusinRepository;
	
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;
	
	@Autowired
	private Routine_ParameterRepository routine_ParameterRepository;

	public AML020AlarmData() {
	}

	/**
	 * *********** AML020 - ***
	 */
	public AlarmsVM getAML020AlarmData() {
		AlarmsVM scMAVM = new AlarmsVM();
		List<AlarmDTO> listofSC;

		try {
			listofSC = selectRecordfromAML020View();
			// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
			// "+listofSC.get(0));
			scMAVM.setAlrmVMs(listofSC);
		} catch (SQLException ex) {
			Logger.getLogger(AML020AlarmData.class.getName()).log(Level.SEVERE, null, ex);
		}

		return scMAVM;

	}

	// Parameters VMs

	public AlarmsVM getAML020ParmData() {
		AlarmsVM parmMAVM = new AlarmsVM();
		List<AlarmDTO> listofParm;

		try {
			listofParm = selectRecordfromAML020Parm();
			// System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():
			// "+listofSC.get(0));
			parmMAVM.setAlrmVMs(listofParm);
		} catch (SQLException ex) {
			Logger.getLogger(AML020AlarmData.class.getName()).log(Level.SEVERE, null, ex);
		}

		return parmMAVM;

	}

	// select Data
	public List<AlarmDTO> selectRecordfromAML020View() throws SQLException {

		List<AlarmDTO> listOfSC = new ArrayList<>();

//		String selectRecord = "select D from DGAML020_Large_Number_Autho_Conduct_Busin D";
//		
//		String selectRecord1 = "select new com.datagearbi.helper.AcRoutineHelper (A.routine_Id,A.routine_Name,A.alarm_Categ_Cd,A.alarm_Subcateg_Cd"
//				+ ",A.routine_Short_Desc"
//				+ ", A.routine_Msg_Txt)  from AC_Routine A where A.routine_Name='AML020' and current_Ind='Y'";
//		List<DGAML020_Large_Number_Autho_Conduct_Busin> a = this.entityManager
//				.createQuery(selectRecord, DGAML020_Large_Number_Autho_Conduct_Busin.class).getResultList();
//		List<AcRoutineHelper> list = this.entityManager.createQuery(selectRecord1, AcRoutineHelper.class)
//				.getResultList();
		
		List<DGAML020_Large_Number_Autho_Conduct_Busin> a= this.dGAML020_Large_Number_Autho_Conduct_BusinRepository.findAll();
		List<AcRoutineHelper> list = this.ac_RoutineRepository.getRoutineDetail("AML020");
		
		a.forEach(res -> {
			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(res.getCust_Type_Desc());
			temp.setCust_No(res.getCust_No());
			temp.setCust_Name(res.getCust_Name());
			temp.setAcct_Emp_Ind(res.getAcct_Emp_Ind());
			temp.setCust_Key(String.valueOf(res.getCust_Key()));
			temp.setPolitical_Exp_Prsn_Ind(res.getPolitical_Exp_Prsn_Ind());
			temp.setCust_Ident_type_Desc(res.getCust_Ident_Type_Desc());
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

			/**
			 * ***********************************************
			 */
			listOfSC.add(temp);

		});

		return listOfSC;

	}

	/**
	 * ************ Get parameters Data
	 */

	public List<AlarmDTO> selectRecordfromAML020Parm() throws SQLException {
//		String selectParmRecord = "select A  from AC_Routine_Parameter A where A.id.routine_Id "
//				+ "=(select B.routine_Id from AC_Routine B" + " where B.routine_Name='AML020' and B.current_Ind='Y')";
//
//		List<AC_Routine_Parameter> c = this.entityManager.createQuery(selectParmRecord, AC_Routine_Parameter.class)
//				.getResultList();
		
		List<AC_Routine_Parameter> c = this.routine_ParameterRepository.getRoutineParameter("AML020");
		
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
	 * *********** End of AML020 ***
	 */
	public static void main(String[] args) {
		// AlarmProcess AMLP = new AlarmProcess();
		// AlarmVM Results = AMLP.getAlarmData();
	}

}
