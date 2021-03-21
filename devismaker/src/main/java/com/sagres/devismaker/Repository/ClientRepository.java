package com.sagres.devismaker.Repository;

import com.sagres.devismaker.Model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
    Client findByName(String name);
}
