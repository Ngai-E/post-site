package com.hustler.post.dal.repositories;

import com.hustler.post.dal.entities.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TUserRepository extends JpaRepository<TUser, String> {

    Optional<TUser> findByEmail(String email);
    Boolean existsByEmail(String email);
}
