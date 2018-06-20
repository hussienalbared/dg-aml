package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.agp.repository.Dgaml001TransLoanXToRepository;
import com.datagearbi.model.Dgaml001TransLoanXToT;
import com.datagearbi.repository.AlaramObjectRepository;
import com.datagearbi.service.AlarmsProcess;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AlarmsProcessTest {
	@Autowired
	AlarmsProcess alarmsProcess;
	@Autowired
	AlaramObjectRepository alaramObjectRepository;
	
	@Autowired
	Dgaml001TransLoanXToRepository dgaml001TransLoanXToRepository; 
	
//	@Test
	public void insertAML001AlarmDataTest(){
//		int sizebefore=this.alaramObjectRepository.findAll().size();
//		System.out.println(sizebefore+"akajkajkjk");
		
		this.alarmsProcess.insertAML001AlarmData();
		
//		int sizeafter=this.alaramObjectRepository.findAll().size();
		
//		System.out.println(sizeafter+"akajkajkjk");
//		assertThat(sizeafter).isGreaterThan(sizebefore);
		
	}
//	@Test
	public void insertAML003AlarmDataTest(){
		this.alarmsProcess.insertAML003AlarmData();
	}
	//@Test
	public void insertAML005AlarmDataTest(){
		this.alarmsProcess.insertAML005AlarmData();
	}
//	@Test
	public void insertAML007AlarmDataTest(){
		this.alarmsProcess.insertAML007AlarmData();
	}
//	@Test
	public void insertAML010AlarmDataTest(){
		this.alarmsProcess.insertAML010AlarmData();
	}
//	@Test
	public void insertAML016AlarmDataTest(){
		this.alarmsProcess.insertAML016AlarmData();
	}
//	@Test
	public void insertAML022AlarmDataTest(){
		this.alarmsProcess.insertAML022AlarmData();
	}
	@Test
	public void insertAML023AlarmDataTest(){
		this.alarmsProcess.insertAML023AlarmData();
	}
	
//	@Test
	public void dgaml001TransLoanXToRepositoryfindAllTest()
	{
		System.out.println("TESTETSTETS=" + this.dgaml001TransLoanXToRepository.findAll().size());
	}
}
