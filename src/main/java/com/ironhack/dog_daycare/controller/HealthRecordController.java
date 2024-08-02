package com.ironhack.dog_daycare.controller;

import com.ironhack.dog_daycare.model.HealthRecord;
import com.ironhack.dog_daycare.service.impl.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/health-records")
public class HealthRecordController {

    @Autowired
    private HealthRecordService healthRecordService;

    // Get all health records
    @GetMapping
    public ResponseEntity<List<HealthRecord>> getAllRecords() {
        List<HealthRecord> records = healthRecordService.getAllRecords();
        return new ResponseEntity<>(records, HttpStatus.OK);
    }

    // Get a specific health record by ID
    @GetMapping("/{id}")
    public ResponseEntity<HealthRecord> getRecordById(@PathVariable Integer id) {
        Optional<HealthRecord> record = healthRecordService.getRecordById(id);
        return record.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new health record
    @PostMapping
    public ResponseEntity<HealthRecord> createRecord(@RequestBody HealthRecord record) {
        HealthRecord savedRecord = healthRecordService.saveRecord(record);
        return new ResponseEntity<>(savedRecord, HttpStatus.CREATED);
    }

    // Update an existing health record
    @PutMapping("/{id}")
    public ResponseEntity<HealthRecord> updateRecord(@PathVariable Integer id, @RequestBody HealthRecord record) {
        if (!healthRecordService.getRecordById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        record.setRecordId(id);
        HealthRecord updatedRecord = healthRecordService.saveRecord(record);
        return ResponseEntity.ok(updatedRecord);
    }

    // Delete a health record
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecord(@PathVariable Integer id) {
        if (!healthRecordService.getRecordById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        healthRecordService.deleteRecord(id);
        return ResponseEntity.noContent().build();
    }
}
