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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Dgaml001TransLoanXToRepositoryIntegrationTest {
	@Autowired
	private Dgaml001TransLoanXToRepository dgaml001TransLoanXToRepository;
	
	@Test
	public void testFindAll() {
		System.out.println("testFindAll");
		List<Dgaml001TransLoanXToT> list = dgaml001TransLoanXToRepository.findAll();
		System.out.println("list.size:" + list.size());
		assertThat(list.size()).isGreaterThanOrEqualTo(0);
	}

}
