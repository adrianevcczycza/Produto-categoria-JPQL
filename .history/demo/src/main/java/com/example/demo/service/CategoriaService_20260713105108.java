package com.example.demo.service;

import org.springframework.stereotype.Service;


import com.example.demo.mapper.CategoriaMapper;

import com.example.demo.repository.CategoriaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CategoriaService {

    private CategoriaMapper categoriaMapper;

    private CategoriaRepository categoriaRepository;

}
