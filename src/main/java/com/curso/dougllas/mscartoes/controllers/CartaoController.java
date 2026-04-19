package com.curso.dougllas.mscartoes.controllers;

import com.curso.dougllas.mscartoes.dtos.CartaoRequestDTO;
import com.curso.dougllas.mscartoes.entities.Cartao;
import com.curso.dougllas.mscartoes.services.CartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cartoes")
public class CartaoController {

    private final CartaoService service;

    @PostMapping
    public Cartao save(@RequestBody CartaoRequestDTO dto){
        return service.save(dto);
    }

    @GetMapping
    public Cartao findByRenda(@RequestParam BigDecimal renda){
        return service.findByRenda(renda);
    }

}
