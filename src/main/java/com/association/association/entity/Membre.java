package com.association.association.entity;

import jakarta.persistence.*;

@Entity
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMembre;
    private String nom;
    private String prenom;
    private String datenais;
    private String lieuNais;
    private String nationalite;
    private String numCni;
    private String fonction;
    private String sexe;
    private String typeMembre;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;

    public Membre() {
    }

    public Membre(Long idMembre, String nom, String prenom, String datenais, String lieuNais, String nationalite, String numCni, String fonction, String sexe, String typeMembre, Categorie categorie) {
        this.idMembre = idMembre;
        this.nom = nom;
        this.prenom = prenom;
        this.datenais = datenais;
        this.lieuNais = lieuNais;
        this.nationalite = nationalite;
        this.numCni = numCni;
        this.fonction = fonction;
        this.sexe = sexe;
        this.typeMembre = typeMembre;
        this.categorie = categorie;
    }

    public Long getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Long idMembre) {
        this.idMembre = idMembre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatenais() {
        return datenais;
    }

    public void setDatenais(String datenais) {
        this.datenais = datenais;
    }

    public String getLieuNais() {
        return lieuNais;
    }

    public void setLieuNais(String lieuNais) {
        this.lieuNais = lieuNais;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getNumCni() {
        return numCni;
    }

    public void setNumCni(String numCni) {
        this.numCni = numCni;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getTypeMembre() {
        return typeMembre;
    }

    public void setTypeMembre(String typeMembre) {
        this.typeMembre = typeMembre;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
// Getters et Setters
}

