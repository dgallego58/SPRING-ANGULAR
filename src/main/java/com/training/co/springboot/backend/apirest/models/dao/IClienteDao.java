package com.training.co.springboot.backend.apirest.models.dao;

import com.training.co.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

}
