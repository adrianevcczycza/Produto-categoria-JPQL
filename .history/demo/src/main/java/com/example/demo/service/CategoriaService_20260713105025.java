package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CategoriaRequestDto;
import com.example.demo.dto.CategoriaResponseDto;
import com.example.demo.mapper.CategoriaMapper;
import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoriaService {

    private CategoriaMapper categoriaMapper;

    private CategoriaRepository categoriaRepository;

    public CategoriaRequestDto criar(CategoriaResponseDto dto){
        Categoria categoria = categoriaMapper.toEntity(dto);
        categoria = repository.save(categoria);

        return categoriaMapper.toResponseDto (categoria);

    }
}
