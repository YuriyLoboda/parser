package com.example.parser.entity;

import com.example.parser.entity.additions.Characteristic;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by yulo0717 on 8/7/2017.
 */
@Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Document(collection="users")
public class User {

    @Id
    @NonNull
    private String id;
    private String name;
    private String surname;
    private int age;
    private String firm = "Netcracker";
    private List<Characteristic> characteristic;
    public User(){};
}
