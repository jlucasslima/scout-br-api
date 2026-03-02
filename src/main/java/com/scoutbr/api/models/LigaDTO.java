package com.scoutbr.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LigaDTO {

    @JsonProperty("league_id")
    private String id;

    @JsonProperty("league_name")
    private String nome;

    @JsonProperty("country_name")
    private String pais;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
}