package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datagearbi.model.SAMA_Report_V;
import com.datagearbi.model.Transaction_Detail;

public interface SAMA_Report_VRepository extends JpaRepository<SAMA_Report_V, Integer>  {
	@Query("SELECT c FROM SAMA_Report_V c WHERE c.cust_No =?1")
	public List<SAMA_Report_V> find(String cust_No);

}