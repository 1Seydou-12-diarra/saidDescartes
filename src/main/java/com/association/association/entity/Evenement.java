package com.association.association.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvenement;
    private String libelle;
    private Date dateEvenement;
    private Date dateDebutVersement;
    private Date dateFinVersement;

    @OneToMany(mappedBy = "evenement")
    private List<Paiement> paiements;

    public Evenement() {
    }

    public Evenement(Long idEvenement, String libelle, Date dateEvenement, Date dateDebutVersement, Date dateFinVersement, List<Paiement> paiements) {
        this.idEvenement = idEvenement;
        this.libelle = libelle;
        this.dateEvenement = dateEvenement;
        this.dateDebutVersement = dateDebutVersement;
        this.dateFinVersement = dateFinVersement;
        this.paiements = paiements;
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

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
// Getters et Setters
}

