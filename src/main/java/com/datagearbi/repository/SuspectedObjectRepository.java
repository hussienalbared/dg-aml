package com.datagearbi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AcSuspectedObj;
import com.datagearbi.model.AcSuspectedObjPK;

public interface SuspectedObjectRepository extends JpaRepository<AcSuspectedObj, AcSuspectedObjPK>{
	@Modifying
	@Transactional
	@Query("update AcSuspectedObj a set a.complianceUserid=?3 where a.id.objKey=?1 and a.id.objLevelCode=?2")
	void updateAcSuspectedObj(int objkey,String objLevelCode,String User);
}
