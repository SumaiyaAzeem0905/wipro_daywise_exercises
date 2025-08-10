package com.wipro.CarRegistration.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "registration_id")
    private CarRegistrationDetail registrationDetail;
    public CarRegistrationDetail getRegistrationDetail() {
        return registrationDetail;
    }

    public void setRegistrationDetail(CarRegistrationDetail registrationDetail) {
        this.registrationDetail = registrationDetail;
    }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
