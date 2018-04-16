package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.CorePartyAccountB;
import com.datagearbi.model.CorePartyAccountBPK;

public interface CorePartyAccountObjRepository  extends JpaRepository<CorePartyAccountB, CorePartyAccountBPK>{

}
