package com.example.demo.Controller;

import com.example.demo.Model.Client;
import com.example.demo.Model.Product;
import com.example.demo.Repository.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Client> getAllClient() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Client addClient(@RequestBody Client client) {
        Client clientSaved = repository.save(client);
        return clientSaved;
    }
}

//    @PostMapping(value = "/Produits")
//    public ResponseEntity<Void> ajouterProduit(@RequestBody Product product) {
//
//        Product productAdded = productDao.save(product);
//
//        if (productAdded == null) {
//            return ResponseEntity.noContent().build();
//        } else {
//            URI location = ServletUriComponentsBuilder
//                    .fromCurrentRequest()
//                    .path("/{id}")
//                    .buildAndExpand(productAdded.getId())
//                    .toUri();
//            return ResponseEntity.created(location).build();
//        }
//    }
