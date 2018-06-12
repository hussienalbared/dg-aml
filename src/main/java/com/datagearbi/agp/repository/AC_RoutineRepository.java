package com.datagearbi.agp.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.datagearbi.model.AC_Routine;

public interface AC_RoutineRepository extends JpaRepository<AC_Routine, Long> {

	@Modifying
	@Transactional
	@Query("update AC_Routine a set a.routine_Name=?2,a.routine_Short_Desc=?3,a.routine_Desc=?4,"
			+ " a.routine_Status_Cd=?5,a.risk_Fact_Ind=?6,a.routine_Run_Freq_Cd=?7,a.alarm_Categ_Cd=?8,"
			+ " a.alarm_Subcateg_Cd=?9,a.routine_Type_Cd=?10,a.save_Trig_Trans_Ind=?11,a.obj_Level_Cd=?12,"
			+ " a.routine_Msg_Txt=?13 where a.routine_Id=?1 ")
	void updateAcRoutine(long routine_Id, String routine_Name, String routine_Short_Desc,String routine_Desc
			,String routine_Status_Cd,String risk_Fact_Ind, String routine_Run_Freq_Cd,String alarm_Categ_Cd
			,String alarm_Subcateg_Cd,String routine_Type_Cd, String save_Trig_Trans_Ind,String obj_Level_Cd
			,String routine_Msg_Txt);
}
