package com.datagearbi.security.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.model.security.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testFindAll() {
		System.out.println("testFindAll");
		List<User> objs = userRepository.findAll();
		System.out.println("test:" + objs.size());
		assertThat(objs.size()).isGreaterThanOrEqualTo(0);
	}
}
