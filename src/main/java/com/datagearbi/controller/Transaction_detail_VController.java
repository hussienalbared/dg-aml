package com.datagearbi.controller;

import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Transaction_detail_V;


@RestController
@RequestMapping("aml/api/Transaction_detail")
@CrossOrigin(origins="*")
public class Transaction_detail_VController {
	@PersistenceContext
	private EntityManager em;

	@RequestMapping(value="transactionDeatil",method=RequestMethod.GET)
	public Object getTranasctionDetail(@RequestParam("ttrn")String ttrn){
		
		List<Transaction_detail_V> test = em.createNativeQuery("SELECT * FROM Transaction_detail_V t where TTRN='"+ttrn+"'",Transaction_detail_V.class).getResultList();

		return test;
//		  return em.createNativeQuery("SELECT * FROM Transaction_detail_V t").getResultList().subList(1, 5);
		//  return em.createQuery("SELECT t FROM Transaction_detail_V t").getResultList();
//	Object result=	 em.createNativeQuery("select  *  from transaction_detail_V where TTRN='"+ttrn+"'").getSingleResult();
//	return result;
		
		
	
	 
	}

}
