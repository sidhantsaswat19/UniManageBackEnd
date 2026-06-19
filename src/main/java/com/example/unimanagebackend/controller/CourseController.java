package com.example.unimanagebackend.unimanage.controller;

import com.example.unimanagebackend.unimanage.model.Course;
import com.example.unimanagebackend.unimanage.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;
    @GetMapping
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}
