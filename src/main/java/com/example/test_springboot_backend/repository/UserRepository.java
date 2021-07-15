package com.example.test_springboot_backend.repository;
import com.example.test_springboot_backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
