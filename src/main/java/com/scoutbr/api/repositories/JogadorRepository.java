package com.scoutbr.api.repositories;

import com.scoutbr.api.models.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    @Query("SELECT j FROM Jogador j WHERE " +
           "(:nome IS NULL OR j.nome LIKE %:nome%) AND " +
           "(:posicao IS NULL OR j.posicao = :posicao) AND " +
           "(:clube IS NULL OR j.time.nome LIKE %:clube%)")
    List<Jogador> pesquisarAvancado(
        @Param("nome") String nome, 
        @Param("posicao") String posicao, 
        @Param("clube") String clube
    );
}