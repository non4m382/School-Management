package com.example.schoolproject.repository;

import com.example.schoolproject.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
