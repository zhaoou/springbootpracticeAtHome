package com.michael.springbootpractice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michael.springbootpractice.model.User;


public interface UserRepository extends JpaRepository<User, String>{

}
