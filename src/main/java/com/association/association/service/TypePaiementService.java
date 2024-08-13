package com.association.association.service;

import com.association.association.dto.TypePaiementDto;
import com.association.association.entity.TypePaiement;
import com.association.association.repository.TypePaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypePaiementService {

    @Autowired
    private TypePaiementRepository typePaiementRepository;

    public TypePaiementDto createTypePaiement(TypePaiementDto typePaiementDto) {
        TypePaiement typePaiement = new TypePaiement();
        typePaiement.setPartiel(typePaiementDto.getPartiel());
        typePaiement.setTotalite(typePaiementDto.getTotalite());
        typePaiementRepository.save(typePaiement);
        typePaiementDto.setIdTypePaiement(typePaiement.getIdTypePaiement());
        return typePaiementDto;
    }

    public List<TypePaiementDto> getAllTypePaiements() {
        return typePaiementRepository.findAll().stream().map(typePaiement -> {
            TypePaiementDto dto = new TypePaiementDto();
            dto.setIdTypePaiement(typePaiement.getIdTypePaiement());

            dto.setPartiel(typePaiement.getPartiel());
            dto.setTotalite(typePaiement.getTotalite());
            return dto;
        }).collect(Collectors.toList());
    }

    public TypePaiementDto updateTypePaiement(Long id, TypePaiementDto typePaiementDto) {
        TypePaiement typePaiement = typePaiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TypePaiement not found"));
        typePaiement.setPartiel(typePaiementDto.getPartiel());
        typePaiement.setTotalite(typePaiementDto.getTotalite());
        typePaiementRepository.save(typePaiement);
        return typePaiementDto;
    }

    public void deleteTypePaiement(Long id) {
        TypePaiement typePaiement = typePaiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TypePaiement not found"));
        typePaiementRepository.delete(typePaiement);
    }
}
