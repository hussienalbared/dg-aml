package com.datagearbi.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML002AlarmDataServiceIntegrationTest {
	@Autowired
	AML002AlarmData aml002AlarmData;

	@Test
	public void testSelectRecordfromAML002Parm() {
		System.out.println("testSelectRecordfromAML002Parm");
		int size = aml002AlarmData.selectRecordfromAML002Parm().size();
		System.out.println("size:"+size);
		assertThat(size).isGreaterThanOrEqualTo(0);
	}
}
