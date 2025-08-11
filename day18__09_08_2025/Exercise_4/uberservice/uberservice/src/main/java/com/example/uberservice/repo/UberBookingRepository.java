package com.example.uberservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uberservice.entity.UberBooking;

@Repository
public interface UberBookingRepository extends JpaRepository<UberBooking, Long>{ 

}
