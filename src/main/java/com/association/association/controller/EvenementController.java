package com.association.association.controller;

import com.association.association.dto.EvenementDto;
import com.association.association.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evenements")
public class EvenementController {
    @Autowired
    private EvenementService evenementService;

    @PostMapping
    public EvenementDto createEvenement(@RequestBody EvenementDto evenementDto) {
        return evenementService.createEvenement(evenementDto);
    }

    @GetMapping
    public List<EvenementDto> getAllEvenements() {
        return evenementService.getAllEvenements();
    }


    @PutMapping("/{id}")
    public EvenementDto updateEvenement(@PathVariable Long id, @RequestBody EvenementDto evenementDto) {
        return evenementService.updateEvenement(id, evenementDto);
    }

    @DeleteMapping("/{id}")
    public void deleteEvenement(@PathVariable Long id) {
        evenementService.deleteEvenement(id);
    }
}
