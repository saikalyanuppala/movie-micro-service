package com.adp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adp.enity.Movie;
import com.adp.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieRestController {

	@Autowired
	private MovieService movieService;

	@GetMapping
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}

	@GetMapping("/{id}")
	public Movie getMovieByMovieId(@PathVariable("id") Integer id) {
		return movieService.getMovieById(id).orElseThrow(() -> new RuntimeException("Movie not found with id " + id));
	}

	@GetMapping("/actor/{id}")
	public ResponseEntity<List<Movie>> getMoviesByActorId(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(movieService.getMoviesByActorId(id));
	}

	@PostMapping
	public Movie saveMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}
}
