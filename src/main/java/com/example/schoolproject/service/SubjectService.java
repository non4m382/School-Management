package com.example.schoolproject.service;

import com.example.schoolproject.entity.Subject;

import java.util.List;

public interface SubjectService {
    Subject saveSubject(Subject subject);

    List<Subject> fetchSubjectList();

    Subject findSubjectById(Long id);

    Subject updateSubject(Subject subject);

    void deleteSubject(Long subjectId);
}
