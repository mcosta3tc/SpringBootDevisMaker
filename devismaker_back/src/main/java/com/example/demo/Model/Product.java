package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class Product {
    @Field("name")
    private String name;
    @Field("price")
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
