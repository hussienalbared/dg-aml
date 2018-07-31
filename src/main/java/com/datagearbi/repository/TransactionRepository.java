package com.datagearbi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datagearbi.model.Transaction_Detail;



public interface TransactionRepository extends JpaRepository<Transaction_Detail, Integer>{

	@Query("SELECT c FROM Transaction_Detail c WHERE c.secur_Name = :secur_Name")
	public List<Transaction_Detail> find(@Param("secur_Name") String secur_Name);
}
