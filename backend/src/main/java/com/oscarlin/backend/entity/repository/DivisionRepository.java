package com.oscarlin.backend.entity.repository;

import com.oscarlin.backend.entity.domain.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,String> {
}
