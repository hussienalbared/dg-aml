package com.datagearbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.service.ReportService;

@RestController
@RequestMapping("report/")
public class ReportController {

	
	@Autowired
	private ReportService reportService;
	
	/**
	 * used to create new SAMA report in case of the request coming from SAMA report tab
	 * 
	 * parameters transaction ID
	 * **/
	@RequestMapping("createSamaReport")
	public SAMAReportDTO createSamaReport(){
		return reportService.getSAMAReport();
	}
	
	
}
