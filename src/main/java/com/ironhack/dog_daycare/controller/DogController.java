package com.ironhack.dog_daycare.controller;

import com.ironhack.dog_daycare.model.Dog;
import com.ironhack.dog_daycare.service.impl.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogService dogService;

    // Get all dogs
    @GetMapping
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> dogs = dogService.getAllDogs();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }

    // Get a specific dog by ID
    @GetMapping("/{id}")
    public ResponseEntity<Dog> getDogById(@PathVariable Integer id) {
        Optional<Dog> dog = dogService.getDogById(id);
        return dog.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new dog
    @PostMapping
    public ResponseEntity<Dog> createDog(@RequestBody Dog dog) {
        Dog savedDog = dogService.saveDog(dog);
        return new ResponseEntity<>(savedDog, HttpStatus.CREATED);
    }

    // Update an existing dog
    @PutMapping("/{id}")
    public ResponseEntity<Dog> updateDog(@PathVariable Integer id, @RequestBody Dog dog) {
        if (!dogService.getDogById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        dog.setDogId(id);
        Dog updatedDog = dogService.saveDog(dog);
        return ResponseEntity.ok(updatedDog);
    }

    // Delete a dog
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDog(@PathVariable Integer id) {
        if (!dogService.getDogById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        dogService.deleteDog(id);
        return ResponseEntity.noContent().build();
    }

}
