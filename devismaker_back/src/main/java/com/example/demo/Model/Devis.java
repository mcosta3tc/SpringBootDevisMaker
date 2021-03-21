package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@Document("devis")
public class Devis {
    @Id
    private String id;
    @Field(name = "name")
    @Indexed(unique = true)
    private String client;


    public Devis(String id, String client) {
        this.id = id;
        this.client = client;
    }
}
