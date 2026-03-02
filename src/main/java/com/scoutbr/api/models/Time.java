package com.scoutbr.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // No SQL, o ID geralmente é um número (Long)
    
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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public int getPontos() { return pontos; }
    public void setPontos(int pontos) { this.pontos = pontos; }
    public int getVitorias() { return vitorias; }
    public void setVitorias(int vitorias) { this.vitorias = vitorias; }
}