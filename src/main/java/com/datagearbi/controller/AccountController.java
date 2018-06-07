package com.datagearbi.controller;

import java.com.datagearbi.aml.agp.AlarmsProcess;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.DateUtil;
import com.datagearbi.helper.ParamRecord;
import com.datagearbi.model.AC_Routine;
import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.Account;
import com.datagearbi.repository.AccountObjectRepository;
import com.datagearbi.service.*;





@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/account")
public class AccountController {

	@Autowired
	private AccountObjectRepository accountObjectRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
//
	@RequestMapping(value = "allaccounts", method = RequestMethod.GET)
	public List allAccounts() {
		return accountObjectRepository.findAll();
	
	}

	/* Search function- */
	@RequestMapping(value = "searchAccount", method = RequestMethod.GET)
	@ResponseBody
	public List<Account> search(@RequestParam(name = "AccountNumber") String AccountNumber,
			@RequestParam(name = "AccountName") String AccountName,
			@RequestParam(name = "AccountType") String AccountType,
			@RequestParam(name = "AccountOpenDate") String AccountOpenDate,
			@RequestParam(name = "AccountCloseDate") String AccountCloseDate)

	{
		if ((AccountNumber == null || AccountNumber.isEmpty()) && (AccountName == null || AccountName.isEmpty())
				&& (AccountType == null || AccountType.isEmpty())
				&& (AccountOpenDate == null || AccountOpenDate.isEmpty())
				&& (AccountCloseDate == null || AccountCloseDate.isEmpty())) {
			return null;
		}

		

		String query = "select A from Account A where 1=1 ";
		if (!AccountNumber.isEmpty()&&AccountNumber!=null) {
			query += " and A.acct_No like '%" + AccountNumber + "%'";

		}
		if (!AccountType.isEmpty()&&AccountType!=null) {
			query += " and A.acct_Type_Desc like '%" + AccountType + "%'";

		}
		if (!AccountName.isEmpty()&&AccountName!=null) {
			query += " and A.acct_Name like '%" + AccountName + "%'";

		}

		if (!AccountOpenDate.isEmpty()&&AccountOpenDate!=null) {
			
			query += " and A.acct_Open_Date >='" + DateUtil.startOfDay(AccountOpenDate) + "'"
					+" and A.acct_Open_Date <=' "+ DateUtil.endOfDay(AccountOpenDate) + "'";
		

		}
		if (!AccountCloseDate.isEmpty()&&AccountCloseDate!=null) {
			
			
			query += " and A.acct_Close_Date >='" + DateUtil.startOfDay(AccountCloseDate) + "'"
					+" and A.acct_Close_Date <='"+ DateUtil.endOfDay(AccountCloseDate) + "'";
		


		}
	return entityManager.createQuery(query,Account.class).getResultList();
	
	}
	@RequestMapping("accountDetail")
	public Account getAccountDetail(@RequestParam("accountNumber") String accountNumber  ){
		
		return this.accountObjectRepository.fetchAccountsByAccountNumber(accountNumber).get(0);
		
		
	}
	@RequestMapping("alarmInBrief")
	public List  alarmAccount(@RequestParam("accountKey") String accountKey ) {
	
		String query2="Select D from AC_Alarm D where D.alarmed_Obj_Level_Cd='ACC' and D.alarmed_Obj_Key= "+Long.parseLong(accountKey);
		return this.entityManager.createQuery(query2).getResultList();
	}
	@RequestMapping("accountDetailSection3")
	public List  accountDetailSection3(@RequestParam("accountNo") String accountNo) {
	
		String query2="Select D from Suspected_transactions_V D where D.acct_No='"+accountNo+"'";
		return this.entityManager.createQuery(query2).getResultList();
	}
	@RequestMapping("test")
	public void test() {

	    int SCR[]={1,2,3,5,7,10,16,20,21,22,23};
	    
	    for (int x : SCR)
	    {
	            //System.out.println("gsjkfgskj:"+ x);
	            
	            switch (x) {
	            case 1:  try {
						AlarmsProcess.insertAML001AlarmData();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                     break;
//	            case 2:  AlarmsProcess.insertAML002AlarmData();
//	                     break;
//	            case 3:  AlarmsProcess.insertAML003AlarmData();
//	                     break;
//	            case 5:  AlarmsProcess.insertAML005AlarmData();
//	                     break;
//	            case 7:  AlarmsProcess.insertAML007AlarmData();
//	                     break;
//	            case 10: AlarmsProcess.insertAML010AlarmData(); ;
//	                     break;
//	            case 16:  AlarmsProcess.insertAML016AlarmData();
//	                     break;
//	            case 20:  AlarmsProcess.insertAML020AlarmData();
//	                     break;
//	            case 21:  AlarmsProcess.insertAML021AlarmData();
//	                     break;
//	            case 22: AlarmsProcess.insertAML022AlarmData();
//	                     break;
//	            case 23: AlarmsProcess.insertAML023AlarmData();
//	                     break;
	            default: System.out.println("Invalid Scenario Name");;
	                     break;
	        }

	}
	}
}