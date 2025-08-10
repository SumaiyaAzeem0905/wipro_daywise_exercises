package com.hibernatedemo.hibernateExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pan")
public class Pan {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String panholderName;
	    private String panNumber;

	    // Getters and setters
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public String getPanholderName() {
	        return panholderName;
	    }
	    public void setPanholderName(String panholderName) {
	        this.panholderName = panholderName;
	    }
	    public String getPanNumber() {
	        return panNumber;
	    }
	    public void setPanNumber(String panNumber) {
	        this.panNumber = panNumber;
	    }
	}

