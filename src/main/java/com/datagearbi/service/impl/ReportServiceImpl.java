package com.datagearbi.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.model.DEV_Report_Property;
import com.datagearbi.model.DEV_Report_SAMA;
import com.datagearbi.model.SAMA_Report_V;
import com.datagearbi.model.Transaction_Detail;
import com.datagearbi.model.dto.report.AlarmReportDTO;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.repository.DEV_Report_PropertyRepository;
import com.datagearbi.repository.ReportRepository;
import com.datagearbi.repository.SAMA_Report_VRepository;
import com.datagearbi.repository.TransactionRepository;
import com.datagearbi.service.ReportService;

@Service

public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository samaReportRepository;
	
	@Autowired
	private DEV_Report_PropertyRepository dev_Report_PropertyRepository;

	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private SAMA_Report_VRepository sama_Report_VRepository;


	@Override
	public List<Transaction_Detail> getTransactions(String customerId) {
		System.out.println("getTransactions");
//		List<Transaction_Detail> transactions = transactionRepository.find(customerId);
		
		List<SAMA_Report_V> transactions1=this.sama_Report_VRepository.find(customerId);
		
		List<Integer> aa=transactions1.stream().map(a->a.getTrans_Key()).collect(Collectors.toList());
		List<Transaction_Detail> transactions=	this.transactionRepository.findAllById(aa);
//		if(transactions == null || transactions.size() == 0) {
//			transactions = new ArrayList<Transaction_Detail>();
//			Transaction_Detail transaction = new Transaction_Detail();
//			transaction.setTrans_Key(1);
//			transaction.setTrans_Ref_No("first jkhkjhtransaction");
//			transactions.add(transaction);
//		}
		return transactions;
	}

	@Override
	public List<SAMAReportDTO> getSAMAReport(Integer[] transactionIds) {
		System.out.println(transactionIds.length+"{{{{{{{{{{{{{");
		System.out.println("getSAMAReport");
		// prepare list of SAMAreport objects to be as inputs
		// SAMAReportV[] inputs = new SAMAReportV[transactionIds.length];
		// for(int i = 0; i < transactionIds.length; i++) {
		// SAMAReportV samaReportV = new SAMAReportV();
		// samaReportV.setPid(transactionIds[i]);
		// inputs[i] = samaReportV;
		// }

		List<DEV_Report_SAMA> samaReports = samaReportRepository.findAllById(Arrays.asList(transactionIds));
		List<SAMA_Report_V> samaReports2 = this.sama_Report_VRepository.findAllById(Arrays.asList(transactionIds));

System.out.println(samaReports.size()+"ammmmmmmmmmmmmmmmmmmmmmmmmmr"); 
System.out.println(samaReports2.size()+"husssssssssssssssssssssssien"); 
//for (Integer x : transactionIds) {
//	System.out.println(x);
//}

		List<SAMAReportDTO> samaReportDTOs = new ArrayList<>();
		List<SAMAReportDTO> samaReportDTOs2 = new ArrayList<>();
		
//		for (DEV_Report_SAMA samaReportV : samaReports) {
//			System.out.println("AMRAMR");
//			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
//			samaReportDTO.setReportingEntityName(samaReportV.getPnm());
//			switch (samaReportV.getPrimaryMediumDesc()) {
//
//			case "cash":
//				samaReportDTO.setDepositType(1);
//				break;
//
//			case "check":
//				samaReportDTO.setDepositType(2);
//				break;
//
//			case "wire":
//				if (samaReportV.getSecondaryMediumDesc() != null || !samaReportV.getSecondaryMediumDesc().equals(""))
//					if (samaReportV.getSecondaryMediumDesc().equals("Demostic")) {
//						samaReportDTO.setTransferType(1);
//					} else if (samaReportV.getSecondaryMediumDesc().equals("International")) {
//						samaReportDTO.setTransferType(2);
//					}
//				break;
//
//			case "international":
//				samaReportDTO.setTransferType(2);
//				break;
//			}
//			
//			samaReportDTO.setCreationDate(samaReportV.getCalendarDate());
//			samaReportDTO.setAmountNumber(samaReportV.getCfcurramt());
//			samaReportDTO.setCurrencyName(samaReportV.getCurrencyName());
//			samaReportDTO.setAccountNumber(samaReportV.getAcctno());
//			samaReportDTO.setAccountBranch(samaReportV.getAcctbnm());
//			samaReportDTO.setCustomerId(samaReportV.getPid());
//			samaReportDTO.setCustomerName(samaReportV.getPnm());
//			samaReportDTO.setNationality(samaReportV.getPczconm());
//
//			samaReportDTOs.add(samaReportDTO);
//		}
 //
		for (SAMA_Report_V samaReportV : samaReports2) {
			System.out.println("AMRAMR");
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setReportingEntityName(samaReportV.getCurr_Name());
			switch (samaReportV.getPrim_Med_Desc()) {

			case "cash":
				samaReportDTO.setDepositType(1);
				break;

			case "check":
				samaReportDTO.setDepositType(2);
				break;

			case "wire":
				if (samaReportV.getSec_Med_Desc() != null || !samaReportV.getSec_Med_Desc().equals(""))
					if (samaReportV.getSec_Med_Desc().equals("Demostic")) {
						samaReportDTO.setTransferType(1);
					} else if (samaReportV.getSec_Med_Desc().equals("International")) {
						samaReportDTO.setTransferType(2);
					}
				break;

			case "international":
				samaReportDTO.setTransferType(2);
				break;
			}
			
			samaReportDTO.setCreationDate(samaReportV.getCalendar_Date());
			samaReportDTO.setAmountNumber(samaReportV.getCcy_Amt());
			samaReportDTO.setCurrencyName(samaReportV.getCurr_Name());
			samaReportDTO.setAccountNumber(samaReportV.getAcct_No());
			samaReportDTO.setAccountBranch(samaReportV.getAcct_Prim_Branch_Name());
			samaReportDTO.setCustomerId(samaReportV.getCust_Ident_Id());
			samaReportDTO.setCustomerName(samaReportV.getCust_Name());
			samaReportDTO.setNationality(samaReportV.getCitizen_Cntry_Name());

			samaReportDTOs.add(samaReportDTO);
		}
//
		if(samaReports.size() == 0) {
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setCustomerName("EGP");
			samaReportDTOs.add(samaReportDTO);
		}
		return samaReportDTOs;
	}

	@Override
	public List<AlarmReportDTO> getAlarmsReport(String status) {
		System.out.println("getAlarmsReport");
		return null;
	}

	@Override
	public void saveSAMARport(SAMAReportDTO samaReportDTO) {
		System.out.println("saveSAMARport");
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
		System.out.println("samaReportsPDF");
		List<SAMAReportDTO> samaReports = new ArrayList<SAMAReportDTO>();
		samaReports = getSAMAReport(transactionIds);		
		return samaReports;
	}
	
	@Override
	public void saveSamaProperties(String sama_Entity_Name,String sama_Entity_City,String sama_Entity_Phone,
			String sama_Entity_Type,String sama_Entity_Branch,String sama_Reporting_Name,
			String sama_Reporting_Address,String sama_Reporting_Phone) {
		
		
		this.dev_Report_PropertyRepository.updateProps("sama_Entity_Name",sama_Entity_Name);
		this.dev_Report_PropertyRepository.updateProps("sama_Entity_City",sama_Entity_City);
		this.dev_Report_PropertyRepository.updateProps("sama_Entity_Phone",sama_Entity_Phone);
		this.dev_Report_PropertyRepository.updateProps("sama_Entity_Type",sama_Entity_Type);
		this.dev_Report_PropertyRepository.updateProps("sama_Entity_Branch",sama_Entity_Branch);
		this.dev_Report_PropertyRepository.updateProps("sama_Reporting_Name",sama_Reporting_Name);
		this.dev_Report_PropertyRepository.updateProps("sama_Reporting_Address",sama_Reporting_Address);
		this.dev_Report_PropertyRepository.updateProps("sama_Reporting_Phone",sama_Reporting_Phone);
	}
	
	@Override
	public List<DEV_Report_Property> samaprops() {
		return this.dev_Report_PropertyRepository.findAll();
	}

}
