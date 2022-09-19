package com.example.schoolproject.controller;

import com.example.schoolproject.entity.Teacher;
import com.example.schoolproject.service.TeacherServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/teachers")
public class TeacherController {

    private TeacherServiceImpl service;

    public TeacherController(TeacherServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Teacher> findAllTeachers() {
        return service.fetchTeacherList();
    }

    @PostMapping
    public Teacher addTeacher(@Valid @RequestBody Teacher teacher) {
        return service.saveTeacher(teacher);
    }

    @GetMapping("{id}")
    public Teacher findTeacherById(@PathVariable Long id) {
        return service.findTeacherById(id);
    }

}
