package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.CorePartyD;


public interface PartyObjectRepository extends JpaRepository<CorePartyD, Integer> {

}
