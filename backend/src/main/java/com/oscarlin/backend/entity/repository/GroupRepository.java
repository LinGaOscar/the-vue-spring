package com.oscarlin.backend.entity.repository;

import com.oscarlin.backend.entity.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,String> {
}
