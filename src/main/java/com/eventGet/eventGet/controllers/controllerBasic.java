package com.eventGet.eventGet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class controllerBasic {
	
	@GetMapping (path = {"/saludar","/holaMund"})
	public String saludar() {
		return "index";
	}

}
