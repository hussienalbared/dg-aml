package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.service.AML001AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML001AlarmDataServiceIntegrationTest {
	@Autowired
	AML001AlarmData aml001AlarmData;



	@Test
	public void getAML002AlarmDataTest() {
		AlarmsVM alarmsVM = this.aml001AlarmData.getAML001AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

	 @Test
	public void getAML002ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.aml001AlarmData.getAML001ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	 @Test
	public void selectRecordfromAML002ViewTest() {

		List<AlarmDTO> list = this.aml001AlarmData.selectRecordfromAML001View();
		assertThat(list.size()).isGreaterThan(0);
	}

	 @Test
	public void selectTransactionsCountTest() {
		String c= this.aml001AlarmData.selectTransactionsCount(1884);
		System.out.println(c);
		assertThat(c).isNotNull();
	}





	// @Test
	public void selectRecordfromAML002ParmTest() {
		 List<AlarmDTO> alarmDTOs= this.aml001AlarmData.selectRecordfromAML001Parm();
	
		System.out.println(alarmDTOs.size());
		assertThat(alarmDTOs.size()).isGreaterThan(0);

	}
}
