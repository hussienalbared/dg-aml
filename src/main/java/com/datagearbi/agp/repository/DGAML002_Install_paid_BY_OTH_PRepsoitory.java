package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML002_Install_paid_BY_OTH_P;

public interface DGAML002_Install_paid_BY_OTH_PRepsoitory
		extends JpaRepository<DGAML002_Install_paid_BY_OTH_P, Integer> {
	@Query("SELECT count(D.trans_Key) ,D.acct_Key  FROM DGAML002_Install_paid_BY_OTH_P D where D.acct_Key= ?1 group by D.acct_Key")
	List<Object[]> TransactionsCount(int acct_Key);
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.acct_Key  FROM DGAML002_Install_paid_BY_OTH_P D where D.acct_Key=?1 group by D.acct_Key")
	List<Object[]> selectTotalAmount(int acct_Key);
	@Query("SELECT count(A.Exec_Cust_Key) as inst_num,A.acct_Key FROm DGAML002_Install_paid_BY_OTH_P A  where A.acct_Key=?1 and A.acct_Key <> A.Exec_Cust_Key and A.relate_Ind='N'    group by A.acct_Key")
	List<Object[]> selectInstNum(int Acct_key);
	@Query("select A.Exec_Cust_Key from DGAML002_Install_paid_BY_OTH_P A where A.acct_Key=?1")
	List<Object[]> selectRecordfromAML002EXPN(int Acct_key);
}
