package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.AcAlarm;


@ResponseBody
public interface AlaramObjectRepository extends JpaRepository<AcAlarm, Long> {
	@Query("SELECT t FROM  AcAlarm t") 
	public List<AcAlarm> findBCodeandLevel();

}
