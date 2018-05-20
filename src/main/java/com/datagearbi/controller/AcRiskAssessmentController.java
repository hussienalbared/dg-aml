package com.datagearbi.controller;

import com.datagearbi.model.AcRiskAssessment;
import com.datagearbi.repository.AcRiskAssismentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by USER-5 on 17/05/2018.
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/accountriskassigment")
@EnableTransactionManagement
public class AcRiskAssessmentController {

    @Autowired
    private AcRiskAssismentRepository acRiskAssismentRepository;

    @GetMapping
    public List<AcRiskAssessment> getAll(){
        Pageable page =  PageRequest.of(0,1);
        List <AcRiskAssessment> acRiskAssessments =  acRiskAssismentRepository.findAll();
        return acRiskAssessments;
    }
}
