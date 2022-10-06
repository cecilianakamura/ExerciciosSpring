package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metas")
public class MetasController {

	@GetMapping
	public String Metas() {
		return "<br>Minhas metas da semana são:</br>"
				+"<br>1. Aprender mais sobre Spring</br>"
				+"<br>2. Continuar o projeto de bordado</br>"
				+"<br>3. Continuar a leitura de Comunicação Não Violenta</br>";
	}
	
}
