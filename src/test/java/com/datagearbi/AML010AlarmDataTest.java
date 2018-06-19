package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML010AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML010AlarmDataTest {
	@Autowired
	AML010AlarmData aml010AlarmData;
	@Test
	private void getAML010AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml010AlarmData.getAML010AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	@Test
	private void getAML010ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.aml010AlarmData.getAML010ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	public void selectRecordfromAML010ViewTest() {
		System.out.println("selectRecordfromAML010ViewTest");
		List<AlarmDTO> list = this.aml010AlarmData.selectRecordfromAML010View();
		assertThat(list.size()).isGreaterThan(0);
	}

	@Test
	public void selectTransactionsCountTest() {
		assertThat(this.aml010AlarmData.selectTransactionsCount(1884)).isNotNull();
	}

	@Test
	public void   selectTotalAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.aml010AlarmData.selectTotalAmount(1884)).isNotNull();

	}

	@Test
	public void  selectInstNumTest() {
		// TODO Auto-generated method stub
		assertThat(this.aml010AlarmData.selectInstNum(1884)).isNotNull();
	}
	@Test
	public void  selectRecordfromAML010ParmTest() {
		assertThat(this.aml010AlarmData.selectRecordfromAML010Parm().size()).isGreaterThan(0);

	}

}
