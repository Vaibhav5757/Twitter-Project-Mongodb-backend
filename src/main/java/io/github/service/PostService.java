package io.github.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.PostRepository;
import io.github.model.Post;
import lombok.extern.java.Log;

@Service
@Log
public class PostService {

	@Autowired
	private PostRepository postRepo;
	
	public String post(Post obj) {
		try {
			this.postRepo.save(obj);
			return "Post successfull";
		}catch(Exception e) {
			log.severe(e.getMessage());
		}
		return null;
	}
	
	public String deletePost(Post obj) {
		try {
			this.postRepo.delete(obj);
			return "Post deleted Sucessfully";
		}catch(Exception err) {
			log.severe(err.getMessage());
		}
		return null;
	}
	
	public String deleteAll() {
		try {
			this.postRepo.deleteAll();
			return "All Posts deleted";
		}catch(Exception err) {
			log.severe(err.getMessage());
		}
		return null;
	}
	
	public Iterable<Post> getAllPost() {
		return this.postRepo.findAll();
	}
}
