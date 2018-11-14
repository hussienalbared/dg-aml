package com.datagearbi.agp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.DGAML023_Payments_PEPRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.DGAML023_Payments_PEP;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.service.AlarmGeneration;

@Service
public class se {

	@Autowired
	private DGAML023_Payments_PEPRepository paymentsByPEPRepository;
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

	public List<AlarmDTO> getAllRecordsFromView(){
		
		List<AcRoutineHelper> routine_detail = this.getRoutine_23_Parameters();

		
		List<DGAML023_Payments_PEP> records = paymentsByPEPRepository.findAll() ; 
		List<AlarmDTO> list = new ArrayList<AlarmDTO>();

		records.forEach(res -> {
			AlarmDTO temp = new AlarmDTO();
			temp.setCust_Type_Desc(res.getCust_Type_Desc());
			temp.setCust_No(res.getCust_No());
			temp.setCust_Name(res.getCust_Name());
//			temp.setAcct_No(res.getAcct_No());
			temp.setAcct_Key(String.valueOf(res.getAcct_Key()));

			temp.setAcct_Name(res.getAcct_Name());
			temp.setAcct_Type_Desc(res.getAcct_Type_Desc());
//			temp.setAcct_Emp_Ind(res.getAcct_Emp_Ind());
			temp.setCust_Emp_Ind(res.getCust_Emp_Ind());
			temp.setCust_Key(res.getCust_Key());
			
			// setting the pep to temp
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

			temp.setTotal_amount(getTotalAmountOfPepCustomer(res.getCust_Key()));
			
			// setting the cdi to temp
			temp.setCredit_Ind(res.getTrans_Cr_Db_Ind_Cd());
			temp.setCcy_Amnt_In_Trans_Ccy(String.valueOf(res.getCcy_Amt_In_Trans_Ccy()));
			temp.setCcy_Amnt_In_Acct_Ccy(String.valueOf(res.getCcy_Amt_In_Acct_Ccy()));
			temp.setSec_Acct_Key(String.valueOf(res.getSec_Acct_Key()));
			temp.setRelate_Ind(String.valueOf(res.getRelate_Ind()));
			temp.setThird_Cust_Ind(res.getThird_Cust_Ind());

			if (routine_detail.size() > 0) {
				temp.setRoutine_Id(String.valueOf(routine_detail.get(0).getRoutine_Id()));
				temp.setRoutine_Name(routine_detail.get(0).getRoutine_Name());
				temp.setAlarm_Categ_Cd(routine_detail.get(0).getAlarm_Categ_Cd());
				temp.setAlarm_Subcateg_Cd(routine_detail.get(0).getAlarm_Subcateg_Cd());
				temp.setRoutine_Short_Desc(routine_detail.get(0).getRoutine_Short_Desc());
				temp.setRoutine_Msg_Txt(routine_detail.get(0).getRoutine_Msg_Txt());
			}
			
			list.add(temp);
			
		});
		return list;
		}

		public List<AcRoutineHelper> getRoutine_23_Parameters() {
	
				List<AcRoutineHelper> routine_detail = this.ac_RoutineRepository.getRoutineDetail("AML0023");
				System.out.println(routine_detail.size() + "routine_detail");
				return routine_detail;
			}

	
		public String getTotalAmountOfPepCustomer(int customerKey) {
			
			Long totalAmount = this.paymentsByPEPRepository.CalculateTransactionTotalAmountOfPepCustomer(customerKey);
			System.out.println("totalamount:" + totalAmount);
			String result = String.valueOf(totalAmount) != null ? String.valueOf(totalAmount) : "0";
			return result;
		}
		
		
		public void alarmGenerationProcess(){
			List<AlarmDTO> alarms = this.getAllRecordsFromView();
			Long totalAmountOfPerCustomer ; 
			for (int i = 0 ; i < alarms.size() ; i++){
				totalAmountOfPerCustomer = Long.valueOf(this.getTotalAmountOfPepCustomer(i)) ;
				System.out.println("the total amount of customer is" +  totalAmountOfPerCustomer);
				

		}
		
		
		
		
		
		
		
		
		
		
		}
		
}

		
		
		
		
		
		
		
		
		
	
