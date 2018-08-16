package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML005_Install_Paid_In_Cash;

public interface DGAML005Repository extends JpaRepository<DGAML005_Install_Paid_In_Cash, Integer> {
	@Query("SELECT count(D.trans_Key) ,D.acct_Key  FROM DGAML005_Install_Paid_In_Cash D where D.acct_Key= ?1 group by D.acct_Key")
	List<Object[]> TransactionsCount(int acct_Key);
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.acct_Key  FROM DGAML005_Install_Paid_In_Cash D where D.acct_Key=?1 and D.trans_Type_Key=9000 group by D.acct_Key")
	List<Object[]> selectTotalAmount(int acct_Key);
	@Query("select sum(D.ccy_Amt),D.acct_Key  from Transaction_Flow D where D.trans_Type_Key=9000  and D.acct_Key=?1 ")
	List<Object[]> selectTotalAmountInCash(int acct_Key);
}
