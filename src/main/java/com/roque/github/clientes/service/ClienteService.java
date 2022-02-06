package com.roque.github.clientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roque.github.clientes.ClienteRepository;
import com.roque.github.clientes.model.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> buscarTodos(){
		return repository.findAll();
	}

	public Optional<Cliente> buscarPorId(Integer id) throws IllegalStateException{
		if(id==null) {
			throw new IllegalStateException("Informe o id");

		}
		return repository.findById(id);
	}

	public void salvar(Cliente cliente) {
		repository.save(cliente);
	}

}
