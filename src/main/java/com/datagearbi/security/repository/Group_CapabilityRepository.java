package com.datagearbi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.security.Group_CapabilityPK;
import com.datagearbi.model.security.Group_capability;

public interface Group_CapabilityRepository extends JpaRepository<Group_capability, Group_CapabilityPK> {

}
