package com.ironhack.dog_daycare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dogId;
    private String name;
    private String breed;
    private String age;
    private String weight;

    @OneToOne
    @JoinColumn(name = "record_id")
    private HealthRecord healthRecord;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

}
