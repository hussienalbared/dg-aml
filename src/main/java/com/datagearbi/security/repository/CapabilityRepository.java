package com.datagearbi.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.datagearbi.model.security.Capability;
@Repository
public interface CapabilityRepository extends JpaRepository<Capability, Integer>{
@Query("Select D from Capability D where D.id not in(select C.id.cId from Group_capability C where C.id.gId=?1)")
List<Capability>getRemainingCapabilities(int groupId);
}
