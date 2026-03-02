package com.scoutbr.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class TimeDTO {

    @JsonProperty("team_name")
    private String nome;

    @JsonProperty("players") 
    private List<JogadorDTO> jogadores; 

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<JogadorDTO> getJogadores() { return jogadores; }
    public void setJogadores(List<JogadorDTO> jogadores) { this.jogadores = jogadores; }
}