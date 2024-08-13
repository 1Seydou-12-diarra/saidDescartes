package com.association.association.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Adhesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdhesion;
    private Date dateAdhesion;
    private  String droit;
    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "idMembre")
    private Membre membre;

    public Adhesion() {
    }

    public Adhesion(Long idAdhesion, Date dateAdhesion, String droit, Categorie categorie, Membre membre) {
        this.idAdhesion = idAdhesion;
        this.dateAdhesion = dateAdhesion;
        this.droit = droit;
        this.categorie = categorie;
        this.membre = membre;
    }

    public Long getIdAdhesion() {
        return idAdhesion;
    }

    public void setIdAdhesion(Long idAdhesion) {
        this.idAdhesion = idAdhesion;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public String getDroit() {
        return droit;
    }

    public void setDroit(String droit) {
        this.droit = droit;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    // Getters et Setters
}
