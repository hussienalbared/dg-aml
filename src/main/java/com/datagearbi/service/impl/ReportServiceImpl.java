package com.datagearbi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.model.SAMAReport;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.repository.ReportRepository;
import com.datagearbi.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService{
	
	
	@Autowired
	private ReportRepository samaReportRepository;

	@Override
	public SAMAReportDTO getSAMAReport() {
		int id = 1231;
		SAMAReport samaReport = samaReportRepository.getOne(id);
		SAMAReportDTO samaReportDTO = new SAMAReportDTO();
		
		return samaReportDTO;
	}

}
