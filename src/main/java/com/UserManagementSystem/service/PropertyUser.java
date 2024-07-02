package com.UserManagementSystem.service;

import com.UserManagementSystem.dto.PropertyUserDto;
import com.UserManagementSystem.entity.PropertyUserEntity;

import java.util.List;

public interface PropertyUser {

    public PropertyUserDto addPropertyUser(PropertyUserDto dto);

    void deletePropertyUser(long propertyUserId);

    PropertyUserEntity updatePropertyUser(long propertyUserId,PropertyUserDto dto);

    List<PropertyUserEntity> getPropertyUsers();
}
