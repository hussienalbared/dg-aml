package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.SuspectedObjectId;
import com.datagearbi.model.SuspectedObject;

public interface SuspectedObjectRepository extends JpaRepository<SuspectedObject, SuspectedObjectId>{

}
