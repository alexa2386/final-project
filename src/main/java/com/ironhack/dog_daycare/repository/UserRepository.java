package com.ironhack.dog_daycare.repository;

import com.ironhack.dog_daycare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
