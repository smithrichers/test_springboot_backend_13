package com.example.test_springboot_backend.controller;

import com.example.test_springboot_backend.entity.Book;
import com.example.test_springboot_backend.entity.Pie;
import com.example.test_springboot_backend.repository.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pie")
public class PieController {
    @Autowired
    private PieRepository pieRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Pie> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return pieRepository.findAll(request);
    }

}
