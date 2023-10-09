package com.apidevsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidevsuperior.userdept.entities.User;
import com.apidevsuperior.userdept.repositories.UserRepository;

// Configuração do controlador das requisições rest
@RestController
@RequestMapping("/users")
public class UserController {

    // Propriedade do repositório de usuários
    // @Autowired - mecanismo de injeção de dependência
    @Autowired
    private UserRepository repository;

    // Método para buscar os usuários no banco de dados
    // @GetMapping define que o verbo http é um get
    @GetMapping
    public List<User> findAll() {
        // repository.findAll() retorna uma lista de todos os usuários
        List<User> result = repository.findAll();
        return result;
    }

    // Indicar que o caminho terá esse id na url, vai buscar e inserir no argumento
    // da função
    @GetMapping(value = "/{id}")
    // @PathVariable determina que o argumento passado será o que vem na variável id
    // do body
    public User findById(@PathVariable Long id) {
        // .get(); pega o usuário que vem no objeto
        User result = repository.findById(id).get();
        return result;
    }

    // Definição do verbo HTTP
    @PostMapping
    // Definição do argumento, será o que vem no requestbody
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
