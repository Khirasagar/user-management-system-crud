package com.UserManagementSystem.service;

import com.UserManagementSystem.dto.PropertyUserDto;

public interface PropertyUser {

    public PropertyUserDto addPropertyUser(PropertyUserDto dto);

    void deletePropertyUser(long propertyUserId);
}
