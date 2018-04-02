package com.datagearbi.controller;

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

import com.datagearbi.model.Alaram;
import com.datagearbi.repository.AlaramObjectRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/alaram")
public class AlaramController {
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;

	
	@RequestMapping(value="allalarams" ,method = RequestMethod.GET)
public List<Alaram> search(@RequestParam(name = "AlarmId",required=false) Double AlarmId,
		
		@RequestParam(name = "AlarmStatus") String AlarmStatus,
		@RequestParam(name = "MoneyLaunderingRisk") String MoneyLaunderingRisk,
		@RequestParam(name = "CreateDate") String CreateDate,
		@RequestParam(name = "RunDate") String RunDate,
		@RequestParam(name = "ScenarioName") String ScenarioName,
		@RequestParam(name = "ScenarioId") Double ScenarioId
		)
{
		
		System.out.println(CreateDate);
		if ((AlarmId == null) && (AlarmStatus == null || AlarmStatus.isEmpty())
				&& (MoneyLaunderingRisk == null || MoneyLaunderingRisk.isEmpty())
				&& (CreateDate == null || CreateDate.isEmpty())
				&& (RunDate == null || RunDate.isEmpty())
				&&(ScenarioName == null || ScenarioName.isEmpty())
				&&(ScenarioId == null )
				) {
			return null;
		}
		
		System.out.println("djkkkkkkkk"+MoneyLaunderingRisk);
		List<Alaram> list=alaramObjectRepository.findAll();
	if(AlarmId != null ) {
		list=list.stream().filter(e->e.getAlarm_id()==AlarmId).collect(Collectors.toList());
	
	}
if(AlarmStatus != null && !AlarmStatus.isEmpty()) {
	list=list.stream().filter(e->e.getAlarm_status_code().trim().equals(AlarmStatus.trim())).collect(Collectors.toList());	
		}
if(MoneyLaunderingRisk != null && !MoneyLaunderingRisk.isEmpty()) {
	list=list.stream().filter(e->e.getMoney_laundering_risk_score()==Integer.parseInt(MoneyLaunderingRisk)).collect(Collectors.toList());	
	
	
}
if(CreateDate != null && !CreateDate.isEmpty()) {
	list=list.stream().filter(e->e.getCreate_date()!=null).filter(
		e->e.getCreate_date().toString().split(" ")[0].trim().equals(CreateDate.trim())
			).
			
			collect(Collectors.toList());
}
if(RunDate != null && !RunDate.isEmpty()) {
	list=list.stream().filter(e->e.getRun_date()!=null).filter(
			e->e.getRun_date().toString().split(" ")[0].trim().equals(RunDate.trim())
				).
				
				collect(Collectors.toList());
}
if(ScenarioName != null && !ScenarioName.isEmpty()) {
	list=list.stream().filter(e->e.getRoutine_name().trim().equals(ScenarioName.trim())).collect(Collectors.toList());
}
if(ScenarioId != null ) {
	list=list.stream().filter(e->e.getRoutine_id()==ScenarioId).collect(Collectors.toList());
}

	return list;
	
}
	
	
	
}
