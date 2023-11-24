package com.example.armedu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.armedu.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom methods if needed
}