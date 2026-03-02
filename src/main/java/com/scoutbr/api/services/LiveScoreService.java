package com.scoutbr.api.services;

import com.scoutbr.api.models.*;
import com.scoutbr.api.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LiveScoreService {

    @Value("${apifootball.token}")
    private String apiToken;

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private JogadorRepository jogadorRepository;

    public String salvarTudoDaLiga(String leagueId) {
        String url = "https://apiv3.apifootball.com/?action=get_teams&league_id=" + leagueId + "&APIkey=" + apiToken.trim();
        RestTemplate restTemplate = new RestTemplate();
        TimeDTO[] times = restTemplate.getForObject(url, TimeDTO[].class);
        if (times == null) return "Erro na API.";
        int total = 0;
        for (TimeDTO t : times) {
            Time timeSalvo = timeRepository.save(new Time(t.getNome(), "Intl", 0, 0));
            if (t.getJogadores() != null) {
                for (JogadorDTO j : t.getJogadores()) {
                    jogadorRepository.save(new Jogador(j.getNome(), j.getPosicao(), j.getIdade(), timeSalvo));
                    total++;
                }
            }
        }
        return "Sucesso! " + total + " jogadores salvos.";
    }

    public JogadorDetalhadoDTO[] obterFichaTecnica(String nome) {
        String url = "https://apiv3.apifootball.com/?action=get_players&player_name=" + nome + "&APIkey=" + apiToken.trim();
        return new RestTemplate().getForObject(url, JogadorDetalhadoDTO[].class);
    }

    public String obterJogosAoVivo() {
        String url = "https://apiv3.apifootball.com/?action=get_livescore&APIkey=" + apiToken.trim();
        return new RestTemplate().getForObject(url, String.class);
    }

    public String importarElencoCompleto(String teamId) {
        String url = "https://apiv3.apifootball.com/?action=get_players&team_id=" + teamId + "&APIkey=" + apiToken.trim();
        JogadorDetalhadoDTO[] lista = new RestTemplate().getForObject(url, JogadorDetalhadoDTO[].class);
        if (lista != null) {
            for (JogadorDetalhadoDTO j : lista) {
                jogadorRepository.save(new Jogador(j.getPlayer_name(), j.getPlayer_type(), j.getPlayer_age(), null));
            }
        }
        return "Elenco do time " + teamId + " importado!";
    }
}