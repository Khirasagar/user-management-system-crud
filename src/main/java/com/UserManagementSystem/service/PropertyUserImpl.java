package com.UserManagementSystem.service;

import com.UserManagementSystem.dto.PropertyUserDto;
import com.UserManagementSystem.entity.PropertyUserEntity;
import com.UserManagementSystem.repository.PropertyUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyUserImpl implements PropertyUser{

    private PropertyUserRepository propertyUserRepository;

    public PropertyUserImpl(PropertyUserRepository propertyUserRepository) {
        this.propertyUserRepository = propertyUserRepository;
    }

    //Create implementations
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

    //Delete implementations
    @Override
    public void deletePropertyUser(long propertyUserId) {
        propertyUserRepository.deleteById(propertyUserId);
    }

    //Update implementations
    @Override
    public PropertyUserEntity updatePropertyUser(
            long propertyUserId,
            PropertyUserDto dto
    ) {
        Optional<PropertyUserEntity> byId = propertyUserRepository.findById(propertyUserId);
        PropertyUserEntity propertyUserEntity = byId.get();

        propertyUserEntity.setName(dto.getName());
        propertyUserEntity.setEmailId(dto.getEmailId());
        propertyUserEntity.setMobile(dto.getMobile());

        return propertyUserRepository.save(propertyUserEntity);

    }

    //Read or fetch implementations
    @Override
    public List<PropertyUserEntity> getPropertyUsers() {
        return propertyUserRepository.findAll();
    }

}
