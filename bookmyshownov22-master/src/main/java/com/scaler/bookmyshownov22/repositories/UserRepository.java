package com.scaler.bookmyshownov22.repositories;

import com.scaler.bookmyshownov22.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    @Override
    Optional<User> findById(Long aLong);
}
