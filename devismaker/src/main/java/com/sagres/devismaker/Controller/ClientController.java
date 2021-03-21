package com.sagres.devismaker.Controller;

import com.sagres.devismaker.Model.Client;
import com.sagres.devismaker.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class ClientController {
    @Autowired
    private ClientRepository repository;

    @GetMapping("/clients/get")
    public Iterable<Client> getData() {
        return repository.findAll();
    }

    @PostMapping("/clients/add")
    public void addData(@RequestBody Client tableData){
        repository.save(tableData);
    }
}
