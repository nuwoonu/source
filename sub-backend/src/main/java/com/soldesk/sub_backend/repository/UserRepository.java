package com.soldesk.sub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soldesk.sub_backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
