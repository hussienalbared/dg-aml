package com.datagearbi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.CoreExternalPartyD;
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
	public List<CoreExternalPartyD> name2(

			@RequestParam(name = "ExtPartynumber") String ExtPartynumber,
			@RequestParam(name = "ExtPartyId") String ExtPartyId,
			@RequestParam(name = "ExtPartyFullName") String ExtPartyFullName,
			@RequestParam(name = "ExtPartyIdCountryCode") String ExtPartyIdCountryCode) {

		/*
		 * /*EXPFULLNM,EXPNO,EXPSTADD1,EXPSTADD2 ," + " EXPSTCINM , EXPBOD , EXPSTCONM "
		 * + ", EXPIDTYDS , EXPID
		 */

		String query = "select * from CORE_EXTERNAL_PARTY_D where 1=1 ";
		if (!ExtPartynumber.isEmpty() && ExtPartynumber != null) {
			query += " and EXPNO = '" + ExtPartynumber + "' ";
		}
		if (!ExtPartyId.isEmpty() && ExtPartyId != null) {
			query += " and EXPID = '" + ExtPartyId + "' ";

		}

		if (!ExtPartyFullName.isEmpty() && ExtPartyFullName != null) {
			query += " and EXPFULLNM = '" + ExtPartyFullName + "' ";
		}

		if (!ExtPartyIdCountryCode.isEmpty() && ExtPartyIdCountryCode != null) {
			query += " and EXPIDCONM = '" + ExtPartyIdCountryCode + "' ";
		}

		// return (List<CoreAccountD>)
		// entityManager.createNativeQuery(query,CoreAccountD.class).getResultList().subList(1,
		// 4);
		// return query;
		return (List<CoreExternalPartyD>) entityManager.createNativeQuery(query, CoreExternalPartyD.class)
				.getResultList();

	}

}
