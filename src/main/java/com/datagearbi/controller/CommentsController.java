package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Comments;
import com.datagearbi.repository.CommentsRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/comments")
public class CommentsController {
	
	@Autowired
	private CommentsRepository CommentsRepository;
	


	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<Comments> findAll()
	{return this.CommentsRepository.findAll();
		
	}
}