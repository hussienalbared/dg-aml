package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.AcAlarm;


@ResponseBody
public interface AlaramObjectRepository extends JpaRepository<AcAlarm, Long> {

}
