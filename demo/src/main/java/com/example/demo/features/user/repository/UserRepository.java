package com.example.demo.features.user.repository;

import com.example.demo.features.user.dto.UserDTOResponce;
import com.example.demo.features.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserDTOResponce findByEmail(String email);

}
