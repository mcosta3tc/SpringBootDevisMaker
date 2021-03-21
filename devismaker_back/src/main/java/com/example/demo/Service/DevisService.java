package com.example.demo.Service;

import com.example.demo.Model.Devis;
import com.example.demo.Repository.DevisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevisService {
    private final DevisRepository devisRepository;

    public DevisService(DevisRepository devisRepository) {
        this.devisRepository = devisRepository;
    }

    public void addDevis(Devis devis) {
        devisRepository.insert(devis);
    }

    public void updateDevis(Devis devis) {
        Devis savedDevis = devisRepository.findById(devis.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot find Expense by ID %s", devis.getId())));

        savedDevis.setClient(devis.getClient());

        devisRepository.save(devis);
    }


    public List<Devis> getAllDevis() {
        return devisRepository.findAll();
    }

    public Devis getDevisByClient(String client) {
        return devisRepository.findByClient(client).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Expense by Name %s", client)
        ));
    }

    public void deleteDevis(String id) {
        devisRepository.deleteById(id);
    }
}