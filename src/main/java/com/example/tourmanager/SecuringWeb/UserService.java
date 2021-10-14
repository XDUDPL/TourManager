package com.example.tourmanager.SecuringWeb;

import com.example.tourmanager.Entity.UserEntity;
import com.example.tourmanager.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
     @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserName(username);
        if(userEntity == null){
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(userEntity);
    }
}
