package io.javabrains.springsecurityjpa.service;

import io.javabrains.springsecurityjpa.entity.MyUserDetails;
import io.javabrains.springsecurityjpa.entity.User;
import io.javabrains.springsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found: "+username));
//        return new MyUserDetails(user.get());
        return user.map(MyUserDetails::new).get();
    }
}
