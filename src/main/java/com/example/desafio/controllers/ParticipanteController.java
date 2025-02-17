package com.example.desafio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.repositories.AtividadeRepository;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {
	
	@Autowired
	private AtividadeRepository repo;
	
	
	

}
