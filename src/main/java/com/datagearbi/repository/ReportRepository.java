package com.datagearbi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.DEV_Report_SAMA;

public interface ReportRepository extends JpaRepository<DEV_Report_SAMA, Integer>{

	
}
