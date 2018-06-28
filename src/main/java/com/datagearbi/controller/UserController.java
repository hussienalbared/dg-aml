package com.datagearbi.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.datagearbi.model.security.User;
import com.datagearbi.security.repository.UserRepository;

@RestController
@RequestMapping("aml/api/user/")
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

	@RequestMapping(value = "users", method = RequestMethod.GET)
    public  List<String> getUsers() {
    	return userRepository.getUserNames();
    }
	
	/**
	 * @return *******/
    @RequestMapping(value = "addUser", method= RequestMethod.POST)
	public void addUser(@RequestBody User target_user) {	
    	System.out.println("----------------------------------***");
//    	System.out.println(target_user.getUsername() + ","+target_user.getDisplayName());
//    	return target_user;
    	
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    	System.out.println(date); //2016/11/16 12:08:43
    	target_user.setLastPasswordResetDate(date);
        target_user.setPassword(passwordEncoder.encode(target_user.getPassword()));
        
        List<User> users = this.userRepository.findAll();
        for (User user : users) {
        	if(target_user.getUsername().equals(user.getUsername())) {
            	System.out.println("same user name ...");
            	return; //TODO some action to the UI
            }
		}
        
        
    	this.userRepository.save(target_user);
    	//FIXME make Sure of Data
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
   	public void  editUser(@RequestBody User target_user) {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	if(target_user.getPassword()!= null && target_user.getPassword().length()>0)
    	{
    		target_user.setPassword(passwordEncoder.encode(target_user.getPassword()));
    	}
    	else {
    		try {    			
    			target_user.setPassword(userRepository.findById(target_user.getId()).get().getPassword());
    		}catch (NoSuchElementException ex) {
    			// TODO log
    		}
    	}
    	Date date = new Date();
    	target_user.setLastPasswordResetDate(date);
       	this.userRepository.save(target_user);
   	}
    
//    @RequestMapping(value = "getUser", method= RequestMethod.GET)
//   	public List<Date> getUser(@RequestParam("userId") String userId) {	
//       	return this.userRepository.getUser(Long.parseLong(userId));
//   	}
    @RequestMapping(value = "getUser/{userId}", method= RequestMethod.GET)
   	public Optional<User> getUser(@PathVariable("userId") String userId) {	
    	 Optional<User> u= this.userRepository.findById(Long.parseLong(userId));
    	
    	 return u;
//    	return this.userRepository.getOne(Long.parseLong(userId));
   	}
    
    @RequestMapping(value = "getAllUsers", method= RequestMethod.GET)
   	public List<User> getAllUsers() {	
    	List <User> allUsers =  this.userRepository.findAll();
        return allUsers;
//    	return this.userRepository.getAll_users();
   	}
    /*********/
}
