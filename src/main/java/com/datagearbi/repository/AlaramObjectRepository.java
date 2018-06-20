package com.datagearbi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.AC_Alarm;




@ResponseBody
public interface AlaramObjectRepository extends JpaRepository<AC_Alarm, Long> {
	
	@Transactional
	@Modifying
	@Query("update AC_Alarm t set t.alarm_Status_Cd=?3 where t.alarmed_Obj_Key=?1 "
			+ "and t.alarmed_Obj_Level_Cd=?2")
	public void  closeAlarms(long alarmedObjKey,String alarmedObjLevelCode,String eventType );
	@Transactional
	@Modifying
	@Query("update AC_Alarm t set t.alarm_Status_Cd=?2 where t.alarm_Id=?1")
	public void closeAlarmById(long alarmId,String alarmStatusCode);
	@Query("select count(a) from AC_Alarm a where a.alarmed_Obj_No=?1 and a.routine_Name=?2 and a.actual_Value_Txt=?3")
	public int countAlarms(String alarmed_Obj_No,String routine_Name,String actual_Value_Txt);
	

}
