package com.datagearbi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {
	
	@Query("select c from Comments c where c.alarmed_Obj_level_Cd=?1 and c.alarmed_Obj_Key=?2 and stateIndicator='y'")
	public List<Comments> getAllComments(String alarmed_Obj_level_Cd, long alarmed_Obj_Key);
}
