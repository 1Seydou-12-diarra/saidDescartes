package com.association.association.controller;

import com.association.association.dto.MontantDto;
import com.association.association.service.MontantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/montants")
public class MontantController {
    @Autowired
    private MontantService montantService;

    @PostMapping
    public MontantDto createMontant(@RequestBody MontantDto montantDto) {
        return montantService.createMontant(montantDto);
    }

    @GetMapping
    public List<MontantDto> getAllMontants() {
        return montantService.getAllMontants();
    }



    @PutMapping("/{id}")
    public MontantDto updateMontant(@PathVariable Long id, @RequestBody MontantDto montantDto) {
        return montantService.updateMontant(id, montantDto);
    }

    @DeleteMapping("/{id}")
    public void deleteMontant(@PathVariable Long id) {
        montantService.deleteMontant(id);
    }
}
