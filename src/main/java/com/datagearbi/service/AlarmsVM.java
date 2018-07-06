/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamzah.Ahmed
 * get all data as bulk
 * 
 */
public class AlarmsVM {
    
    List<AlarmDTO> alrmsVMs = new  ArrayList<>();

    public List<AlarmDTO> getAlrmsVMs() {
        return alrmsVMs;
    }

    public void setAlrmVMs(List<AlarmDTO> alrmsVMs) {
        this.alrmsVMs = alrmsVMs;
    }
    
    
}
