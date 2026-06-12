package com.yogaenequilibrio.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogaenequilibrio.ecommerce.model.Producto;
import com.yogaenequilibrio.ecommerce.repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    public Producto obtenerPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto crear(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto actualizar(Integer id, Producto producto) {
        if (productoRepository.existsById(id)) {
            producto.setId(id);
            return productoRepository.save(producto);
        }
        
        return null;
    }

    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}
