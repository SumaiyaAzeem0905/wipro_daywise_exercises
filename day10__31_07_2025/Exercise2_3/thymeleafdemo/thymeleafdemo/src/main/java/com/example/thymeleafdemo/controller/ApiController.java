package com.example.thymeleafdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.thymeleafdemo.model.Person;

@RestController
@RequestMapping("/api")
public class ApiController {
	@GetMapping("/person")
    public Person getPerson() {
        Person p = new Person();
        p.setFirstName("Sona");
        p.setAdult(true);
        p.setSalary(65000.0);
        p.setBankAccounts(java.util.List.of(
                new com.example.thymeleafdemo.model.BankAccount("11111","ICICI"),
                new com.example.thymeleafdemo.model.BankAccount("22222","Axis")
        ));
        return p;
    }

    // POST person JSON — receives and echoes back
    @PostMapping("/person")
    public ResponseEntity<Person> receivePerson(@RequestBody Person person) {
        // you could save into DB, but here we just echo back
        System.out.println("Received person: " + person);
        return ResponseEntity.ok(person);
    }
}
