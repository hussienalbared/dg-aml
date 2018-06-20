package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Dgaml001TransLoanXToT;

public interface Dgaml001TransLoanXToRepository extends JpaRepository<Dgaml001TransLoanXToT, Integer> {
	@Query("SELECT count(D.trans_Key) as transactions_count FROM Dgaml001TransLoanXToT D where D.acctKey=?1 group by D.acctKey")
	public List<Long> getTransactionCount(int account_key);

}
