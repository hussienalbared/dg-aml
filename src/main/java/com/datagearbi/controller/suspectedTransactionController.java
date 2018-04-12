package com.datagearbi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Suspected_transactions_V;

@RestController
@RequestMapping("aml/api/v1/suspectedTransaction")
@CrossOrigin(origins = "http://localhost:4200")
public class suspectedTransactionController {
	@PersistenceContext
	private EntityManager entityManager;
	@SuppressWarnings("unchecked")
	@RequestMapping("all")
	private List<Suspected_transactions_V> suspectedTransaction(@RequestParam("partyNumber")String partyNumber) {
		String Query=
				
				"select * from AML_DEV.AML.suspected_transactions_V\r\n" + 
				"where ACCTNO in ("+
				
				"select  ACCTNO from AML_DEV.AML.CORE_ACCOUNT_D where change_current_ind='Y'" + 
				"and account_key in(" + 
				"" + 
				"select account_key from AML_DEV.AML.CORE_PARTY_ACCOUNT_B where change_current_ind='Y'"
				+ " and PACCTNO='"+partyNumber+"'"
				+ "" + 
				")" + 
				"" + 
				"" + 
				")";
		return (List<Suspected_transactions_V>)this.entityManager.createNativeQuery(Query).getResultList();
		
		

	}
	

}
