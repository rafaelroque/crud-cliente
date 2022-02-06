package com.roque.github.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roque.github.clientes.ClienteRepository;
import com.roque.github.clientes.model.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}

}
