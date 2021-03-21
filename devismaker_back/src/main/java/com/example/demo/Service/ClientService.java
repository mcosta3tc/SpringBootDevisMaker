package com.example.demo.Service;

import com.example.demo.Model.Client;
import com.example.demo.Repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    private final ClientRepository clientRepository;

    public void addClient(Client client) {
        clientRepository.insert(client);
    }

    public void updateClient(Client client) {
        Client savedClient = clientRepository.findById(client.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot find Expense by ID %s", client.getId())));

        savedClient.setName(client.getName());

        clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClientByName(String name) {
        return clientRepository.findByName(name).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Expense by Name %s", name)
        ));
    }

    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }
}
