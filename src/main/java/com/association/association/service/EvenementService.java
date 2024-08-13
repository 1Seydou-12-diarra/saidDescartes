package com.association.association.service;

import com.association.association.dto.EvenementDto;
import com.association.association.entity.Evenement;
import com.association.association.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EvenementService {

    @Autowired
    private EvenementRepository evenementRepository;

    public EvenementDto createEvenement(EvenementDto evenementDto) {
        Evenement evenement = new Evenement();
        evenement.setLibelle(evenementDto.getLibelle());
        evenement.setDateEvenement(evenementDto.getDateEvenement());
        evenement.setLibelle(evenementDto.getLibelle());
        evenement.setDateDebutVersement(evenementDto.getDateDebutVersement());
        evenement.setDateFinVersement(evenementDto.getDateFinVersement());
        evenementRepository.save(evenement);
        evenementDto.setIdEvenement(evenement.getIdEvenement());
        return evenementDto;
    }

    public List<EvenementDto> getAllEvenements() {
        return evenementRepository.findAll().stream().map(evenement -> {
            EvenementDto dto = new EvenementDto();
            dto.setIdEvenement(evenement.getIdEvenement());
            dto.setLibelle(evenement.getLibelle());
            dto.setDateEvenement(evenement.getDateEvenement());
            dto.setDateDebutVersement(evenement.getDateDebutVersement());
            dto.setDateFinVersement(evenement.getDateFinVersement());
            return dto;
        }).collect(Collectors.toList());
    }

    public EvenementDto updateEvenement(Long id, EvenementDto evenementDto) {
        Evenement evenement = evenementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evenement not found"));
        evenement.setLibelle(evenementDto.getLibelle());
        evenement.setDateEvenement(evenementDto.getDateEvenement());

        evenement.setDateDebutVersement(evenementDto.getDateDebutVersement());
        evenement.setDateFinVersement(evenementDto.getDateFinVersement());
        evenementRepository.save(evenement);
        return evenementDto;
    }

    public void deleteEvenement(Long id) {
        Evenement evenement = evenementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evenement not found"));
        evenementRepository.delete(evenement);
    }
}

