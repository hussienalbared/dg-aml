package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML021AlarmData;
import com.datagearbi.service.AlarmDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML021AlarmDataIntegrationTest {

	@Autowired
	private AML021AlarmData aml021AlarmData;
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectRecordfromAML023View() {
		List<AlarmDTO> obj = this.aml021AlarmData.selectRecordfromAML021View();
//		System.out.println("Cust_Name: " + obj.get(0).getCust_Name());
		assertThat(obj).size().isGreaterThan(0);
	}
	
	/*
	 * Passed
	 */
	@Test
	public void TestSelectRecordfromAML023Parm() {
		List<AlarmDTO> obj = this.aml021AlarmData.selectRecordfromAML021Parm();
//		System.out.println("Pram Name: " + obj.get(0).getParm_name());
		assertThat(obj).size().isGreaterThan(0);
	}
}
