package com.example.jpaandcrud.controller;

import com.example.jpaandcrud.dto.request.UserCreationRequest;
import com.example.jpaandcrud.dto.request.UserUpdateRequest;
import com.example.jpaandcrud.entity.User;
import com.example.jpaandcrud.service.UserService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request){
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId , @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userID}")
    String deleteUser(@PathVariable String userID){
        userService.deleteUser(userID);
        return "Deleted User" + userID;
    }
}
