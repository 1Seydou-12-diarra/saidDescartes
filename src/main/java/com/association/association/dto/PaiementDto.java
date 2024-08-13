package com.association.association.dto;

public class PaiementDto {
    private Long idPaiement;
    private Long membreId;
    private Long cotisationId;
    private Long typePaiementId;
    private Long montantId;
    private Long evenementId;

    public PaiementDto() {
    }

    public PaiementDto(Long idPaiement, Long membreId, Long cotisationId, Long typePaiementId, Long montantId, Long evenementId) {
        this.idPaiement = idPaiement;
        this.membreId = membreId;
        this.cotisationId = cotisationId;
        this.typePaiementId = typePaiementId;
        this.montantId = montantId;
        this.evenementId = evenementId;
    }

    public Long getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(Long idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Long getMembreId() {
        return membreId;
    }

    public void setMembreId(Long membreId) {
        this.membreId = membreId;
    }

    public Long getCotisationId() {
        return cotisationId;
    }

    public void setCotisationId(Long cotisationId) {
        this.cotisationId = cotisationId;
    }

    public Long getTypePaiementId() {
        return typePaiementId;
    }

    public void setTypePaiementId(Long typePaiementId) {
        this.typePaiementId = typePaiementId;
    }

    public Long getMontantId() {
        return montantId;
    }

    public void setMontantId(Long montantId) {
        this.montantId = montantId;
    }

    public Long getEvenementId() {
        return evenementId;
    }

    public void setEvenementId(Long evenementId) {
        this.evenementId = evenementId;
    }
// Getters et Setters
}
