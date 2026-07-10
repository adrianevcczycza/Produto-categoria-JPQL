package com.example.demo.mapper;


import org.springframework.stereotype.Component;


@Component
public class CategoriaMapper {
    public CategoriaResponseDto toResponseDto (Categoria categoria){
        if (categoria ==null){
            return null;
        }

        return new CategoriaResponseDto(
            categoria.getId(),
            categoria.getNome()
        );
    }

    public Categoria toEntity(CategoriaRequestDto dto){
        if (dto == null){
            return null;
        }
        return new Categoria(
            dto.nome()
        );
    }
    
}
