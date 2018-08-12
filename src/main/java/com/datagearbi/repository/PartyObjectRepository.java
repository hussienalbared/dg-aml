package com.datagearbi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Customer;


public interface PartyObjectRepository extends JpaRepository<Customer, Integer> {

	@Query("select t from Customer t where t.cust_No=?1 ")     
	Optional<Customer> findBcust_No(String pno);
}
