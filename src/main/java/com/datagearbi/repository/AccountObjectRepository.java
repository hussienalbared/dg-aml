package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.CoreAccountD;


@ResponseBody
public interface AccountObjectRepository extends JpaRepository<CoreAccountD, Long> {
//	List<Account> findByAcctNo(String acctNo);

	// @Query("SELECT a FROM CORE_ACCOUNT_D a WHERE a.ACCTNO=:AccountNumber")
	// List<Account> fetchArticles(@Param("AccountNumber") String AccountNumber);
	/* "select * from CORE_ACCOUNT_D a where 1=1  and a.ACCTNO='100019680748'" */
	// @Query(value = ":query", nativeQuery = true)
//	@Query(value = "select * from CORE_ACCOUNT_D a where 1=1", nativeQuery = true)
//	List<Account> findAll(String query);
	List<CoreAccountD> findByacctno(String acctno);

}
