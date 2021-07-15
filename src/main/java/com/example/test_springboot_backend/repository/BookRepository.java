package com.example.test_springboot_backend.repository;
import com.example.test_springboot_backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
