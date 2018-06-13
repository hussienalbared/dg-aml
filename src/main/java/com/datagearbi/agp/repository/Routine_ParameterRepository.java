package com.datagearbi.agp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.AC_Routine_ParameterPK;

public interface Routine_ParameterRepository extends JpaRepository<AC_Routine_Parameter, AC_Routine_ParameterPK> {
@Query("SELECT AP FROM AC_Routine_Parameter AP  where AP.id.routine_Id = (select A.routine_Id from AC_Routine A  where A.routine_Name=?1 and A.current_Ind='Y')")
List<AC_Routine_Parameter>getRoutineParameter(String routineName);
}
