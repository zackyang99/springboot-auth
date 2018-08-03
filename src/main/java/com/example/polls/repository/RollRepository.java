package com.example.polls.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.polls.model.Roll;
import com.example.polls.model.RollName;

public interface RollRepository extends JpaRepository<Roll, Long> {
	Optional<Roll> findByName(RollName roleName);
}
