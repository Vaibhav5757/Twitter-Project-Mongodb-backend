package io.github.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class Post {
	
	
	private String id;
	
	@NotEmpty
	private String author, message;
}
