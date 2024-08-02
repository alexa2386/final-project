package com.ironhack.dog_daycare.service.impl;

import com.ironhack.dog_daycare.model.HealthRecord;
import com.ironhack.dog_daycare.repository.HealthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HealthRecordService {
    @Autowired
    private HealthRecordRepository healthRecordRepository;

    public List<HealthRecord> getAllRecords() {
        return healthRecordRepository.findAll();
    }

    public Optional<HealthRecord> getRecordById(Integer id) {
        return healthRecordRepository.findById(id);
    }

    public HealthRecord saveRecord(HealthRecord record) {
        return healthRecordRepository.save(record);
    }

    public void deleteRecord(Integer id) {
        healthRecordRepository.deleteById(id);
    }

}
