package com.association.association.dto;

import java.util.Date;

public class AdhesionDto {
    private Long idAdhesion;
    private Long idCategorie;
    private Long idMembre;
    private String droit;
    private Date dateAdhesion;

    public AdhesionDto() {
    }

    public AdhesionDto(Long idAdhesion, Long idCategorie, Long idMembre, String droit, Date dateAdhesion) {
        this.idAdhesion = idAdhesion;
        this.idCategorie = idCategorie;
        this.idMembre = idMembre;
        this.droit = droit;
        this.dateAdhesion = dateAdhesion;
    }

    public Long getIdAdhesion() {
        return idAdhesion;
    }

    public void setIdAdhesion(Long idAdhesion) {
        this.idAdhesion = idAdhesion;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Long getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Long idMembre) {
        this.idMembre = idMembre;
    }

    public String getDroit() {
        return droit;
    }

    public void setDroit(String droit) {
        this.droit = droit;
    }

    public Date getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(Date dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }
// Getters et Setters
}
