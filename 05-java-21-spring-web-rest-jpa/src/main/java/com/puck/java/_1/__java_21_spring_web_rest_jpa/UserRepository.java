package com.puck.java._1.__java_21_spring_web_rest_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}