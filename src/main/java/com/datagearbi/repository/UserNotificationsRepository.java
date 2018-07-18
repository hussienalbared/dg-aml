package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.UserNotifications;

public interface UserNotificationsRepository extends JpaRepository<UserNotifications, Integer>{
}
