package com.example.parser.service;

import com.example.parser.entity.User;
import com.example.parser.repository.UserRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by yulo0717 on 8/7/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void saveUserFromFile(MultipartFile file) {

        try {

            CSVParser parser = CSVFormat.EXCEL.withHeader().parse(new InputStreamReader(file.getInputStream()));
            for(CSVRecord rec : parser){
               User user = new User();
               user.setName(rec.get("name"));
               user.setAge(Integer.parseInt(rec.get("age")));
               user.setFirm(rec.get("firm"));
               userRepository.save(user);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
