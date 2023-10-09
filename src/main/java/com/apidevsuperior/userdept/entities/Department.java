package com.apidevsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Mapeamento da classe (ORM)
// @Entity define que é uma entidade do banco de dados
// @Table define o nome da tabela
@Entity
@Table(name = "tb_department")
public class Department {
    // @Id define a chave primária da tabela
    // @GeneratedValue define que é auto incrementado
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
