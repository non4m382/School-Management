package com.example.schoolproject.service;

import com.example.schoolproject.entity.School;
import com.example.schoolproject.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    private SchoolRepository repository;

    public SchoolServiceImpl(SchoolRepository repository) {
        this.repository = repository;
    }

    @Override
    public School saveSchool(School school) {
        return repository.save(school);
    }

    @Override
    public List<School> fetchSchoolList() {
        return (List<School>) repository.findAll();
    }

    @Override
    public School updateSchool(School school) {
        return repository.save(school);
    }

    @Override
    public void deleteSchool(Long schoolId) {
        repository.deleteById(schoolId);
    }
}
