package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML016AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML016AlarmDataTest {
	@Autowired
	AML016AlarmData aml016AlarmData;
	
//	@Test
	public void getAML016AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml016AlarmData.getAML016AlarmData();
		
		assertThat(alarmsVM).isNotNull();
	}

	/*
	 * Passed
	 */
//	@Test
	public void getAML016ParmDataTest() {
		AlarmsVM alarmsVM = this.aml016AlarmData.getAML016ParmData();
		System.out.println("getAML016ParmDataTest" + alarmsVM.getAlrmsVMs().get(0));
		assertThat(alarmsVM.getAlrmsVMs().size()).isGreaterThan(0);
	}

	/*
	 * ??
	 */
	@Test
	public void selectRecordfromAML016ViewTest() {
		System.out.println("selectRecordfromAML016ViewTest");
		List<AlarmDTO> list = this.aml016AlarmData.selectRecordfromAML016View();
		assertThat(list.size()).isGreaterThan(0);
	}

	/*
	 * Passed
	 */
//	@Test
	public void selectTransactionsCountTest() {
		String trans_count = this.aml016AlarmData.selectTransactionsCount(1884);
		System.out.println("Transaction Count: " + trans_count);
		assertThat(trans_count).isNotNull();
	}

	/*
	 * Passed
	 */
//	@Test
	public void selectTotalAmountTest() {
		String total_amount = this.aml016AlarmData.selectTotalAmount(1884);
		System.out.println("Total Amount: " + total_amount);
		assertThat(total_amount).isNotNull();
	}

	/*
	 * Passed
	 */
//	@Test
	public void selectRecordfromAML016ParmTest() {
		List<AlarmDTO> obj = this.aml016AlarmData.selectRecordfromAML016Parm(); 
		System.out.println("Pram Name: " + obj.get(0).getParm_name());
		assertThat(obj).size().isGreaterThan(0);
	}

}
