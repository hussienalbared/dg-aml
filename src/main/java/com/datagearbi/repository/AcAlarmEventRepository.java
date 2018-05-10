package com.datagearbi.repository;

import java.math.BigDecimal;

import org.hibernate.id.enhanced.AccessCallback;
import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.AC_Alarm_Event;;

public interface AcAlarmEventRepository extends JpaRepository<AC_Alarm_Event, Long> {

}
