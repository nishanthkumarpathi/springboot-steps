package com.bbk.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbk.springbootdemo.model.User;

//@Controller
//@ResponseBody

// @RestController = @Controller + @ResponseBody

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "This is the Default Root Response!";
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Nishanth");
        user.setEmailId("pathinishanth@gmail.com");

        return user;
    }

}

