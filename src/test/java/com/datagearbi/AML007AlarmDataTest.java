package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.agp.repository.AC_RoutineRepository;
import com.datagearbi.agp.repository.DGAML007_Early_Termin_LoanRepository;
import com.datagearbi.agp.repository.Routine_ParameterRepository;
import com.datagearbi.service.AML007AlarmData;
import com.datagearbi.service.AlarmDTO;
import com.datagearbi.service.AlarmsVM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AML007AlarmDataTest {
	@Autowired
	public AML007AlarmData alAml007AlarmData;
	@Autowired
	private DGAML007_Early_Termin_LoanRepository dgaml007_Early_Termin_LoanRepository;
	
	@Autowired
	private AC_RoutineRepository ac_RoutineRepository;
	
	@Autowired
	private Routine_ParameterRepository routine_ParameterRepository;

	//@Test
	public void getAML007AlarmDataTest() {
		AlarmsVM alarmsVM = this.alAml007AlarmData.getAML007AlarmData();
		assertThat(alarmsVM).isNotNull();

	}

//	@Test
	public void getAML007ParmDataTest() {
		// TODO Auto-generated method stub

		assertThat(this.alAml007AlarmData.getAML007ParmData().getAlrmsVMs().size()).isGreaterThan(0);
	}

	@Test
	public void selectRecordfromAML007ViewTest() {

		List<AlarmDTO> list = this.alAml007AlarmData.selectRecordfromAML007View();
		assertThat(list.size()).isGreaterThan(0);
	}

//	@Test
	public void selectTransactionsCountTest() {
		assertThat(this.alAml007AlarmData.selectTransactionsCount(2000)).isNotNull();
	}

//	@Test
	public void selectTotalAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml007AlarmData.selectTotalAmount(2000)).isNotNull();

	}
//	@Test
	
	public void dgaml007_Early_Termin_LoanRepositoryfindAll()
	{
		assertThat(this.dgaml007_Early_Termin_LoanRepository.findAll().size()).isGreaterThan(0);
	}

//	@Test
	public void selectInstNumTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml007AlarmData.selectInstNum(2000)).isNotNull();
	}

//	@Test
	public void selectRecordfromAML007ParmTest() {
		assertThat(this.alAml007AlarmData.selectRecordfromAML007Parm().size()).isGreaterThan(0);

	}

//	@Test
	public void selectTotalLoanAmountTest() {
		// TODO Auto-generated method stub
		assertThat(this.alAml007AlarmData.selectTotalLoanAmount(2000)).isNotNull();

	}
//	@Test
	public void ac_RoutineRepositoryAML007(){
	int size=	this.ac_RoutineRepository.getRoutineDetail("AML007").size();
	System.out.println(size+"9999999999999999999");
		assertThat(size).isGreaterThan(0);
		
	}
}
