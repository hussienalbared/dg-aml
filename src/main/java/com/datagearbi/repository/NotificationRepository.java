package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

	
}
