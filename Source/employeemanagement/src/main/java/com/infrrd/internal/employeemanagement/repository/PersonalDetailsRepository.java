package com.infrrd.internal.employeemanagement.repository;

import com.infrrd.internal.employeemanagement.entities.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long> {
}
