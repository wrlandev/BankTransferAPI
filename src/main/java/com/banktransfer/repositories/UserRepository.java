package com.banktransfer.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.banktransfer.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUSerByDocument(String document);
    Optional<User> findUSerById(Long id);
}
