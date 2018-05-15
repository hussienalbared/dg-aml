package com.datagearbi.controller;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.helper.AcAlaramEventHelper;
import com.datagearbi.model.AC_Alarm_Event;
import com.datagearbi.repository.AcAlarmEventRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("aml/api/v1/alarmEvent")
public class AcAlarmEventController {
	@Autowired
	private AcAlarmEventRepository acAlarmEventRepository;
	@RequestMapping(value="add",method=RequestMethod.PUT)
	@ResponseBody
	public String  addAlarmEvent(@RequestBody AcAlaramEventHelper ac	) {
	
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		AC_Alarm_Event acAlarmEvent = new AC_Alarm_Event();
	
		acAlarmEvent.setCreate_User_Id(ac.getCreate_user_id());
		acAlarmEvent.setEvent_Desc(ac.getEvent_description());

		acAlarmEvent.setCreate_Date(timestamp);

		acAlarmEvent.setEvent_Type_Cd(ac.getEvent_type_code());
		acAlarmEvent.setAlarm_Id(ac.getAlarm_id());
	this.acAlarmEventRepository.save(acAlarmEvent);
		  
	//	return acAlarmEvent; 
	return "an event added";
		

		
	}

}
