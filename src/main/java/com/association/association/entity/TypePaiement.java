package com.association.association.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TypePaiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypePaiement;
    private String partiel;
    private String totalite;

    @OneToMany(mappedBy = "typePaiement")
    private List<Paiement> paiements;

    public TypePaiement() {
    }

    public TypePaiement(Long idTypePaiement, String partiel, String totalite, List<Paiement> paiements) {
        this.idTypePaiement = idTypePaiement;
        this.partiel = partiel;
        this.totalite = totalite;
        this.paiements = paiements;
    }

    public Long getIdTypePaiement() {
        return idTypePaiement;
    }

    public void setIdTypePaiement(Long idTypePaiement) {
        this.idTypePaiement = idTypePaiement;
    }

    public String getPartiel() {
        return partiel;
    }

    public void setPartiel(String partiel) {
        this.partiel = partiel;
    }

    public String getTotalite() {
        return totalite;
    }

    public void setTotalite(String totalite) {
        this.totalite = totalite;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
// Getters et Setters
}
