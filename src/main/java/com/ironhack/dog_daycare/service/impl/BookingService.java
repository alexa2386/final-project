package com.ironhack.dog_daycare.service.impl;

import com.ironhack.dog_daycare.model.Booking;
import com.ironhack.dog_daycare.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingById(Integer id) {
        return bookingRepository.findById(id);
    }

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking updateBooking(Integer id, Booking booking) {
        if (bookingRepository.existsById(id)) {
            booking.setBookingId(id);
            return bookingRepository.save(booking);
        }
        return null;
    }

    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }
}
