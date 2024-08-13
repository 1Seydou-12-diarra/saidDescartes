package com.association.association.service;

import com.association.association.dto.CotisationDto;
import com.association.association.entity.Cotisation;
import com.association.association.repository.CotisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CotisationService {

    @Autowired
    private CotisationRepository cotisationRepository;

    public CotisationDto createCotisation(CotisationDto cotisationDto) {
        Cotisation cotisation = new Cotisation();
        cotisation.setAnnee(cotisationDto.getAnnee());
        cotisation.setMois(cotisationDto.getMois());
        cotisationRepository.save(cotisation);
        cotisationDto.setIdCotisation(cotisation.getIdCotisation());
        return cotisationDto;
    }

    public List<CotisationDto> getAllCotisations() {
        return cotisationRepository.findAll().stream().map(cotisation -> {
            CotisationDto dto = new CotisationDto();
            dto.setIdCotisation(cotisation.getIdCotisation());
            dto.setAnnee(cotisation.getAnnee());
            dto.setMois(cotisation.getMois());
            return dto;
        }).collect(Collectors.toList());
    }

    public CotisationDto updateCotisation(Long id, CotisationDto cotisationDto) {
        Cotisation cotisation = cotisationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cotisation not found"));
        cotisation.setAnnee(cotisationDto.getAnnee());
        cotisation.setMois(cotisationDto.getMois());
        cotisationRepository.save(cotisation);
        return cotisationDto;
    }

    public void deleteCotisation(Long id) {
        Cotisation cotisation = cotisationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cotisation not found"));
        cotisationRepository.delete(cotisation);
    }
}

