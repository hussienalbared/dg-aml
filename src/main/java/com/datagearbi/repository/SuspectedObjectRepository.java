package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.AcSuspectedObj;
import com.datagearbi.model.AcSuspectedObjPK;

public interface SuspectedObjectRepository extends JpaRepository<AcSuspectedObj, AcSuspectedObjPK>{

}
