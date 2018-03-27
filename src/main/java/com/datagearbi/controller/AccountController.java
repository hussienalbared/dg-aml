package com.datagearbi.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Account;
import com.datagearbi.repository.AccountObjectRepository;

@RestController
@RequestMapping("aml/api/account")
public class AccountController {
	@Autowired
	private AccountObjectRepository accountObjectRepository;

	 @PersistenceContext
	 private EntityManager entityManager;


	@RequestMapping(value = "allaccounts", method = RequestMethod.GET)
	public List<Account> allAccounts() {
		return accountObjectRepository.findAll();
	}


	@RequestMapping(value="search",method=RequestMethod.POST)
	public List<Account> helperfunction(String Accountnumber,String Accountname,String AccountType) throws SQLException {
		
		String query="select * from CORE_ACCOUNT_D a where 1=1 ";
		if(!Accountnumber.isEmpty()) {
			query+=" and ACCTNO='"+Accountnumber+"'";
		}
		if(!AccountType.isEmpty()) {
			query+=" and ACCTTYDESC='"+AccountType+"'";
		}
		if(!Accountname.isEmpty()) {
			query+=" and ACCTNM='"+Accountname+"'";
		}
		
		

		List<Account>list = entityManager.createNativeQuery(query).getResultList();
	
		 return list;

		
	}




}
