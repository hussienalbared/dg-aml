package com.datagearbi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Risk_Classifier;
import com.datagearbi.repository.AcRiskClassifierRepository;

/**
 * Created by Ahmed Shalash on 27/04/2018.
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/acriskclassifier")
@EnableTransactionManagement
public class AcRiskClassifierController {

    @Autowired
    private AcRiskClassifierRepository acRiskClassifierRepository;

    @GetMapping
    public List<AC_Risk_Classifier> getAll(){
        Pageable page =  PageRequest.of(0,1);
        List <AC_Risk_Classifier> acRiskClassifiers =  acRiskClassifierRepository.findAll();
        return acRiskClassifiers;
    }
}
