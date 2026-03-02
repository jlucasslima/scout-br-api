package com.scoutbr.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    private String nome;
    private String estado;
    // Trocamos 'int' por 'Integer' para o banco aceitar valores vazios na hora do relacionamento
    private Integer pontos;
    private Integer vitorias;

    public Time() {}

    public Time(String nome, String estado, Integer pontos, Integer vitorias) {
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
    public Integer getPontos() { return pontos; }
    public void setPontos(Integer pontos) { this.pontos = pontos; }
    public Integer getVitorias() { return vitorias; }
    public void setVitorias(Integer vitorias) { this.vitorias = vitorias; }
}