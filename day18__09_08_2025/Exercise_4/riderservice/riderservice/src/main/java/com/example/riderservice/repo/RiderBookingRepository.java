package com.example.riderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.riderservice.entity.RiderBooking;

public interface RiderBookingRepository extends JpaRepository<RiderBooking, Long>
{
}
