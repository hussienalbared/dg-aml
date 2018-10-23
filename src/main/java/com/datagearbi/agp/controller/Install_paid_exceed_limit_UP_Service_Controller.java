package com.datagearbi.agp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.service.Install_paid_exceed_limit_UP_Service;
import com.datagearbi.dto.AlarmDTO;

@RestController
@RequestMapping("aml/api/scenario3")
public class Install_paid_exceed_limit_UP_Service_Controller {

	@Autowired
	private Install_paid_exceed_limit_UP_Service install_paid_exceed_limit_UP_Service;
	@RequestMapping("all")
	public Map<String, List<AlarmDTO>> getAllTransactionfromView(){
		 return this.install_paid_exceed_limit_UP_Service.generateaAlarms();
	}
}
