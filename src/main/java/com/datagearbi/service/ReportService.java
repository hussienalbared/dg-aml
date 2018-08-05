package com.datagearbi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.datagearbi.model.DEV_Report_Property;
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
	
	public void saveSamaProperties(String sama_Entity_Name,String sama_Entity_City,String sama_Entity_Phone,
			String sama_Entity_Type,String sama_Entity_Branch,String sama_Reporting_Name,
			String sama_Reporting_Address,String sama_Reporting_Phone) ;
	
	public List<DEV_Report_Property> samaprops();
}
