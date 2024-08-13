package com.association.association.dto;

public class TypePaiementDto {
    private Long idTypePaiement;
    private String libelle;
    private String totalite;
    private String partiel;

    public TypePaiementDto() {
    }

    public TypePaiementDto(Long idTypePaiement, String libelle, String totalite, String partiel) {
        this.idTypePaiement = idTypePaiement;
        this.libelle = libelle;
        this.totalite = totalite;
        this.partiel = partiel;
    }

    public Long getIdTypePaiement() {
        return idTypePaiement;
    }

    public void setIdTypePaiement(Long idTypePaiement) {
        this.idTypePaiement = idTypePaiement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTotalite() {
        return totalite;
    }

    public void setTotalite(String totalite) {
        this.totalite = totalite;
    }

    public String getPartiel() {
        return partiel;
    }

    public void setPartiel(String partiel) {
        this.partiel = partiel;
    }
// Getters et Setters
}

