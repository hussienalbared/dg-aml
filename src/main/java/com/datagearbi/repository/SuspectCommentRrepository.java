package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Comment;

public interface SuspectCommentRrepository extends JpaRepository<Comment, Integer>{

	@Query("select c from Comment c where c.alarmed_Obj_level_Cd=?1 and c.alarmed_Obj_Key=?2")
	public List<Comment> getAllComments(String alarmed_Obj_level_Cd, long alarmed_Obj_Key);
}
