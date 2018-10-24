package com.datagearbi.agp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.InstallmentsPaidByOtherPartyRepository;
import com.datagearbi.agp.service.AML002Service;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.service.AlarmsVM;
import com.datagearbi.service.MainAGP;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class MainAgpController {
	@Autowired
	MainAGP mainAGP;
	@Autowired
	private InstallmentsPaidByOtherPartyRepository installmentsPaidByOtherPartyRepository;
	@Autowired
	private AlaramObjectRepository AlaramObjectRepository;
	@Autowired
	private AML002Service AML002Service;

	@RequestMapping(value="runAGP", method=RequestMethod.GET)
	private void Run_AGP() {
		this.mainAGP.Run_AGP();

	}
	
	@RequestMapping(value="test", method=RequestMethod.GET)
	private AlarmsVM test() {
		
return this.AML002Service.getAML002AlarmData();
	}

}
