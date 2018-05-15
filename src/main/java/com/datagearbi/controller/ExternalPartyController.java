package com.datagearbi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.External_Customer;
import com.datagearbi.repository.ExternalPartyObjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/externalParty")
@Transactional
@Repository
public class ExternalPartyController {
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private ExternalPartyObjectRepository externalPartyObjectRepository;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<External_Customer> name2(

			@RequestParam(name = "ExtPartynumber") String ExtPartynumber,
			@RequestParam(name = "ExtPartyId") String ExtPartyId,
			@RequestParam(name = "ExtPartyFullName") String ExtPartyFullName,
			@RequestParam(name = "ExtPartyIdCountryCode") String ExtPartyIdCountryCode) {

	

		String query = "select A from External_Customer A where 1=1 ";
		if (!ExtPartynumber.isEmpty() && ExtPartynumber != null) {
			query += " and A.ext_Cust_No = '" + ExtPartynumber + "' ";
		}
		if (!ExtPartyId.isEmpty() && ExtPartyId != null) {
			query += " and A.ident_Id = '" + ExtPartyId + "' ";

		}

		if (!ExtPartyFullName.isEmpty() && ExtPartyFullName != null) {
			query += " and A.ext_Full_Name = '" + ExtPartyFullName + "' ";
		}

		if (!ExtPartyIdCountryCode.isEmpty() && ExtPartyIdCountryCode != null) {
			query += " and A.ident_Cntry_Name = '" + ExtPartyIdCountryCode + "' ";
		}

		
		return entityManager.createQuery(query)
				.getResultList();

	}
	@RequestMapping(value = "all2", method = RequestMethod.GET)
	public List<External_Customer> all(){
		CriteriaBuilder cb=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<External_Customer> query=cb.createQuery(External_Customer.class);
		Root<External_Customer> e=query.from(External_Customer.class);
		 query.select(e).where(cb.lt(e.get("ext_Cust_Acct_Key"), 3));
		return  this.entityManager.createQuery(query).getResultList();
		
		//return this.externalPartyObjectRepository.findAll();
	}
}
