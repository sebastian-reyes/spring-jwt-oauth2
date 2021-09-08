package com.spring.app.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.app.interfaceService.IUsuarioService;
import com.spring.app.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

    @Autowired
    IUsuarioService service;

    @GetMapping
    public ResponseEntity<Map<String, Object>> listarUsuarios() {
        Map<String, Object> response = new HashMap<>();
        List<Usuario> lstUsuarios = service.listarUsuarios();
        response.put("usuarios", lstUsuarios);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerUsuario(@PathVariable Integer id) {
        Usuario objUsuario = null;
        Map<String, Object> response = new HashMap<>();
        try {
            objUsuario = service.buscarUsuario(id);
            if (objUsuario == null) {
                response.put("mensaje", "El usuario con id: " + id + " no se ecuentra en la base de datos.");
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
            } else {
                response.put("usuario", objUsuario);
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
            }
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la consulta a la base de datos.");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Secured("ROLE_ADMIN")
    @PostMapping("/registro")
    public ResponseEntity<?> registrarUsuario(@RequestBody Usuario u) {
        Usuario nuevoUsuario = null;
        Map<String, Object> response = new HashMap<>();
        try {
            nuevoUsuario = service.registrarUsuario(u);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el registro a la base de datos.");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El usuario fue creado con éxito");
		response.put("usuario", nuevoUsuario);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Integer id){
        Usuario usuarioEliminado = null;
        Map<String, Object> response = new HashMap<>();
        usuarioEliminado = service.buscarUsuario(id);
        if(usuarioEliminado == null){
            response.put("error", "El usuario no existe en la base de datos.");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }else{
            service.eliminarUsuario(id);
            response.put("mensaje", "Usuario eliminado correctamente.");
            response.put("usuario_eliminado", usuarioEliminado);
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        }
    }
}
