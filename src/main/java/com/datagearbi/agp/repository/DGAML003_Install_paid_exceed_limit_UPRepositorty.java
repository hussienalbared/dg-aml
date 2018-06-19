package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML003_Install_paid_exceed_limit_UP;

public interface DGAML003_Install_paid_exceed_limit_UPRepositorty
		extends JpaRepository<DGAML003_Install_paid_exceed_limit_UP, Integer> {
	@Query("SELECT count(D.trans_Key) ,D.acct_Key  FROM DGAML003_Install_paid_exceed_limit_UP D where D.acct_Key= ?1 group by D.acct_Key")
	List<Object[]> TransactionsCount(int acct_Key);
	@Query("SELECT sum(D.ccy_Amt) ,D.acct_Key  FROM DGAML003_Install_paid_exceed_limit_UP D where D.acct_Key=?1 group by D.acct_Key")
	List<Object[]> selectTotalAmount(int acct_Key);
	@Query("SELECT count(D.Exec_Cust_Key) ,D.acct_Key FROM DGAML003_Install_paid_exceed_limit_UP D where D.acct_Key=?1 and D.acct_Key = D.Exec_Cust_Key and D.relate_Ind='N' group by D.acct_Key")
	List<Object[]> selectInstNum(Integer Acct_key);
}

