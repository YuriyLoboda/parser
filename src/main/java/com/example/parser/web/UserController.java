package com.example.parser.web;

import com.example.parser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yulo0717 on 8/7/2017.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void setUser(){
        userService.saveUserFromFile();
    }
}
