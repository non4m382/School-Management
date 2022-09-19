package com.example.schoolproject.service;

import com.example.schoolproject.entity.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher saveTeacher(Teacher teacher);

    List<Teacher> fetchTeacherList();

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacher(Long teacherId);
}
