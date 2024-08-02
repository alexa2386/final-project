package com.ironhack.dog_daycare.repository;

import com.ironhack.dog_daycare.model.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Integer> {
}
