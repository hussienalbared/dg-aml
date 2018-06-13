package com.datagearbi.agp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.AC_Routine_ParameterPK;

public interface Routine_ParameterRepository extends JpaRepository<AC_Routine_Parameter, AC_Routine_ParameterPK> {

}
