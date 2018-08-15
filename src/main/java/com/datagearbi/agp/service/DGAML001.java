package com.datagearbi.agp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.datagearbi.model.DGAML001_Transfer_Loan_customer_to_another;

import com.datagearbi.agp.repository.DGAML001_Transfer_Loan_customer_to_anotherRepository;

@Service
public class DGAML001 {

	@Autowired
	private DGAML001_Transfer_Loan_customer_to_anotherRepository dgaml001_repository;
	
	public List<DGAML001_Transfer_Loan_customer_to_another> DGAML001_Data() {
		return this.dgaml001_repository.findAll();
	}
}
