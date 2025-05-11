package com.lagrangecode.nominal_roll.Controller;

import com.lagrangecode.nominal_roll.DTO.StaffProfileRequest;
import com.lagrangecode.nominal_roll.Entity.StaffProfile;
import com.lagrangecode.nominal_roll.Service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    private final StaffService staffService;

    @PostMapping
    public ResponseEntity<StaffProfile> createStaff(@RequestBody StaffProfileRequest request) {
        return ResponseEntity.ok(staffService.createStaff(request));
    }

    @GetMapping
    public ResponseEntity<List<StaffProfile>> getAllStaff() {
        return ResponseEntity.ok(staffService.getAllStaff());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffProfile> getStaffById(@PathVariable UUID id) {
        return ResponseEntity.ok(staffService.getStaffById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StaffProfile> updateStaff(@PathVariable UUID id, @RequestBody StaffProfileRequest request) {
        return ResponseEntity.ok(staffService.updateStaff(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStaff(@PathVariable UUID id) {
        staffService.deleteStaff(id);
        return ResponseEntity.ok().build();
    }
} 