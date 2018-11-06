package com.datagearbi.agp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.service.MainAGP;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class MainAgpController {
	@Autowired
	MainAGP mainAGP;
	

	@RequestMapping(value="runAGP", method=RequestMethod.GET)
	private void Run_AGP() {
		this.mainAGP.Run_AGP();

	}
	
	
	
}
