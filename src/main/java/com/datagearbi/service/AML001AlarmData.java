/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datagearbi.service;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;

import com.datagearbi.helper.AcRoutineHelper;
import com.datagearbi.helper.ParamRecord;
import com.datagearbi.model.Dgaml001TransLoanXToT;


/**
 *
 * @author Hamzah.Ahmed
 * 
 * This class gets all data for the AML001
 */
public class AML001AlarmData {
	@PersistenceContext
	private EntityManager entityManager;


    public AML001AlarmData() {
    }

    /**
     * *********** AML001 - ***
     */
    public AlarmsVM getAML001AlarmData() {
        AlarmsVM scMAVM = new AlarmsVM();
        List<AlarmDTO> listofSC;

        try {
            listofSC = selectRecordfromAML001View();
            // System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():   "+listofSC.get(0));
            scMAVM.setAlrmVMs(listofSC);
        } catch (SQLException ex) {
            Logger.getLogger(AML001AlarmData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return scMAVM;

    }
    
    
    // Parameters VMs
    
    public AlarmsVM getAML001ParmData() {
        AlarmsVM parmMAVM = new AlarmsVM();
        List<AlarmDTO> listofParm;

        try {
            listofParm = selectRecordfromAML001Parm();
            // System.out.println("com.datagearbi.aml.agb.AlarmProcess.getAlarmData():   "+listofSC.get(0));
            parmMAVM.setAlrmVMs(listofParm);
        } catch (SQLException ex) {
            Logger.getLogger(AML001AlarmData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return parmMAVM;

    }

    //select Data
    public List<AlarmDTO> selectRecordfromAML001View() throws SQLException {

        List<AlarmDTO> listOfSC = new ArrayList<>();
     

//        String selectRecord = "select Cust_Type_Desc,Cust_No,Cust_Name,Acct_No,Acct_Key,Acct_Name,Acct_Type_Desc,Acct_Emp_Ind,Cust_Emp_Ind,Cust_Key,Political_Exp_Prsn_Ind"
//                + ",Trans_Key,Date_Key,Time_Key,Trans_Type_Key,Cntry_Key,Trans_Status_Key,Branch_Key"
//                + " from DGAMLCORE.DGAML001_TRANS_LOAN_X_TO_T";
        String selectRecord = "select D from Dgaml001TransLoanXToT D";
//        String selectRecord1 = "select Routine_Id,Routine_Name,Alarm_Categ_Cd,Alarm_Subcateg_Cd,Routine_Short_Desc"
//                + ", Routine_Msg_Txt from AC.AC_Routine where Routine_Name='AML001' and Current_Ind='Y'";

		 String selectRecord1 = "select new com.datagearbi.helper.AcRoutineHelper (A.routine_Id,A.routine_Name,A.alarm_Categ_Cd,A.alarm_Subcateg_Cd"
	        		+ ",A.routine_Short_Desc"
	                + ", A.routine_Msg_Txt)  from AC_Routine A where A.routine_Name='AML001' and current_Ind='Y'";
	               
	
		
	

     
           List<Dgaml001TransLoanXToT> res1= this.entityManager.createQuery(selectRecord,Dgaml001TransLoanXToT.class).getResultList();
           res1.forEach(a->{
        	    AlarmDTO temp = new AlarmDTO();
                temp.setCust_Type_Desc(a.getCust_Type_Desc());
                temp.setCust_No(a.getCust_No());
                temp.setCust_Name(a.getCust_Name());
                temp.setAcct_No(a.getAcct_No());
                temp.setAcct_Key(String.valueOf(a.getAcct_Key()));
                temp.setAcct_Name(a.getAcct_Name());
                temp.setAcct_Type_Desc(a.getAcct_Type_Desc());
                temp.setAcct_Emp_Ind(a.getAcct_Emp_Ind());
                temp.setCust_Emp_Ind(a.getCust_Emp_Ind());
                temp.setCust_Key(String.valueOf(a.getCust_Key()));
                temp.setPolitical_Exp_Prsn_Ind(a.getPolitical_Exp_Prsn_Ind());
                temp.setTrans_Key(String.valueOf(a.getTrans_Key()));
                
                try {
					temp.setTransactions_count(selectTransactionsCount(String.valueOf(a.getAcct_Key())));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
                temp.setDate_Key(String.valueOf(a.getDate_Key()));
                temp.setTime_Key(String.valueOf(a.getTime_Key()));
                temp.setTrans_Type_Key(String.valueOf(a.getTrans_Type_Key()));
                temp.setCntry_Key(String.valueOf(a.getCntry_Key()));
                temp.setTrans_Status_Key(String.valueOf(a.getTrans_Status_Key()));
                temp.setBranch_Key(String.valueOf(a.getBranch_Key()));
                List<AcRoutineHelper> list= this.entityManager.createQuery(selectRecord1,AcRoutineHelper.class).getResultList();     

//                ResultSet res2 = statement2.executeQuery(selectRecord1);
//                res2.next();
                if(list.size()>0) {
                  temp.setRoutine_Id(String.valueOf(list.get(0).getRoutine_Id()));
                  temp.setRoutine_Name(list.get(0).getRoutine_Name());
                  temp.setAlarm_Categ_Cd(list.get(0).getAlarm_Categ_Cd());
                  temp.setAlarm_Subcateg_Cd(list.get(0).getAlarm_Subcateg_Cd());
                  temp.setRoutine_Short_Desc(list.get(0).getRoutine_Short_Desc());
                  temp.setRoutine_Msg_Txt(list.get(0).getRoutine_Msg_Txt());                	
                }

                /**
                 * ***********************************************
                 */
                listOfSC.add(temp);
        	    
           });
           
           
                    
        return listOfSC;

    }

    /**
     * ************** Get  transactions count
     */
   
   public String selectTransactionsCount(String Acct_key) throws SQLException {

      

		  String selectTransactionsCount = "SELECT count(D.trans_Key) as transactions_count"
       + "  FROM Dgaml001TransLoanXToT D group by D.acctKey";
		  List<Long> f=  this.entityManager.createQuery(selectTransactionsCount).getResultList();
        

		  long z=f.get(0);
		  return String.valueOf(z);
         
            
//            res.next();
//            transactions_count1=res.getString("transactions_count");
         
      
            



        
    
    }
    
       
    
   /**
    * ************ Get parameters Data
    */ 
    
    public List<AlarmDTO> selectRecordfromAML001Parm() throws SQLException {

        List<AlarmDTO> listOfParm = new ArrayList<>();
     

        String selectParmRecord =  "select AP.id.routine_Id as q,AP.id.parm_Name as w "
        		+ ",AP.parm_Value as dd,"
        		+ "AP.parm_Type_Desc as www,AP.parm_Desc as qqq" 
                +" from AC_Routine_Parameter AP" 
                +" where AP.id.routine_Id =(select A.routine_Id from AC_Routine A" 
                +" where A.routine_Name='AML001' and current_Ind='Y')";

      
          
        	 List<ParamRecord> list= this.entityManager.createQuery(selectParmRecord,ParamRecord.class).getResultList();
        	 AlarmDTO tempParm = new AlarmDTO();
        	 for(ParamRecord r:list)
        	 { 
        	 tempParm.setParm_name(r.getParm_Name());
             tempParm.setParm_value(r.getParm_Value());
             tempParm.setParm_type_desc(r.getParm_Type_Desc());
        	 }
     
               
               
               
                
               
                
                /**
                 * ***********************************************
                 */
                listOfParm.add(tempParm);

            

        
        return listOfParm;

    }


    /**
     * *********** End of AML001 ***
     */
    public static void main(String[] args) {
//        AlarmProcess AMLP = new AlarmProcess();
//        AlarmVM Results = AMLP.getAlarmData();
    }

}
