package com.scoutbr.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RankingDTO {

    @JsonProperty("player_name")
    private String nome;

    @JsonProperty("team_name")
    private String time;

    @JsonProperty("goals")
    private String gols;

    @JsonProperty("assists")
    private String assistencias;

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getGols() { return gols; }
    public void setGols(String gols) { this.gols = gols; }

    public String getAssistencias() { return assistencias; }
    public void setAssistencias(String assistencias) { this.assistencias = assistencias; }
}