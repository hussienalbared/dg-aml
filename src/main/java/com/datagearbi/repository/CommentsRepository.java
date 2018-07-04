package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
	@Query("SeLect D from Comments D where D.alarmed_Obj_level_Cd=?1 and D.alarmed_Obj_Key=?2")
	List<Comments> findAttachmentbySuspect(String code, long key);
//	@Query("select new map()from Comments c inner join User u on u.id=c.")
}
