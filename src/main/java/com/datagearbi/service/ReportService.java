package com.datagearbi.service;

import java.util.List;

import com.datagearbi.model.CoreTransactionD;
import com.datagearbi.model.dto.report.AlarmReportDTO;
import com.datagearbi.model.dto.report.SAMAReportDTO;

public interface ReportService {

	public List<CoreTransactionD> getTransactions(String customerId);
	public List<SAMAReportDTO> getSAMAReport(Integer[] transactionIds);	
	public List<AlarmReportDTO> getAlarmsReport(String status);
	public void saveSAMARport(SAMAReportDTO samaReportDTO);
}
