package com.example.unimanagebackend.unimanage.repository;

import com.example.unimanagebackend.unimanage.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
