package com.UserManagementSystem.controller;

import com.UserManagementSystem.dto.PropertyUserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//RESTful APIs class - it will make the class as rest api controller
@RestController
public class PropertyUserController {

    //CREATE
    @PostMapping("/createPropertyUser")
    public String createPropertyUser(@RequestBody PropertyUserDto dto){
        System.out.println(dto.getName());
        System.out.println(dto.getEmailId());
        System.out.println(dto.getMobile());

        return "Done";

    }
}
