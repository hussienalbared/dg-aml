package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.ExternalParty;
import com.datagearbi.repository.ExternalPartyObjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/externalParty")
public class ExternalPartyController {
	@Autowired
	private ExternalPartyObjectRepository externalPartyObjectRepository ;
	@RequestMapping(value="all" ,method = RequestMethod.GET)
	public List<ExternalParty> name() {
		return externalPartyObjectRepository.findAll();
		
	}

}
