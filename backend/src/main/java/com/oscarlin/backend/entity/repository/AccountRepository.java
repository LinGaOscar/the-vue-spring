package com.oscarlin.backend.entity.repository;

import com.oscarlin.backend.entity.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
