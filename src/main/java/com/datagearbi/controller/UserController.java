package com.datagearbi.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.security.User;
import com.datagearbi.security.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

	@RequestMapping(value = "users", method = RequestMethod.GET)
    public  List<String> getUsers() {
    	return userRepository.getuserNames();
    }
	
	/*********/
    @RequestMapping(value = "addUser", method= RequestMethod.PUT)
	public void addUser(/*@RequestParam("username") String username,*/
							@RequestParam("password") String password,
							@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
							@RequestParam("email") String email/*,@RequestParam("enabled") Boolean enabled,
							@RequestParam("lastPasswordResetDate") Date lastPasswordResetDate*/) {	
    	
//    	User user_ = new User();
//    	user_.setPassword(password);
//    	user_.setFirstname(firstname);
//    	user_.setLastname(lastname);
//    	user_.setEmail(email);
    	//user_.setEnabled(enabled);
    	//user_.setLastPasswordResetDate(lastPasswordResetDate);
    	
    	//this.userRepository.save(user_);
    	
    	this.userRepository.addUser( password, firstname, lastname, email, true/*, lastPasswordResetDate*/);
	}
    @RequestMapping(value = "deleteUser", method= RequestMethod.PUT)
   	public void  deleteUser(@RequestParam("userId") String userId) {	
    	this.userRepository.deleteById(Long.parseLong(userId));
   	}
    @RequestMapping(value = "disableUser", method= RequestMethod.PUT)
   	public void  disableUser(@RequestParam("userId") String userId) {	
       	this.userRepository.disableUser(false, Long.parseLong(userId));	
   	}
    @RequestMapping(value = "enableUser", method= RequestMethod.PUT)
   	public void  enableUser(@RequestParam("userId") String userId) {	
       	this.userRepository.enableUser(true, Long.parseLong(userId));
   	}
    @RequestMapping(value = "editUser", method= RequestMethod.PUT)
   	public void  editUser(@RequestParam("userId") String userId, 		@RequestParam("password") String password,
						  @RequestParam("firstname") String firstname,  @RequestParam("lastname") String lastname,
						  @RequestParam("email") String email,			@RequestParam("enabled") Boolean enabled
						  /*,@RequestParam("lastPasswordResetDate") String lastPasswordResetDate*/) {	
       	
//    	DateFormat format = new SimpleDateFormat("MMMM d, yyyy");
//    	Date date = format.parse(lastPasswordResetDate);
    	
    	this.userRepository.editUser(Long.parseLong(userId), password, firstname, lastname, email, enabled
    			/*, lastPasswordResetDate*/);
   	}
    @RequestMapping(value = "getUser", method= RequestMethod.GET)
   	public List<Date> getUser(@RequestParam("userId") String userId) {	
       	return this.userRepository.getUser(Long.parseLong(userId));
   	}
    /*********/
}
