package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.CoreTransactionD;
import com.datagearbi.model.dto.report.AlarmReportDTO;
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
	@CrossOrigin
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
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="createSamaReport", method=RequestMethod.POST)
	public List<SAMAReportDTO> createSamaReport(@RequestBody Integer[] transactionId){
		return reportService.getSAMAReport(transactionId);
	}
	

	/**
	 * return three types of alarm reports(active, closed, suppressed) for period based on status
	 *  
	 *  status = "CLS” in case of closed report
	 *  status = “SUP” in case of suppressed report
	 * 
	 * parameters 
	 * 	status 
	 * 	period 
	 * 	reportType
	 * **/
	@RequestMapping("getAlarmReport")
	public List<AlarmReportDTO> getAlarmReport(@RequestParam(name = "status") String status){
		return reportService.getAlarmsReport(status);
	}
	
	@CrossOrigin(allowedHeaders="*",allowCredentials="true")
	@RequestMapping(value="saveSamaReport", method=RequestMethod.POST)
	public void saveSamaReport(@RequestBody SAMAReportDTO samaReportDTO) {
		reportService.saveSAMARport(samaReportDTO);
	}
	
}
