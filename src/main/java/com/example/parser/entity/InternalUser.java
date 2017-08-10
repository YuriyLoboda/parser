package com.example.parser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by yulo0717 on 8/10/2017.
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class InternalUser {
    private String first_name;
    private  String last_name;
    private int age;
    public InternalUser(){};
}
