package com.example.unimanagebackend.unimanage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name", nullable = false, length = 150)
    private String courseName;

    @Column(name = "course_code", nullable = false, unique = true, length = 20)
    private String courseCode;

    @Column(name = "credits",nullable = false)
    private Integer credits;

    @Column(name = "is_elective",nullable = false)
    private Boolean isElective;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id", nullable = false)
    private Department department;

    public Course() {
    }

    public Long getCourseId() {
        return courseId;
    }

    public Boolean getElective() {
        return isElective;
    }

    public Department getDepartment() {
        return department;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Integer getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public void setElective(Boolean elective) {
        isElective = elective;
    }
}
