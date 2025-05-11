package com.lagrangecode.nominal_roll.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StaffProfile {
    @Id
    @GeneratedValue
    private UUID staffId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

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
