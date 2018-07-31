package com.datagearbi.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Alarm;
import com.datagearbi.model.AC_Risk_Assessment;
import com.datagearbi.model.AC_Suspected_Object;
import com.datagearbi.model.AC_Suspected_ObjectPK;
import com.datagearbi.model.Notification;
import com.datagearbi.model.RiskNotification;
import com.datagearbi.model.SuspectNotification;
import com.datagearbi.model.UserNotifications;
import com.datagearbi.model.alarmNotification;
import com.datagearbi.model.security.User;
import com.datagearbi.repository.AcRiskAssismentRepository;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.repository.AlarmNotificationRepository;
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
		s.setNotification_Date(new Date());
		
		Optional<User> user = this.userRepository.findById(s.getCreate_User_Id());
		String NotificationMessage = "";
		if (user.isPresent()) {
			s.setCreate_User_Name(user.get().getFirstname());

		}
		Optional<AC_Suspected_Object> suspect = this.suspectedObjectRepository
				.findById(new AC_Suspected_ObjectPK(s.getAlarmed_Obj_level_Cd(), s.getAlarmed_Obj_Key()));

		if (suspect.isPresent()) {
			s.setAlarmed_Obj_Name(suspect.get().getAlarmed_Obj_Name());
		}
		if (s.getAction().equals("Forward")) {
			NotificationMessage = "" + s.getCreate_User_Name() + " " + s.getAction() + "  suspect " + s.getAlarmed_Obj_Name()
					+ " to user " + s.getTarget_User_Name();

		} else if (s.getAction().equals("close") || s.getAction().equals("suppress")
				|| s.getAction().equals("take ownership") || s.getAction().equals("remove ownership")) {
			NotificationMessage = "" + s.getCreate_User_Name() + " " + s.getAction() + "  suspect " + s.getAlarmed_Obj_Name();

		} else if (s.getAction().equals("add comment") || s.getAction().equals("update comment")
				|| s.getAction().equals("delete comment")) {
			NotificationMessage = "" + s.getCreate_User_Name() + " " + s.getAction() + s.getComment_Decription()
					+ " on  suspect " + s.getAlarmed_Obj_Name();

		}

		s.setNotification_Summary(NotificationMessage);
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
		s.setNotification_Date(new Date());
		Optional<User> user = this.userRepository.findById(s.getCreate_User_Id());
		if (user.isPresent()) {
			s.setCreate_User_Name(user.get().getFirstname());
		}
		Optional<AC_Alarm> alarm = this.alaramObjectRepository.findById(s.getAlarm_Id());
		if (alarm.isPresent()) {
			s.setAlarmed_obj_name(alarm.get().getAlarmed_Obj_Name());
		}
		NotificationMessage = "" + s.getCreate_User_Name() + " " + s.getAction() + " alarm on suspect "
				+ s.getAlarmed_obj_name();
		s.setNotification_Summary(NotificationMessage);
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
		s.setNotification_Date(new Date());
		Optional<User>user=this.userRepository.findById(s.getCreate_User_Id());
		if(user.isPresent()) {
			s.setCreate_User_Name(user.get().getFirstname());
		}
		Optional<AC_Risk_Assessment> ac_risk=this.acRiskAssismentRepository.findById(s.getRisk_Assmnt_Id());
		if(ac_risk.isPresent())
		{
			s.setCust_Name(ac_risk.get().getCust_Name());
		}

		if(s.getAction().equals("Forward"))
		{
			 NotificationMessage=""+s.getCreate_User_Name()+" "+s.getAction()+
					"  "+s.getCust_Name()+" to user "+s.getTarget_Name();
			
		}
		else
		{
			 NotificationMessage=""+s.getCreate_User_Name()+" "+s.getAction()+" on "+s.getCust_Name();
			
		}
		s.setNotification_Summary(NotificationMessage);
		RiskNotification ss=this.riskNotificationRepository.save(s);
		List<User> uu=this.userRepository.findAll();
		uu.forEach(a->{
			template.convertAndSend("/topic/notification/" + a.getId(),ss);
	
});

	 return ss;
		}
	@RequestMapping("readNotification")
	public void readNotification(@RequestBody UserNotifications s) {
		s.setIs_Seen("y");
		this.userNotificationsRepository.save(s);
		 List<Notification> notification= this.notificationRepository.getUnseenNotification(s.getUser_Id());

//		template.convertAndSend("/topic/notification/"+s.getUserId(),notification);


	}
	@RequestMapping("allNotification/{userId}")
	public List<Notification> test(@PathVariable int userId) {
		return this.notificationRepository.getUnseenNotification(userId);
		

	}
	@RequestMapping("markAllRead")
	public void  markAllRead(@RequestParam("userId") int userId) {
	List<Notification> n= this.notificationRepository.getUnseenNotification(userId);
	n.forEach(a->{
		UserNotifications nn=new UserNotifications();
		nn.setIs_Seen("y");
		nn.setNotification_ID(a.getNotification_ID());
		nn.setUser_Id(userId);
		this.userNotificationsRepository.save(nn);
		
		
	});
		

	}
	

}