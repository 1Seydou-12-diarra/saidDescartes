package com.association.association.service;

import com.association.association.dto.PaiementDto;
import com.association.association.entity.*;
import com.association.association.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaiementService {
    @Autowired
    private PaiementRepository paiementRepository;

    @Autowired
    private MembreRepository membreRepository;

    @Autowired
    private CotisationRepository cotisationRepository;

    @Autowired
    private TypePaiementRepository typePaiementRepository;

    @Autowired
    private MontantRepository montantRepository;

    @Autowired
    private EvenementRepository evenementRepository;

    public PaiementDto createPaiement(PaiementDto paiementDto) {
        Paiement paiement = new Paiement();

        Membre membre = membreRepository.findById(paiementDto.getMembreId())
                .orElseThrow(() -> new RuntimeException("Membre not found"));
        paiement.setMembre(membre);

        Cotisation cotisation = cotisationRepository.findById(paiementDto.getCotisationId())
                .orElseThrow(() -> new RuntimeException("Cotisation not found"));
        paiement.setCotisation(cotisation);

        TypePaiement typePaiement = typePaiementRepository.findById(paiementDto.getTypePaiementId())
                .orElseThrow(() -> new RuntimeException("Type de Paiement not found"));
        paiement.setTypePaiement(typePaiement);

        Montant montant = montantRepository.findById(paiementDto.getMontantId())
                .orElseThrow(() -> new RuntimeException("Montant not found"));
        paiement.setMontant(montant);

        Evenement evenement = evenementRepository.findById(paiementDto.getEvenementId())
                .orElseThrow(() -> new RuntimeException("Evenement not found"));
        paiement.setEvenement(evenement);

        paiementRepository.save(paiement);
        paiementDto.setIdPaiement(paiement.getIdPaiement());
        return paiementDto;
    }

    public List<PaiementDto> getAllPaiements() {
        return paiementRepository.findAll().stream().map(paiement -> {
            PaiementDto dto = new PaiementDto();
            dto.setIdPaiement(paiement.getIdPaiement());
            dto.setMembreId(paiement.getMembre().getIdMembre());
            dto.setCotisationId(paiement.getCotisation().getIdCotisation());
            dto.setTypePaiementId(paiement.getTypePaiement().getIdTypePaiement());
            dto.setMontantId(paiement.getMontant().getIdMontant());
            dto.setEvenementId(paiement.getEvenement().getIdEvenement());
            return dto;
        }).collect(Collectors.toList());
    }

    public PaiementDto updatePaiement(Long id, PaiementDto paiementDto) {
        Paiement paiement = paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement not found"));

        Membre membre = membreRepository.findById(paiementDto.getMembreId())
                .orElseThrow(() -> new RuntimeException("Membre not found"));
        paiement.setMembre(membre);

        Cotisation cotisation = cotisationRepository.findById(paiementDto.getCotisationId())
                .orElseThrow(() -> new RuntimeException("Cotisation not found"));
        paiement.setCotisation(cotisation);

        TypePaiement typePaiement = typePaiementRepository.findById(paiementDto.getTypePaiementId())
                .orElseThrow(() -> new RuntimeException("Type de Paiement not found"));
        paiement.setTypePaiement(typePaiement);

        Montant montant = montantRepository.findById(paiementDto.getMontantId())
                .orElseThrow(() -> new RuntimeException("Montant not found"));
        paiement.setMontant(montant);

        Evenement evenement = evenementRepository.findById(paiementDto.getEvenementId())
                .orElseThrow(() -> new RuntimeException("Evenement not found"));
        paiement.setEvenement(evenement);

        paiementRepository.save(paiement);

        return paiementDto;
    }

    public void deletePaiement(Long id) {
        Paiement paiement = paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement not found"));
        paiementRepository.delete(paiement);
    }
}

