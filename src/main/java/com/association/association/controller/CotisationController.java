package com.association.association.controller;

import com.association.association.dto.CotisationDto;
import com.association.association.service.CotisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cotisations")
public class CotisationController {
    @Autowired
    private CotisationService cotisationService;

    @PostMapping
    public CotisationDto createCotisation(@RequestBody CotisationDto cotisationDto) {
        return cotisationService.createCotisation(cotisationDto);
    }

    @GetMapping
    public List<CotisationDto> getAllCotisations() {
        return cotisationService.getAllCotisations();
    }



    @PutMapping("/{id}")
    public CotisationDto updateCotisation(@PathVariable Long id, @RequestBody CotisationDto cotisationDto) {
        return cotisationService.updateCotisation(id, cotisationDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCotisation(@PathVariable Long id) {
        cotisationService.deleteCotisation(id);
    }
}
