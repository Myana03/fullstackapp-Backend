package com.codewithmyana.fullstack_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithmyana.fullstack_Backend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
