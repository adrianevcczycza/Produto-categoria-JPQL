package com.example.demo.mapper;


import org.springframework.stereotype.Component;

import com.example.demo.dto.CategoriaRequestDto;
import com.example.demo.dto.CategoriaResponseDto;
import com.example.demo.model.Categoria;


@Component
public class CategoriaMapper {
    public Categoria toEntity(CategoriaRequestDto dto){
        if (dto == null){
            return null;
        }
        return new Categoria(
            dto.nome()
        );
    } 
    public CategoriaResponseDto toResponseDto (Categoria categoria){
        if (categoria ==null){
            return null;
        }

        return new CategoriaResponseDto(
            categoria.getId(),
            categoria.getNome()
        );
    }
    
}
