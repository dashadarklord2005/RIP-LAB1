package com.example.bookrecommendation.repository;

import com.example.bookrecommendation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}