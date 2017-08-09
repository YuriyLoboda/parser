package com.example.parser.web;

import com.example.parser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yulo0717 on 8/7/2017.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void setUser(@RequestParam MultipartFile file){
        userService.saveUserFromFile(file);
    }
}
