package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
public class Devis {

    @Field("product")
    private Product product;
    public Devis() {
        super();
    }

    public Devis(Product product) {
        this.product = product;
    }
}
