package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML021_Large_Number_Autho_Financed_Asset;

public interface DGAML021_Large_Number_Autho_Financed_AssetRepositry extends JpaRepository<DGAML021_Large_Number_Autho_Financed_Asset, Integer>{

	@Query("SELECT count(D.trans_Key) ,D.acct_Key FROM DGAML022_Payments_High_Risk_Industry_Cust D where D.acct_Key=?1 group by D.acct_Key")
	public List<Object[]> getTransactionCount(int Acct_key);
	
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.acct_Key FROM DGAML022_Payments_High_Risk_Industry_Cust D where D.acct_Key=?1 group by D.acct_Key")
	public List<Object[]> getTotalAmount(int Acct_key);
}
