package com.oscarlin.backend.entity.repository;

import com.oscarlin.backend.entity.domain.Function;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface FunctionRepository extends JpaRepository<Function, String> {
}
