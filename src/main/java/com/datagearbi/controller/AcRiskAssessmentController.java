package com.datagearbi.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Risk_Assessment;
import com.datagearbi.repository.AcRiskAssismentRepository;

/**
 * Created by USER-5 on 17/05/2018.
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/accountriskassigment")
@EnableTransactionManagement
public class AcRiskAssessmentController {

	@PersistenceContext
	private EntityManager em;
	
    @Autowired
    private AcRiskAssismentRepository acRiskAssismentRepository;

    @GetMapping
    public List<AC_Risk_Assessment> getAll(){
        Pageable page =  PageRequest.of(0,1);
        List <AC_Risk_Assessment> acRiskAssessments =  acRiskAssismentRepository.findAll();
        return acRiskAssessments;
    }
    
    /******/
    @RequestMapping(value = "getObject", method= RequestMethod.GET)
	public List<AC_Risk_Assessment> getAllAvaRisks() {
		//return suspectedObjectRepository.findAll();
//		String query="select a from AC_Risk_Assessment a "
//				+ "where a.risk_Assmnt_Status_Cd !=CLS";
//		List s= em.createQuery(query,AC_Risk_Assessment.class).getResultList();
//		int y=s.size();
//		if(s.size()==0)
//			return null;
//		
//		return s;
		List<AC_Risk_Assessment> list= acRiskAssismentRepository.findAll();
		list = list.stream().filter(e -> !(e.getRisk_Assmnt_Status_Cd().equals("CLS"))).collect(Collectors.toList());
		
		return list;
	}
    @RequestMapping(value = "updateUser", method= RequestMethod.PUT)
	public void  updateUser(@RequestParam("key") String key,
							@RequestParam("user") String user) {	
    	
    	this.acRiskAssismentRepository.updateAcRiskAssismentObj(Long.parseLong(key), user);	
	}	
    @RequestMapping(value = "removeOwnerShip", method= RequestMethod.PUT)
	public void  removeOwnerShip(@RequestParam("key") String key) {
		
    	this.acRiskAssismentRepository.updateAcRiskAssismentObj(Long.parseLong(key),null);	
	}	
    @RequestMapping(value = "riskDecline", method= RequestMethod.PUT)
	public void riskDecline(@RequestParam("key") String key) {
		
    	this.acRiskAssismentRepository.riskDecline(Long.parseLong(key),"CLS");	
	}
    
    @RequestMapping(value = "approveRisk", method= RequestMethod.PUT)
	public void approveRisk(@RequestParam("key") String key, @RequestParam("custNo") String custNo) {
		
    	this.acRiskAssismentRepository.riskDecline(Long.parseLong(key),"CLS");
    	//update customer table
    	//String query="update Customer set Customer.risk_Class= AC_Risk_Assessment.proposed_Risk_Class from Customer INNER JOIN AC_Risk_Assessment ON "
			//	+ "Customer.cust_No = AC_Risk_Assessment.cust_No";
//    	String query="update Customer c set c.risk_Class = "
//    			+ "( SELECT proposed_Risk_Class FROM AC_Risk_Assessment Where risk_Assmnt_Id='"+key+"') " + 
//    			" where c.cust_No='"+custNo+"'";
//    	
//    	em.createQuery(query).executeUpdate();
    	this.acRiskAssismentRepository.updateCusNo(Long.parseLong(key), custNo);
    	
    	this.acRiskAssismentRepository.updatePropsed(Long.parseLong(key));
	}
    /******/
}		
		