package com.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdv.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
