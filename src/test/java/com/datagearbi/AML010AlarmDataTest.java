package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML010AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML010AlarmDataTest {
	@Autowired
	AML010AlarmData aml010AlarmData;
	@Test
	public void getAML010AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml010AlarmData.getAML010AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	/*
	 * Passed
	 */
//	@Test
	public void getAML010ParmDataTest() {
		AlarmsVM alarmsVM = this.aml010AlarmData.getAML010ParmData();
		System.out.println("getAML010ParmDataTest" + alarmsVM.getAlrmsVMs().get(0));
		assertThat(alarmsVM.getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	public void selectRecordfromAML010ViewTest() {
		System.out.println("selectRecordfromAML010ViewTest");
		List<AlarmDTO> list = this.aml010AlarmData.selectRecordfromAML010View();
		System.out.println("Cust_Name: " + list.get(0).getCust_Name());
		assertThat(list.size()).isGreaterThan(0);
	}

//	@Test
	public void selectTransactionsCountTest() {
		String trans_count = this.aml010AlarmData.selectTransactionsCount(1884);
		System.out.println("Transaction Count: " + trans_count);
		assertThat(trans_count).isNotNull();
	}

	/*
	 * Passed
	 */
//	@Test
	public void selectTotalAmountTest() {
		String total_amount = this.aml010AlarmData.selectTotalAmount(1884);
		System.out.println("Total Amount: " + total_amount);
		assertThat(total_amount).isNotNull();

	}


	/*
	 * Passed
	 */
//	@Test
	public void selectInstNumTest() {
		String InsNum = this.aml010AlarmData.selectInstNum(1884);
		System.out.println("InsNum: " + InsNum);
		assertThat(InsNum).isNotNull();
	}

	/*
	 * Passed
	 */
//	@Test
	public void selectRecordfromAML010ParmTest() {
		List<AlarmDTO> obj = this.aml010AlarmData.selectRecordfromAML010Parm();
		System.out.println("Pram Name: " + obj.get(0).getParm_name());
		assertThat(obj.size()).isGreaterThan(0);

	}

}
