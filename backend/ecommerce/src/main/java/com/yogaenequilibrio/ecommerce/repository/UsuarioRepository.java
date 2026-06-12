package com.yogaenequilibrio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogaenequilibrio.ecommerce.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
