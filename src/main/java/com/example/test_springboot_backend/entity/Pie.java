package com.example.test_springboot_backend.entity;

import lombok.Data;

import javax.persistence.*;
@Table(name = "pie")
@Entity
@Data
public class Pie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer value;
    private String name;
}
