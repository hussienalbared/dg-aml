package com.datagearbi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AcSuspectedObj;
import com.datagearbi.model.AcSuspectedObjPK;
import com.datagearbi.repository.SuspectedObjectRepository;

@RestController
@RequestMapping("aml/api/v1/")
@CrossOrigin(origins = "*")
public class SuspectedController {

	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	
	@RequestMapping(value = "suspectedObject", method= RequestMethod.GET)
	public List<AcSuspectedObj> list() {
		return suspectedObjectRepository.findAll();
	}
	
	@RequestMapping(value = "suspectedObject/{key}/{levelCode}" , method= RequestMethod.GET)
	public AcSuspectedObj get(@PathVariable int key,@PathVariable String levelCode) {
		AcSuspectedObjPK id = new AcSuspectedObjPK(key, levelCode);
		return suspectedObjectRepository.getOne(id);
	}
	@RequestMapping(value = "alarms", method= RequestMethod.GET)
	public Optional<AcSuspectedObj> getAlarms(@RequestParam("key") String key,
			@RequestParam("code") String levelCode) {
		return suspectedObjectRepository.findById(new AcSuspectedObjPK(Integer.parseInt(key), levelCode));
//		return suspectedObjectRepository.findAll();
	}
	@RequestMapping(value = "updateUser", method= RequestMethod.PUT)
	public void  updateUser(@RequestParam("key") String key,
			@RequestParam("code") String levelCode,
			@RequestParam("user") String user
			) {
		
this.suspectedObjectRepository.updateAcSuspectedObj(Integer.parseInt(key), levelCode, user);	
		

	}
	
}
