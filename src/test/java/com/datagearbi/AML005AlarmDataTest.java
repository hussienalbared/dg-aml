package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML005AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML005AlarmDataTest {
	@Autowired
	private AML005AlarmData alAml005AlarmData;

	@Test
	private void getAML005AlarmDataTest() {
		AlarmsVM alarmsVM = this.alAml005AlarmData.getAML005AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	@Test
	private void getAML005ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.alAml005AlarmData.getAML005ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	private void selectRecordfromAML005ViewTest() {

		List<AlarmDTO> list = this.alAml005AlarmData.selectRecordfromAML005View();
		assertThat(list.size()).isGreaterThan(0);
	}

	@Test
	void selectTransactionsCountTest() {
		assertThat(this.alAml005AlarmData.selectTransactionsCount(1884)).isNotNull();
	}

	@Test
	private void selectTotalAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml005AlarmData.selectTotalAmount(1884)).isNotNull();

	}

	@Test
	private void selectRecordfromAML005ParmTest() {
		assertThat(this.alAml005AlarmData.selectRecordfromAML005Parm().size()).isGreaterThan(0);

	}
}
