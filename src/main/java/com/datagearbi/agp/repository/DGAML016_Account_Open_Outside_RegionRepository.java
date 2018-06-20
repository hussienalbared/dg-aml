package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DGAML016_Account_Open_Outside_Region;

public interface DGAML016_Account_Open_Outside_RegionRepository extends JpaRepository<DGAML016_Account_Open_Outside_Region, Integer>{

	@Query("SELECT count(D.trans_Key) ,D.expr6 FROM DGAML016_Account_Open_Outside_Region D where D.expr6=?1 group by D.expr6")
	public List<Object[]> getTransactionCount(int Acct_key);
	
	@Query("SELECT sum(D.ccy_Amt) as total_amount,D.expr6 FROM DGAML016_Account_Open_Outside_Region D where D.expr6=?1 group by D.expr6")
	public List<Object[]> getTotalAmount(int Acct_key);
}
