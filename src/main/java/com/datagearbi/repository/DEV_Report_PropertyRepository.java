package com.datagearbi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DEV_Report_Property;


public interface DEV_Report_PropertyRepository extends JpaRepository<DEV_Report_Property, Integer>{

	@Query("update DEV_Report_Property d set d.propertyValue=?2 where d.propertyKey=?1")
	@Transactional
	@Modifying
	void updateProps(String key,String value);
	
}
