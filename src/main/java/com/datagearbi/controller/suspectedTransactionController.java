package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Suspected_transactions_V;
import com.datagearbi.service.suspectedTransactionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("aml/api/suspectedTransaction")

public class suspectedTransactionController {
	
	@Autowired
	public suspectedTransactionService suspectedTransactionService;
	
	@RequestMapping("all")
	public List<Suspected_transactions_V>  suspectedTransaction(@RequestParam("partyNumber")String partyNumber) {
	return this.suspectedTransactionService.getCustomerSuspectedTransaction(partyNumber);	
		

	}
	
	

}
