package com.datagearbi.controller;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.CommentNotification;
import com.datagearbi.model.Comments;
import com.datagearbi.model.Notification;
import com.datagearbi.model.RiskNotification;
import com.datagearbi.model.SuspectNotification;
import com.datagearbi.model.alarmNotification;
import com.datagearbi.model.security.User;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.AlarmNotificationRepository;
import com.datagearbi.repository.NotificationRepository;
import com.datagearbi.repository.RiskNotificationRepository;
import com.datagearbi.repository.SuspectNotificationRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.security.repository.UserRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.datagearbi.repository.CommentNotificationRepository;
import com.datagearbi.repository.CommentsRepository;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("aml/api/notification")
public class NotificationController {

	@Autowired
	private NotificationRepository notificationRepository;
	@Autowired
	private SuspectNotificationRepository suspectNotificationRepository;
	@Autowired
	private AlarmNotificationRepository alarmNotificationRepository;
	@Autowired
	private RiskNotificationRepository riskNotificationRepository;
	@Autowired
	private CommentNotificationRepository commentNotificationRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;
	
	@Autowired
	private AlaramObjectRepository alaramObjectRepository;
	@Autowired
	private CommentsRepository commentsRepository;

	@RequestMapping("all")
	public List<Notification> allNotifications() {

//	return this.suspectnotificationController.findAll();
	
			List<Notification> notification=this.notificationRepository.findAll();
              
			return notification;

		}
	@RequestMapping("addSuspectNotification")
	public SuspectNotification addSuspectNotification(@RequestBody SuspectNotification s) {

	 SuspectNotification ss=this.suspectNotificationRepository.save(s);
	 return ss;
		}
	@RequestMapping("addalarmNotification")
	public alarmNotification addalarmNotification(@RequestBody alarmNotification s) {

		alarmNotification ss=this.alarmNotificationRepository.save(s);
	 return ss;
		}

	@RequestMapping("addRiskNotification")
	public RiskNotification addRiskNotification(@RequestBody RiskNotification s) {

		RiskNotification ss=this.riskNotificationRepository.save(s);
	 return ss;
		}
	@RequestMapping("addCommentNotification")
	public CommentNotification addCommentNotification(@RequestBody CommentNotification s) {

		CommentNotification ss=this.commentNotificationRepository.save(s);
	 return ss;
		}
	
	@RequestMapping("test2")
	public List<String> test2()  {
		List<Notification> notification=this.notificationRepository.findAll();
		List<String> description=new ArrayList<>();
		System.out.println("*************************************************");
notification.forEach(a->{
	if(a instanceof SuspectNotification) {
		System.out.println("**********hhhhhhhhhhhh**************************************");
		Optional<User>u=this.userRepository.findById(a.getUserId());
		
		if(u.isPresent())
		{
			Optional<AC_Suspected_Object>uu=
		this.suspectedObjectRepository.findById(new AC_Suspected_ObjectPK
					
	(((SuspectNotification)a).getAlarmed_Obj_level_Cd(),((SuspectNotification)a).getAlarmed_Obj_Key()));
			 
			if(uu.isPresent())
			{
				String h="User "+u.get().getDisplayName()+" "+
						((SuspectNotification)a).getAction()+" on suspect "+uu.get().getAlarmed_Obj_Name()
						;	
		description.add(h);
			}
			
		}
	
	}
	else if(a instanceof alarmNotification) {
		Optional<User>u=this.userRepository.findById(a.getUserId());
		if(u.isPresent())
		{
			Optional<AC_Alarm> al=this.alaramObjectRepository.findById(((alarmNotification)a).getAlarmId());
			if(al.isPresent())
			{
				String h="User "+u.get().getDisplayName()+" "+
						((alarmNotification)a).getAction()+" on suspect "+al.get().getAlarmed_Obj_Name()
						;	
		description.add(h);
				
			}
		}
	}
	else if(a instanceof CommentNotification) {
		Optional<User>u=this.userRepository.findById(a.getUserId());
		if(u.isPresent())
		{
			Optional<Comments> al=this.commentsRepository.findById(((CommentNotification)a).getCommentId());

			if(al.isPresent())
			{
				String h="User "+u.get().getDisplayName()+" "+
						((CommentNotification)a).getDescription()+" comment with id "+al.get().getDescription()
						;	
		description.add(h);
				
			}
		}
	}
	
});
return description;
     
		}
	

}