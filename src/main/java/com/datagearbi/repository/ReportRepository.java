package com.datagearbi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.DEV_Report_SAMA;
import com.datagearbi.model.SAMAReport;
import com.datagearbi.model.SAMAReportV;

public interface ReportRepository extends JpaRepository<DEV_Report_SAMA, Serializable>{

}
