package com.example.manytomany.controller;


import org.springframework.web.bind.annotation.*;

import com.example.manytomany.entity.Genre;
import com.example.manytomany.entity.Movie;
import com.example.manytomany.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
	private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

    @PostMapping("/genres")
    public Genre addGenre(@RequestBody Genre genre) {
        return movieService.saveGenre(genre);
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/genres")
    public List<Genre> getGenres() {
        return movieService.getAllGenres();
    }
}
