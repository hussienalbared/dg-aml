package com.datagearbi.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datagearbi.model.DEV_Report_SAMA;
import com.datagearbi.model.SAMA_Report_V;
import com.datagearbi.model.Transaction_Detail;
import com.datagearbi.model.dto.report.AlarmReportDTO;
import com.datagearbi.model.dto.report.SAMAReportDTO;
import com.datagearbi.repository.ReportRepository;
import com.datagearbi.repository.SAMA_Report_VRepository;
import com.datagearbi.repository.TransactionRepository;
import com.datagearbi.service.ReportService;

@Service

public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository samaReportRepository;

	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private SAMA_Report_VRepository sama_Report_VRepository;

	@Override
	public List<Transaction_Detail> getTransactions(String customerId) {
		System.out.println("getTransactions");
		// List<Transaction_Detail> transactions =
		// transactionRepository.find(customerId);

		List<SAMA_Report_V> transactions1 = this.sama_Report_VRepository.find(customerId);

		List<Integer> aa = transactions1.stream().map(a -> a.getTrans_Key()).collect(Collectors.toList());
		List<Transaction_Detail> transactions = this.transactionRepository.findAllById(aa);

		return transactions;
	}

	@Override
	public List<SAMAReportDTO> getSAMAReport(Integer[] transactionIds) {
		System.out.println("getSAMAReport");
		List<SAMA_Report_V> samaReportsV = new ArrayList<>();

		List<DEV_Report_SAMA> samaReportsT = new ArrayList<>();

		for (int i = 0; i < transactionIds.length; i++) {
			System.out.println(transactionIds[i]);
			Optional<DEV_Report_SAMA> z = this.samaReportRepository.findById(transactionIds[i]);
			if (z.isPresent()) {
				samaReportsT.add(z.get());
			} else {
				Optional<SAMA_Report_V> z2 = this.sama_Report_VRepository.findById(transactionIds[i]);
				if (z2.isPresent()) {
					samaReportsV.add(z2.get());
				}
			}
		}

		System.out.println(samaReportsT.size() + "  " + samaReportsV.size());

		List<SAMAReportDTO> samaReportDTOs = new ArrayList<>();
		for (SAMA_Report_V samaReportV : samaReportsV) {
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setReportingEntityName(samaReportV.getCurr_Name());
			String Prim_Med_Desc = samaReportV.getPrim_Med_Desc();
			if (Prim_Med_Desc.toLowerCase().contains("cash")) {
				samaReportDTO.setDepositType(1);
			} else if (Prim_Med_Desc.toLowerCase().contains("check")) {
				samaReportDTO.setDepositType(2);
			} if (Prim_Med_Desc.toLowerCase().contains("wire")) {
				if (samaReportV.getSec_Med_Desc() != null || !samaReportV.getSec_Med_Desc().equals(""))
					if (samaReportV.getSec_Med_Desc().toLowerCase().contains("demostic")) {
						samaReportDTO.setTransferType(1);
					} else if (samaReportV.getSec_Med_Desc().toLowerCase().contains("international")) {
						samaReportDTO.setTransferType(2);
					}
			} else if (Prim_Med_Desc.toLowerCase().contains("international")) {
				samaReportDTO.setTransferType(2);
			} else {
				samaReportDTO.setPrimMedDesc(Prim_Med_Desc);
			}

			samaReportDTO.setCreationDate(samaReportV.getCalendar_Date());
			samaReportDTO.setAmountNumber(samaReportV.getCcy_Amt());
			samaReportDTO.setCurrencyName(samaReportV.getCurr_Name());
			samaReportDTO.setAccountNumber(samaReportV.getAcct_No());
			samaReportDTO.setAccountBranch(samaReportV.getAcct_Prim_Branch_Name());
			samaReportDTO.setCustomerId(samaReportV.getCust_Ident_Id());
			samaReportDTO.setCustomerName(samaReportV.getCust_Name());
			samaReportDTO.setNationality(samaReportV.getCitizen_Cntry_Name());
			samaReportDTO.setTransactionKey(samaReportV.getTrans_Key());
			samaReportDTO.setCust_No(samaReportV.getCust_No());
			samaReportDTO.setCust_Key(samaReportV.getCust_Key());
			samaReportDTO.setBranch_Type_Desc(samaReportV.getBranch_Type_Desc());
			samaReportDTO.setBranch_Name(samaReportV.getBranch_Name());
			samaReportDTOs.add(samaReportDTO);
		}
		for (DEV_Report_SAMA samaReportT : samaReportsT) {
			SAMAReportDTO samaReportDTO = new SAMAReportDTO();
			samaReportDTO.setReportingEntityName(samaReportT.getCurr_Name());
			String Prim_Med_Desc = samaReportT.getPrim_Med_Desc();
			if (Prim_Med_Desc != null) {
				if (Prim_Med_Desc.toLowerCase().contains("cash")) {
					samaReportDTO.setDepositType(1);
				} else if (Prim_Med_Desc.toLowerCase().contains("check")) {
					samaReportDTO.setDepositType(2);
				} if (Prim_Med_Desc.toLowerCase().contains("wire")) {
					if (samaReportT.getSec_Med_Desc() != null || !samaReportT.getSec_Med_Desc().equals(""))
						if (samaReportT.getSec_Med_Desc().toLowerCase().contains("demostic")) {
							samaReportDTO.setTransferType(1);
						} else if (samaReportT.getSec_Med_Desc().toLowerCase().contains("international")) {
							samaReportDTO.setTransferType(2);
						}
				} else if (Prim_Med_Desc.toLowerCase().contains("international")) {
					samaReportDTO.setTransferType(2);
				}
			}

			samaReportDTO.setCreationDate(samaReportT.getCalendar_Date());
			samaReportDTO.setAmountNumber(samaReportT.getCcy_Amt());
			samaReportDTO.setCurrencyName(samaReportT.getCurr_Name());
			samaReportDTO.setAccountNumber(samaReportT.getAcct_No());
			samaReportDTO.setAccountBranch(samaReportT.getAcct_Prim_Branch_Name());
			samaReportDTO.setCustomerId(samaReportT.getCust_Ident_Id());
			samaReportDTO.setCustomerName(samaReportT.getCust_Name());
			samaReportDTO.setNationality(samaReportT.getCitizen_Cntry_Name());
			samaReportDTO.setTransactionKey(samaReportT.getTrans_Key());
			samaReportDTO.setCust_No(samaReportT.getCust_No());
			samaReportDTO.setCust_Key(samaReportT.getCust_Key());
			samaReportDTO.setBranch_Type_Desc(samaReportT.getBranch_Type_Desc());
			samaReportDTO.setBranch_Name(samaReportT.getBranch_Name());

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
		String primMidDesc = "";
		if (samaReportDTO.getDepositType() == 1) {
			primMidDesc = primMidDesc + "Check";
		} else if (samaReportDTO.getDepositType() == 2) {
			primMidDesc = primMidDesc + "Cash";
		}
		if (samaReportDTO.getWithdrawType() == 1) {
			samaReportEntity.setBranch_Type_Desc("ATM");
		} else if (samaReportDTO.getWithdrawType() == 2) {
			samaReportEntity.setBranch_Type_Desc("Branch");
		}
		if (samaReportDTO.getTransferType() == 1) {
			primMidDesc = primMidDesc + " Wire";
			samaReportEntity.setSec_Med_Desc("Demostic");
		} else if (samaReportDTO.getTransferType() == 2) {
			primMidDesc = primMidDesc + " Wire";
			samaReportEntity.setSec_Med_Desc("International");
		}
		if (primMidDesc != null && !primMidDesc.isEmpty()) {
			samaReportEntity.setPrim_Med_Desc(primMidDesc);
		} else if (samaReportEntity.getPrim_Med_Desc() == null || samaReportEntity.getPrim_Med_Desc().isEmpty()) {
			samaReportEntity.setPrim_Med_Desc(samaReportDTO.getPrimMedDesc());
		}
		// if (samaReportDTO.getPrimMedDesc() == null ||
		// samaReportDTO.getPrimMedDesc().isEmpty()) {
		// }
		System.out.println(samaReportDTO.getDepositType() + "samaReportDTO.getDepositType()");
		System.out.println(samaReportDTO.getWithdrawType() + "samaReportDTO.getWithdrawType()");
		System.out.println(samaReportDTO.getTransferType() + "samaReportDTO.getTransferType()");
		System.out.println(samaReportDTO.getCreationDate() + "samaReportDTO.getCreationDate()");
		System.out.println(samaReportDTO.getAmountNumber() + "samaReportDTO.getAmountNumber())");
		System.out.println(samaReportDTO.getCurrencyName() + "samaReportDTO.getCurrencyName()");
		System.out.println(samaReportDTO.getAccountNumber() + "samaReportDTO.getAccountNumber()");
		System.out.println(samaReportDTO.getCustomerId() + "samaReportDTO.getCustomerId()");
		System.out.println(samaReportDTO.getAccountBranch() + "samaReportDTO.getAccountBranch(");
		System.out.println(samaReportDTO.getCustomerName() + "samaReportDTO.getCustomerName()");
		System.out.println(samaReportDTO.getNationality() + "samaReportDTO.getNationality()");
		System.out.println(samaReportDTO.getTransactionKey() + "samaReportDTO.getTransactionKey()");
		samaReportEntity.setCalendar_Date(
				samaReportDTO.getCreationDate() != null ? new Timestamp(samaReportDTO.getCreationDate().getTime())
						: new Timestamp(0));
		samaReportEntity.setCcy_Amt(samaReportDTO.getAmountNumber());
		samaReportEntity.setCurr_Name(samaReportDTO.getCurrencyName());
		samaReportEntity.setAcct_No(samaReportDTO.getAccountNumber());
		samaReportEntity.setBranch_Name(samaReportDTO.getAccountBranch());
		samaReportEntity.setCust_Ident_Id(samaReportDTO.getCustomerId());
		samaReportEntity.setCust_Name(samaReportDTO.getCustomerName());
		samaReportEntity.setCitizen_Cntry_Name(samaReportDTO.getNationality());
		///
		samaReportEntity.setTrans_Key(samaReportDTO.getTransactionKey());

		////
		samaReportEntity.setCust_No(samaReportDTO.getCust_No());
		samaReportEntity.setCust_Key(samaReportDTO.getCust_Key());
		samaReportEntity.setBranch_Type_Desc(samaReportDTO.getBranch_Type_Desc());
		samaReportEntity.setAcct_Prim_Branch_Name(samaReportDTO.getAccountBranch());
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
	public List<DEV_Report_SAMA> allreports() {
		// TODO Auto-generated method stub
		return this.samaReportRepository.findAll();
	}

}
