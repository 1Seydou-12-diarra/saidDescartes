package com.association.association.controller;

import com.association.association.dto.CategorieDto;
import com.association.association.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping
    public CategorieDto createCategorie(@RequestBody CategorieDto categorieDto) {
        return categorieService.createCategorie(categorieDto);
    }

    @GetMapping
    public List<CategorieDto> getAllCategories() {
        return categorieService.getAllCategories();
    }



    @PutMapping("/{id}")
    public CategorieDto updateCategorie(@PathVariable Long id, @RequestBody CategorieDto categorieDto) {
        return categorieService.updateCategorie(id, categorieDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCategorie(@PathVariable Long id) {
        categorieService.deleteCategorie(id);
    }
}

