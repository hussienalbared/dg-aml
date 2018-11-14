package com.datagearbi.agp.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML023_Payments_PEP;


public interface DGAML023_Payments_PEPRepository extends JpaRepository<DGAML023_Payments_PEP, Integer> {

	@Query("SELECT count(D.trans_Key) ,D.acct_Key FROM DGAML023_Payments_PEP D where D.acct_Key=?1 group by D.acct_Key")
	public List<Object[]> getTransactionCount(int Acct_key);
	
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.acct_Key FROM DGAML023_Payments_PEP D where D.acct_Key=?1 group by D.acct_Key")
	public List<Object[]> getTotalAmount(int customerKey);
	
	//group by D.cust_Key
	
	// created by mostafa
//	@Query("select sum(D.ccy_Amt)  from DGAML023_Payments_PEP D where D.cust_Key=?1 ")
//	Long CalculateTransactionTotalAmount(Integer customerKey);

	@Query("select sum(D.ccy_Amt) from DGAML023_Payments_PEP D where D.cust_Key=?1 and D.political_Exp_Prsn_Ind='Y' and D.trans_Cr_Db_Ind_Cd='C' group by D.cust_Key")
	Long CalculateTransactionTotalAmountOfPepCustomer(Integer customerKey);

	@Query("SELECT distinct D.cust_Name ,D.acct_Key FROM DGAML023_Payments_PEP D where D.cust_Key=?1")
	public String getPepName(int customerKey);
	
//	@Query("SELECT count(D.trans_Key) from DGAML023_Payments_PEP e where e.Exec_Cust_Key=?1")
//	public int getTransactioncount(int esxctiveCustomerKey);
//	
//	
//	@Query("select sum(e.ccy_Amt) from DGAML023_Payments_PEP e where e.Exec_Cust_Key=?1")
//	public Long calculateTransactionTotalAmount(int esxctiveCustomerKey);
//	
	
	
	
}
