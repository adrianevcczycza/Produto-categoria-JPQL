package com.example.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProdutoRequestDto(
    String nome,
    String descricao,
    BigDecimal preco,
    LocalDate dataCadastro,
    Long categoriaId
    
) {
} 