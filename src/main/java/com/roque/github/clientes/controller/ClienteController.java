package com.roque.github.clientes.controller;

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
	
	@GetMapping
	public String ok () {
		return "ok";
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
		service.salvar(cliente);
		return new ResponseEntity<>(cliente,HttpStatus.OK);
	}

}
