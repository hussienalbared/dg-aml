package com.datagearbi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datagearbi.model.CorePartyD;


public interface PartyObjectRepository extends JpaRepository<CorePartyD, Integer> {
//	 @Query("SELECT t FROM CorePartyD t where t.ptaxid = :id") 
//	    String findTitleById(@Param("id") String id);
	     
	Optional<CorePartyD> findBypno(String pno);
}
