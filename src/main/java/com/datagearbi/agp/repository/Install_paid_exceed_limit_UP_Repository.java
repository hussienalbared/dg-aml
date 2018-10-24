package com.datagearbi.agp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Install_paid_exceed_limit_UP;

public interface Install_paid_exceed_limit_UP_Repository extends JpaRepository<Install_paid_exceed_limit_UP, Integer>{
@Query("select sum(e.ccy_Amt) from Install_paid_exceed_limit_UP e where e.acct_Key=?1")
	public Long CalculateTransactionTotalAmount(int accountKey);
 @Query("select count(e.trans_Key)  from Install_paid_exceed_limit_UP e where e.acct_Key=?1")
	public Integer CalculateTransactionsCount(int accountKey);
 @Query("select count(e.trans_Key)  from Install_paid_exceed_limit_UP e where e.acct_Key=?1")
	public Long CalculateInstallmentNumber(int accountKey);

}
