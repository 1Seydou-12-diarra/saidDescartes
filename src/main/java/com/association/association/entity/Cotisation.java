package com.association.association.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cotisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCotisation;
    private Integer annee;
    private String mois;

    @OneToMany(mappedBy = "cotisation")
    private List<Paiement> paiements;

    public Cotisation() {
    }

    public Cotisation(Long idCotisation, Integer annee, String mois, List<Paiement> paiements) {
        this.idCotisation = idCotisation;
        this.annee = annee;
        this.mois = mois;
        this.paiements = paiements;
    }

    public Long getIdCotisation() {
        return idCotisation;
    }

    public void setIdCotisation(Long idCotisation) {
        this.idCotisation = idCotisation;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
// Getters et Setters
}
