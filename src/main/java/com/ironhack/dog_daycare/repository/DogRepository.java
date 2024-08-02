package com.ironhack.dog_daycare.repository;

import com.ironhack.dog_daycare.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {
}
