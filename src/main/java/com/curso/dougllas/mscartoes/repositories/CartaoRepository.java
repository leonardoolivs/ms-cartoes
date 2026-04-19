package com.curso.dougllas.mscartoes.repositories;

import com.curso.dougllas.mscartoes.entities.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    Cartao findByRenda(BigDecimal renda);
}
