package com.datagearbi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.datagearbi.model.SAMA_Report_V;
import com.datagearbi.model.Transaction_Detail;
import com.datagearbi.model.dto.report.AlarmReportDTO;
import com.datagearbi.model.dto.report.SAMAReportDTO;
@Service
public interface ReportService {

	public List<Transaction_Detail> getTransactions(String customerId);
	public List<SAMAReportDTO> getSAMAReport(Integer[] transactionIds);	
	public List<AlarmReportDTO> getAlarmsReport(String status);
	public void saveSAMARport(SAMAReportDTO samaReportDTO);
	public List<SAMAReportDTO> samaReportsPDF(Integer[] transactionIds);
}
