package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
