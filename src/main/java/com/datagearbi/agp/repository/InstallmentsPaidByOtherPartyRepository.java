package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.InstallmentsPaidByOtherParty;

public interface InstallmentsPaidByOtherPartyRepository extends JpaRepository<InstallmentsPaidByOtherParty, Integer> {
    @Query("select count(D.trans_Key) ,D.acct_Key  FROM InstallmentsPaidByOtherParty D where D.acct_Key= ?1 and D.relate_Ind='N' and D.exec_Cust_Key<>D.cust_Key group by D.acct_Key")
	List<Object[]> getInstallmentNumber(int acct_Key);
	
	@Query("select sum(D.ccy_Amt) ,D.acct_Key  FROM InstallmentsPaidByOtherParty D where D.acct_Key= ?1 group by D.acct_Key")
	List<Object[]> getTotalAmount(int acct_Key);
	
	@Query("SELECT count(D.trans_Key) ,D.acct_Key  FROM InstallmentsPaidByOtherParty D where D.acct_Key= ?1 group by D.acct_Key")
	List<Object[]> TransactionsCount(int acct_Key);
	
	@Query("select A.exec_Cust_Key from InstallmentsPaidByOtherParty A where A.acct_Key=?1")
	List<Integer> selectRecordfromAML002EXPN(int Acct_key);
	
	@Query("select D from InstallmentsPaidByOtherParty D")
	List<InstallmentsPaidByOtherParty> getData();
	
	
}
