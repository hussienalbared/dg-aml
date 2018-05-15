package com.datagearbi.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Alarm_Event;
import com.datagearbi.model.AC_Routine;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.AC_Transaction_Flow_Alarm;
import com.datagearbi.model.AC_Transaction_Flow_AlarmPK;
import com.datagearbi.model.Account;
import com.datagearbi.model.Customer;
import com.datagearbi.model.Customer_X_Account;
import com.datagearbi.model.Customer_X_AccountPK;
import com.datagearbi.model.External_Customer;

import com.datagearbi.model.Transaction_Detail_V;




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
	

}
