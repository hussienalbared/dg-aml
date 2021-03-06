package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

@Query("select n from Notification n where n.Notification_ID not in(select u.Notification_ID from UserNotifications u where u.User_Id=?1)")
List<Notification> getUnseenNotification(int userId);
		
	
}
