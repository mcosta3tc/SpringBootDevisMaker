package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.context.annotation.Primary;


import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Integer price;

    @JsonBackReference
    @ManyToMany(mappedBy = "product")
    private List<Quotation> quotation;
}
