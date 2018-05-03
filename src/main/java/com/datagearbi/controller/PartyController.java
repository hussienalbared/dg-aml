package com.datagearbi.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.CorePartyD;
import com.datagearbi.repository.PartyObjectRepository;

@RestController
@RequestMapping("aml/api/party")
@CrossOrigin(origins = "http://localhost:4200")
public class PartyController {
	@Autowired
	private PartyObjectRepository PartyObjectRepository;
	@RequestMapping("ByPNO")
	private Optional<CorePartyD> findByPNO(@RequestParam(name = "PartyNumber") String PartyNumber) {
		
return this.PartyObjectRepository.findBypno(PartyNumber);		

	}
	@RequestMapping("search")
public List<CorePartyD> name(@RequestParam(name = "PartyNumber") String PartyNumber,
		@RequestParam(name = "PartyId") String PartyId,
		@RequestParam(name = "PartyName") String PartyName,
		@RequestParam(name = "PoliticallyExposedPerson") String PoliticallyExposedPerson,
		@RequestParam(name = "Risk") String Risk,
		@RequestParam(name = "PartyStatusDescription") String PartyStatusDescription
		) {
		
		if ((PartyNumber == null||PartyNumber.isEmpty()) 
				&& (PartyId == null || PartyId.isEmpty())
				&& (PartyName == null || PartyName.isEmpty())
				&& (PoliticallyExposedPerson == null || PoliticallyExposedPerson.isEmpty())
				&&(Risk == null || Risk.isEmpty())
				&&(PartyStatusDescription == null || PartyStatusDescription.isEmpty() )
				) {
			return null;
		}
	
		
		List<CorePartyD>list=PartyObjectRepository.findAll();
		
		if (PartyNumber != null && !PartyNumber.isEmpty())
		{ 
			list=list.stream().filter(p->p.getPno()!=null).filter(p->p.getPno().trim().equalsIgnoreCase(PartyNumber.trim())).collect(Collectors.toList());
			
		}
		if(PartyId != null && !PartyId.isEmpty())
		{ 
			list=list.stream().filter(p->p.getPid()!=null).filter(p->p.getPid().trim().equalsIgnoreCase(PartyId.trim())).collect(Collectors.toList());
		}
		if(PartyName != null && !PartyName.isEmpty())
		{ 
			list=list.stream().filter(p->p.getPfnm()!=null).filter(p->p.getPfnm().trim().equalsIgnoreCase(PartyName.trim())).collect(Collectors.toList());
		}
		if(PoliticallyExposedPerson != null && !PoliticallyExposedPerson.isEmpty())
		{
			
			list=list.stream().filter(p->p.getPpepind()!=null).filter(p->p.getPpepind().trim().equalsIgnoreCase(PoliticallyExposedPerson.trim())).collect(Collectors.toList());
		}
		if(Risk != null && !Risk.isEmpty())
		{
			list=list.stream().filter(p->p.getRiskClassification()!=null).filter(p->p.getRiskClassification().compareTo(new BigDecimal(Risk.trim()))==0).collect(Collectors.toList());
		}
		
		if(PartyStatusDescription != null && !PartyStatusDescription.isEmpty())
		{
			list=list.stream().filter(p->p.getPstatds()!=null).filter(p->p.getPstatds().trim().equals(PartyStatusDescription.trim())).collect(Collectors.toList());
		}
		
		
		
	return list;
	
}
}
