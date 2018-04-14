package com.datagearbi.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.model.CoreTransactionD;
import com.datagearbi.model.SAMAReportV;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.repository.ReportRepository;
import com.datagearbi.repository.TransactionRepository;
import com.datagearbi.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	
	
	@Autowired
	private ReportRepository samaReportRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public List<CoreTransactionD> getTransactions(String customerId){
		return transactionRepository.find(customerId);
	}
	

	@Override
	public List<SAMAReportDTO> getSAMAReport(String[] transactionIds) {
		//prepare list of SAMAreport objects to be as inputs
//		SAMAReportV[] inputs = new SAMAReportV[transactionIds.length];
//		for(int i = 0; i < transactionIds.length; i++) {
//			SAMAReportV samaReportV = new SAMAReportV();
//			samaReportV.setPid(transactionIds[i]);
//			inputs[i] = samaReportV;
//		}
		
		List<SAMAReportV> samaReports = samaReportRepository.findAllById(Arrays.asList(transactionIds));
		
		List<SAMAReportDTO> samaReportDTOs = new ArrayList<>();
		
		for(SAMAReportV samaReportV : samaReports) {
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setReportingEntityName(samaReportV.getPnm());
			
			//insert the rest of columns
			samaReportDTOs.add(samaReportDTO);
		}
		
		return samaReportDTOs;
	}
	


}
