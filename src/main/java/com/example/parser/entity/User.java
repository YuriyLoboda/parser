package com.example.parser.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
    @JsonProperty("number")
    private String id;
    private String name;
    private int age;
    private String firm;
    public User(){};
}
