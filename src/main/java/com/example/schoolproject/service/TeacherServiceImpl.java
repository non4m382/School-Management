package com.example.schoolproject.service;

import com.example.schoolproject.entity.Teacher;
import com.example.schoolproject.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository repository;

    public TeacherServiceImpl(TeacherRepository repository) {
        this.repository = repository;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return repository.save(teacher);
    }

    @Override
    public List<Teacher> fetchTeacherList() {
        return repository.findAll();
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return repository.save(teacher);
    }

    @Override
    public void deleteTeacher(Long teacherId) {
        repository.deleteById(teacherId);
    }

    @Override
    public Teacher findTeacherById(Long id) {
        return repository.findById(id).get();
    }
}
