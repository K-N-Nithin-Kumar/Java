package com.assignment.a8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.assignment.a8.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}