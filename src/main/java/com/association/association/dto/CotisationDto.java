package com.association.association.dto;

public class CotisationDto {
    private Long idCotisation;
    private Integer annee;
    private String mois;

    public CotisationDto() {
    }

    public CotisationDto(Long idCotisation, Integer annee, String mois) {
        this.idCotisation = idCotisation;
        this.annee = annee;
        this.mois = mois;
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
}
