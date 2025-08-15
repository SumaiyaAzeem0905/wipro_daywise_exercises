package com.example.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomany.entity.Person;

public interface PostRepository extends JpaRepository<Person, Long>{

}
