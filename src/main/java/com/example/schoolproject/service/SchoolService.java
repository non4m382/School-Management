package com.example.schoolproject.service;

import com.example.schoolproject.entity.School;

import java.util.List;

public interface SchoolService {
    School saveSchool(School school);

    List<School> fetchSchoolList();

    School updateSchool(School school);

    void deleteSchool(Long schoolId);
}
