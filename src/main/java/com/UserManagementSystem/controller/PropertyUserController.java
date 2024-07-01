package com.UserManagementSystem.controller;

import com.UserManagementSystem.dto.PropertyUserDto;
import com.UserManagementSystem.service.PropertyUser;
import com.UserManagementSystem.service.PropertyUserImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RESTful APIs class - it will make the class as rest api controller
@RestController
@RequestMapping("/api/v1/propertyuser")
public class PropertyUserController {

    private PropertyUserImpl pu;

    public PropertyUserController(PropertyUserImpl pu) {
        this.pu = pu;
    }

    //CREATE
    @PostMapping("/addPropertyUser")
    public String addPropertyUser(@RequestBody PropertyUserDto dto){
        pu.addPropertyUser(dto);
        return "Done";

    }
}
