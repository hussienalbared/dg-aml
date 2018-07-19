package com.datagearbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.security.Group_CapabilityPK;
import com.datagearbi.model.security.Group_capability;
import com.datagearbi.security.repository.Group_CapabilityRepository;
@RestController
@RequestMapping("aml/api/group-capability")
public class Group_Capability_controller {
@Autowired
private Group_CapabilityRepository group_CapabilityRepository;
@RequestMapping(value="add",method=RequestMethod.POST)
@ResponseBody
public boolean addGroup_Capability(@RequestBody Group_capability group_capability) {
	System.out.println(group_capability.getId().getCId());
	System.out.println(group_capability.getId().getGId());
//	this.group_CapabilityRepository.save(group_capability);
	return true;
	
}
}
