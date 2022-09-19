package com.example.schoolproject.service;

import com.example.schoolproject.entity.Subject;
import com.example.schoolproject.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    private SubjectRepository repository;

    public SubjectServiceImpl(SubjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return repository.save(subject);
    }

    @Override
    public List<Subject> fetchSubjectList() {
        return (List<Subject>) repository.findAll();
    }

    @Override
    public Subject findSubjectById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Subject updateSubject(Subject subject) {
        return repository.save(subject);
    }

    @Override
    public void deleteSubject(Long subjectId) {
        repository.deleteById(subjectId);
    }
}
