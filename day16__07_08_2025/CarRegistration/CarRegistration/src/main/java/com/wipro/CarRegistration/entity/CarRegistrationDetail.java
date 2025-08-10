package com.wipro.CarRegistration.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarRegistrationDetail {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String registrationNumber;
	    private LocalDate dateOfRegistration;
		public String getRegistrationNumber() {
			return registrationNumber;
		}
		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}
		public LocalDate getDateOfRegistration() {
			return dateOfRegistration;
		}
		public void setDateOfRegistration(LocalDate dateOfRegistration) {
			this.dateOfRegistration = dateOfRegistration;
		}

}
