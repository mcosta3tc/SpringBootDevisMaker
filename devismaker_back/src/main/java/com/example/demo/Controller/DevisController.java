package com.example.demo.Controller;

import com.example.demo.Model.Devis;
import com.example.demo.Service.DevisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devis")
public class DevisController {

    private final DevisService devisService;

    public DevisController(DevisService devisService) {
        this.devisService = devisService;
    }

    @PostMapping
    public ResponseEntity addExpense(@RequestBody Devis devis) {
        devisService.addDevis(devis);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity<Object> updateDevis(@RequestBody Devis devis) {
        devisService.updateDevis(devis);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Devis>> getAllExpense() {
        return ResponseEntity.ok(devisService.getAllDevis());
    }

    @GetMapping("/{client}")
    public ResponseEntity<Devis> getDevisByClient(@PathVariable String client) {
        return ResponseEntity.ok(devisService.getDevisByClient(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDevis(@PathVariable String id) {
        devisService.deleteDevis(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
