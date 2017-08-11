package com.example.parser.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ExternalUser {
    @JsonProperty("name")
    private String first_name;
    @JsonProperty("surname")
    private  String last_name;
    private int age;
    public ExternalUser(){};
}
