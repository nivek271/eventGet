package com.eventGet.eventGet.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.eventGet.eventGet.model.Post;

@ Component("com.eventGet.eventGet.components.PostComponent")//uso la direccion para no repetir/confundir nombre
public class PostComponent {

	
	public List<Post> getPosts(){//creo una arrayList de tipo Post
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/eventGet.png"	, new Date(),"evento creado" ));
		post.add(new Post(2,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/fondo.jpg"	, new Date(),"evento creado 2" ));
		post.add(new Post(3,"prueba de descripcion en creacion de eventos","http://localhost:8181/img/eventGet.png"	, new Date(),"evento creado 3" ));
		
		return post;
	}
}
