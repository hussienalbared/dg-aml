package com.datagearbi.agp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.model.AC_Routine;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class AC_RoutineController {
	@Autowired
	AC_RoutineRepository ac_RoutineRepository;

	@GetMapping("scenarios")
	private List<AC_Routine> selectRecordIntoSecsTable() {
		return ac_RoutineRepository.findAll();
	}
	@GetMapping("getscenario")
	private Optional<AC_Routine> selectRecordIntoSecsTable(@RequestParam("id") String id) {
		return ac_RoutineRepository.findById(Long.parseLong(id));
	}
}
