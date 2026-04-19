package com.curso.dougllas.mscartoes.services;

import com.curso.dougllas.mscartoes.dtos.CartaoRequestDTO;
import com.curso.dougllas.mscartoes.dtos.mapper.CartaoMapper;
import com.curso.dougllas.mscartoes.entities.Cartao;
import com.curso.dougllas.mscartoes.repositories.CartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRepository repository;
    private final CartaoMapper mapper;

    public Cartao save(CartaoRequestDTO dto){
        return repository.save(mapper.toEntity(dto));
    }

    public Cartao findByRenda(BigDecimal renda){
        return repository.findByRenda(renda);
    }
}
