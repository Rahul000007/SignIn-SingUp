package com.example.javalogin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT email FROM User WHERE email =?1" )
    User findByEmail(String email);
}
