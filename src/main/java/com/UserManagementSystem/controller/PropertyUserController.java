package com.UserManagementSystem.controller;

import com.UserManagementSystem.dto.PropertyUserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTful APIs class - it will make the class as rest api controller
@RestController
public class PropertyUserController {

    //CREATE
    @GetMapping("/createPropertyUser")
    public String createPropertyUser(PropertyUserDto propertyUserDto){
        return "Done";

    }
}
