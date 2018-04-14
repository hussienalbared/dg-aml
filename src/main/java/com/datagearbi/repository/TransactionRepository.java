package com.datagearbi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datagearbi.model.CoreTransactionD;

public interface TransactionRepository extends JpaRepository<CoreTransactionD, Serializable>{

	@Query("SELECT c FROM CoreTransactionD c WHERE c.tsnm = :tsnm")
	public List<CoreTransactionD> find(@Param("tsnm") String tsnm);
}
