package com.eventGet.eventGet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eventGet.eventGet.components.PostComponent;
import com.eventGet.eventGet.model.Conexion;
import com.eventGet.eventGet.service.PostService;

@SpringBootApplication
public class EventGetApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("beanConexion")
	private Conexion conexion;
	
	@Autowired
	@Qualifier("com.eventGet.eventGet.components.PostComponent")
	public PostComponent postComponent;
	
	
	@Autowired
	@Qualifier("serviceDos")
	public PostService postService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EventGetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postService.validationId(postComponent.getPosts())
				.forEach((post)->{System.out.println(post.getTitulo());});
		
		
		
		//postComponent.getPosts().forEach(p -> { System.out.println(p.getDescrip());});//imprimo la descripcion de todos los post
		//cv15 model app image
		
	}

}
