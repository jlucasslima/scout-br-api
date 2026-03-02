package com.scoutbr.api.controllers;

import com.scoutbr.api.models.Jogador;
import com.scoutbr.api.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @PostMapping
    public Jogador cadastrarJogador(@RequestBody Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    @GetMapping
    public List<Jogador> listarJogadores() {
        return jogadorRepository.findAll();
    }
}