package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

@Query("select n from Notification n where n.id not in(select u.notificationId from UserNotifications u where u.userId=?1)")
List<Notification> getUnseenNotification(int userId);
		
	
}
