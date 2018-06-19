package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML007AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML007AlarmDataTest {
	@Autowired
	public AML007AlarmData alAml007AlarmData;

	@Test
	public void getAML007AlarmDataTest() {
		AlarmsVM alarmsVM = this.alAml007AlarmData.getAML007AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	@Test
	public void getAML007ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.alAml007AlarmData.getAML007ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	public void selectRecordfromAML007ViewTest() {

		List<AlarmDTO> list = this.alAml007AlarmData.selectRecordfromAML007View();
		assertThat(list.size()).isGreaterThan(0);
	}

	@Test
	public void selectTransactionsCountTest() {
		assertThat(this.alAml007AlarmData.selectTransactionsCount(1884)).isNotNull();
	}

	@Test
	public void selectTotalAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml007AlarmData.selectTotalAmount(1884)).isNotNull();

	}

	@Test
	public void selectInstNumTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml007AlarmData.selectInstNum(1884)).isNotNull();
	}

	@Test
	public void selectRecordfromAML007ParmTest() {
		assertThat(this.alAml007AlarmData.selectRecordfromAML007Parm().size()).isGreaterThan(0);

	}
	@Test
	public void selectTotalLoanAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml007AlarmData.selectTotalLoanAmount(1884)).isNotNull();

	}
}
