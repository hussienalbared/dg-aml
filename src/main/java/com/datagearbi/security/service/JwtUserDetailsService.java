package com.datagearbi.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.datagearbi.model.security.Capability;
import com.datagearbi.model.security.User;
import com.datagearbi.security.JwtUserFactory;
import com.datagearbi.security.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	System.out.println("loadUserByUsername");
    	User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }
   
   	public List<String> getUserCapabilities( long id) {	
    	 Optional<User> user=	this.userRepository.findById(id);
    	 if(!user.isPresent())
    		 return null;
    	 User userObject=user.get();
    	 List<String>capabilities=new ArrayList<>();
    	 userObject.getGroups().forEach(a ->{
    		a.getCapabilities().forEach(b->{
    			capabilities.add(b.getName());
    		});
    	 });
    	 return capabilities;
    	
//    	return this.userRepository.getAll_users();
   	}
}
