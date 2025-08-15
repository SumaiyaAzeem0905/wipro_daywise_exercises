package com.example.manytomany.service;

import org.springframework.stereotype.Service;

import com.example.manytomany.entity.Genre;
import com.example.manytomany.entity.Movie;
import com.example.manytomany.repo.GenreRepository;
import com.example.manytomany.repo.MovieRepository;

import java.util.List;

@Service
public class MovieService {
	private final MovieRepository movieRepository;
    private final GenreRepository genreRepository;

    public MovieService(MovieRepository movieRepository, GenreRepository genreRepository) {
        this.movieRepository = movieRepository;
        this.genreRepository = genreRepository;
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
