package com.association.association.service;

import com.association.association.dto.MontantDto;
import com.association.association.entity.Montant;
import com.association.association.repository.MontantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MontantService {

    @Autowired
    private MontantRepository montantRepository;

    public MontantDto createMontant(MontantDto montantDto) {
        Montant montant = new Montant();
        montant.setTarif(montantDto.getTarif());
        montantRepository.save(montant);
        montantDto.setIdMontant(montant.getIdMontant());
        return montantDto;
    }

    public List<MontantDto> getAllMontants() {
        return montantRepository.findAll().stream().map(montant -> {
            MontantDto dto = new MontantDto();
            dto.setIdMontant(montant.getIdMontant());
            dto.setTarif(montant.getTarif());
            return dto;
        }).collect(Collectors.toList());
    }

    public MontantDto updateMontant(Long id, MontantDto montantDto) {
        Montant montant = montantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Montant not found"));
        montant.setTarif(montantDto.getTarif());
        montantRepository.save(montant);
        return montantDto;
    }

    public void deleteMontant(Long id) {
        Montant montant = montantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Montant not found"));
        montantRepository.delete(montant);
    }
}
