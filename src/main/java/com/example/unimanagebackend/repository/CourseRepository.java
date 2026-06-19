package com.example.unimanagebackend.unimanage.repository;

import com.example.unimanagebackend.unimanage.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
