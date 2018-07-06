package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.AC_Transaction_Flow_Alarm;
import com.datagearbi.model.AC_Transaction_Flow_AlarmPK;

public interface AC_Transaction_Flow_AlarmRepository extends JpaRepository<AC_Transaction_Flow_Alarm, AC_Transaction_Flow_AlarmPK> {

}
