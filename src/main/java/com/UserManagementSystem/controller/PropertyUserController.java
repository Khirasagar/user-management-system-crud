package com.UserManagementSystem.controller;

import com.UserManagementSystem.dto.PropertyUserDto;
import com.UserManagementSystem.service.PropertyUser;
import com.UserManagementSystem.service.PropertyUserImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//RESTful APIs class - it will make the class as rest api controller
@RestController
@RequestMapping("/api/v1/propertyUser")
public class PropertyUserController {

    private PropertyUserImpl pu;

    public PropertyUserController(PropertyUserImpl pu) {
        this.pu = pu;
    }

    //CREATE
    @PostMapping("/addPropertyUser")
    public ResponseEntity<PropertyUserDto> addPropertyUser(@RequestBody PropertyUserDto dto){
        PropertyUserDto propertyUserDto = pu.addPropertyUser(dto);
        return new  ResponseEntity<>(propertyUserDto, HttpStatus.CREATED);

    }
    //DELETE
    @DeleteMapping("/deletePropertyUser")
    public ResponseEntity<String> deletePropertyUser(@RequestParam long propertyUserId){

        pu.deletePropertyUser(propertyUserId);
        return new ResponseEntity<>("Record Deleted Successfully !", HttpStatus.OK);


    }

}
