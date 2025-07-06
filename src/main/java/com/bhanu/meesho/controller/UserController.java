package com.bhanu.meesho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "hello user";
    }
    
    @GetMapping("/hello_user/v1/{name}")
    public String sayHelloUserV1(@PathVariable String name){
        return "Hello "+name;
    }

    @GetMapping("/hello_user/v2")
    public String sayHelloUserV2(@RequestParam String name){
        return "Hello "+name;
    }

}
