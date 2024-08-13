package com.association.association.service;

import com.association.association.dto.MembreDto;
import com.association.association.entity.Categorie;
import com.association.association.entity.Membre;
import com.association.association.repository.CategorieRepository;
import com.association.association.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MembreService {
    @Autowired
    private MembreRepository membreRepository;

    @Autowired
    private CategorieRepository categorieRepository;

    public MembreDto createMembre(MembreDto membreDto) {
        Membre membre = new Membre();
        membre.setNom(membreDto.getNom());
        membre.setPrenom(membreDto.getPrenom());
        membre.setDatenais(membreDto.getDatenais());
        membre.setLieuNais(membreDto.getLieuNais());
        membre.setNationalite(membreDto.getNationalite());
        membre.setNumCni(membreDto.getNumCni());
        membre.setFonction(membreDto.getFonction());
        membre.setSexe(membreDto.getSexe());
        membre.setTypeMembre(membreDto.getTypeMembre());

        Categorie categorie = categorieRepository.findById(membreDto.getCategorieId())
                .orElseThrow(() -> new RuntimeException("Categorie not found"));
        membre.setCategorie(categorie);

        membreRepository.save(membre);
        membreDto.setIdMembre(membre.getIdMembre());

        return membreDto;
    }

    public List<MembreDto> getAllMembres() {
        return membreRepository.findAll().stream().map(membre -> {
            MembreDto dto = new MembreDto();
            dto.setIdMembre(membre.getIdMembre());
            dto.setNom(membre.getNom());
            dto.setPrenom(membre.getPrenom());
            dto.setDatenais(membre.getDatenais());
            dto.setLieuNais(membre.getLieuNais());
            dto.setNationalite(membre.getNationalite());
            dto.setNumCni(membre.getNumCni());
            dto.setFonction(membre.getFonction());
            dto.setSexe(membre.getSexe());
            dto.setTypeMembre(membre.getTypeMembre());
            dto.setCategorieId(membre.getCategorie().getIdCategorie());
            return dto;
        }).collect(Collectors.toList());
    }

    public MembreDto updateMembre(Long id, MembreDto membreDto) {
        Membre membre = membreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membre not found"));

        membre.setNom(membreDto.getNom());
        membre.setPrenom(membreDto.getPrenom());
        membre.setDatenais(membreDto.getDatenais());
        membre.setLieuNais(membreDto.getLieuNais());
        membre.setNationalite(membreDto.getNationalite());
        membre.setNumCni(membreDto.getNumCni());
        membre.setFonction(membreDto.getFonction());
        membre.setSexe(membreDto.getSexe());
        membre.setTypeMembre(membreDto.getTypeMembre());

        Categorie categorie = categorieRepository.findById(membreDto.getCategorieId())
                .orElseThrow(() -> new RuntimeException("Categorie not found"));
        membre.setCategorie(categorie);

        membreRepository.save(membre);

        return membreDto;
    }

    public void deleteMembre(Long id) {
        Membre membre = membreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membre not found"));
        membreRepository.delete(membre);
    }
}
