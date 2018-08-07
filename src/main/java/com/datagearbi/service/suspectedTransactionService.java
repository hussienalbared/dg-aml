package com.datagearbi.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;

import com.datagearbi.model.Suspected_transactions_V;

@Service
public class suspectedTransactionService {
	@PersistenceContext
	private EntityManager entityManager;
	public List<Suspected_transactions_V> getCustomerSuspectedTransaction(String partyNumber) {
		
		List<Suspected_transactions_V> Suspected_transactions =new ArrayList<>();
		TypedQuery<Integer> query = entityManager.createQuery(
			      "SELECT c.id.acct_Key FROM Customer_X_Account AS c where c.chg_Current_Ind='Y'   and c.cust_No= ?1", Integer.class);
		query.setParameter(1, partyNumber);
			  List<Integer> accountKeys1 = query.getResultList();
	
		if(accountKeys1.size()<1)
			return Suspected_transactions;
		TypedQuery<Integer> query2=entityManager.createQuery("select  A.acct_Key from Account A where A.chg_Current_Ind='Y' and  A.acct_Key in :varList",Integer.class);
		query2.setParameter("varList", accountKeys1);

		List<Integer> accountKeys2=	query2.getResultList();
		if(accountKeys2.size()<1)
			return Suspected_transactions;
		TypedQuery<Suspected_transactions_V> query3=entityManager.createQuery("select s from Suspected_transactions_V s where s.acct_Key in :varList2",Suspected_transactions_V.class);
		query3.setParameter("varList2", accountKeys2);
		
		Suspected_transactions= query3.getResultList();
		return Suspected_transactions;
		
		
	
	}

}
