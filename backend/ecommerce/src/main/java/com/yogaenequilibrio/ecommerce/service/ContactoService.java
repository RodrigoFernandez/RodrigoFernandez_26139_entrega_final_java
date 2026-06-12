package com.yogaenequilibrio.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogaenequilibrio.ecommerce.model.Contacto;
import com.yogaenequilibrio.ecommerce.repository.ContactoRepository;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public void guardar(Contacto contacto) {
        contactoRepository.save(contacto);
    }
}
