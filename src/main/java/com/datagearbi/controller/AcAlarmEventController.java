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
import com.datagearbi.model.AcAlarmEvent;
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

		AcAlarmEvent acAlarmEvent = new AcAlarmEvent();
	
		acAlarmEvent.setCreateUserId(ac.getCreate_user_id());
		acAlarmEvent.setEventDescription(ac.getEvent_description());

		acAlarmEvent.setCreateDate(timestamp);

		acAlarmEvent.setEventTypeCode(ac.getEvent_type_code());
		acAlarmEvent.setAlarmId(ac.getAlarm_id());
		this.acAlarmEventRepository.save(acAlarmEvent);
		  
		 
		return "an event added";
		

		
	}

}
