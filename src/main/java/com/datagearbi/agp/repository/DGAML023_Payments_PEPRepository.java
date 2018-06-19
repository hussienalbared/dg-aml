package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML023_Payments_PEP;

public interface DGAML023_Payments_PEPRepository extends JpaRepository<DGAML023_Payments_PEP, Integer> {

	@Query("SELECT count(D.trans_Key) ,D.expr6 FROM DGAML023_Payments_PEP D where D.expr6=?1 group by D.expr6")
	public List<Object[]> getTransactionCount(int Acct_key);
	
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.expr6 FROM DGAML023_Payments_PEP D where D.expr6=?1 group by D.expr6")
	public List<Object[]> getTotalAmount(int Acct_key);
}
