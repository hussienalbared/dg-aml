package com.datagearbi.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.helper.DateUtil;
import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.Suspected_transactions_V;
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
			@RequestParam(name = "CreateDateFrom") String CreateDateFrom,
			@RequestParam(name = "CreateDateTo") String CreateDateTo,
			@RequestParam(name = "RunDateFrom") String RunDateFrom, @RequestParam(name = "RunDateTo") String RunDateTo,
			@RequestParam(name = "ScenarioName") String ScenarioName,
			@RequestParam(name = "ScenarioId") String ScenarioId) {

		if ((AlarmId == null || AlarmId.isEmpty()) && (AlarmStatus == null || AlarmStatus.isEmpty())
				&& (MoneyLaunderingRisk == null || MoneyLaunderingRisk.isEmpty())
				&& (CreateDateFrom == null || CreateDateFrom.isEmpty())
				&& (CreateDateTo == null || CreateDateTo.isEmpty()) && (RunDateFrom == null || RunDateFrom.isEmpty())
				&& (RunDateTo == null || RunDateTo.isEmpty()) && (ScenarioName == null || ScenarioName.isEmpty())
				&& (ScenarioId == null || ScenarioId.isEmpty())) {
			return null;
		}

		String query = "select A from AC_Alarm A where 1=1 ";
		if (!AlarmId.isEmpty() && AlarmId != null) {
			query += " and A.alarm_Id =" + AlarmId;

		}

		if (!AlarmStatus.isEmpty() && AlarmStatus != null) {
			query += " and A.alarm_Status_Cd like '%" + AlarmStatus + "%'";

		}
		if (!MoneyLaunderingRisk.isEmpty() && MoneyLaunderingRisk != null) {
			query += " and A.ml_Risk_Score =" + MoneyLaunderingRisk;

		}
		if (!CreateDateFrom.isEmpty() && CreateDateFrom != null) {
			query += " and A.create_Date >='" + DateUtil.startOfDay(CreateDateFrom) + "' ";
		}
		if (!CreateDateTo.isEmpty() && CreateDateTo != null) {
			query += " AND A.create_Date <= '" + DateUtil.endOfDay(CreateDateTo) + "' ";
		}
		if (!RunDateFrom.isEmpty() && RunDateFrom != null) {
			query += " and A.run_Date >='" + DateUtil.startOfDay(RunDateFrom) + "' ";
		}
		if (!RunDateTo.isEmpty() && RunDateTo != null) {
			query += " AND A.run_Date <= '" + DateUtil.endOfDay(RunDateTo) + "' ";
		}
		if (!ScenarioName.isEmpty() && ScenarioName != null) {
			query += " and A.routine_Name =" + ScenarioName + "%' ";
		}
		if (!ScenarioId.isEmpty() && ScenarioId != null) {
			query += " and A.routine_Id =" + ScenarioId;
		}
		System.out.println("allalarams query:"+query);

		return this.em.createQuery(query).getResultList();
	}

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public List<AC_Alarm> allalarms() {
		return this.alaramObjectRepository.findAll();
	}

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
				.findById(new AC_Suspected_ObjectPK(levelCode, Long.parseLong(key)));

		if (!suspected.isPresent()) {
			return null;
		}

		String query = "select count(*)  from AC_Alarm A" + " where A.alarm_Status_Cd='ACT'"
				+ " and A.alarmed_Obj_Level_Cd=:code and A.alarmed_Obj_Key=:key";
		int y = ((Long) (this.em.createQuery(query).setParameter("code", levelCode)
				.setParameter("key", Long.parseLong(key)).getResultList().get(0))).intValue();

		this.suspectedObjectRepository.updateAcSuspectedObjAlertCount(Long.parseLong(key), levelCode, y);
		return y;

	}

	@RequestMapping(value = "AlarmDetailSection1", method = RequestMethod.GET)
	private Optional<AC_Alarm> getAlarmDetailSection1(@RequestParam("alarmId") String alarmId) {
		return this.alaramObjectRepository.findById(Long.parseLong(alarmId));
	}

	@RequestMapping(value = "AlarmDetailSection2", method = RequestMethod.GET)
	private List getAlarmDetailSection2(@RequestParam("alarmId") String alarmId) {

		String query = " select ST " + " from Suspected_transactions_V ST" + "" + " where ST.trans_Ref_No in( "
				+ "  select A.trans_Ref_No from Transaction_Detail A " + "" + "where A.trans_Key in( "
				+ "  select B.id.trans_Key from AC_Transaction_Flow_Alarm B where B.id.alarm_Id=" + alarmId + "  ))";
		return em.createQuery(query, Suspected_transactions_V.class).getResultList();

	}

	@RequestMapping(value = "AlarmDetailSection2/Account", method = RequestMethod.GET)
	private List getAlarmDetailSection2Account(@RequestParam("alarmId") String alarmId,
			@RequestParam("accountKey") String AccountKey) {

		String query = "select B from AC_Transaction_Flow_Alarm B where B.";
		return em.createQuery(query, Suspected_transactions_V.class).getResultList();

	}

}
