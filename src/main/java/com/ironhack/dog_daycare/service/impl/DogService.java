package com.ironhack.dog_daycare.service.impl;

import com.ironhack.dog_daycare.model.Dog;
import com.ironhack.dog_daycare.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogService {
    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    public Optional<Dog> getDogById(Integer id) {
        return dogRepository.findById(id);
    }

    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    public void deleteDog(Integer id) {
        dogRepository.deleteById(id);
    }


}
