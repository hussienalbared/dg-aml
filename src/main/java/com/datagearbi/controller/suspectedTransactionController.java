package com.datagearbi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Suspected_transactions_V;
import com.datagearbi.repository.suspected_transactions_VRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("aml/api/suspectedTransaction")

public class suspectedTransactionController {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private suspected_transactions_VRepository suspected_transactions_VRepository;
	
	@RequestMapping("all")
	public List  suspectedTransaction(@RequestParam("partyNumber")String partyNumber) {
	
		List<Integer> accountKeys1=this.entityManager.createQuery("select B.id.acct_Key from Customer_X_Account B where B.chg_Current_Ind='Y'   and B.id.cust_Key="+partyNumber).getResultList();
		Query q1=this.entityManager.createQuery("select  A.acct_Key from Account A where A.chg_Current_Ind='Y' and  A.acct_Key in (:varList)");
		q1.setParameter("varList", accountKeys1);

		List<Integer> accountKeys2=	q1.getResultList();
		Query q2=entityManager.createQuery("select s from Suspected_transactions_V s where s.acct_Key in (:varList2)");
		q2.setParameter("varList2", accountKeys2);
		return q2.getResultList();
		
		
		
		
		

	}
	
	

}
