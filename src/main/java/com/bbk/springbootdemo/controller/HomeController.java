package com.bbk.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;

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

    // Request Parameter Method
    @GetMapping("/requestParam1")
    public String requestParameter1(@RequestParam String name) {
        return "This is the Request Parameter Response! " + name;
    }


    @GetMapping("/requestParam2")
    public String requestParameter2(@RequestParam("name") String name,
                                    @RequestParam("emailId") String emailId) { // Parameter is Case Sensitive
        return "This is the Request Parameter Response! " + name + "and email id is : " + emailId;
    }

    @GetMapping("/requestParam3")
    public String requestParameter3(@RequestParam("name") String name,
                                    @RequestParam(name = "email") String emailId) { // Parameter is not Case Sensitive
        return "This is the Request Parameter Response! " + name + "and email id is : " + emailId;
    }


    @GetMapping("/requestParam4")
    public String requestParameter4(@RequestParam("name") String name,
                                    @RequestParam(name = "email", required = false) String emailId) { // Parameter is not Case Sensitive
        return "This is the Request Parameter Response! " + name + "and email id is : " + emailId;
    }

    @GetMapping("/requestParam5")
    public String requestParameter5(@RequestParam("name") String name,
                                    @RequestParam(name = "email", required = false, defaultValue = "") String emailId) { // Parameter is not Case Sensitive
        return "This is the Request Parameter Response! " + name + "and email id is : " + emailId;
    }
}

