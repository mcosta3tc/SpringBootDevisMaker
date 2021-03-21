package com.example.demo.Model;

import jdk.jfr.DataAmount;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@ToString
@Document("client")
public class Client {
    @Id
    private String id;

    @Field("name")
    @Indexed(unique = true)
    private String name;

    @Field("county")
    private Integer county;

    private List<Devis> devis;

    public Client(String id, String name, Integer county, List<Devis> devis) {
        this.id = id;
        this.name = name;
        this.county = county;
        this.devis = devis;
    }
}
