package com.sagres.devismaker.Controller;

import com.sagres.devismaker.Model.Devis;
import com.sagres.devismaker.Repository.DevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class DevisController {

    @Autowired
    private DevisRepository repository;

    @GetMapping("/devis/get")
    public Iterable<Devis> getData() {

        return repository.findAll();
    }

    @PostMapping("/devis/add")
    public void addData(@RequestBody Devis tableData) {

        repository.save(tableData);
    }

}