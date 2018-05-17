package com.datagearbi.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Account;
import com.datagearbi.repository.AccountObjectRepository;






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
			query += " and A.acct_Open_Date like '%" + AccountOpenDate + "%'";
		

		}
		if (!AccountCloseDate.isEmpty()&&AccountCloseDate!=null) {
			query += " and A.acct_Close_Date like '%" + AccountCloseDate + "%'";

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
	
}
