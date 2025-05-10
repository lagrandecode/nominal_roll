package com.lagrangecode.nominal_roll.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lagrangecode.nominal_roll.DTO.LoginReques;
import com.lagrangecode.nominal_roll.DTO.RegisterRequest;
import com.lagrangecode.nominal_roll.Entity.User;
import com.lagrangecode.nominal_roll.Service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginReques request) {
        Authentication authentication = authService.login(request);
        return ResponseEntity.ok("Login successful");
    }
} 