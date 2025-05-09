package com.lagrangecode.nominal_roll.DTO;


import lombok.Data;

import java.time.LocalDate;

@Data
public class StaffProfileRequest {
    private String surname;
    private String otherNames;
    private String presentDesignation;
    private String gradeLevel;
    private String gender;
    private String qualification;
    private LocalDate dateOfBirth;
    private String stateOfOrigin;
    private String designationOnFirstAppt;
    private LocalDate dateOfFirstAppt;
    private LocalDate dateOfPresentAppt;
    private String employeeNo;
    private String civilServiceFileNo;
    private String mepbFileNo;
    private String presentPosting;
    private String phoneNumber;

}
