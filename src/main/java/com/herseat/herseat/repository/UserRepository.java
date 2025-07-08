package com.herseat.herseat.repository;

import com.herseat.herseat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
