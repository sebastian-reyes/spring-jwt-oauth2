package com.spring.app.repository;

import com.spring.app.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmail(String email);
    public Usuario findByEmailAndPassword(String email, String password);
}
