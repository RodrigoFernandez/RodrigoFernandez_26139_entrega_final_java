package com.yogaenequilibrio.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogaenequilibrio.ecommerce.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
