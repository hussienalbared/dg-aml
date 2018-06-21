package com.datagearbi.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.security.Group;
import com.datagearbi.security.repository.GroupRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("aml/api/group")
public class GroupController {
@Autowired
private GroupRepository groupRepository;
@RequestMapping(value="add",method=RequestMethod.POST)
//
public boolean addGroup(@RequestBody Group group)
{System.out.println(group.getId()+" "+group.getName());
Group b=new Group();
b.setName(group.getName());
	this.groupRepository.save(b);
	return true;
	
}

@RequestMapping(value="all",method=RequestMethod.GET)
//
public List<Group> getGroups()
{
	return this.groupRepository.findAll();
	
	
}
@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
//
public List<Group> deleteGroup(@PathVariable int id)
{
	 this.groupRepository.deleteById(id);
	 
	 return this.groupRepository.findAll();
	
	
}
@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
//
public Optional<Group> findGroup(@PathVariable int id)
{
	
	 
	 return this.groupRepository.findById(id);
	
	
}
@RequestMapping(value="/update",method=RequestMethod.PUT)
//
public void updateGroup(@RequestBody Group p)
{
	
	this.groupRepository.save(p);
//	Optional<Group> gg=this.groupRepository.findById(5).orElseThrow(() -> new ResourceNotFoundException("Note", "id", 5));
//	
//	 return this.groupRepository.findById(5);
	
	
}



}

