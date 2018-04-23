package com.datagearbi.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.AcAlarm;


@ResponseBody
public interface AlaramObjectRepository extends JpaRepository<AcAlarm, Long> {
	
	@Transactional
	@Modifying
	@Query("update AcAlarm t set t.alarmStatusCode=?3 where t.alarmedObjKey=?1 "
			+ "and t.alarmedObjLevelCode=?2")
	public void  closeAlarms(int alarmedObjKey,String alarmedObjLevelCode,String eventType );
	@Transactional
	@Modifying
	@Query("update AcAlarm t set t.alarmStatusCode=?2 where t.alarmId=?1")
	public void closeAlarmById(long alarmId,String alarmStatusCode);
	

}
