package com.oscarlin.backend.entity.repository;

import com.oscarlin.backend.entity.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,String> {
}
