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

		//List<Account> articleList = accountObjectRepository.findAll();

		String query = "select A from Account A where 1=1 ";
		if (!AccountNumber.isEmpty()&&AccountNumber!=null) {
			query += " and A.acct_No='" + AccountNumber + "'";
//			articleList = articleList.stream().filter(p->p.getAcct_No()!=null)
//					.filter(article ->
//
//			article.getAcct_No().trim().equals(AccountNumber.trim())).collect(Collectors.toList());

		}
		if (!AccountType.isEmpty()&&AccountType!=null) {
			query += " and A.acct_Type_Desc='" + AccountType + "'";
//			articleList = articleList.stream().filter(a->a.getAcct_Type_Desc()!=null)
//					.filter(a -> a.getAcct_Type_Desc().trim().equals(AccountType.trim()))
//					.collect(Collectors.toList());
		}
		if (!AccountName.isEmpty()&&AccountName!=null) {
			query += " and A.acct_Name='" + AccountName + "'";
//			articleList = articleList.stream().filter(a->a.getAcct_Name()!=null).
//					filter(a -> a.getAcct_Name().trim().equals(AccountName.trim()))
//					.collect(Collectors.toList());
		}

		if (!AccountOpenDate.isEmpty()&&AccountOpenDate!=null) {
			query += " and A.acct_Open_Date='" + AccountOpenDate + "'";
		

//			articleList = articleList.stream().filter(a->a.getAcct_Open_Date()!=null).
//					filter(e -> e.getAcct_Open_Date() != null).filter(
//					article -> (article.getAcct_Open_Date().toString().split(" ")[0]).trim().equals(AccountOpenDate.trim()))
//					.collect(Collectors.toList());
		}
		if (!AccountCloseDate.isEmpty()&&AccountCloseDate!=null) {
			query += " and A.acct_Close_Date='" + AccountCloseDate + "'";
//			articleList = articleList.stream().filter(a->a.getAcct_Close_Date()!=null).
//					filter(e -> e.getAcct_Close_Date() != null)
//					.filter(article -> (article.getAcct_Close_Date().toString().split(" ")[0]).trim()
//							.equals(AccountCloseDate.trim()))
//					.collect(Collectors.toList());
		}
	return entityManager.createQuery(query,Account.class).getResultList();
	//	return articleList;

	}
	@RequestMapping("accountDetail")
	public Account getAccountDetail(@RequestParam("accountNumber") String accountNumber  ){
		
		return this.accountObjectRepository.fetchAccountsByAccountNumber(accountNumber).get(0);
		
		
	}
	@RequestMapping("alarmInBrief")
	public List  alarmAccount(@RequestParam("accountKey") String accountKey ) {
		String query="Select D from AC_Alarm D  inner join AC_Transaction_Flow_Alarm T on  D.alarmed_Obj_Key=T.exec_Cust_Key"
				+ " where"
				+ ""
				+ " T.acct_Key="+accountKey;
		return this.entityManager.createQuery(query).getResultList();
	}
}
