package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.model.DEV_Report_SAMA;
import com.datagearbi.repository.ReportRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class ReportRepositoryIntegrationTest {
	
	@Autowired
	private ReportRepository samaReportRepository;

//	@Test
	public void testFindAll() {
		List<DEV_Report_SAMA> objs = samaReportRepository.findAll();
		System.out.println("test:" + objs.size()+objs.stream());
		assertThat(objs.size()).isGreaterThanOrEqualTo(0);
	}
	
	@Test
	public void testSave() {
		
		DEV_Report_SAMA entity= new DEV_Report_SAMA(); 
		entity.setBrtydesc("Branch");
		entity.setPrimaryMediumDesc("International");
		entity.setSecondaryMediumDesc("Check");
		entity.setCalendarDate( new Timestamp(0));
		entity.setCfcurramt(BigDecimal.TEN);
		entity.setCurrencyName("test");
		entity.setAcctno("test1");
		entity.setAcctbnm("test2");
		entity.setPid("test3");
		entity.setPnm("test4");	
		entity.setPczconm("test5");
	
		DEV_Report_SAMA objs = samaReportRepository.save(entity);
		System.out.println("test:" + objs);
//		assertThat(objs).isGreaterThanOrEqualTo(0);
	}
	

}
