package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML001AlarmData;
import com.datagearbi.service.AML002AlarmData;
import com.datagearbi.service.AlarmDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML001AlarmDataServiceIntegrationTest {
	@Autowired
	AML001AlarmData aml001AlarmData;
	@Autowired
	AML002AlarmData aml002AlarmData;

	@Test
	public void selectRecordfromAML002View() {
		assertThat(this.aml002AlarmData.selectRecordfromAML002View().size()).isGreaterThan(0);
	}

	// @Test
	public void testSelectRecordfromAML001Parm() {
		System.out.println("testSelectRecordfromAML001Parm");

		List<AlarmDTO> AlarmDTOs = aml001AlarmData.selectRecordfromAML001Parm();
		AlarmDTOs.forEach(dd -> {
			System.out.println(dd.getParm_name());
		});
		System.out.println("AlarmDTOs.size:" + AlarmDTOs.size());
		assertThat(AlarmDTOs.size()).isGreaterThanOrEqualTo(0);

	}

	// @Test
	public void testSelectTransactionsCount() {

	}

	// @Test
	public void testSelectRecordfromAML003Parm() {
		System.out.println("testSelectRecordfromAML001Parm");

		List<AlarmDTO> AlarmDTOs = aml001AlarmData.selectRecordfromAML001Parm();
		AlarmDTOs.forEach(dd -> {
			System.out.println(dd.getParm_name());
		});
		System.out.println("AlarmDTOs.size:" + AlarmDTOs.size());
		assertThat(AlarmDTOs.size()).isGreaterThanOrEqualTo(0);

	}
}
