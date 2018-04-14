package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.CoreTransactionD;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.service.ReportService;

@RestController
@RequestMapping("report/")
public class ReportController {

	
	@Autowired
	private ReportService reportService;
	
	
	/**
	 * return the transactions related to the entered customer id
	 * 
	 * parameter customerId
	 * 
	 * **/
	@RequestMapping("getTransactions")
	public List<CoreTransactionD> getTransactions(@RequestParam(name = "customerId")String customerId) {
		return reportService.getTransactions(customerId);
	}
	
	/**
	 * used to create new SAMA report in case of the request coming from SAMA report tab
	 * return SAMA report(s) based on the entered transaction id(s) input
	 * 
	 * parameters transactionID(s)
	 * **/
	@RequestMapping("createSamaReport")
	public List<SAMAReportDTO> createSamaReport(@RequestParam(name = "transactionId")String[] transactionId){
		return reportService.getSAMAReport(transactionId);
	}
	

	
}
