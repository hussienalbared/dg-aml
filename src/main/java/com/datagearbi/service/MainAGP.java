/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;



import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainAGP {

   
    //private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    
    public void Run_AGP() throws SQLException
    {
        // Scenarios that will be run SCR Vector.
    
    int SCR[]={1,2,3,5,7,10,16,20,21,22,23};
    
    for (int x : SCR)
    {
            //System.out.println("gsjkfgskj:"+ x);
            
            switch (x) {
            case 1:  AlarmsProcess.insertAML001AlarmData();
                     break;
//            case 2:  AlarmsProcess.insertAML002AlarmData();
//                     break;
//            case 3:  AlarmsProcess.insertAML003AlarmData();
//                     break;
//            case 5:  AlarmsProcess.insertAML005AlarmData();
//                     break;
//            case 7:  AlarmsProcess.insertAML007AlarmData();
//                     break;
//            case 10: AlarmsProcess.insertAML010AlarmData(); ;
//                     break;
//            case 16:  AlarmsProcess.insertAML016AlarmData();
//                     break;
//            case 20:  AlarmsProcess.insertAML020AlarmData();
//                     break;
//            case 21:  AlarmsProcess.insertAML021AlarmData();
//                     break;
//            case 22: AlarmsProcess.insertAML022AlarmData();
//                     break;
//            case 23: AlarmsProcess.insertAML023AlarmData();
//                     break;
            default: System.out.println("Invalid Scenario Name");;
                     break;
        }
    }
      
    
    
    
    }

    public static void main(String[] argv) throws SQLException {

    
    
    
//    // Scenarios that will be run SCR Vector.
//    
//    int SCR[]={1};
//    
//    for (int x : SCR)
//    {
//            //System.out.println("gsjkfgskj:"+ x);
//            
//            switch (x) {
//            case 1:  AlarmsProcess.insertAML001AlarmData();
//                     break;
//            case 2:  AlarmsProcess.insertAML002AlarmData();
//                     break;
//            case 3:  AlarmsProcess.insertAML003AlarmData();
//                     break;
//            case 5:  AlarmsProcess.insertAML005AlarmData();
//                     break;
//            case 7:  AlarmsProcess.insertAML007AlarmData();
//                     break;
//            case 10: AlarmsProcess.insertAML010AlarmData(); ;
//                     break;
//            case 16:  AlarmsProcess.insertAML016AlarmData();
//                     break;
//            case 20:  AlarmsProcess.insertAML020AlarmData();
//                     break;
//            case 21:  AlarmsProcess.insertAML021AlarmData();
//                     break;
//            case 22: AlarmsProcess.insertAML022AlarmData();
//                     break;
//            case 23: AlarmsProcess.insertAML023AlarmData();
//                     break;
//            default: System.out.println("Invalid Scenario Name");;
//                     break;
//        }
//    }
//      
    
    
      
    
    }

}
