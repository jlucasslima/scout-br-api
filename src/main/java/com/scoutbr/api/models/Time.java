package com.scoutbr.api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "times")
public class Time {

    @Id
    private String id;
    private String nome;
    private String estado;
    private int pontos;
    private int vitorias;

    public Time() {}


    public Time(String nome, String estado, int pontos, int vitorias) {
        this.nome = nome;
        this.estado = estado;
        this.pontos = pontos;
        this.vitorias = vitorias;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public int getPontos() { return pontos; }
    public void setPontos(int pontos) { this.pontos = pontos; }

    public int getVitorias() { return vitorias; }
    public void setVitorias(int vitorias) { this.vitorias = vitorias; }
}