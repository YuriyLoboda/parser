package com.example.parser.web;

import com.example.parser.entity.ExternalUser;
import com.example.parser.entity.User;
import com.example.parser.entity.additions.Characteristic;
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
    private User user;

    @PostMapping("/add-from-file")
    public void createUserFromFile(@RequestParam MultipartFile file) {
        userService.saveUserFromFile(file);
    }

    @PostMapping("/registration")
    public User registrationNewUser(@RequestBody ExternalUser externalUser) {
        user = new User();
        user.setName(externalUser.getName());
        user.setCharacteristic(externalUser.getCharacteristics());
        return userService.createUser(user);
    }
}
