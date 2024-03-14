package com.example.demo.features.user.controller;

import com.example.demo.features.user.service.UserSevice;
import com.example.demo.features.user.dto.UserDTOResponce;
import com.example.demo.features.user.dto.UserDTOReceive;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api/server")
public class UserController {
    private final UserSevice userSevice;

    public UserController(UserSevice userSevice) {
        this.userSevice = userSevice;
    }
    @GetMapping
    UserDTOResponce authUser(@RequestBody UserDTOReceive userDTOReceive) {
        return userSevice.authUser(userDTOReceive);
    }

    @PostMapping
    UserDTOResponce registerUser(@RequestBody UserDTOResponce userDTOResponce) {
        return userSevice.registerUser(userDTOResponce);
    }

    @DeleteMapping("/{id}")
    String deleteUser(@PathVariable("id") Long id) {
        return userSevice.deleteUser(id);
    }
}

