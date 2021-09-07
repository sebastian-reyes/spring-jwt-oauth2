package com.spring.app.service;

import java.util.List;

import com.spring.app.interfaceService.IUsuarioService;
import com.spring.app.model.Usuario;
import com.spring.app.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    UsuarioRepository repository;

    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>)repository.findAll();
    }

    @Override
    public Usuario buscarUsuario(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Usuario registrarUsuario(Usuario u) {
        return repository.save(u);
    }

    @Override
    public void eliminarUsuario(Integer id) {
        repository.deleteById(id);
    }
    
}
