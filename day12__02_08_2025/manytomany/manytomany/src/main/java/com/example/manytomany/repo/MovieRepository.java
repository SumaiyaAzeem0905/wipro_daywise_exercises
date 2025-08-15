package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
