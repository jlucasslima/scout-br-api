package com.scoutbr.api.models;

import jakarta.persistence.*;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String posicao;
    private String idade;

    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;

    public Jogador() {}

    public Jogador(String nome, String posicao, String idade, Time time) {
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.time = time;
    }

    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getPosicao() { return posicao; }
    public String getIdade() { return idade; }
    public Time getTime() { return time; }
}