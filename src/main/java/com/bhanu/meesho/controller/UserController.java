package com.bhanu.meesho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhanu.meesho.entity.User;
import com.bhanu.meesho.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    

    @PostMapping("/create_user")
    public User createUser(@RequestBody User user)
    {
       return userService.createUser(user);
    }

    @GetMapping("/phone_number_by_id")
    public Long getPhoneNumberByUserId(@RequestParam Integer id)throws Exception{
        return userService.getPhoneNumberByUserId(id);
    }

    @GetMapping("/user_details_by_num")
    public User getUserInfoByNum(@RequestParam Long num)throws Exception{
        return userService.getUserInfoByNum(num);
    }
    public void test(){
        
    }

}
