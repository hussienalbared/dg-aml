package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML002AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML002AlarmDataServiceIntegrationTest {
	@Autowired
	AML002AlarmData aml002AlarmData;

	// @Test
	public void selectRecordfromAML002View() {
		String b = this.aml002AlarmData.selectInstNum(1884);
		assertThat(b).isNotNull();

	}

//	@Test
	public void getAML002AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml002AlarmData.getAML002AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

//	 @Test
	public void getAML002ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.aml002AlarmData.getAML002ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	// @Test
	public void selectRecordfromAML002ViewTest() {

		List<AlarmDTO> list = this.aml002AlarmData.selectRecordfromAML002View();
		assertThat(list.size()).isGreaterThan(0);
	}

	// @Test
	public void selectTransactionsCountTest() {
		String c= this.aml002AlarmData.selectTransactionsCount(1884);
		System.out.println(c);
		assertThat(c).isNotNull();
	}

	// @Test
	public void selectTotalAmountTest() {
		// TODO Auto-generated method stub
		 String t=this.aml002AlarmData.selectTotalAmount(1884);
		 System.out.println(t);
		assertThat(t).isNotNull();

	}

	// @Test
	public void selectInstNumTest() {
		// TODO Auto-generated method stub
		 String t=this.aml002AlarmData.selectInstNum(1884);
		 System.out.println(t);
		assertThat(t).isNotNull();

	}

	 @Test
	public void selectRecordfromAML002ParmTest() {
		 List<AlarmDTO> alarmDTOs= this.aml002AlarmData.selectRecordfromAML002Parm();
	
		System.out.println(alarmDTOs.size());
		assertThat(alarmDTOs.size()).isGreaterThan(0);

	}
}