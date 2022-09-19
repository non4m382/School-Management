package com.example.schoolproject.model;

import com.example.schoolproject.entity.Subject;
import com.example.schoolproject.service.SubjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/subjects")
public class SubjectController {

    private final SubjectServiceImpl service;

    public SubjectController(SubjectServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Subject> findAllSubjects() {
        return service.fetchSubjectList();
    }

    @PostMapping
    public Subject addSubject(@Valid @RequestBody Subject subject) {
        return service.saveSubject(subject);
    }

    @GetMapping("{id}")
    public Subject findSubjectById(@PathVariable Long id) {
        return service.findSubjectById(id);
    }

    @PutMapping
    public Subject updateSubject(@RequestBody Subject subject) {
        return service.saveSubject(subject);
    }

    @DeleteMapping("{id}")
    public void deleteSubject(@PathVariable Long id) {
        service.deleteSubject(id);
    }
}
