package com.bbk.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

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

    //  @RequestMapping(value = "/user", method = RequestMethod.GET)
    // Stereo Type Methods
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Nishanth");
        user.setEmailId("pathinishanth@gmail.com");

        return user;
    }

    // Path Variable Method
    @GetMapping("/user/{id}")
    public String pathVariable1(@PathVariable("id") String id) {
        return "This is the Path Variable Response! " + id;
    }

    @GetMapping("/user/{id1}/{id2}")
    public String pathVariable2(@PathVariable("id1") String id1, @PathVariable("id2") String id2) {
        return "This is the Path Variable Response! " + id1 + " " + id2;
    }

//    @GetMapping("/user/{id1}/{id2}")
//    public String pathVariable3(@PathVariable String id1,
//                                @PathVariable("id2") String name) {
//        return "This is the Path Variable Response! " + id1 + ":" + name;
//    }
}

