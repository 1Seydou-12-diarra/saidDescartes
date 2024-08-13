package com.association.association.service;

import com.association.association.dto.AdhesionDto;
import com.association.association.entity.Adhesion;
import com.association.association.entity.Categorie;
import com.association.association.entity.Membre;
import com.association.association.repository.AdhesionRepository;
import com.association.association.repository.CategorieRepository;
import com.association.association.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdhesionService {
    @Autowired
    private AdhesionRepository adhesionRepository;

    @Autowired
    private CategorieRepository categorieRepository;

    @Autowired
    private MembreRepository membreRepository;

    public AdhesionDto createAdhesion(AdhesionDto adhesionDto) {
        Adhesion adhesion = new Adhesion();

        Categorie categorie = categorieRepository.findById(adhesionDto.getIdCategorie())
                .orElseThrow(() -> new RuntimeException("Categorie not found"));
        adhesion.setCategorie(categorie);

        Membre membre = membreRepository.findById(adhesionDto.getIdMembre())
                .orElseThrow(() -> new RuntimeException("Membre not found"));
        adhesion.setMembre(membre);

        adhesion.setDroit(adhesionDto.getDroit());
        adhesion.setDateAdhesion(adhesionDto.getDateAdhesion());

        adhesionRepository.save(adhesion);
        adhesionDto.setIdAdhesion(adhesion.getIdAdhesion());
        return adhesionDto;
    }

    public List<AdhesionDto> getAllAdhesions() {
        return adhesionRepository.findAll().stream().map(adhesion -> {
            AdhesionDto dto = new AdhesionDto();
            dto.setIdAdhesion(adhesion.getIdAdhesion());
            dto.setIdCategorie(adhesion.getCategorie().getIdCategorie());
            dto.setIdMembre(adhesion.getMembre().getIdMembre());
            dto.setDroit(adhesion.getDroit());
            dto.setDateAdhesion(adhesion.getDateAdhesion());
            return dto;
        }).collect(Collectors.toList());
    }

    public AdhesionDto updateAdhesion(Long id, AdhesionDto adhesionDto) {
        Adhesion adhesion = adhesionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adhesion not found"));

        Categorie categorie = categorieRepository.findById(adhesionDto.getIdCategorie())
                .orElseThrow(() -> new RuntimeException("Categorie not found"));
        adhesion.setCategorie(categorie);

        Membre membre = membreRepository.findById(adhesionDto.getIdMembre())
                .orElseThrow(() -> new RuntimeException("Membre not found"));
        adhesion.setMembre(membre);

        adhesion.setDroit(adhesionDto.getDroit());
        adhesion.setDateAdhesion(adhesionDto.getDateAdhesion());

        adhesionRepository.save(adhesion);

        return adhesionDto;
    }

    public void deleteAdhesion(Long id) {
        Adhesion adhesion = adhesionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adhesion not found"));
        adhesionRepository.delete(adhesion);
    }
}

