package com.datagearbi.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.AC_Risk_Assessment;

/**
 * Created by USER-5 on 17/05/2018.
 */
public interface AcRiskAssismentRepository extends JpaRepository<AC_Risk_Assessment,Long> {
	/****/
	@Modifying
	@Transactional
	@Query("update AC_Risk_Assessment a set a.owner_User_Long_Id=?2 where a.risk_Assmnt_Id=?1")
	void updateAcRiskAssismentObj(long objkey,String User);
	
	@Modifying
	@Transactional
	@Query("update AC_Risk_Assessment a set a.risk_Assmnt_Status_Cd=?2 where a.risk_Assmnt_Id=?1")
	void riskDecline(long key_,String newStatus);
	
	@Modifying
	@Transactional
	@Query("update Customer c set c.risk_Class = "
			+ "( SELECT rc.proposed_Risk_Class FROM AC_Risk_Assessment rc Where rc.risk_Assmnt_Id=?1 ) "
			+" where c.cust_No=?2")
	void updateCusNo(Long rkey_,String custNo);
	
	
	@Modifying
	@Transactional
	@Query("update AC_Risk_Assessment rc set rc.risk_Class = rc.proposed_Risk_Class where rc.risk_Assmnt_Id=?1")
	void updatePropsed(Long rkey);
	
	/****/
}
