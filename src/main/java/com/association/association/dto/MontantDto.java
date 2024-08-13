package com.association.association.dto;

public class MontantDto {
    private Long idMontant;
    private String tarif;

    public MontantDto() {
    }

    public MontantDto(Long idMontant, String tarif) {
        this.idMontant = idMontant;
        this.tarif = tarif;
    }

    public Long getIdMontant() {
        return idMontant;
    }

    public void setIdMontant(Long idMontant) {
        this.idMontant = idMontant;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
// Getters et Setters
}


