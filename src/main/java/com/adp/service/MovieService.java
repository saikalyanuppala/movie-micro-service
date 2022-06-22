package com.adp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adp.enity.Movie;
import com.adp.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public Optional<Movie> getMovieById(Integer id) {
		return movieRepository.findById(id);
	}

	public List<Movie> getMoviesByActorId(Integer id) {
		return movieRepository.findByActorId(id);
	}

	public Movie saveMovie(Movie movie) {
		return movieRepository.save(movie);
	}
}
