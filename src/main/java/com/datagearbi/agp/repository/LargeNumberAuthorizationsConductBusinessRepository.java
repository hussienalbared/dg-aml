package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.LargeNumberAuthorizationsConductBusiness;

public interface LargeNumberAuthorizationsConductBusinessRepository
		extends JpaRepository<LargeNumberAuthorizationsConductBusiness, Integer> {
	@Query("select count(D) from Account_Third_X_Customer D where D.id.acct_Key=?1")
	Long getAuthorizationNumber(int acct_key);

	List<LargeNumberAuthorizationsConductBusiness> findByRoleDesc(String roledesc);

}
