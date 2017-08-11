package com.infrrd.internal.employeemanagement.repository;

import com.infrrd.internal.employeemanagement.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
