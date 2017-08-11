package com.infrrd.internal.employeemanagement.repository;


import com.infrrd.internal.employeemanagement.entities.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist, Long> {
}
