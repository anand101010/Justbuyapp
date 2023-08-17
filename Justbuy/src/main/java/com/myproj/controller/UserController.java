package com.bezkoder.spring.datajpa.controller;

import com.bezkoder.spring.datajpa.Service.UserService;
import com.bezkoder.spring.datajpa.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user/api")
@RestController
public class UserController {
    public UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/postuser")
    public ResponseEntity<User> postUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.ACCEPTED);
    }
    @GetMapping("/getalluser")
    public List<User> getAllUser(){
        return userService.GetAllUser();
    }

    @GetMapping("/getuser/{id}")
        public User getUser(@PathVariable long id){
        return userService.getuserByID(id);

    }
}
