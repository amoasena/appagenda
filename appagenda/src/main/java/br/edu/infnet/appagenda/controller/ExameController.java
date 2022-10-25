package br.edu.infnet.appagenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExameController {

	@GetMapping(value = "exame/lista")
	public String telaLista()
	{
		return "exame/lista";
	}
	
}
