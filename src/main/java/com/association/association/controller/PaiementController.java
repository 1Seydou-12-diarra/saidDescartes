package com.association.association.controller;

import com.association.association.dto.PaiementDto;
import com.association.association.service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
public class PaiementController {
    @Autowired
    private PaiementService paiementService;
    @GetMapping
    public List<PaiementDto> getAllPaiements() {
        return paiementService.getAllPaiements();
    }

    @PostMapping
    public PaiementDto createPaiement(@RequestBody PaiementDto paiementDto) {
        return paiementService.createPaiement(paiementDto);
    }




    @PutMapping("/{id}")
    public PaiementDto updatePaiement(@PathVariable Long id, @RequestBody PaiementDto paiementDto) {
        return paiementService.updatePaiement(id, paiementDto);
    }

    @DeleteMapping("/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}
