package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Categoria;

@Repso
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{
    List<Categoria> findById(Long id);