package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Produto;

@R
public interface ProdutoRepository extends JpaRepository <Produto,Long> {

}
