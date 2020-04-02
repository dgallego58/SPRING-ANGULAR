package com.training.co.springboot.backend.apirest.models.service;

import com.training.co.springboot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();
    Cliente save(Cliente cliente);
    void delete(Long id);
    Cliente findById(Long id);

}
