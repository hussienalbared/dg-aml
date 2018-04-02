package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.Party;

public interface PartyObjectRepository extends JpaRepository<Party, Integer> {

}
