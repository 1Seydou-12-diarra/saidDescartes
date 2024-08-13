package com.association.association.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorie;
    private String nom;
    private String privilege;
    private Integer montant;

    @OneToMany(mappedBy = "categorie")
    private List<Membre> membres;

    @OneToMany(mappedBy = "categorie")
    private List<Adhesion> adhesions;

    // Getters et Setters

    public Categorie() {
    }

    public Categorie(Long idCategorie, String nom, String privilege, Integer montant, List<Membre> membres, List<Adhesion> adhesions) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.privilege = privilege;
        this.montant = montant;
        this.membres = membres;
        this.adhesions = adhesions;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public List<Membre> getMembres() {
        return membres;
    }

    public void setMembres(List<Membre> membres) {
        this.membres = membres;
    }

    public List<Adhesion> getAdhesions() {
        return adhesions;
    }

    public void setAdhesions(List<Adhesion> adhesions) {
        this.adhesions = adhesions;
    }
}


