package com.scoutbr.api.controllers;

import com.scoutbr.api.models.JogadorDetalhadoDTO;
import com.scoutbr.api.services.LiveScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scout")
public class LiveScoreController {

    @Autowired
    private LiveScoreService liveScoreService;

    @GetMapping("/ao-vivo")
    public String verLive() { 
        return liveScoreService.obterJogosAoVivo(); 
    }

    @GetMapping("/ficha/{nome}")
    public JogadorDetalhadoDTO[] verFicha(@PathVariable String nome) { 
        return liveScoreService.obterFichaTecnica(nome); 
    }

    @GetMapping("/importar-elenco/{id}")
    public String importar(@PathVariable String id) { 
        return liveScoreService.importarElencoCompleto(id); 
    }

    @GetMapping("/salvar-times/{id}")
    public String salvar(@PathVariable String id) { 
        return liveScoreService.salvarTudoDaLiga(id); 
    }
}