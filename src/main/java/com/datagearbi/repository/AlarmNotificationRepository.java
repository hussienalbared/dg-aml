package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.alarmNotification;

public interface AlarmNotificationRepository extends JpaRepository<alarmNotification, Integer> {

	
}
