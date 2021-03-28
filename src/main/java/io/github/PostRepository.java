package io.github;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.github.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, String>{
	
}
