package com.example.demo.Repository;

import com.example.demo.Model.Client;
import com.example.demo.Model.Devis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;


public interface ClientRepository extends MongoRepository<Client, String> {
    @Query("{'name': ?0}")
    Optional<Client> findByName(String name);
}
