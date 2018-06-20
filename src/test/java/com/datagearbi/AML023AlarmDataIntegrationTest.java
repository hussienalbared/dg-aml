package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML023AlarmData;
import com.datagearbi.service.AlarmDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML023AlarmDataIntegrationTest {

	@Autowired
	private AML023AlarmData amL023AlarmData;
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectRecordfromAML023View() {
		List<AlarmDTO> obj = this.amL023AlarmData.selectRecordfromAML023View();
		System.out.println("Cust_Name: " + obj.get(0).getCust_Name());
		assertThat(obj).size().isGreaterThan(0);
	}
	
	/*
	 * Passed
	 * 5
	 */
//	@Test
	public void TestSelectTransactionsCount() {
		String trans_count = this.amL023AlarmData.selectTransactionsCount(1884);
		System.out.println("Transaction Count: " + trans_count);
		assertThat(trans_count).isNotNull();
	}
	
	/*
	 * Passed
	 * 341685.00000
	 */
//	@Test
	public void TestSelectTotalAmount() {
		String total_amount = this.amL023AlarmData.selectTotalAmount(1884);
		System.out.println("Total Amount: " + total_amount);
		assertThat(total_amount).isNotNull();
	}
	
	/*
	 * Passed
	 */
//	@Test
	public void TestSelectRecordfromAML023Parm() {
		
		List<AlarmDTO> obj = this.amL023AlarmData.selectRecordfromAML023Parm();
		System.out.println("Pram Name: " + obj.get(0).getParm_name());
		assertThat(obj).size().isGreaterThan(0);
	}
		
}
