package com.datagearbi.agp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AC_Routine_Parameter;
import com.datagearbi.model.AC_Routine_ParameterPK;

public interface Routine_ParameterRepository extends JpaRepository<AC_Routine_Parameter, AC_Routine_ParameterPK> {

	@Query("SELECT AP FROM AC_Routine_Parameter AP  where AP.id.routine_Id = (select A.routine_Id from AC_Routine A  where A.routine_Name=?1 and A.current_Ind='Y')")
	List<AC_Routine_Parameter>getRoutineParameter(String routineName);
	
	@Transactional
	@Modifying
	@Query("update AC_Routine_Parameter d set d.parm_Value=?2 where d.id.parm_Name=?1")
	void updateParameters(String param_Name, String param_Value);
	@Query("select D.parm_Value from AC_Routine_Parameter D where D.id.parm_Name=?1")
	List<String> getParamValueByParamName(String param_name);
}
