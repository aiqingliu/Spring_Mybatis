package com.laq.service;

import com.laq.model.Student;

import java.util.List;

public interface StudentService {

    public List<Student> selectList();

    public void add(Student student);

    public void delete(Student student);

    public void update(Student student);

    void testmethod();
}
