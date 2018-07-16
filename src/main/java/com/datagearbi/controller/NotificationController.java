package com.datagearbi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.CommentNotification;
import com.datagearbi.model.Notification;
import com.datagearbi.model.RiskNotification;
import com.datagearbi.model.SuspectNotification;
import com.datagearbi.model.alarmNotification;
import com.datagearbi.repository.AlarmNotificationRepository;
import com.datagearbi.repository.NotificationRepository;
import com.datagearbi.repository.RiskNotificationRepository;
import com.datagearbi.repository.SuspectNotificationRepository;
import com.datagearbi.repository.CommentNotificationRepository;
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
	@PersistenceContext
	private EntityManager entityManager;



	@RequestMapping("all")
	public List<Notification> test() {

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
}