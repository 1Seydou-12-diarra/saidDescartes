package com.association.association.dto;

public class CategorieDto {
    private Long idCategorie;
    private String nom;
    private String privilege;
    private Integer idMontant;

    public CategorieDto() {
    }

    public CategorieDto(Long idCategorie, String nom, String privilege, Integer idMontant) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.privilege = privilege;
        this.idMontant = idMontant;
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

    public Integer getIdMontant() {
        return idMontant;
    }

    public void setIdMontant(Integer idMontant) {
        this.idMontant = idMontant;
    }
// Getters et Setters
}

