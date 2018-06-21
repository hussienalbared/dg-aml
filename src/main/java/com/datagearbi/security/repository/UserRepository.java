package com.datagearbi.security.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.datagearbi.model.security.User;

/**
 * Created by stephan on 20.03.16.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
   
    
    @Query("Select U.username from User U")
    List getuserNames();
    
//    @Modifying
//	@Transactional
//	@Query("insert into User (password,firstname,lastname,email,enabled) "
//			+ "values(password=?1, firstname=?2 ,lastname=?3 , email=?4 , enabled=?5 ) ")
//	void addUser(String password, String firstname, String lastname,String email,Boolean enabled);
    
//    @Modifying
//    @Query(value = "insert into User (password,firstname,lastname,email,enabled) VALUES (:password,:firstname,"
//    		+ ":lastname,:email,:enabled)", nativeQuery = true)
//    @Transactional
//    void addUser(@Param("password") String password, @Param("firstname") String firstname,@Param("lastname") String lastname,
//    		@Param("email") String email,@Param("enabled") Boolean enabled);
    
    
   	@Query("Select U.lastPasswordResetDate from User U where U.id=?1")
   	List getUser(Long userId);
    
    @Modifying
	@Transactional
	@Query("update User U set U.enabled=?1 where U.id=?2")
	void enableUser(Boolean enabled,Long userId);
    
    @Modifying
	@Transactional
	@Query("update User U set U.enabled=?1 where U.id=?2")
	void disableUser(Boolean enabled,Long userId);
    
    @Modifying
	@Transactional
//	@Query("update User U set U.password=?2, U.firstname=?3 , U.lastname=?4 , "
//			+ "U.email=?5 , U.enabled=?6 , U.lastPasswordResetDate=?7 where U.id=?1")
	@Query("update User U set U.password=?2, U.firstname=?3 , U.lastname=?4 , "
			+ "U.email=?5 , U.enabled=?6 where U.id=?1")
	void editUser(Long userId,String password, String firstname, String lastname,String email,Boolean enabled
			/*,Date lastPasswordResetDate*/);
    
//	@Query("select u from User u")
    @Query("select new map( u.id as id,u.firstname as firstname,u.lastname as lastname,u.email as email,u.enabled as enabled,"
    		+ "u.username as username,u.password as password,u.lastPasswordResetDate as lastPasswordResetDate )from User u")
	List<User> getAll_users();
}
