package com.generation.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class ObjetivoController {
	@GetMapping ("/ob")
	public String getObjetivo() {
		return "Aprender toda a base de back-end e as Bsm que são importantes.";
	}
}
