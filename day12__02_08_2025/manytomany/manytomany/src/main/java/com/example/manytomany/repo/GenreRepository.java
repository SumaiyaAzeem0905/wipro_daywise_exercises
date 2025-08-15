package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.manytomany.entity.Genre;


public interface GenreRepository extends JpaRepository<Genre, Long>{

}
