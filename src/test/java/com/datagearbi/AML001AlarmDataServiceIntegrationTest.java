package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML001AlarmData;
import com.datagearbi.service.AlarmDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML001AlarmDataServiceIntegrationTest {
	@Autowired
	AML001AlarmData aml001AlarmData;

	@Test
	public void testSelectTransactionsCount() {
		System.out.println("testSelectTransactionsCount");

		String count;
		try {
			count = aml001AlarmData.selectTransactionsCount("");
			System.out.println("objs.size:" + count);
			assertThat(Integer.parseInt(count)).isGreaterThanOrEqualTo(0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSelectRecordfromAML001Parm() {
		System.out.println("testSelectRecordfromAML001Parm");

		List<AlarmDTO> AlarmDTOs = aml001AlarmData.selectRecordfromAML001Parm();
		AlarmDTOs.forEach(dd -> {
			System.out.println(dd.getParm_name());
		});
		System.out.println("AlarmDTOs.size:" + AlarmDTOs.size());
		assertThat(AlarmDTOs.size()).isGreaterThanOrEqualTo(0);

	}
}
