package com.datagearbi.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AcAlarm;
import com.datagearbi.repository.AlaramObjectRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/alaram")
public class AlaramController {
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;

	
	@RequestMapping(value="allalarams" ,method = RequestMethod.GET)
public List<AcAlarm> search(@RequestParam(name = "AlarmId",required=false) String AlarmId,
		
		@RequestParam(name = "AlarmStatus") String AlarmStatus,
		@RequestParam(name = "MoneyLaunderingRisk") String MoneyLaunderingRisk,
		@RequestParam(name = "CreateDate") String CreateDate,
		@RequestParam(name = "RunDate") String RunDate,
		@RequestParam(name = "ScenarioName") String ScenarioName,
		@RequestParam(name = "ScenarioId") String ScenarioId
		)
{
		
		System.out.println(CreateDate);
		if        ((AlarmId == null ||AlarmId.isEmpty())
				&& (AlarmStatus == null || AlarmStatus.isEmpty())
				&& (MoneyLaunderingRisk == null || MoneyLaunderingRisk.isEmpty())
				&& (CreateDate == null || CreateDate.isEmpty())
				&& (RunDate == null || RunDate.isEmpty())
				&&(ScenarioName == null || ScenarioName.isEmpty())
				&&(ScenarioId == null ||ScenarioId.isEmpty())
				) {
			return null;
		}
		
		
		List<AcAlarm> list=alaramObjectRepository.findAll();
	if(AlarmId != null &&!AlarmId.isEmpty() ) {
		list=list.stream().filter(e->e.getAlarmId()==Long.parseLong(AlarmId.trim())).collect(Collectors.toList());
	
	}
if(AlarmStatus != null && !AlarmStatus.isEmpty()) {
	list=list.stream().filter(e->e.getAlarmStatusCode()!=null).
			filter(e->e.getAlarmStatusCode().trim().equals(AlarmStatus.trim())).collect(Collectors.toList());	
		}
if(MoneyLaunderingRisk != null && !MoneyLaunderingRisk.isEmpty()) {
	list=list.stream().filter(e->e.getMoneyLaunderingRiskScore()!=null).
			filter(e->e.getMoneyLaunderingRiskScore().
			compareTo(new BigDecimal(MoneyLaunderingRisk.trim()))==0).collect(Collectors.toList());	
	
	
}
if(CreateDate != null && !CreateDate.isEmpty()) {
	list=list.stream().filter(e->e.getCreateDate()!=null).
			filter(e->e.getCreateDate()!=null).filter(
		e->e.getCreateDate().toString().split(" ")[0].trim().equals(CreateDate.trim())
			).
			
			collect(Collectors.toList());
}
if(RunDate != null && !RunDate.isEmpty()) {
	list=list.stream().filter(e->e.getRunDate()!=null).
			filter(e->e.getRunDate()!=null).filter(
			e->e.getRunDate().toString().split(" ")[0].trim().equals(RunDate.trim())
				).
				
				collect(Collectors.toList());
}
if(ScenarioName != null && !ScenarioName.isEmpty()) {
	list=list.stream().filter(e->e.getRoutineName()!=null).
			filter(e->e.getRoutineName().trim().equals(ScenarioName.trim())).collect(Collectors.toList());
}
if(ScenarioId != null &&!ScenarioId.isEmpty() ) {
	list=list.stream().filter(e->e.getRoutineId()!=null).
			filter(e->e.getRoutineId().compareTo(new BigDecimal(ScenarioId.trim()))==0).collect(Collectors.toList());
}

	return list;
	
}
	
	
	@RequestMapping(value="all" ,method = RequestMethod.GET)
	public List<AcAlarm> allalarms() {
		
return this.alaramObjectRepository.findAll();
	}
}
