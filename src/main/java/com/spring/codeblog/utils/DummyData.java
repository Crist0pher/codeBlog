package com.spring.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;

@Component
public class DummyData {

		@Autowired
		CodeblogRepository codeblogRepository;
	
		
		@PostConstruct
		public void savePosts() {
			List<Post> postList = new ArrayList<>();
			Post post1 = new Post();
			post1.setAutor("Cristopher S. Araujo");
			post1.setData(LocalDate.now());
			post1.setTitulo("Docker");
			post1.setTexto("ddausdhauidhasduo´dhuásdashuashdhasdha´dhadhadasdhuasdhasuidahus");
			
			
			
			Post post2 = new Post();
			post2.setAutor("Tatiana S. Araujo");
			post2.setData(LocalDate.now());
			post2.setTitulo("Erica");
			post2.setTexto("dasdadasdsa´dhuásdashuashdhasdha´dhadhadasdhuasdhasuidahus");			
		
		
			postList.add(post1);
			postList.add(post2);
			
			
			for(Post post: postList) {
				Post postSaved = codeblogRepository.save(post);
				System.out.println(postSaved.getId());
			}
			
			
			
		}
}
