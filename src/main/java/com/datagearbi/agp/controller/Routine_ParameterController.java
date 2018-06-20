package com.datagearbi.agp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.model.AC_Routine_Parameter;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class Routine_ParameterController {

	@Autowired
	private Routine_ParameterRepository routine_ParameterRepository;
	
	@RequestMapping(value="addparam", method=RequestMethod.POST)
	public void addParam(@RequestBody AC_Routine_Parameter ac_Routine_Parameter) {
		this.routine_ParameterRepository.save(ac_Routine_Parameter);
	}
	
	@RequestMapping(value="getparams", method=RequestMethod.GET)
	public List<AC_Routine_Parameter> getAllParam(){
		return this.routine_ParameterRepository.findAll();
	}
	
	@RequestMapping(value="updateparam", method=RequestMethod.PUT)
	public void upfateParam(@RequestBody AC_Routine_Parameter ac_Routine_Parameter) {
		this.routine_ParameterRepository.save(ac_Routine_Parameter);
	}
}
