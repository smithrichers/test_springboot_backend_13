package com.example.test_springboot_backend.repository;
import com.example.test_springboot_backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
    Users getByUsernameAndPassword(String username,String password);
}
