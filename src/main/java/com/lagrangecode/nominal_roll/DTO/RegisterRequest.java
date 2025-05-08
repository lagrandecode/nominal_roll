package com.lagrangecode.nominal_roll.DTO;


import com.lagrangecode.nominal_roll.Entity.StaffProfile;
import com.lagrangecode.nominal_roll.Enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String password;
    private Role role;
    private StaffProfile profile;

}
