package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

}
