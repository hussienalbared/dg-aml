package com.datagearbi.agp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.Early_termination_of_LoansRepository;
import com.datagearbi.agp.repository.Installments_paid_in_cashRepository;
import com.datagearbi.agp.service.AML003Service;
import com.datagearbi.agp.service.AML005Service;
import com.datagearbi.agp.service.AML007Service;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.model.Early_termination_of_Loans;
import com.datagearbi.model.Installments_paid_in_cash;
import com.datagearbi.agp.service.AML0010Service;
import com.datagearbi.dto.AlarmDTO;
import com.datagearbi.service.MainAGP;

@RestController
@RequestMapping("aml/api/agp")
@CrossOrigin("*")
public class MainAgpController {
	@Autowired
	MainAGP mainAGP;
	@Autowired
	private AML007Service aml007Service;
	@Autowired
	private Early_termination_of_LoansRepository Early_termination_of_LoansRepository;
	
	private AML0010Service AML0010Service;

	@RequestMapping(value="runAGP", method=RequestMethod.GET)
	private void Run_AGP() {
		this.mainAGP.Run_AGP();

	}
	@RequestMapping(value="test", method=RequestMethod.GET)
	private Map<String, List<AlarmDTO>> test() {
		return this.AML0010Service.generateaAlarms();

	}
	
	
}
