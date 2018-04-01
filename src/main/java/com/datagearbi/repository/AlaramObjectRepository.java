package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datagearbi.model.Alaram;
@ResponseBody
public interface AlaramObjectRepository extends JpaRepository<Alaram, Long> {

}
