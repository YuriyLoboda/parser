package com.example.parser.entity;

import com.example.parser.entity.additions.Characteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by yulo0717 on 8/10/2017.
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class ExternalUser {
    private String name;
    private List<Characteristic> characteristics;
    public ExternalUser(){};
}
