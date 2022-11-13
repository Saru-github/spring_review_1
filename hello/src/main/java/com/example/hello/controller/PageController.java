package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    // ResponseEntity

    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("대영");
        user.setAddress("구로구");
        return user;
    }
}
