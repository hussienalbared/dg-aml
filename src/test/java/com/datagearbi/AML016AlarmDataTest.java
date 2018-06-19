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
	@Test
	private void getAML016AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml016AlarmData.getAML016AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	@Test
	private void getAML016ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.aml016AlarmData.getAML016ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	private void selectRecordfromAML016ViewTest() {

		List<AlarmDTO> list = this.aml016AlarmData.selectRecordfromAML016View();
		assertThat(list.size()).isGreaterThan(0);
	}

	@Test
	void selectTransactionsCountTest() {
		assertThat(this.aml016AlarmData.selectTransactionsCount(1884)).isNotNull();
	}

	@Test
	private void selectTotalAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.aml016AlarmData.selectTotalAmount(1884)).isNotNull();

	}



	@Test
	private void selectRecordfromAML016ParmTest() {
		assertThat(this.aml016AlarmData.selectRecordfromAML016Parm().size()).isGreaterThan(0);

	}

}
