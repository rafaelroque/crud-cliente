package com.roque.github.clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roque.github.clientes.model.Cliente;
import com.roque.github.clientes.service.ClienteService;

@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Cliente>> todos () {
		return new ResponseEntity<>(service.buscarTodos(),HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
		service.salvar(cliente);
		return new ResponseEntity<>(cliente,HttpStatus.OK);
	}

}
