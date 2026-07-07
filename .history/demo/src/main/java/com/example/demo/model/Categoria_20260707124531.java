package com.example.demo.model;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Categoria{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable =  false , unique = true) 
        // defique que o nome não pode ser nulo e deve ser unico
    private String nome;

    @OneToMany (mappedBy = "categoria" )
        //mappedBy indica que o lado dono do relacionamento
        //é o atributo categoria na classe Produto.
    private List<Produto> produtos = new ArrayList<>();
    
    // Construtor customizado para facilitar a instanciação
    // da categoria passando apenas o nome.
    public Categoria (String nome){
        this.nome =nome;
    }
}