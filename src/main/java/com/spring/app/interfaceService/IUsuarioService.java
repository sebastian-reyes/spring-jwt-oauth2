package com.spring.app.interfaceService;

import java.util.List;

import com.spring.app.model.Usuario;

public interface IUsuarioService {
    public List<Usuario> listarUsuarios();
    public Usuario buscarUsuario(Integer id);
    public Usuario registrarUsuario(Usuario u);
    public void eliminarUsuario(Integer id);
}
