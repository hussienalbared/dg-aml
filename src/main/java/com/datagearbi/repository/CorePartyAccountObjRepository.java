package com.datagearbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datagearbi.model.Customer_X_Account;
import com.datagearbi.model.Customer_X_AccountPK;

public interface CorePartyAccountObjRepository  extends JpaRepository<Customer_X_Account, Customer_X_AccountPK>{

}
