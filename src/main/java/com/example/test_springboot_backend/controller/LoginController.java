package com.example.test_springboot_backend.controller;
import com.example.test_springboot_backend.response.Result;
import com.example.test_springboot_backend.entity.Users;
import com.example.test_springboot_backend.service.UserService;
import com.example.test_springboot_backend.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;
import sun.security.util.Password;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    private JwtUtil jwtUtil;

    @CrossOrigin
    @PostMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody Users requestUser) {
        String username = requestUser.getUsername();
        String password=requestUser.getPassword();
        username = HtmlUtils.htmlEscape(username);
        Users users = userService.get(username, requestUser.getPassword());
        return username;
    }
    @PostMapping(value = "/token")
    @ResponseBody
    public String token(@RequestBody Users requestUser) {
        String username = requestUser.getUsername();
        String password=requestUser.getPassword();
        username = HtmlUtils.htmlEscape(username);
        Users users = userService.get(username, requestUser.getPassword());
        String token = JwtUtil.sign(username, password);
        return token;
    }
}
