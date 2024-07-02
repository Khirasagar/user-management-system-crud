package com.UserManagementSystem.service;

import com.UserManagementSystem.dto.PropertyUserDto;
import com.UserManagementSystem.entity.PropertyUserEntity;
import com.UserManagementSystem.repository.PropertyUserRepository;
import org.springframework.stereotype.Service;

@Service
public class PropertyUserImpl implements PropertyUser{

    private PropertyUserRepository propertyUserRepository;

    public PropertyUserImpl(PropertyUserRepository propertyUserRepository) {
        this.propertyUserRepository = propertyUserRepository;
    }

    @Override
    public PropertyUserDto addPropertyUser(PropertyUserDto dto) {
        PropertyUserEntity entity = new PropertyUserEntity();
        entity.setName(dto.getName());
        entity.setEmailId(dto.getEmailId());
        entity.setMobile(dto.getMobile());
        PropertyUserEntity savedPropertyUser = propertyUserRepository.save(entity);

        PropertyUserDto pud = new PropertyUserDto();
        pud.setId(savedPropertyUser.getId());
        pud.setName(savedPropertyUser.getName());
        pud.setEmailId(savedPropertyUser.getEmailId());
        pud.setMobile(savedPropertyUser.getMobile());

        return pud;
    }

    @Override
    public void deletePropertyUser(long propertyUserId) {
        propertyUserRepository.deleteById(propertyUserId);
    }
}
