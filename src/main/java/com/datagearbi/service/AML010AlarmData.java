/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.DGAML010_Excessive_ACCT_CLS_OPNRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.DGAML010_Excessive_ACCT_CLS_OPN;

/**
 *
 * @author Hamzah.Ahmed
 */
@Service
public class AML010AlarmData {

	@Autowired
	private DGAML010_Excessive_ACCT_CLS_OPNRepository dGAML010_Excessive_ACCT_CLS_OPNRepository;
	
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;
	
	@Autowired
	private Routine_ParameterRepository routine_ParameterRepository;

	public AML010AlarmData() {
	}

	/**
	 * *********** AML010 - ***
	 */
	public AlarmsVM getAML010AlarmData() {
		AlarmsVM scMAVM = new AlarmsVM();
		List<AlarmDTO> listofSC;

		listofSC = selectRecordfromAML010View();

		scMAVM.setAlrmVMs(listofSC);

		return scMAVM;

	}

	// Parameters VMs

	public AlarmsVM getAML010ParmData() {
		AlarmsVM parmMAVM = new AlarmsVM();
		List<AlarmDTO> listofParm;

		listofParm = selectRecordfromAML010Parm();

		parmMAVM.setAlrmVMs(listofParm);

		return parmMAVM;

	}

	// select Data
	public List<AlarmDTO> selectRecordfromAML010View() {

		List<AlarmDTO> listOfSC = new ArrayList<AlarmDTO>();
	
		List<DGAML010_Excessive_ACCT_CLS_OPN> a = this.dGAML010_Excessive_ACCT_CLS_OPNRepository.findAll();
		List<AcRoutineHelper> list = this.ac_RoutineRepository.getRoutineDetail("AML010");
		
		 a.forEach(res->{
			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(res.getCust_Type_Desc());
			temp.setCust_No(res.getCust_No());
			temp.setCust_Name(res.getCust_Name());
			temp.setAcct_No(res.getExpr7());
			temp.setAcct_Key(String.valueOf(res.getExpr6()));

			temp.setAcct_Name(res.getAcct_Name());
			temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
			temp.setAcct_Emp_Ind(res.getExpr16());
			temp.setCust_Emp_Ind(res.getCust_Emp_Ind());
			temp.setCust_Key(String.valueOf(res.getCust_Key()));
			temp.setPolitical_Exp_Prsn_Ind(res.getPolitical_Exp_Prsn_Ind());
			temp.setTrans_Key(String.valueOf(res.getTrans_Key()));

			temp.setTransactions_count(selectTransactionsCount(res.getExpr6()));

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

			temp.setTotal_amount(selectTotalAmount(res.getExpr6()));

			temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(res.getCcy_Amt_In_Trans_Ccy()));
			temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(res.getCcy_Amt_In_Acct_Ccy()));
			temp.setSec_Acct_Key(String.valueOf(res.getSec_Acct_Key()));
			temp.setRelate_Ind(res.getRelate_Ind());
			temp.setThird_Cust_Ind(res.getThird_Cust_Ind());

			temp.setNum_inst(selectInstNum(res.getExpr6()));
			if (list.size() > 0) {
				temp.setRoutine_Id(String.valueOf(list.get(0).getRoutine_Id()));
				temp.setRoutine_Name(list.get(0).getRoutine_Name());
				temp.setAlarm_Categ_Cd(list.get(0).getAlarm_Categ_Cd());
				temp.setAlarm_Subcateg_Cd(list.get(0).getAlarm_Subcateg_Cd());
				temp.setRoutine_Short_Desc(list.get(0).getRoutine_Short_Desc());
				temp.setRoutine_Msg_Txt(list.get(0).getRoutine_Msg_Txt());
			}

			listOfSC.add(temp);

		});

		return listOfSC;

	}

	/**
	 * ************** Get transactions count
	 */
	public String selectTransactionsCount(int Acct_key) {

		String transactions_count1 = null;

		List<Object[]> z = this.dGAML010_Excessive_ACCT_CLS_OPNRepository.getTransactionCount(Acct_key);
		
		if (z.size() > 0)
			transactions_count1 = z.get(0)[0]!=null?z.get(0)[0].toString():null;
		return transactions_count1;	}

	/**
	 * ************** Get Total amount
	 */
	public String selectTotalAmount(int Acct_key)  {

		String total_amount1 = null;
		
		List<Object[]> z = this.dGAML010_Excessive_ACCT_CLS_OPNRepository.getTotalAmount(Acct_key);
		
		if (z.size() > 0)
			total_amount1 = z.get(0)[0]!=null?z.get(0)[0].toString():null;
		return total_amount1;
			}

	/**
	 * ************** Get Number of installments
	 */
	public String selectInstNum(int Acct_key) {

		 String inst_num1=null;
		
		 List <Object[]>tt= this.dGAML010_Excessive_ACCT_CLS_OPNRepository.selectInstNum(Acct_key);
		 
		 if(tt.size()>0)
			inst_num1= tt.get(0)[0]!=null?tt.get(0)[0].toString():null;
	        
	                return inst_num1;
	}

	/**
	 * ************ Get parameters Data
	 */
	public List<AlarmDTO> selectRecordfromAML010Parm() {

		List<AC_Routine_Parameter> c = this.routine_ParameterRepository.getRoutineParameter("AML010");
		
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
	 * *********** End of AML010 ***
	 */
	

}
