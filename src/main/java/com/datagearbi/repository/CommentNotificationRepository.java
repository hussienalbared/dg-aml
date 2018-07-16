package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.CommentNotification;

public interface CommentNotificationRepository extends JpaRepository<CommentNotification, Integer> {

	
}
