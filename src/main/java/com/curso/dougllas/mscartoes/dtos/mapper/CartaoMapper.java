package com.curso.dougllas.mscartoes.dtos.mapper;

import com.curso.dougllas.mscartoes.dtos.CartaoRequestDTO;
import com.curso.dougllas.mscartoes.entities.Cartao;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartaoMapper {

    Cartao toEntity(CartaoRequestDTO dto);

    CartaoRequestDTO toDto(Cartao entity);
}
