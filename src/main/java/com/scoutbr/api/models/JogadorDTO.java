package com.scoutbr.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JogadorDTO {

    @JsonProperty("player_name")
    private String nome;

    @JsonProperty("player_type") 
    private String posicao;

    @JsonProperty("player_age")
    private String idade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public String getIdade() { return idade; }
    public void setIdade(String idade) { this.idade = idade; }
}