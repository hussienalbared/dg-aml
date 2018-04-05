package com.datagearbi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.SAMAReport;

public interface ReportRepository extends JpaRepository<SAMAReport, Serializable>{

}
