package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-BSM")
public class BSMController {

	@GetMapping
	public String[] BSM() {
		String[] ListaBSM = { "Mentalidade de Crescimento", "Orientação ao Futuro", "Persistência",
				"Responsabilidade pessoal", "Comunicação", "Orientação ao Detalhe", "Proatividade",
				"Trabalho em Equipe" };
		return ListaBSM;
	}
}