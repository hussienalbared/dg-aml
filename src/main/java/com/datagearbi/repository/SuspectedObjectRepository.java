package com.datagearbi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;

public interface SuspectedObjectRepository extends JpaRepository<AC_Suspected_Object, AC_Suspected_ObjectPK> {
	@Modifying
	@Transactional
	@Query("update AC_Suspected_Object a set a.owner_UID=?3 where a.id.alarmed_Obj_Key=?1 and a.id.alarmed_Obj_level_Cd=?2")
	void updateAcSuspectedObj(long objkey, String objLevelCode, String User);

	@Modifying
	@Transactional
	@Query("update AC_Suspected_Object a set a.alarmsCount=?3 where a.id.alarmed_Obj_Key=?1 and a.id.alarmed_Obj_level_Cd=?2")
	void updateAcSuspectedObjAlertCount(long objKey, String objLevelCode, int y);

	public List<AC_Suspected_Object> findByalarmsCountGreaterThan(int count);
	
	@Query("select new map(u.username as ownername,s as details)from User u,AC_Suspected_Object s ")
	public Object[] getAllSuspectWithNames();
	@Query("select count(T) from AC_Alarm A inner join AC_Alarm_Transaction T on T.alarm_Id=A.alarm_Id where lower(A.alarm_Status_Cd)='act' and A.alarmed_Obj_Key=?2 and A.alarmed_Obj_Level_Cd=?1")
	public Long getTransactions_cntForActiveAlarms(String alarmed_Obj_Level_Cd , long alarmed_Obj_Key);
	@Query("select sum(T.trans_Amt) from AC_Alarm A inner join AC_Alarm_Transaction T on T.alarm_Id=A.alarm_Id where lower( A.alarm_Status_Cd)='act' and A.alarmed_Obj_Key=?2 and A.alarmed_Obj_Level_Cd=?1")
	public Long getAggregate_amtForActiveAlarms(String alarmed_Obj_Level_Cd , long alarmed_Obj_Key);

}
