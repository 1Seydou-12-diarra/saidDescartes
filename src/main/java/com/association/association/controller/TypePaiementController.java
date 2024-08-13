package com.association.association.controller;

import com.association.association.dto.TypePaiementDto;
import com.association.association.service.TypePaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typepaiements")
public class TypePaiementController {
    @Autowired
    private TypePaiementService typePaiementService;

    @PostMapping
    public TypePaiementDto createTypePaiement(@RequestBody TypePaiementDto typePaiementDto) {
        return typePaiementService.createTypePaiement(typePaiementDto);
    }

    @GetMapping
    public List<TypePaiementDto> getAllTypePaiements() {
        return typePaiementService.getAllTypePaiements();
    }



    @PutMapping("/{id}")
    public TypePaiementDto updateTypePaiement(@PathVariable Long id, @RequestBody TypePaiementDto typePaiementDto) {
        return typePaiementService.updateTypePaiement(id, typePaiementDto);
    }

    @DeleteMapping("/{id}")
    public void deleteTypePaiement(@PathVariable Long id) {
        typePaiementService.deleteTypePaiement(id);
    }
}
