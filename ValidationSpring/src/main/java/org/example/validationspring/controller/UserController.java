package org.example.validationspring.controller;

import jakarta.validation.Valid;
import org.example.validationspring.dto.request.ApiResponse;
import org.example.validationspring.dto.request.UserCreationRequest;
import org.example.validationspring.dto.request.UserUpdateRequest;
import org.example.validationspring.dto.response.UserResponse;
import org.example.validationspring.entity.User;
import org.example.validationspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setCode(1000);
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    UserResponse getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    UserResponse updateUser(@PathVariable String userId , @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
        
    }

    @DeleteMapping("/{userID}")
    String deleteUser(@PathVariable String userID){
        userService.deleteUser(userID);
        return "Deleted User" + userID;
    }
}
