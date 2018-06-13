package com.datagearbi.agp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.model.AC_Routine;

public interface AC_RoutineRepository extends JpaRepository<AC_Routine, Long> {

	@Modifying
	@Transactional
	@Query("update AC_Routine a set a.routine_Name=?2,a.routine_Short_Desc=?3,a.routine_Desc=?4,"
			+ " a.routine_Status_Cd=?5,a.risk_Fact_Ind=?6,a.routine_Run_Freq_Cd=?7,a.alarm_Categ_Cd=?8,"
			+ " a.alarm_Subcateg_Cd=?9,a.routine_Type_Cd=?10,a.save_Trig_Trans_Ind=?11,a.obj_Level_Cd=?12,"
			+ " a.routine_Msg_Txt=?13,a.ML_Bayes_Weight=?14,a.dflt_Suppr_Dur_Count=?15,a.routine_Dur_Count=?16 where a.routine_Id=?1 ")
	void updateAcRoutine(long routine_Id, String routine_Name, String routine_Short_Desc, String routine_Desc,
			String routine_Status_Cd, String risk_Fact_Ind, String routine_Run_Freq_Cd, String alarm_Categ_Cd,
			String alarm_Subcateg_Cd, String routine_Type_Cd, String save_Trig_Trans_Ind, String obj_Level_Cd,
			String routine_Msg_Txt, int ml_Bayes_Weight, int dflt_Suppr_Dur_Count, int routine_Dur_Count);

	@Query("select new com.datagearbi.helper.AcRoutineHelper (A.routine_Id,A.routine_Name,A.alarm_Categ_Cd,A.alarm_Subcateg_Cd"
			+ ",A.routine_Short_Desc"
			+ ", A.routine_Msg_Txt)  from AC_Routine A where A.routine_Name=?1 and current_Ind='Y'")
	List<AcRoutineHelper> getRoutineDetail(String routineName);
}
