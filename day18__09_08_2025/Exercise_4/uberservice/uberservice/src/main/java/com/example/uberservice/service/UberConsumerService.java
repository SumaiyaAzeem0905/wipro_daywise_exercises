package com.example.uberservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.uberservice.entity.UberBooking;
import com.example.uberservice.repo.UberBookingRepository;

@Service
public class UberConsumerService {
	@Autowired
    private UberBookingRepository repository;

    @KafkaListener(topics = "RidertoUber", groupId = "uber_group", containerFactory = "bookingKafkaListenerFactory")
    public void consumeBooking(UberBooking booking) {
        booking.setStatus("Received by Uber");
        repository.save(booking);
        System.out.println("Booking received from Rider Service: " + booking.getRiderName());
    }
}
