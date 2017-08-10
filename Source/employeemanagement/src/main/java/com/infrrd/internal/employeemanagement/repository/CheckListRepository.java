package com.infrrd.internal.employeemanagement.repository;

import com.infrrd.internal.employeemanagement.entities.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckListRepository extends JpaRepository<CheckList,Long> {
}
