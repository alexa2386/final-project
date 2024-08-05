package com.ironhack.dog_daycare.repository;

import com.ironhack.dog_daycare.model.Booking;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BookingRepositoryTest {
    //  given - when - then

    @Autowired
    private BookingRepository bookingRepository;
    Booking booking;

    @BeforeEach
    void setup(){
        booking = new Booking();
        bookingRepository.save(booking);
    }

    @AfterEach
    void tearDown(){
        booking = null;
        bookingRepository.deleteAll();
    }

    // Test case SUCCESS

//    @Test
////    void testFindDogByID_Found(){
////        List<Booking> bookingList = bookingRepository.findAllById(1);
////
////    }
}