package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML003AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML003AlarmDataServiceIntegrationTest {
	@Autowired
	AML003AlarmData aml003AlarmData;



	@Test
	public void getAML003AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml003AlarmData.getAML003AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	@Test
	public void getAML003ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.aml003AlarmData.getAML003ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	public void selectRecordfromAML003ViewTest() {

		List<AlarmDTO> list = this.aml003AlarmData.selectRecordfromAML003View();
		assertThat(list.size()).isGreaterThan(0);
	}

	@Test
	public void selectTransactionsCountTest() {
		assertThat(this.aml003AlarmData.selectTransactionsCount(1867)).isNotNull();
	}

	@Test
	public void selectTotalAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.aml003AlarmData.selectTotalAmount(1867)).isNotNull();

	}

	@Test
	public void selectInstNumTest() {
		// TODO Auto-generated method stub
		assertThat(this.aml003AlarmData.selectInstNum(1867)).isNotNull();

	}

	@Test
	public void selectRecordfromAML003ParmTest() {
		assertThat(this.aml003AlarmData.selectRecordfromAML003Parm().size()).isGreaterThan(0);

	}
}
