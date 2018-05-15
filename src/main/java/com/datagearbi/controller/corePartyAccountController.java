package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.Customer_X_Account;
import com.datagearbi.repository.CorePartyAccountObjRepository;

@RestController
@RequestMapping("aml/api/corePartyAccount")
public class corePartyAccountController {
	@Autowired
private CorePartyAccountObjRepository corePartyAccountObjRepository;
	@RequestMapping("search")
	private List<Customer_X_Account> all() {
		// TODO Auto-generated method stub
		return this.corePartyAccountObjRepository.findAll();

	}

}
