package com.example.onetomany.service;


import org.springframework.stereotype.Service;

import com.example.onetomany.entity.Person;
import com.example.onetomany.repo.PersonRepository;

import java.util.List;

@Service
public class PersonService {
	private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
