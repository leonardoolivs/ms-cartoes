package com.curso.dougllas.mscartoes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_CARTAO")
public class Cartao {

    private Long id;
    private String bandeira;
    private BigDecimal renda;
    private BigDecimal limite;
    
}
