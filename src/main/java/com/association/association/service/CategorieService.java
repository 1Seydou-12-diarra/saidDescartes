package com.association.association.service;

import com.association.association.dto.CategorieDto;
import com.association.association.entity.Categorie;
import com.association.association.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public CategorieDto createCategorie(CategorieDto categorieDto) {
        Categorie categorie = new Categorie();
        categorie.setNom(categorieDto.getNom());
        categorie.setPrivilege(categorieDto.getPrivilege());
        categorie.setMontant(categorieDto.getIdMontant());

        categorieRepository.save(categorie);
        categorieDto.setIdCategorie(categorie.getIdCategorie());
        return categorieDto;
    }

    public List<CategorieDto> getAllCategories() {
        return categorieRepository.findAll().stream().map(categorie -> {
            CategorieDto dto = new CategorieDto();
            dto.setIdCategorie(categorie.getIdCategorie());
            dto.setNom(categorie.getNom());
            dto.setPrivilege(categorie.getPrivilege());
            dto.setIdMontant(categorie.getMontant());
            return dto;
        }).collect(Collectors.toList());
    }

    public CategorieDto updateCategorie(Long id, CategorieDto categorieDto) {
        Categorie categorie = categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categorie not found"));

        categorie.setNom(categorieDto.getNom());
        categorie.setPrivilege(categorieDto.getPrivilege());
        categorie.setMontant(categorieDto.getIdMontant());

        categorieRepository.save(categorie);

        return categorieDto;
    }

    public void deleteCategorie(Long id) {
        Categorie categorie = categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categorie not found"));
        categorieRepository.delete(categorie);
    }
}
