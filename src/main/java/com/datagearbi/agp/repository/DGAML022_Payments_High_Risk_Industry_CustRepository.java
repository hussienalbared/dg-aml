package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML022_Payments_High_Risk_Industry_Cust;

public interface DGAML022_Payments_High_Risk_Industry_CustRepository extends JpaRepository<DGAML022_Payments_High_Risk_Industry_Cust, Integer>{

	@Query("SELECT count(D.trans_Key) ,D.acct_Key FROM DGAML022_Payments_High_Risk_Industry_Cust D where D.acct_Key=?1 group by D.acct_Key")
	public List<Object[]> getTransactionCount(int Acct_key);
	
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.acct_Key FROM DGAML022_Payments_High_Risk_Industry_Cust D where D.acct_Key=?1 group by D.acct_Key")
	public List<Object[]> getTotalAmount(int Acct_key);
}
