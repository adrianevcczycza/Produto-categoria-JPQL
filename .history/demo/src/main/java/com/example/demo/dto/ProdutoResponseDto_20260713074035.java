package com.example.demo.dto;
import java.math.BigDecimal;
import java.time.LocalDate;


public record ProdutoResponseDto(
    Long id,
    String nome,
    String descricao,
    BigDecimal preco,
    LocalDate dataCadastro,
    Long categoriaId
    
) {

}

