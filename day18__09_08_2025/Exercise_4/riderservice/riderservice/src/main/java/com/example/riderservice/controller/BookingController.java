package com.example.riderservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.riderservice.entity.RiderBooking;
import com.example.riderservice.repo.RiderBookingRepository;
import com.example.riderservice.service.BookingProducer;

@RestController
@RequestMapping("/ride")

public class BookingController {
	private final RiderBookingRepository bookingRepository;
    private final BookingProducer bookingProducer;

    public BookingController(RiderBookingRepository bookingRepository, BookingProducer bookingProducer) {
        this.bookingRepository = bookingRepository;
        this.bookingProducer = bookingProducer;
    }

    @PostMapping
    public String bookRide(@RequestBody RiderBooking booking) {
        booking.setStatus("REQUESTED");
        bookingRepository.save(booking);

        bookingProducer.sendBooking(
                booking.getId() + "," + booking.getRiderName() + "," +
                booking.getPickupLocation() + "," + booking.getDropLocation()
        );

        return "Ride requested successfully!";
    }
}
