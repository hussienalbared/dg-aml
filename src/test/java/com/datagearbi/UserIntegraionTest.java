package com.datagearbi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.datagearbi.controller.UserController;
import com.datagearbi.model.security.User;
import com.datagearbi.security.repository.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class UserIntegraionTest {

	@Autowired
    private UserController userController;
	
	@Test
	public void testGetAllUser() {
		System.out.println("testGetAllUser");
		List<User> users_ = this.userController.getAllUsers();
		System.out.println("Size= " + users_.size());
		assertThat(users_.size()).isGreaterThan(0);
	}
	
//	@Test
	public void testAddUser() {
		System.out.println("testAddUser");
		User user = new User();
		user.setEmail("amabedu0@gmail.com");
		user.setEnabled(true);
		user.setFirstname("Amro");
		user.setLastname("Almajeedi");
		user.setUsername("ame_user_name");
		user.setPassword("1234");
		
		this.userController.addUser(user);
	}
	
//	@Test
	public void testGetUser() {
		System.out.println("testGetUser");
		User user = this.userController.getUser("1002");
		System.out.println("FirstName: "+ user.getFirstname());
	}
	
//	@Test
	public void testdisableUser() {
		System.out.println("testdisableUser");
		this.userController.disableUser("1002");
	}
	
//	@Test
	public void testUnableUser() {
		System.out.println("testUnableUser");
		this.userController.enableUser("1002");
	}
	
//	@Test
	public void testDeleteUser() {
		System.out.println("testDeleteUser");
		this.userController.deleteUser("1002");
	}
}
