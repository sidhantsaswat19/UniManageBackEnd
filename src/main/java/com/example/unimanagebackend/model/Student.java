package com.example.unimanagebackend.unimanage.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "email",nullable = false,unique = true,length = 100)
    private String email;

    @Column(name = "phone",length = 15)
    private String phone;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "gender",length = 1)
    private String gender;

    @Column(name = "semester",nullable = false)
    private Integer semester;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id", nullable = false)
    private Department department;

    public Student(){}

    public Long getStudentId() {
        return studentId;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Department getDepartment() {
        return department;
    }

    public Integer getSemester() {
        return semester;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }
}
