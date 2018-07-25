package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.Account;




@ResponseBody
public interface AccountObjectRepository extends JpaRepository<Account, Long> {
	

	@Query("SELECT a FROM Account a WHERE a.acct_No=:AccountNumber")
	 List<Account> fetchAccountsByAccountNumber(@Param("AccountNumber") String AccountNumber);


	
//


}
