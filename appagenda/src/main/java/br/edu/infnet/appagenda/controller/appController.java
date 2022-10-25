package br.edu.infnet.appagenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController 
{
	@GetMapping(value = "/")
	public String telaHome()
	{
		return "home";
	}
}
