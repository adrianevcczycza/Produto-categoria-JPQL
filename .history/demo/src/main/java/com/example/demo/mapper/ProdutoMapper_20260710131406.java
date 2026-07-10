package com.example.demo.mapper;



 public class ProdutoMapper {
     public ProdutoResponseDto toResponseDto (Produto produto){
         if (produto ==  null) {
             return null;
         }
         return new ProdutoResponseDto(
             produto.getId(),
             produto.getNome(),
             produto.getDescricao(),
             produto.getPreco(),
             produto.getDataCadastro(),
             produto.getCategoria().getId()
         );    
     }
     public Produto toEntity (ProdutoRequestDto dto){
         if (dto == null) {
             return null;
         }
        
         return new Produto(
             dto.nome(), 
             dto.descricao(),
             dto.preco(),
             dto.dataCadastro(),
             dto.
        
         ); 
     }
 }
