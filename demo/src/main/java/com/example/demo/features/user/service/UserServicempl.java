package com.example.demo.features.user.service;

import com.example.demo.features.user.dto.UserDTOReceive;
import com.example.demo.features.user.dto.UserDTOResponce;
import com.example.demo.features.user.entity.UserEntity;
import com.example.demo.features.user.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServicempl implements UserSevice {
    private final UserRepository repository;

    public UserServicempl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDTOResponce registerUser(UserDTOResponce userDTOResponce) {
        if (repository.findByEmail(userDTOResponce.getEmail()) == null) {
            repository.save(new UserEntity(
                    userDTOResponce.getId_user(),
                    userDTOResponce.getLogin(),
                    userDTOResponce.getEmail(),
                    userDTOResponce.getPassword(),
                    userDTOResponce.getCreate_data(),
                    userDTOResponce.getBalance()
            ));
            return repository.findByEmail(userDTOResponce.getEmail());
        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User is already exist!");
        }

    }

    @Override
    public UserDTOResponce authUser(UserDTOReceive userDTOReceive) {
        UserDTOResponce user = repository.findByEmail(userDTOReceive.getEmail());
        if (user != null && user.getPassword().equals(userDTOReceive.getPassword())) {
            return user;
        } else {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Invalid email or password");
        }
    }

    @Override
    public String deleteUser(Long id) {
        repository.deleteById(id);
        return "User" + id + " deleted";
    }
}
