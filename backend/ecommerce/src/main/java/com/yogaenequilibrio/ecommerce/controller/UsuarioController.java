package com.yogaenequilibrio.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yogaenequilibrio.ecommerce.dto.UsuarioLoginRequest;
import com.yogaenequilibrio.ecommerce.dto.UsuarioLoginResponse;
import com.yogaenequilibrio.ecommerce.model.Usuario;
import com.yogaenequilibrio.ecommerce.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public UsuarioLoginResponse login(@RequestBody UsuarioLoginRequest request) {
        Usuario usuario = usuarioService.obtenerPorNombreYContrasenia(request.getUsername(), request.getPassword());
        
        if (usuario != null) {
            UsuarioLoginResponse rta = new UsuarioLoginResponse();
            rta.setUser(usuario.getNombre());
            rta.setToken("Token1");
            rta.setRoles(usuario.getRoles().stream().map(rol -> rol.getNombre()).toList());
            System.out.println("UsuarioController.login: " + rta);
            return rta;
        } else {
            throw new RuntimeException("Credenciales inválidas");
        }
    }
}
