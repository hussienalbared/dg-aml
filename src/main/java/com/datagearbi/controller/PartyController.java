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

import com.datagearbi.model.Customer;
import com.datagearbi.repository.PartyObjectRepository;

@RestController
@RequestMapping("aml/api/party")
@CrossOrigin(origins = "*")
public class PartyController {
	@Autowired
	private PartyObjectRepository PartyObjectRepository;
	@RequestMapping("ByPNO")
	private Optional<Customer> findByPNO(@RequestParam(name = "PartyNumber") String PartyNumber) {
		
return this.PartyObjectRepository.findBcust_No(PartyNumber);		

	}
	@RequestMapping("search")
	public List<Customer> name(
	    @RequestParam(name = "PartyNumber") String PartyNumber,
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
	
		
		List<Customer>list=PartyObjectRepository.findAll();
		
		
		if (PartyNumber != null && !PartyNumber.isEmpty())
		{ 
			list=list.stream().filter(p->p.getCust_No()!=null).filter(p->p.getCust_No().trim().equalsIgnoreCase(PartyNumber.trim())).collect(Collectors.toList());
			
		}
		if(PartyId != null && !PartyId.isEmpty())
		{ 
			list=list.stream().filter(p->p.getCust_Key()==Integer.parseInt(PartyId.trim())).collect(Collectors.toList());
		}
		if(PartyName != null && !PartyName.isEmpty())
		{ 
			list=list.stream().filter(p->p.getCust_Name()!=null).filter(p->p.getCust_Name().trim().equalsIgnoreCase(PartyName.trim())).collect(Collectors.toList());
		}
		if(PoliticallyExposedPerson != null && !PoliticallyExposedPerson.isEmpty())
		{
			
			list=list.stream().filter(p->p.getPolitical_Exp_Prsn_Ind()!=null).filter(p->p.getPolitical_Exp_Prsn_Ind().trim().equalsIgnoreCase(PoliticallyExposedPerson.trim())).collect(Collectors.toList());
		}
		if(Risk != null && !Risk.isEmpty())
		{
			list=list.stream().filter(p->p.getRisk_Class()!=null).filter(p->p.getRisk_Class().compareTo(new BigDecimal(Risk.trim()))==0).collect(Collectors.toList());
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		PartyStatusDescription=PartyStatusDescription.substring(PartyStatusDescription.indexOf(",")+1);
		if(PartyStatusDescription != null && !PartyStatusDescription.isEmpty())
		{
			String PartyStatusDescription2=PartyStatusDescription.substring(PartyStatusDescription.indexOf(",")+1);
			list=list.stream().filter(p->p.getCust_Status_Desc()!=null).filter(p->p.getCust_Status_Desc().trim().equalsIgnoreCase(PartyStatusDescription2.trim())).collect(Collectors.toList());
		}
////		
	
		return list;

	}
	
	@RequestMapping("getAll")
	public List<Customer> getAll(){
		return this.PartyObjectRepository.findAll();
	}
}
