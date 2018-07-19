package com.datagearbi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datagearbi.model.security.Group;
@Repository
public interface GroupRepository extends JpaRepository<Group, Integer>{
	

}
