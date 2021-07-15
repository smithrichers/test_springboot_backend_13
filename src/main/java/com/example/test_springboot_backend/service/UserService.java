package com.example.test_springboot_backend.service;

import com.example.test_springboot_backend.entity.Users;
import com.example.test_springboot_backend.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserLoginRepository userLoginRepository;

    public boolean isExist(String username) {
        Users users = getByName(username);
        return null!=users;
    }

    public Users getByName(String username) {
        return userLoginRepository.findByUsername(username);
    }

    public Users get(String username, String password){
        return userLoginRepository.getByUsernameAndPassword(username, password);
    }

    public void add(Users user) {
        userLoginRepository.save(user);
    }
}
