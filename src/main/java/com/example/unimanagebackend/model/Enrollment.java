package com.example.unimanagebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Enrollments", uniqueConstraints = {@UniqueConstraint(columnNames = {"student_id", "course_id","semester","academic_year"})})
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_id")
    private Long enrollmentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(name = "semester", nullable = false)
    private Integer semester;

    @Column(name = "academic_year", nullable = false, length = 9)
    private String academicYear;

    @Column(name = "marks",precision = 5, scale = 2)
    private BigDecimal marks;

    public Enrollment(){}

    public Integer getSemester() {
        return semester;
    }

    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public BigDecimal getMarks() {
        return marks;
    }

    public Course getCourse() {
        return course;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public Student getStudent() {
        return student;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setMarks(BigDecimal marks) {
        this.marks = marks;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
