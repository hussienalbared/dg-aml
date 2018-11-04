package com.datagearbi.agp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datagearbi.model.Installments_paid_in_cash;

public interface Installments_paid_in_cashRepository extends JpaRepository<Installments_paid_in_cash, Integer>{
@Query("select sum(D.ccy_Amt) from Installments_paid_in_cash D where D.cust_Key=?1")
	Long CalculateTransactionTotalAmount(int customerKey);
@Query("select sum(D.ccy_Amt) from Installments_paid_in_cash D where D.cust_Key=?1 and D.Sec_Med_Desc='Cash'")

Long CalculateTransactionTotalAmountOfCash(int customerKey);

}
