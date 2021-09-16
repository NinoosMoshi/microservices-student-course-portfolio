package com.ninos.service;

import com.ninos.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student findByUsername(String username);

    List<String> findStudents(List<Long> idList);

}
