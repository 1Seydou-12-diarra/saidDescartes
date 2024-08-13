package com.association.association.controller;

import com.association.association.dto.AdhesionDto;
import com.association.association.service.AdhesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/adhesions")
public class AdhesionController {
    @Autowired
    private AdhesionService adhesionService;

    @PostMapping
    public AdhesionDto createAdhesion(@RequestBody AdhesionDto adhesionDto) {
        return adhesionService.createAdhesion(adhesionDto);

    }

    @GetMapping
    public List<AdhesionDto> getAllAdhesions() {
        return adhesionService.getAllAdhesions();
    }


    @PutMapping("/{id}")
    public AdhesionDto updateAdhesion(@PathVariable Long id, @RequestBody AdhesionDto adhesionDto) {
        return adhesionService.updateAdhesion(id, adhesionDto);
    }

    @DeleteMapping("/{id}")
    public void deleteAdhesion(@PathVariable Long id) {
        adhesionService.deleteAdhesion(id);
    }
}
