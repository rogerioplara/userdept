package com.apidevsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidevsuperior.userdept.entities.User;

// Criação do repositório de usuário
// Esse repositório já contempla as operações básicas do banco de dados
public interface UserRepository extends JpaRepository<User, Long> {

}
