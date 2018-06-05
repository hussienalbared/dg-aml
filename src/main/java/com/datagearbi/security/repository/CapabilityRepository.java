package com.datagearbi.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datagearbi.model.security.Capability;
@Repository
public interface CapabilityRepository extends JpaRepository<Capability, Long>{

}
