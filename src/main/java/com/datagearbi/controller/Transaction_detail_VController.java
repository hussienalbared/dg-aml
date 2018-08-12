package com.datagearbi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Transaction_Detail_V;




@RestController
@RequestMapping("aml/api/Transaction_detail")
@CrossOrigin(origins="*")
public class Transaction_detail_VController {
	@PersistenceContext
	private EntityManager em;

	@RequestMapping(value="transactionDeatil",method=RequestMethod.GET)
	public Object getTranasctionDetail(@RequestParam("ttrn")String ttrn){
		
		List<Transaction_Detail_V> test = em.createQuery("SELECT T FROM Transaction_Detail_V T where T.trans_Ref_No='"+ttrn+"'",Transaction_Detail_V.class).getResultList();

		return test;
//	
		
		
	
	 
	}

}
