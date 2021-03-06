package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML022AlarmData;
import com.datagearbi.service.AlarmDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML022AlarmDataIntegrationTest {

	@Autowired
	private AML022AlarmData amL022AlarmData;
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectRecordfromAML023View() {
		List<AlarmDTO> obj = this.amL022AlarmData.selectRecordfromAML022View();
//		System.out.println("Cust_Name: " + obj.get(0).getCust_Name());
		assertThat(obj).size().isGreaterThan(0);
	}
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectTransactionsCount() {
		String trans_count = this.amL022AlarmData.selectTransactionsCount(1884);
		System.out.println("Transaction Count: " + trans_count);
		assertThat(trans_count).isNotNull();
	}
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectTotalAmount() {
		String total_amount = this.amL022AlarmData.selectTotalAmount(1884);
		System.out.println("Total Amount: " + total_amount);
		assertThat(total_amount).isNotNull();
	}
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectRecordfromAML023Parm() {
		List<AlarmDTO> obj = this.amL022AlarmData.selectRecordfromAML022Parm();
//		System.out.println("Pram Name: " + obj.get(0).getParm_name());
		assertThat(obj).size().isGreaterThan(0);
	}
}
