package com.datagearbi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.datagearbi.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
	List<Attachment> findByfileName(String fileName);
	@Modifying
	@Transactional
	void deleteByfileName(String fileName);

}
