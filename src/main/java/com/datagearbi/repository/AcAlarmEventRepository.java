package com.datagearbi.repository;

import java.math.BigDecimal;

import org.hibernate.id.enhanced.AccessCallback;
import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.AcAlarmEvent;

public interface AcAlarmEventRepository extends JpaRepository<AcAlarmEvent, Long> {

}
