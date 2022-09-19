package com.example.schoolproject.service;

import com.example.schoolproject.entity.Clazz;

import java.util.List;

public interface ClazzService {
    Clazz saveClazz(Clazz clazz);

    List<Clazz> fetchClazzList();

    Clazz updateClazz(Clazz clazz);

    void deleteClazz(Long clazzId);


}
