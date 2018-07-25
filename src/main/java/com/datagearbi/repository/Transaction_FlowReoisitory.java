package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Transaction_Flow;

public interface Transaction_FlowReoisitory extends JpaRepository<Transaction_Flow, Integer>{
	@Query("select sum(T.ccy_Amt) as all_amnt from Transaction_Flow T where T.acct_Key=?1")
		List<Object>	selectAllAmnt(int acctKey);

}
