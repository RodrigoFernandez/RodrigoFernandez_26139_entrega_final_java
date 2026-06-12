package com.yogaenequilibrio.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogaenequilibrio.ecommerce.model.Usuario;
import com.yogaenequilibrio.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario obtenerPorNombreYContrasenia(String nombre, String contrasenia) {
        return usuarioRepository.findById(nombre)
                .filter(usuario -> usuario.getContrasenia().equals(contrasenia))
                .orElse(null);
    }
}
