package com.example.demo.features.user.service;

import com.example.demo.features.user.dto.UserDTOResponce;
import com.example.demo.features.user.dto.UserDTOReceive;

import org.springframework.stereotype.Service;

@Service
public interface UserSevice {

    UserDTOResponce registerUser(UserDTOResponce userDTOResponce);

    UserDTOResponce authUser(UserDTOReceive userDTOReceive);

    String deleteUser(Long id_user);

}
