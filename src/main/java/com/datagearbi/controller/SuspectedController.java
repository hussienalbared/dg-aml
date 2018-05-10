package com.datagearbi.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;

import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;

@RestController
@RequestMapping("aml/api/v1/")
@CrossOrigin(origins = "*")
public class SuspectedController {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;
	
	
	@RequestMapping(value = "suspectedObject", method= RequestMethod.GET)
	public List<AC_Suspected_Object> list() {
		return suspectedObjectRepository.findAll();
	}
	
	@RequestMapping(value = "suspectedObject/{key}/{levelCode}" , method= RequestMethod.GET)
	public AC_Suspected_Object get(@PathVariable int key,@PathVariable String levelCode) {
		AC_Suspected_ObjectPK id = new AC_Suspected_ObjectPK(levelCode, key);
		return suspectedObjectRepository.getOne(id);
	}
	@RequestMapping(value = "alarms", method= RequestMethod.GET)
	public AC_Suspected_Object getAlarms(@RequestParam("key") String key,
			@RequestParam("code") String levelCode) {
		
		
		AC_Suspected_Object asObj= suspectedObjectRepository.findById(new AC_Suspected_ObjectPK(levelCode, Integer.parseInt(key))).get();
System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%5");
		Set<AC_Alarm> alarms=asObj.getAcAlarm().stream().filter(a->a.getAlarm_Status_Cd().equalsIgnoreCase("act")).
		collect(Collectors.toSet());
		asObj.setAcAlarm(alarms);
		return asObj;
		//		
		
		
		//return suspectedObjectRepository.findAll();
	}
	@RequestMapping(value = "updateUser", method= RequestMethod.PUT)
	public void  updateUser(@RequestParam("key") String key,
			@RequestParam("code") String levelCode,
			@RequestParam("user") String user
			) {
		
this.suspectedObjectRepository.updateAcSuspectedObj(Integer.parseInt(key), levelCode, user);	
		

	}
	@RequestMapping(value = "removeOwnerShip", method= RequestMethod.PUT)
	public void  removeOwnerShip(@RequestParam("key") String key,
			@RequestParam("code") String levelCode
			) {
		
this.suspectedObjectRepository.updateAcSuspectedObj(Integer.parseInt(key), levelCode,null);	
		

	}
	
	//close all alarams of suspect given key and level code of the suspect
	@RequestMapping(value = "closeAllSuspectAlarms", method= RequestMethod.GET)
	public void  closeAllSuspectAlarms(
			@RequestParam("key") String key,
			@RequestParam("code") String levelCode,
			@RequestParam("eventType") String eventType
			) {
		
		
		  //close all alarms
		  this.alaramObjectRepository.closeAlarms(Integer.parseInt(key), levelCode,eventType);
	
		  //update alert count
		  this.suspectedObjectRepository.updateAcSuspectedObjAlertCount(Integer.parseInt(key), levelCode, 0);
	
	
	}
	
	
	@RequestMapping(value = "getSuspetedByObjectNumber", method= RequestMethod.GET)
	public List getByObjectNumber(@RequestParam("obj_number") String obj_number)
	{
		String query="select obj_key,obj_level_code from [AML_DEV].[AML].[ac_suspected_objs] "
				+ "where obj_number='"+obj_number+"'";
	
				List s= entityManager.createNativeQuery(query).getResultList();
				
				return s;

	
	
	}
	
}
