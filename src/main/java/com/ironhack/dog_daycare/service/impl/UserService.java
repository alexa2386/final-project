package com.ironhack.dog_daycare.service.impl;

import com.ironhack.dog_daycare.model.User;
import com.ironhack.dog_daycare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

        @Autowired
        private UserRepository userRepository;

        public User saveUser(User user) {
            return userRepository.save(user);
        }

        public Optional<User> getUserById(Integer id) {
            return userRepository.findById(String.valueOf(id));
        }

        public List<User> getAllUsers() {
            return userRepository.findAll();
        }
        public User updateUser(Integer id, User user) {
            if (userRepository.existsById(String.valueOf(id))) {
                user.setUserId(id);
                return userRepository.save(user);
            }
            throw new RuntimeException("User not found");
        }

        public void deleteUser(Integer id) {
            if (userRepository.existsById(String.valueOf(id))) {
                userRepository.deleteById(String.valueOf(id));
            } else {
                throw new RuntimeException("User not found");
            }
        }

    }
