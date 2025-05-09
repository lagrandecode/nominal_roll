package com.lagrangecode.nominal_roll.Service;


import com.lagrangecode.nominal_roll.Repository.StaffProfileRepository;
import com.lagrangecode.nominal_roll.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final StaffProfileRepository staffProfileRepository;
    private  final JwtService jwtService;
}
