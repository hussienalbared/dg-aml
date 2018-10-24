package com.datagearbi.agp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.agp.service.AML002Service2X;
import com.datagearbi.agp.service.AML003Service;
import com.datagearbi.dto.AlarmDTO;

@RestController
@RequestMapping("aml/api/scenario3")
public class Install_paid_exceed_limit_UP_Service_Controller {

	@Autowired
	private AML003Service install_paid_exceed_limit_UP_Service;

	@Autowired
	private AML002Service2X aml002Service2X;
	@Autowired
	private Routine_ParameterRepository routine_ParameterRepository;
	@RequestMapping("all")
	public Map<String, List<AlarmDTO>> getAllTransactionfromView(){
		 return this.install_paid_exceed_limit_UP_Service.generateaAlarms();
	}
	@RequestMapping("all2")
	public Map<String, List<AlarmDTO>> test(){
		return this.aml002Service2X.generateaAlarms();
		}
}
