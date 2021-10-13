package com.example.tourmanager.Service;

import com.example.tourmanager.Entity.UserEntity;
import com.example.tourmanager.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

}
