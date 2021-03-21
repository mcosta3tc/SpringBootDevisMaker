package com.example.demo.Controller;

import com.example.demo.Model.Client;
import com.example.demo.Model.Devis;
import com.example.demo.Service.ClientService;
import com.example.demo.Service.DevisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity addClient(@RequestBody Client client) {
        clientService.addClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<Object> updateClient(@RequestBody Client client) {
        clientService.updateClient(client);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Client>> getAllClient() {
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Client> getClientByName(@PathVariable String name) {
        return ResponseEntity.ok(clientService.getClientByName(name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteClient(@PathVariable String id) {
        clientService.deleteClient(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
