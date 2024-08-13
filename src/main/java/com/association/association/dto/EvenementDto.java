package com.association.association.dto;

import java.util.Date;

public class EvenementDto {
    private Long idEvenement;
    private String libelle;
    private Date dateEvenement;
    private Date dateDebutVersement;
    private Date dateFinVersement;

    public EvenementDto() {
    }

    public EvenementDto(Long idEvenement, String libelle, Date dateEvenement, Date dateDebutVersement, Date dateFinVersement) {
        this.idEvenement = idEvenement;
        this.libelle = libelle;
        this.dateEvenement = dateEvenement;
        this.dateDebutVersement = dateDebutVersement;
        this.dateFinVersement = dateFinVersement;
    }

    public Long getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(Long idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateEvenement() {
        return dateEvenement;
    }

    public void setDateEvenement(Date dateEvenement) {
        this.dateEvenement = dateEvenement;
    }

    public Date getDateDebutVersement() {
        return dateDebutVersement;
    }

    public void setDateDebutVersement(Date dateDebutVersement) {
        this.dateDebutVersement = dateDebutVersement;
    }

    public Date getDateFinVersement() {
        return dateFinVersement;
    }

    public void setDateFinVersement(Date dateFinVersement) {
        this.dateFinVersement = dateFinVersement;
    }
// Getters et Setters
}

