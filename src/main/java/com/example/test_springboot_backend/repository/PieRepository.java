package com.example.test_springboot_backend.repository;

import com.example.test_springboot_backend.entity.Pie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PieRepository extends JpaRepository<Pie,Integer> {
}
