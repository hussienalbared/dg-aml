package com.datagearbi.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Transaction_Detail;
import com.datagearbi.model.dto.report.AlarmReportDTO;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.service.ReportService;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPropertiesHolder;
import net.sf.jasperreports.engine.JRPropertiesMap;
import net.sf.jasperreports.engine.JRPropertiesUtil;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.xml.JasperPrintFactory;
import net.sf.jasperreports.view.JasperViewer;

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
	 **/
	@CrossOrigin
	@RequestMapping("getTransactions")
	public List<Transaction_Detail> getTransactions(@RequestParam(name = "customerId") String customerId) {
		return reportService.getTransactions(customerId);
	}

	/**
	 * used to create new SAMA report in case of the request coming from SAMA report
	 * tab return SAMA report(s) based on the entered transaction id(s) input
	 * 
	 * parameters transactionID(s)
	 **/
	@CrossOrigin(allowedHeaders = "*", allowCredentials = "true")
	@RequestMapping(value = "createSamaReport", method = RequestMethod.POST)
	public List<SAMAReportDTO> createSamaReport(@RequestBody Integer[] transactionId) {
		return reportService.getSAMAReport(transactionId);
	}

	/**
	 * return three types of alarm reports(active, closed, suppressed) for period
	 * based on status
	 * 
	 * status = "CLS” in case of closed report status = “SUP” in case of suppressed
	 * report
	 * 
	 * parameters status period reportType
	 **/
	@RequestMapping("getAlarmReport")
	public List<AlarmReportDTO> getAlarmReport(@RequestParam(name = "status") String status) {
		return reportService.getAlarmsReport(status);
	}

	@CrossOrigin(allowedHeaders = "*", allowCredentials = "true")
	@RequestMapping(value = "saveSamaReport", method = RequestMethod.POST)
	public void saveSamaReport(@RequestBody SAMAReportDTO samaReportDTO) {
		reportService.saveSAMARport(samaReportDTO);
	}

	@CrossOrigin(allowedHeaders = "*", allowCredentials = "true")
	@RequestMapping("printSamaReport")
	public void printSamaReport(HttpServletResponse response, @RequestParam(name = "transactionIds") Integer[] transactionIds, @RequestParam(name = "lang") String lang) {
		InputStream inputStream = this.getClass().getResourceAsStream("/report/SamaReport_"+lang+".jrxml");
		Map<String, Object> parameters = new HashMap<>();
		List<SAMAReportDTO> samaReports = reportService.samaReportsPDF(transactionIds);

		JRDataSource dataSource = new JRBeanCollectionDataSource(samaReports);
		
		try {
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			
			String fileName= "samareport.pdf";
			response.setHeader("Content-Disposition", "inline; filename="+ fileName);
			response.setContentType("application/x-pdf");
			OutputStream outputStream = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
