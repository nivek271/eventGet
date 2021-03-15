package com.eventGet.eventGet.service.impl;

import com.eventGet.eventGet.service.PostService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eventGet.eventGet.model.Post;

@Service("serviceDos")
public class PostServiceImplDos implements PostService{
	@Override
	public List<Post> validationId (List<Post> posts){

		System.out.println("Segundo Servicio");
		for(Post post: posts) {
			if (post.getId()==0) {
				
				throw new NullPointerException("no tiene ID **null**");
				
			}
			
		}
		
		return posts;
	}
	
	
}
