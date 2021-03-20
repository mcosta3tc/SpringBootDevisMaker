package com.sagres.devismaker.Repository;

import com.sagres.devismaker.Model.Devis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisRepository extends CrudRepository<Devis, Integer> {

}