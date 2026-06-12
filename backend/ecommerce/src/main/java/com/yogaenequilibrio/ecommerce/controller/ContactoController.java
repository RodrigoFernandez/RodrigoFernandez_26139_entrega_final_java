package com.yogaenequilibrio.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yogaenequilibrio.ecommerce.model.Contacto;
import com.yogaenequilibrio.ecommerce.service.ContactoService;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;
    
    @PostMapping("/guardar")
    public void guardarContacto(@RequestBody Contacto contacto) {
        this.contactoService.guardar(contacto);
    }
}
