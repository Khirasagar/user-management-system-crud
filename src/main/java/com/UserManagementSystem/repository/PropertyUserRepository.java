package com.UserManagementSystem.repository;

import com.UserManagementSystem.entity.PropertyUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyUserRepository extends JpaRepository<PropertyUserEntity, Long> {

}