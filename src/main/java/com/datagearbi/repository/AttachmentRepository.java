package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
	@Query("SeLect D from Attachment D where D.alarmed_Obj_level_Cd=?1 and D.alarmed_Obj_Key=?2")
List<Attachment>findAttachmentbySuspect(String code,long key);
}
