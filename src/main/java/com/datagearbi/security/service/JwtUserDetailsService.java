package com.datagearbi.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.datagearbi.model.security.Capability;
import com.datagearbi.model.security.Group;
import com.datagearbi.model.security.User;
import com.datagearbi.security.JwtUser;
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
            return create(user);
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
   	private static  List<String> getPrivileges(Collection<Group> roles) {
   	  
        List<String> privileges = new ArrayList<>();
        List<Capability> collection = new ArrayList<>();
        for (Group role : roles) {
            collection.addAll(role.getCapabilities());
        }
        for (Capability item : collection) {
            privileges.add(item.getName());
        }
        return privileges;
    }
    private static Collection<? extends GrantedAuthority> getAuthorities(
    	      Collection<Group> roles) {
    	  
    	        return getGrantedAuthorities(getPrivileges(roles));
    	    }
    private static List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getFirstname(),
                user.getLastname(),
                user.getEmail(),
                user.getPassword(),
                getAuthorities(user.getGroups()),
                user.getEnabled(),
                user.getLastPasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Group> groups) {
        return groups.stream()
                .map(group -> new SimpleGrantedAuthority(group.getName()))
                .collect(Collectors.toList());
    }
}
