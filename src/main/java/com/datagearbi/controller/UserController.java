package com.datagearbi.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.datagearbi.model.AC_Risk_Assessment;
import com.datagearbi.model.security.User;
import com.datagearbi.security.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("aml/api/user")
public class UserController {

	private EntityManager em;
	
    @Autowired
    private UserRepository userRepository;

	@RequestMapping(value = "users", method = RequestMethod.GET)
    public  List<String> getUsers() {
    	return userRepository.getuserNames();
    }
	
	/*********/
    @RequestMapping(value = "addUser", method= RequestMethod.POST)
	public void addUser(@RequestBody User target_user) {	
    	
    	this.userRepository.save(target_user);
    	
//    	User user_ = new User();
//    	user_.setPassword(password);
//    	user_.setFirstname(firstname);
//    	user_.setLastname(lastname);
//    	user_.setEmail(email);
//    	user_.setEnabled(true);
//////    	user_.setLastPasswordResetDate(lastPasswordResetDate);
////    	
//    	this.userRepository.save(user_);
    	
//    	this.userRepository.addUser( password, firstname, lastname, email, true);
    	
//    	EntityManager entityManager;
//    	EntityManagerFactory factory = Persistence
//                .createEntityManagerFactory("persistenceUnitName");
//        entityManager = factory.createEntityManager();
//        
//        entityManager.getTransaction().begin();
//        
//        Query query = entityManager.createNativeQuery("INSERT INTO User (password,firstname,lastname,email,enabled) " +
//                " VALUES(?,?,?,?,?)");
//            query.setParameter(1, password);
//            query.setParameter(2, firstname);
//            query.setParameter(3, lastname);
//            query.setParameter(4, email);
//            query.setParameter(5, true);
//            query.executeUpdate();
//        
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        factory.close();
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
    @RequestMapping(value = "getAllUsers", method= RequestMethod.GET)
   	public List<User> getAllUsers() {	
    	List <User> allUsers =  this.userRepository.findAll();
        return allUsers;
//    	return this.userRepository.getAll_users();
   	}
    /*********/
}
