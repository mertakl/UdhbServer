package com.mertakl.springboot.webservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mertakl.springboot.webservice.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUserNameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);
}