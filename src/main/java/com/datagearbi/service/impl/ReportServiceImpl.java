package com.datagearbi.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.model.CoreTransactionD;
import com.datagearbi.model.DEV_Report_SAMA;
import com.datagearbi.model.dto.report.AlarmReportDTO;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.repository.ReportRepository;
import com.datagearbi.repository.TransactionRepository;
import com.datagearbi.service.ReportService;

@Service

public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository samaReportRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public List<CoreTransactionD> getTransactions(String customerId) {
		List<CoreTransactionD> transactions = null;
		try {
			transactions = transactionRepository.find(customerId);
		}catch(Exception e) {
			
		}
		if(transactions == null || transactions.size() == 0) {
			transactions = new ArrayList<CoreTransactionD>();
			CoreTransactionD transaction = new CoreTransactionD();
			transaction.setTransactionKey(1);
			transaction.setTtrn("first transaction");
			transactions.add(transaction);
		}
		return transactions;
	}

	@Override
	public List<SAMAReportDTO> getSAMAReport(Integer[] transactionIds) {
		// prepare list of SAMAreport objects to be as inputs
		// SAMAReportV[] inputs = new SAMAReportV[transactionIds.length];
		// for(int i = 0; i < transactionIds.length; i++) {
		// SAMAReportV samaReportV = new SAMAReportV();
		// samaReportV.setPid(transactionIds[i]);
		// inputs[i] = samaReportV;
		// }

		List<DEV_Report_SAMA> samaReports = samaReportRepository.findAllById(Arrays.asList(transactionIds));


		List<SAMAReportDTO> samaReportDTOs = new ArrayList<>();

		for (DEV_Report_SAMA samaReportV : samaReports) {
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setReportingEntityName(samaReportV.getPnm());
			switch (samaReportV.getPrimaryMediumDesc()) {

			case "cash":
				samaReportDTO.setDepositType(1);
				break;

			case "check":
				samaReportDTO.setDepositType(2);
				break;

			case "wire":
				if (samaReportV.getSecondaryMediumDesc() != null || !samaReportV.getSecondaryMediumDesc().equals(""))
					if (samaReportV.getSecondaryMediumDesc().equals("Demostic")) {
						samaReportDTO.setTransferType(1);
					} else if (samaReportV.getSecondaryMediumDesc().equals("International")) {
						samaReportDTO.setTransferType(2);
					}
				break;

			case "international":
				samaReportDTO.setTransferType(2);
				break;
			}
			
			samaReportDTO.setCreationDate(samaReportV.getCalendarDate());
			samaReportDTO.setAmountNumber(samaReportV.getCfcurramt());
			samaReportDTO.setCurrencyName(samaReportV.getCurrencyName());
			samaReportDTO.setAccountNumber(samaReportV.getAcctno());
			samaReportDTO.setAccountBranch(samaReportV.getAcctbnm());
			samaReportDTO.setCustomerId(samaReportV.getPid());
			samaReportDTO.setCustomerName(samaReportV.getPnm());
			samaReportDTO.setNationality(samaReportV.getPczconm());

			samaReportDTOs.add(samaReportDTO);
		}
		
		if(samaReports.size() == 0) {
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setCustomerName("EGP");
			samaReportDTOs.add(samaReportDTO);
		}
		return samaReportDTOs;
	}

	@Override
	public List<AlarmReportDTO> getAlarmsReport(String status) {
		return null;
	}

	@Override
	public void saveSAMARport(SAMAReportDTO samaReportDTO) {
		DEV_Report_SAMA samaReportEntity = new DEV_Report_SAMA();
		if(samaReportDTO.getDepositType() == 1) {
			samaReportEntity.setPrimaryMediumDesc("Cash");
		}else if(samaReportDTO.getDepositType() == 2){
			samaReportEntity.setPrimaryMediumDesc("Check");
		}
		
		if(samaReportDTO.getWithdrawType() == 1) {
			samaReportEntity.setBrtydesc("ATM");
		}else if(samaReportDTO.getWithdrawType() == 2) {
			samaReportEntity.setBrtydesc("Branch");
		}
		
		if(samaReportDTO.getTransferType() == 1) {
			samaReportEntity.setPrimaryMediumDesc("Wire");
		} else if(samaReportDTO.getTransferType() == 2) {
			samaReportEntity.setPrimaryMediumDesc("International");
		}
		
		samaReportEntity.setCalendarDate(samaReportDTO.getCreationDate() != null? new Timestamp(samaReportDTO.getCreationDate().getTime()): new Timestamp(0));
		
		samaReportEntity.setCfcurramt(samaReportDTO.getAmountNumber());
		
		samaReportEntity.setCurrencyName(samaReportDTO.getCurrencyName());
		
		samaReportEntity.setAcctno(samaReportDTO.getAccountNumber());
		
		samaReportEntity.setAcctbnm(samaReportDTO.getAccountBranch());
		
		samaReportEntity.setPid(samaReportDTO.getCustomerId());
		
		samaReportEntity.setPnm(samaReportDTO.getCustomerName());
		
		samaReportEntity.setPczconm(samaReportDTO.getNationality());
		
		samaReportEntity = samaReportRepository.save(samaReportEntity);
	}

	@Override
	public List<SAMAReportDTO> samaReportsPDF(Integer[] transactionIds) {
		List<SAMAReportDTO> samaReports = new ArrayList<SAMAReportDTO>();
		samaReports = getSAMAReport(transactionIds);		
		return samaReports;
	}

}
