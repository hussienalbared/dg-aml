package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML010_Excessive_ACCT_CLS_OPN;

public interface DGAML010_Excessive_ACCT_CLS_OPNRepository extends JpaRepository<DGAML010_Excessive_ACCT_CLS_OPN, Integer>{

	@Query("SELECT count(D.trans_Key) ,D.expr6 FROM DGAML010_Excessive_ACCT_CLS_OPN D where D.expr6=?1 group by D.expr6")
	public List<Object[]> getTransactionCount(int Acct_key);
	
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.expr6 FROM DGAML010_Excessive_ACCT_CLS_OPN D where D.expr6=?1  group by D.expr6")
	public List<Object[]> getTotalAmount(int Acct_key);
	
	@Query("SELECT count(D.Exec_Cust_Key) as inst_num,D.expr6 "
			+ " FROM DGAML010_Excessive_ACCT_CLS_OPN D "
			+ " where D.expr6=?1 and D.expr6 <> D.Exec_Cust_Key and D.relate_Ind='N' group by D.expr6")
	
	public List <Object[]> selectInstNum(int Acct_key);
}
