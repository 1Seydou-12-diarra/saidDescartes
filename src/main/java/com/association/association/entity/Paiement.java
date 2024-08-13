package com.association.association.entity;

import jakarta.persistence.*;

@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;

    @ManyToOne
    @JoinColumn(name = "idMembre")
    private Membre membre;

    @ManyToOne
    @JoinColumn(name = "idCotisation")
    private Cotisation cotisation;

    @ManyToOne
    @JoinColumn(name = "idTypePaiement")
    private TypePaiement typePaiement;

    @ManyToOne
    @JoinColumn(name = "idMontant")
    private Montant montant;

    @ManyToOne
    @JoinColumn(name = "idEvenement")
    private Evenement evenement;

    public Paiement() {
    }

    public Paiement(Long idPaiement, Membre membre, Cotisation cotisation, TypePaiement typePaiement, Montant montant, Evenement evenement) {
        this.idPaiement = idPaiement;
        this.membre = membre;
        this.cotisation = cotisation;
        this.typePaiement = typePaiement;
        this.montant = montant;
        this.evenement = evenement;
    }

    public Long getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(Long idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Cotisation getCotisation() {
        return cotisation;
    }

    public void setCotisation(Cotisation cotisation) {
        this.cotisation = cotisation;
    }

    public TypePaiement getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(TypePaiement typePaiement) {
        this.typePaiement = typePaiement;
    }

    public Montant getMontant() {
        return montant;
    }

    public void setMontant(Montant montant) {
        this.montant = montant;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
// Getters et Setters
}
