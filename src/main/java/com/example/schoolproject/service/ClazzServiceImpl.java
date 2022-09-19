package com.example.schoolproject.service;

import com.example.schoolproject.entity.Clazz;
import com.example.schoolproject.repository.ClazzRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService {
    private ClazzRepository repository;

    public ClazzServiceImpl(ClazzRepository clazzRepository) {
        this.repository = clazzRepository;
    }

    @Override
    public Clazz saveClazz(Clazz clazz) {
        return repository.save(clazz);
    }

    @Override
    public List<Clazz> fetchClazzList() {
        return repository.findAll();
    }

    @Override
    public Clazz updateClazz(Clazz clazz) {
        return repository.save(clazz);
    }

    @Override
    public void deleteClazz(Long clazzId) {
        repository.deleteById(clazzId);
    }
}
