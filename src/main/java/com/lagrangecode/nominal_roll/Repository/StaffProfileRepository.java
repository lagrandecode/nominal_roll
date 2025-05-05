package com.lagrangecode.nominal_roll.Repository;


import com.lagrangecode.nominal_roll.Entity.StaffProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StaffProfileRepository extends JpaRepository<StaffProfile, UUID> {
   Optional<StaffProfile> findByStaffId(UUID staffId);
}
