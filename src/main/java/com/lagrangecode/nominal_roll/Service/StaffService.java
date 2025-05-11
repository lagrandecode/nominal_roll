package com.lagrangecode.nominal_roll.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.lagrangecode.nominal_roll.DTO.StaffProfileRequest;
import com.lagrangecode.nominal_roll.Entity.StaffProfile;
import com.lagrangecode.nominal_roll.Repository.StaffProfileRepository;

import lombok.RequiredArgsConstructor;

@Service
public class StaffService {


    public StaffService(StaffProfileRepository staffProfileRepository) {
        this.staffProfileRepository = staffProfileRepository;
    }
    private final StaffProfileRepository staffProfileRepository;

    public StaffProfile createStaff(StaffProfileRequest request) {
        StaffProfile staffProfile = new StaffProfile();
        updateStaffProfileFromRequest(staffProfile, request);
        return staffProfileRepository.save(staffProfile);
    }

    public List<StaffProfile> getAllStaff() {
        return staffProfileRepository.findAll();
    }

    public StaffProfile getStaffById(UUID id) {
        return staffProfileRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Staff not found with id: " + id));
    }

    public StaffProfile updateStaff(UUID id, StaffProfileRequest request) {
        StaffProfile staffProfile = getStaffById(id);
        updateStaffProfileFromRequest(staffProfile, request);
        return staffProfileRepository.save(staffProfile);
    }

    public void deleteStaff(UUID id) {
        if (!staffProfileRepository.existsById(id)) {
            throw new RuntimeException("Staff not found with id: " + id);
        }
        staffProfileRepository.deleteById(id);
    }

    private void updateStaffProfileFromRequest(StaffProfile staffProfile, StaffProfileRequest request) {
        staffProfile.setSurname(request.getSurname());
        staffProfile.setOtherNames(request.getOtherNames());
        staffProfile.setPresentDesignation(request.getPresentDesignation());
        staffProfile.setGradeLevel(request.getGradeLevel());
        staffProfile.setGender(request.getGender());
        staffProfile.setQualification(request.getQualification());
        staffProfile.setDateOfBirth(request.getDateOfBirth());
        staffProfile.setStateOfOrigin(request.getStateOfOrigin());
        staffProfile.setDesignationOnFirstAppt(request.getDesignationOnFirstAppt());
        staffProfile.setDateOfFirstAppt(request.getDateOfFirstAppt());
        staffProfile.setDateOfPresentAppt(request.getDateOfPresentAppt());
        staffProfile.setEmployeeNo(request.getEmployeeNo());
        staffProfile.setCivilServiceFileNo(request.getCivilServiceFileNo());
        staffProfile.setMepbFileNo(request.getMepbFileNo());
        staffProfile.setPresentPosting(request.getPresentPosting());
        staffProfile.setPhoneNumber(request.getPhoneNumber());
    }
} 