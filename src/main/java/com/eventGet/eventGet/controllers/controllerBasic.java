package com.eventGet.eventGet.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eventGet.eventGet.model.Post;

@Controller
@RequestMapping("/inicio")
public class controllerBasic {
	
	public List<Post> getPosts(){//creo una arrayList de tipo Post
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/eventGet.png"	, new Date(),"evento creado" ));
		post.add(new Post(2,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/fondo.jpg"	, new Date(),"evento creado 2" ));
		post.add(new Post(3,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/eventGet.png"	, new Date(),"evento creado 3" ));
		
		return post;
	}
	
	@GetMapping (path = {"/post","/"})
	public String saludar(Model model) {
		model.addAttribute("posts",this.getPosts());
		return "index";
	}

}
