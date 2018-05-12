package com.datagearbi.controller;

import com.datagearbi.model.AcRiskClassifier;
import com.datagearbi.repository.AcRiskClassifierRepository;
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
 * Created by Ahmed Shalash on 27/04/2018.
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/acriskclassifier")
@EnableTransactionManagement
public class AcRiskClassifierController {

    @Autowired
    private AcRiskClassifierRepository acRiskClassifierRepository;

    @GetMapping
    public List<AcRiskClassifier> getAll(){
        Pageable page =  PageRequest.of(0,1);
        List <AcRiskClassifier> acRiskClassifiers =  acRiskClassifierRepository.findAll();
        return acRiskClassifiers;
    }
}
