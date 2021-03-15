package com.eventGet.eventGet.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.eventGet.eventGet.model.Post;
import com.eventGet.eventGet.service.PostService;

@Service
public class PostServiceImpl implements PostService{
	
	@Override
	public List<Post> validationId (List<Post> posts){
		
		System.out.println("Primer Servicio");
		for(Post post: posts) {
			if (post.getTitulo()==null) {
				
				throw new NullPointerException("no tiene titulo **null**");
				
			}
			
		}
		
		return posts;
	}

}
