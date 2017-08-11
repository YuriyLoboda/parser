package com.example.parser.entity.additions;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yulo0717 on 8/11/2017.
 */
@Data
@Getter
@Setter
public class Characteristic {
    List<String> list = new ArrayList<>();

    public Characteristic (){};
}
