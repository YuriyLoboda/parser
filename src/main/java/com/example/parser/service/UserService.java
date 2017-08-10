package com.example.parser.service;

import com.example.parser.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by yulo0717 on 8/7/2017.
 */
public interface UserService {
   void saveUserFromFile(MultipartFile file);
   User createUser(User user);
}
