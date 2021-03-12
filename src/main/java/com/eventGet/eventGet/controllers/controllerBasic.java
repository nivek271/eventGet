package com.eventGet.eventGet.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eventGet.eventGet.configuration.Paginas;
import com.eventGet.eventGet.model.Post;

@Controller 
@RequestMapping("/home")
public class controllerBasic {
	
	public List<Post> getPosts(){//creo una arrayList de tipo Post
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/eventGet.png"	, new Date(),"evento creado" ));
		post.add(new Post(2,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/fondo.jpg"	, new Date(),"evento creado 2" ));
		post.add(new Post(3,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/eventGet.png"	, new Date(),"evento creado 3" ));
		
		return post;
	}
	
	@GetMapping (path = {"/posts","/"})
	public String saludar(Model model) {
		model.addAttribute("posts",this.getPosts());
		return "index";
	}

	/*@GetMapping (path="/public")
	public ModelAndView post() {
		ModelAndView modelAndView = new ModelAndView(Paginas.HOME);//una forma de escribir la url en el navegador
		
		modelAndView.addObject("posts",this.getPosts());
		return modelAndView;
		
	}*/
	
	@GetMapping(path = {"/post","/post/pub/{post}"})//CoV11 - 12 //entre {} para mostrar el nro de id//2 formas de ingresar home/post o home/post/pub/nroId
	public ModelAndView getPostIndividual(
			@RequestParam(defaultValue = "1", name="id", required = false)			@PathVariable (required = true, name = "post")int id) {//en la url aparesca el numero de publicacione(id)
		ModelAndView modelAndView = new ModelAndView(Paginas.POST);
		List<Post> postFiltrado = this.getPosts().stream().filter( (p) -> { return p.getId () == id; }).collect(Collectors.toList());
		
		modelAndView.addObject("post",postFiltrado.get(0));
		
		return modelAndView;
	}
	
}


