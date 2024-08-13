package com.association.association.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Montant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMontant;
    private String tarif;

    @OneToMany(mappedBy = "montant")
    private List<Paiement> paiements;

    public Montant() {
    }

    public Montant(Long idMontant, String tarif, List<Paiement> paiements) {
        this.idMontant = idMontant;
        this.tarif = tarif;
        this.paiements = paiements;
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

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
// Getters et Setters
}
