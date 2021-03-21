package com.example.demo.Repository;

import com.example.demo.Model.Devis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface DevisRepository extends MongoRepository<Devis, String> {
    @Query("{'client': ?0}")
    Optional<Devis> findByClient(String client);
}
