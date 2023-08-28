package com.backend.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.rest.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
