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

    public StaffProfileRequest(String surname, String otherNames, String presentDesignation, String gradeLevel, String gender, String qualification, LocalDate dateOfBirth, String stateOfOrigin, String designationOnFirstAppt, LocalDate dateOfFirstAppt, LocalDate dateOfPresentAppt, String employeeNo, String civilServiceFileNo, String mepbFileNo, String presentPosting, String phoneNumber) {
        this.surname = surname;
        this.otherNames = otherNames;
        this.presentDesignation = presentDesignation;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.qualification = qualification;
        this.dateOfBirth = dateOfBirth;
        this.stateOfOrigin = stateOfOrigin;
        this.designationOnFirstAppt = designationOnFirstAppt;
        this.dateOfFirstAppt = dateOfFirstAppt;
        this.dateOfPresentAppt = dateOfPresentAppt;
        this.employeeNo = employeeNo;
        this.civilServiceFileNo = civilServiceFileNo;
        this.mepbFileNo = mepbFileNo;
        this.presentPosting = presentPosting;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public String getPresentDesignation() {
        return presentDesignation;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String getGender() {
        return gender;
    }

    public String getQualification() {
        return qualification;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public String getDesignationOnFirstAppt() {
        return designationOnFirstAppt;
    }

    public LocalDate getDateOfFirstAppt() {
        return dateOfFirstAppt;
    }

    public LocalDate getDateOfPresentAppt() {
        return dateOfPresentAppt;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getCivilServiceFileNo() {
        return civilServiceFileNo;
    }

    public String getMepbFileNo() {
        return mepbFileNo;
    }

    public String getPresentPosting() {
        return presentPosting;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public void setPresentDesignation(String presentDesignation) {
        this.presentDesignation = presentDesignation;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public void setDesignationOnFirstAppt(String designationOnFirstAppt) {
        this.designationOnFirstAppt = designationOnFirstAppt;
    }

    public void setDateOfFirstAppt(LocalDate dateOfFirstAppt) {
        this.dateOfFirstAppt = dateOfFirstAppt;
    }

    public void setDateOfPresentAppt(LocalDate dateOfPresentAppt) {
        this.dateOfPresentAppt = dateOfPresentAppt;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public void setCivilServiceFileNo(String civilServiceFileNo) {
        this.civilServiceFileNo = civilServiceFileNo;
    }

    public void setMepbFileNo(String mepbFileNo) {
        this.mepbFileNo = mepbFileNo;
    }

    public void setPresentPosting(String presentPosting) {
        this.presentPosting = presentPosting;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
