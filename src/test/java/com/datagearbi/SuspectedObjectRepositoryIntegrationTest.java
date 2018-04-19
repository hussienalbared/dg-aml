package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.model.AcSuspectedObj;
import com.datagearbi.model.AcSuspectedObjPK;
import com.datagearbi.repository.SuspectedObjectRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SuspectedObjectRepositoryIntegrationTest {

	@Autowired
	private SuspectedObjectRepository suspectedObjectRepository;

	@Test
	public void testFindAll() {
		System.out.println("testFindAll");
		List<AcSuspectedObj> objs = suspectedObjectRepository.findAll();
		System.out.println("test:" + objs.size());
		assertThat(objs.size()).isGreaterThanOrEqualTo(0);
	}


//	@Test
	public void testSuspectedGet() {
		System.out.println("testSuspectedGet");
		AcSuspectedObjPK id = new AcSuspectedObjPK(1, "A");
		
		AcSuspectedObj obj = suspectedObjectRepository.getOne(id);
		System.out.println("test0:" + obj);

		if (obj!=null) {			
			System.out.println("test1:" + obj.getEmployeeInd());
			System.out.println("test2:" + obj.getAcAlarm().size());
			System.out.println("test2:" + obj.getAcAlarm().size());
		}
	}

}
