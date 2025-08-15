package com.example.onetomany.entity;


import jakarta.persistence.*;

@Entity
public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    // Constructors
    public Post() {}
    public Post(String message, Person person) {
        this.message = message;
        this.person = person;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}
