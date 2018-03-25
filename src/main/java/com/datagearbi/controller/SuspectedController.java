package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.SuspectedObject;
import com.datagearbi.model.SuspectedObjectId;
import com.datagearbi.repository.SuspectedObjectRepository;

@RestController
@RequestMapping("api/v1/")
public class SuspectedController {

	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	
	@RequestMapping(value = "suspectedObject", method= RequestMethod.GET)
	public List<SuspectedObject> list() {
		return suspectedObjectRepository.findAll();
	}
	
	@RequestMapping(value = "suspectedObject/{key}/{levelCode}" , method= RequestMethod.GET)
	public SuspectedObject get(@PathVariable int key,@PathVariable String levelCode) {
		SuspectedObjectId id = new SuspectedObjectId(key, levelCode);
		return suspectedObjectRepository.getOne(id);
	}
}
