package com.datagearbi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Risk_Assessment;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.CommentNotification;
import com.datagearbi.model.Comments;
import com.datagearbi.model.Notification;
import com.datagearbi.model.RiskNotification;
import com.datagearbi.model.SuspectNotification;
import com.datagearbi.model.UserNotifications;
import com.datagearbi.model.alarmNotification;
import com.datagearbi.model.security.User;
import com.datagearbi.repository.AcRiskAssismentRepository;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.AlarmNotificationRepository;
import com.datagearbi.repository.CommentNotificationRepository;
import com.datagearbi.repository.CommentsRepository;
import com.datagearbi.repository.NotificationRepository;
import com.datagearbi.repository.RiskNotificationRepository;
import com.datagearbi.repository.SuspectNotificationRepository;
import com.datagearbi.repository.SuspectedObjectRepository;
import com.datagearbi.repository.UserNotificationsRepository;
import com.datagearbi.security.repository.UserRepository;

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
	@Autowired
	private SimpMessagingTemplate template;
	@Autowired
	private AcRiskAssismentRepository acRiskAssismentRepository;
	@Autowired
	private UserNotificationsRepository userNotificationsRepository;
	@RequestMapping("all")
	
	public List<Notification> allNotifications() {

//	return this.suspectnotificationController.findAll();
	
			List<Notification> notification=this.notificationRepository.findAll();
              
			return notification;

		}

	@RequestMapping("addSuspectNotification")
	public SuspectNotification addSuspectNotification(@RequestBody SuspectNotification s) {
		s.setNotificationDate(new Date());
		System.out.println("***********************>>>" + s.getUserId());
		Optional<User> user = this.userRepository.findById(s.getUserId());
		String NotificationMessage = "";
		if (user.isPresent()) {
			s.setUserName(user.get().getFirstname());

		}
		Optional<AC_Suspected_Object> suspect = this.suspectedObjectRepository
				.findById(new AC_Suspected_ObjectPK(s.getAlarmed_Obj_level_Cd(), s.getAlarmed_Obj_Key()));

		if (suspect.isPresent()) {
			s.setAlarmed_obj_name(suspect.get().getAlarmed_Obj_Name());
		}
		if (s.getAction().equals("Forward")) {
			NotificationMessage = "" + s.getUserName() + " " + s.getAction() + "  suspect " + s.getAlarmed_obj_name()
					+ " to user " + s.getTarget_user_name();

		} else if (s.getAction().equals("close") || s.getAction().equals("suppress")
				|| s.getAction().equals("take ownership") || s.getAction().equals("remove ownership")) {
			NotificationMessage = "" + s.getUserName() + " " + s.getAction() + "  suspect " + s.getAlarmed_obj_name();

		} else if (s.getAction().equals("add comment") || s.getAction().equals("update comment")
				|| s.getAction().equals("delete comment")) {
			NotificationMessage = "" + s.getUserName() + " " + s.getAction() + s.getCommentdecription()
					+ " on  suspect " + s.getAlarmed_obj_name();

		}

		s.setFinalDescription(NotificationMessage);
		SuspectNotification ss = this.suspectNotificationRepository.save(s);
//		template.convertAndSend("/topic/notification/", this.notificationRepository.findAll());
		List<User> uu=this.userRepository.findAll();
		uu.forEach(a->{
			template.convertAndSend("/topic/notification/" + a.getId(),ss);
	
});
		return ss;
	}

	@RequestMapping("addalarmNotification")
	public alarmNotification addalarmNotification(@RequestBody alarmNotification s) {
		String NotificationMessage = "";
		s.setNotificationDate(new Date());
		Optional<User> user = this.userRepository.findById(s.getUserId());
		if (user.isPresent()) {
			s.setUserName(user.get().getFirstname());
		}
		Optional<AC_Alarm> alarm = this.alaramObjectRepository.findById(s.getAlarmId());
		if (alarm.isPresent()) {
			s.setAlarmed_obj_name(alarm.get().getAlarmed_Obj_Name());
		}
		NotificationMessage = "" + s.getUserName() + " " + s.getAction() + " alarm on suspect "
				+ s.getAlarmed_obj_name();
		s.setFinalDescription(NotificationMessage);
		alarmNotification ss = this.alarmNotificationRepository.save(s);
		List<User> uu=this.userRepository.findAll();
		uu.forEach(a->{
			template.convertAndSend("/topic/notification/" + a.getId(),ss);
	
});
//		template.convertAndSend("/topic/notification/",this.notificationRepository.findAll());

		return ss;
	}

	@RequestMapping("addRiskNotification")
	public RiskNotification addRiskNotification(@RequestBody RiskNotification s) {
		String NotificationMessage="";
		s.setNotificationDate(new Date());
		Optional<User>user=this.userRepository.findById(s.getUserId());
		if(user.isPresent()) {
			s.setUserName(user.get().getFirstname());
		}
		Optional<AC_Risk_Assessment> ac_risk=this.acRiskAssismentRepository.findById(s.getRisk_Assmnt_Id());
		if(ac_risk.isPresent())
		{
			s.setCust_Name(ac_risk.get().getCust_Name());
		}

		if(s.getAction().equals("Forward"))
		{
			 NotificationMessage=""+s.getUserName()+" "+s.getAction()+
					"  "+s.getCust_Name()+" to user "+s.getTarget_Name();
			
		}
		else
		{
			 NotificationMessage=""+s.getUserName()+" "+s.getAction()+" on "+s.getCust_Name();
			
		}
		s.setFinalDescription(NotificationMessage);
		RiskNotification ss=this.riskNotificationRepository.save(s);
		List<User> uu=this.userRepository.findAll();
		uu.forEach(a->{
			template.convertAndSend("/topic/notification/" + a.getId(),ss);
	
});

	 return ss;
		}
	@RequestMapping("readNotification")
	public void readNotification(@RequestBody UserNotifications s) {
		s.setIsSeen("y");
		this.userNotificationsRepository.save(s);
		 List<Notification> notification= this.notificationRepository.getUnseenNotification(s.getUserId());

		template.convertAndSend("/topic/notification/"+s.getUserId(),notification);


	}
	@RequestMapping("test/{userId}")
	public List<Notification> test(@PathVariable int userId) {
		return this.notificationRepository.getUnseenNotification(userId);
		

	}
	

}