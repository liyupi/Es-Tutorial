package com.yupi.estutorial.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "my_index", type = "user")
public class User {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Double money;
}
