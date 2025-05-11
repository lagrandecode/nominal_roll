package com.lagrangecode.nominal_roll.Entity;


import com.lagrangecode.nominal_roll.Enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity

@NoArgsConstructor
@Getter
@Setter
@Table(name="app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private StaffProfile staffProfile;


    public User() {
    }

    public User(Long id, String email, String password, Role role, StaffProfile staffProfile) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.staffProfile = staffProfile;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public StaffProfile getStaffProfile() {
        return staffProfile;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setStaffProfile(StaffProfile staffProfile) {
        this.staffProfile = staffProfile;
    }
}
