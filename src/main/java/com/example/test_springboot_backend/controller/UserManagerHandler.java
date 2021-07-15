package com.example.test_springboot_backend.controller;
import com.example.test_springboot_backend.entity.Book;
import com.example.test_springboot_backend.entity.Users;
import com.example.test_springboot_backend.repository.BookRepository;
import com.example.test_springboot_backend.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserManager")
public class UserManagerHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Users> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        PageRequest request = PageRequest.of(page,size);
        return userRepository.findAll(request);
    }

    @PostMapping("/save")
    public String save(@RequestBody Users users){
        Users result = userRepository.save(users);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }
    @GetMapping("/findById/{id}")
    public Users findById(@PathVariable("id") Integer id){
        return userRepository.findById(id).get();
    }
    @PutMapping("/update")
    public String update(@RequestBody Users users){
        Users result = userRepository.save(users);
        if(result != null){
            return "success";
        }else{
            return "error";
        }
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
    }
}
