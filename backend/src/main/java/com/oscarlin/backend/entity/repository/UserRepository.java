package com.oscarlin.backend.entity.repository;

import com.oscarlin.backend.entity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,String> {

     List<User> findByUserNameContains(String name);

}
