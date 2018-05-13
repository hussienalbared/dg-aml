package com.datagearbi.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.repository.suspected_transactions_VRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/alaram")
public class AlaramController {
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;
	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	@Autowired
	private suspected_transactions_VRepository transctiobb;

	@RequestMapping(value = "allalarams", method = RequestMethod.GET)
	public List<AC_Alarm> search(@RequestParam(name = "AlarmId", required = false) String AlarmId,

			@RequestParam(name = "AlarmStatus") String AlarmStatus,
			@RequestParam(name = "MoneyLaunderingRisk") String MoneyLaunderingRisk,
			@RequestParam(name = "CreateDate") String CreateDate, @RequestParam(name = "RunDate") String RunDate,
			@RequestParam(name = "ScenarioName") String ScenarioName,
			@RequestParam(name = "ScenarioId") String ScenarioId) {

		System.out.println(CreateDate);
		if ((AlarmId == null || AlarmId.isEmpty()) && (AlarmStatus == null || AlarmStatus.isEmpty())
				&& (MoneyLaunderingRisk == null || MoneyLaunderingRisk.isEmpty())
				&& (CreateDate == null || CreateDate.isEmpty()) && (RunDate == null || RunDate.isEmpty())
				&& (ScenarioName == null || ScenarioName.isEmpty()) && (ScenarioId == null || ScenarioId.isEmpty())) {
			return null;
		}

		List<AC_Alarm> list = alaramObjectRepository.findAll();
		if (AlarmId != null && !AlarmId.isEmpty()) {
			list = list.stream().filter(e -> e.getAlarm_Id() == Long.parseLong(AlarmId.trim()))
					.collect(Collectors.toList());

		}
		if (AlarmStatus != null && !AlarmStatus.isEmpty()) {
			list = list.stream().filter(e -> e.getAlarm_Status_Cd() != null)
					.filter(e -> e.getAlarm_Status_Cd().trim().equals(AlarmStatus.trim())).collect(Collectors.toList());
		}
		if (MoneyLaunderingRisk != null && !MoneyLaunderingRisk.isEmpty()) {
			list = list.stream().filter(e -> e.getMl_Risk_Score() == Integer.parseInt(MoneyLaunderingRisk.trim()))
					.collect(Collectors.toList());

		}
		if (CreateDate != null && !CreateDate.isEmpty()) {
			list = list.stream().filter(e -> e.getCreate_Date() != null).filter(e -> e.getCreate_Date() != null)
					.filter(e -> e.getCreate_Date().toString().split(" ")[0].trim().equals(CreateDate.trim())).

					collect(Collectors.toList());
		}
		if (RunDate != null && !RunDate.isEmpty()) {
			list = list.stream().filter(e -> e.getRun_Date() != null).filter(e -> e.getRun_Date() != null)
					.filter(e -> e.getRun_Date().toString().split(" ")[0].trim().equals(RunDate.trim())).

					collect(Collectors.toList());
		}
		if (ScenarioName != null && !ScenarioName.isEmpty()) {
			list = list.stream().filter(e -> e.getRoutine_Name() != null)
					.filter(e -> e.getRoutine_Name().trim().equals(ScenarioName.trim())).collect(Collectors.toList());
		}
		if (ScenarioId != null && !ScenarioId.isEmpty()) {
			list = list.stream().filter(e -> e.getRoutine_Id() != null)
					.filter(e -> e.getRoutine_Id().compareTo(new BigDecimal(ScenarioId.trim())) == 0)
					.collect(Collectors.toList());
		}

		return list;

	}

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<AC_Alarm> allalarms() {

		return this.alaramObjectRepository.findAll();
	}

	// set alram status to close by obj_key obj_code
	// @RequestMapping(value="closeAlarm" ,method = RequestMethod.GET)
	// public void closeAlarm(@RequestParam("alarmed_obj_key") String
	// alarmed_obj_key,
	// @RequestParam("alarmed_obj_level_code")String alarmed_obj_level_code
	//
	// ) {
	// this.alaramObjectRepository.closeAlarms(Integer.parseInt(alarmed_obj_key),alarmed_obj_level_code);
	//
	// }
	@RequestMapping(value = "closeAlarmById", method = RequestMethod.PUT)
	private String closeOneAlarm(@RequestParam("alarmId") String alarmId,
			@RequestParam("alarmStatusCode") String alarmStatusCode) {
		// close alarm
		this.alaramObjectRepository.closeAlarmById(Long.parseLong(alarmId), alarmStatusCode);

		return "updated";

	}

	@RequestMapping(value = "updateAlertCountApi", method = RequestMethod.PUT)
	private Object updateAlertCountApi(@RequestParam("key") String key,
			@RequestParam("code") String levelCode) {

		Optional suspected = this.suspectedObjectRepository
				.findById(new AC_Suspected_ObjectPK(levelCode, Integer.parseInt(key)));

		if (!suspected.isPresent()) {

			return null;
		}

		String query = "select count(*)  from AC_Alarm A"
				+ " where A.alarm_Status_Cd='ACT'"
				+ " and A.alarmed_Obj_Level_Cd=:code and A.alarmed_Obj_Key=:key";
		int y =  ((Long) (this.em.createQuery(query)
				.setParameter("code", levelCode).setParameter("key",new BigDecimal(key))
				.getResultList().get(0))).intValue();;
		;
	
		
		this.suspectedObjectRepository.updateAcSuspectedObjAlertCount(Long.parseLong(key), levelCode,y);
		return y;

	}

	@RequestMapping(value="AlarmDetailSection1",method=RequestMethod.GET)
	private Optional<AC_Alarm> getAlarmDetailSection1(@RequestParam("alarmId") String alarmId) {
//			
//		String query=" select A.routine_Name ,B.routine_Desc,A.run_Date ,A.actual_Value_Txt "
//				+ " From  AC_Alarm as A inner join "
//				+ " AC_ROUTINE as B on A.routine_Id=B.routine_Id where A.alarm_Id="+alarmId ;
//		return em.createNativeQuery(query).getResultList();
		
		return this.alaramObjectRepository.findById(Long.parseLong(alarmId));
		
								
	}

	@RequestMapping(value = "AlarmDetailSection2", method = RequestMethod.GET)
	private List getAlarmDetailSection2(@RequestParam("alarmId") String alarmId) {
	
		String query = " select ST.acct_Key ,ST.trans_Ref_No,ST.date_Key,ST.ccy_Amt,ST.trans_Desc, ST.trans_Cr_Db_Ind_Desc"
				+ " from Suspected_transactions_V ST"
				+ ""
				+ " where ST.trans_Ref_No in( "
				+ "  select A.trans_Ref_No from Transaction_Detail A "
				+ ""
				+ "where A.trans_Key in( "
				+ "  select B.id.trans_Key from AC_Transaction_Flow_Alarm B where B.id.alarm_Id=" + alarmId +
				"  ))";
		String query2="select B from AC_Transaction_Flow_Alarm B";
		return em.createQuery(query).getResultList();

	}

}
