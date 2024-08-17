package com.ilabs.Backend.repository;

import com.ilabs.Backend.model.question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface questionRepository extends JpaRepository<question, Integer> {

}
