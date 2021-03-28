package io.github.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.model.Post;
import io.github.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postSvc;
	
	@GetMapping("/wakeup")
	public String wakeUp() {
		return "The rest api is accessible - The Server is up and running";
	}
	
	@PostMapping("/post")
	public String post(@RequestBody @Valid Post obj) {
		return this.postSvc.post(obj);
	}
	
	@GetMapping("/allPosts")
	public Iterable<Post> getAllPosts() {
		return this.postSvc.getAllPost();
	}
	
	@PostMapping("/delete")
	public String deletePost(@RequestBody Post obj) {
		return this.postSvc.deletePost(obj);
	}

	@PostMapping("/deleteAll")
	public String deletePost() {
		return this.postSvc.deleteAll();
	}
	
}
