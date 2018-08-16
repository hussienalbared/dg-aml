package com.datagearbi.agp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.InstallmentsPaidByOtherPartyRepository;
import com.datagearbi.model.InstallmentsPaidByOtherParty;

@RestController
@RequestMapping("aml/api/aml002")
@CrossOrigin("*")
public class InstallmentsPaidByOtherPartyController {
	@Autowired
	private InstallmentsPaidByOtherPartyRepository installmentsPaidByOtherPartyRepository;
	@RequestMapping(value="all", method=RequestMethod.GET)
	private List<InstallmentsPaidByOtherParty> Run_AGP() {
		return this.installmentsPaidByOtherPartyRepository.findAll();

	}
	@RequestMapping(value="test", method=RequestMethod.GET)
	List<Object[]> getInstallmentNumber()
	{
		return this.installmentsPaidByOtherPartyRepository.getInstallmentNumber(1674);
	}
	
}
