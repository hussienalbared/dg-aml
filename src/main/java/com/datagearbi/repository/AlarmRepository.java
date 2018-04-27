package com.datagearbi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.AcAlarm;

public interface AlarmRepository extends JpaRepository<AcAlarm, Serializable>{

}
