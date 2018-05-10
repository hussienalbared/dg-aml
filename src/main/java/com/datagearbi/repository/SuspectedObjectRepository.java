package com.datagearbi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;



public interface SuspectedObjectRepository extends JpaRepository<AC_Suspected_Object, AC_Suspected_ObjectPK>{
	@Modifying
	@Transactional
	@Query("update AC_Suspected_Object a set a.owner_UID=?3 where a.id.alarmed_Obj_Key=?1 and a.id.alarmed_Obj_level_Cd=?2")
	void updateAcSuspectedObj(int objkey,String objLevelCode,String User);
	@Modifying
	@Transactional
	@Query("update AC_Suspected_Object a set a.alarms_Count=?3 where a.id.alarmed_Obj_Key=?1 and a.id.alarmed_Obj_level_Cd=?2")
	void updateAcSuspectedObjAlertCount(long objKey,String objLevelCode,int y);
	
}
