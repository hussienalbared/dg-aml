package com.datagearbi.controller;

import java.math.BigDecimal;
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
	private Object updateAlertCountApi(@RequestParam("key") String key, @RequestParam("code") String levelCode) {

		Optional suspected = this.suspectedObjectRepository
				.findById(new AC_Suspected_ObjectPK(levelCode, Integer.parseInt(key)));

		if (!suspected.isPresent()) {

			return null;
		}

		String query = "select count(*)  from AC_ALARM where alarm_status_code='act'"
				+ " and alarmed_obj_level_code=:code and alarmed_obj_key=:key";
		int y = (Integer) this.em.createNativeQuery(query).setParameter("code", levelCode).setParameter("key", key)
				.getResultList().get(0);
		;
		this.suspectedObjectRepository.updateAcSuspectedObjAlertCount(Integer.parseInt(key), levelCode, y);
		return y;

	}

	@RequestMapping(value="AlarmDetailSection1",method=RequestMethod.GET)
	private List getAlarmDetailSection1(@RequestParam("alarmId") String alarmId) {
			
		String query=" select A.routine_name ,B.routine_description,A.run_date ,A.actual_values_text "
				+ " From  AC_ALARM as A inner join "
				+ " AC_ROUTINE as B on A.routine_id=B.routine_id where A.alarm_id="+alarmId ;
		return em.createNativeQuery(query).getResultList();
								
	}

	@RequestMapping(value = "AlarmDetailSection2", method = RequestMethod.GET)
	private List getAlarmDetailSection2(@RequestParam("alarmId") String alarmId) {

		String query = "  select ACCTNO ,TTRN,CFDATEKEY,CFCURRAMT,transaction_cdi_desc, TTDS from suspected_transactions_V where TTRN in( "
				+ "  select ttrn from CORE_TRANSACTION_D where transaction_key in( "
				+ "  select transaction_key from AC_CASH_FLOW_ALARM where alarm_id=" + alarmId +
				"  ))";
		return em.createNativeQuery(query).getResultList();

	}

}
