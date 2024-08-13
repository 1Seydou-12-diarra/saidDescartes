package com.association.association.controller;

import com.association.association.dto.MembreDto;
import com.association.association.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/membres")
public class MembreController {
    @Autowired
    private MembreService membreService;

    @PostMapping
    public MembreDto createMembre(@RequestBody MembreDto membreDto) {
        return membreService.createMembre(membreDto);
    }

    @GetMapping
    public List<MembreDto> getAllMembres() {
        return membreService.getAllMembres();
    }



    @PutMapping("/{id}")
    public MembreDto updateMembre(@PathVariable Long id, @RequestBody MembreDto membreDto) {
        return membreService.updateMembre(id, membreDto);
    }

    @DeleteMapping("/{id}")
    public void deleteMembre(@PathVariable Long id) {
        membreService.deleteMembre(id);
    }
}

