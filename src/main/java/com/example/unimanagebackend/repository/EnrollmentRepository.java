package com.example.unimanagebackend.unimanage.repository;

import com.example.unimanagebackend.unimanage.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
