package com.example.schoolproject.service;

import com.example.schoolproject.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> fetchStudentList();

    Student updateStudent(Student student);

    void deleteStudent(Long studentId);
}
