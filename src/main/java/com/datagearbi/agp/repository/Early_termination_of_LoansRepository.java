package com.datagearbi.agp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Early_termination_of_Loans;

public interface Early_termination_of_LoansRepository extends JpaRepository<Early_termination_of_Loans, Integer>{

	@Query("select sum(D.orig_Loan_Amt) from Early_termination_of_Loans D  where D.cust_Key=?1")
	Long getTotalAmountOfAllTerminatedLoans(int customerKey);

}
