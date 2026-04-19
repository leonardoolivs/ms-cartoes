package com.curso.dougllas.mscartoes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoRequestDTO {

    private String bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

}
