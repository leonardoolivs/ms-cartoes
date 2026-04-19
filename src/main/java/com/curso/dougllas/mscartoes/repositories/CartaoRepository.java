package com.curso.dougllas.mscartoes.repositories;

import com.curso.dougllas.mscartoes.entities.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {
}
