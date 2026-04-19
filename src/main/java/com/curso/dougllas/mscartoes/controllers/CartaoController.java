package com.curso.dougllas.mscartoes.controllers;

import com.curso.dougllas.mscartoes.dtos.CartaoRequestDTO;
import com.curso.dougllas.mscartoes.entities.Cartao;
import com.curso.dougllas.mscartoes.services.CartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cartoes")
public class CartaoController {

    private final CartaoService service;

    @PostMapping
    public ResponseEntity<Cartao> save(@RequestBody CartaoRequestDTO dto){

        Cartao cartao = service.save(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(cartao.getId()).toUri();

        return ResponseEntity.created(uri).body(cartao);
    }

    @GetMapping(params = "renda")
    public ResponseEntity<List<Cartao>> findByRenda(@RequestParam("renda") BigDecimal renda){
        return ResponseEntity.ok().body(service.findByRenda(renda));
    }

}
