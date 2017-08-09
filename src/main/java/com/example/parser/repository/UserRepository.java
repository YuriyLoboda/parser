package com.example.parser.repository;

import com.example.parser.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yulo0717 on 8/7/2017.
 */
public interface UserRepository extends MongoRepository<User,String> {
}
