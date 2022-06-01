package com.laq.mapper;

import com.laq.model.Student;

import java.util.List;

public interface StudentMapper {

    public List<Student> selectList();

    public void add(Student student);

    public void delete(Student student);

    public void update(Student student);
}
