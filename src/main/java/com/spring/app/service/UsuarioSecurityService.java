package com.spring.app.service;

import java.util.List;
import java.util.stream.Collectors;

import com.spring.app.model.Usuario;
import com.spring.app.repository.UsuarioRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioSecurityService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UsuarioSecurityService.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email);
        if (usuario == null) {
            logger.error("Error en el login: no existe usuario en el sistema");
            throw new UsernameNotFoundException("Error en el login: no existe usuario en el sistema");
        }
        List<GrantedAuthority> authorities = usuario.getRoles()
                .stream()
                .map(rol -> new SimpleGrantedAuthority(rol.getNombre()))
                .peek(authority -> logger.info("Rol:"+ authority.getAuthority()))
                .collect(Collectors.toList());
        return new User(usuario.getEmail(), usuario.getPassword(), usuario.getActivo(), true, true, true, authorities);
    }

}
