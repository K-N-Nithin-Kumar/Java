package com.assignment.a8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.assignment.a8.model.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
