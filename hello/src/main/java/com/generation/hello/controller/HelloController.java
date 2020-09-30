package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping ("/ola")
	public String getHello(){
		return "Olá Mundo!!";
	}
	@GetMapping ("/hab-men")
	public String getHab() {
		return "Persistência e Atenção aos detalhes!!";
	}
}

