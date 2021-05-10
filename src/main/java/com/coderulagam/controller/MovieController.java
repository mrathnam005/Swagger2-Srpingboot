package com.coderulagam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderulagam.model.Movie;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

	
	private static List<Movie> list = new ArrayList<Movie>();
	
	@GetMapping
	public List<Movie> getMovieInfo(){
		
		return list;
	}

	@PostMapping
	public Movie addMovis(@RequestBody Movie movie) {
		list.add(movie);
		
		return movie;
	}
	
}
