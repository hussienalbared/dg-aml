package com.datagearbi.agp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AC_Routine;

public interface AC_RoutineRepository extends JpaRepository<AC_Routine, Long> {

	
}
