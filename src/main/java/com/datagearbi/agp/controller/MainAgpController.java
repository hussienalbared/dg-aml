package com.datagearbi.agp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.InstallmentsPaidByOtherPartyRepository;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.service.AML002Service;


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
	private void test() {
		
//return this.installmentsPaidByOtherPartyRepository.selectRecordfromAML002EXPN(1);
//	return	this.AlaramObjectRepository.getAlarmCount("PTY2", 40717);
	//	return this.AML002Service.selectRecordfromAML002Parm();
	}

}
