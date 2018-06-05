package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.security.Capability;
import com.datagearbi.model.security.Group;
import com.datagearbi.security.repository.CapabilityRepository;
import com.datagearbi.security.repository.GroupRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("aml/api/capability")
public class CapabilityController {
	@Autowired
	private CapabilityRepository capabilityRepository;
	@RequestMapping(value="all",method=RequestMethod.GET)
	public List<Capability> getCapabilities() {
		return this.capabilityRepository.findAll();
	}
}
